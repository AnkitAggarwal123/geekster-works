package com.geekster.Restaurant.App.Service;

import com.geekster.Restaurant.App.Model.DTO.AdminDto;
import com.geekster.Restaurant.App.Model.DTO.AdminAuth;
import com.geekster.Restaurant.App.Model.Tokens;
import com.geekster.Restaurant.App.Model.Users.Admin;
import com.geekster.Restaurant.App.Repo.IAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class AdminService {

    @Autowired
    IAdminRepo adminRepo;

    @Autowired
    TokenService tokenService;
    public String adminSignUp(Admin admin) {

        //check email -> if existing return it
        String email = admin.getAdminEmail();
        Admin existingEmail = adminRepo.findFirstByAdminEmail(email);
        if(existingEmail != null){
            return "This Email is exiting Email, please fill the password to login!!!";
        }


        String password = admin.getPassword();
        try {
            String encryptedPassword = PasswordEncryptor.encrypt(password);
            admin.setPassword(encryptedPassword);
            adminRepo.save(admin);
            return "Admin registered";
        } catch (NoSuchAlgorithmException e) {
            return "Internal Server issues while saving password, try again later!!!";
        }

    }

    public String adminSignIn(AdminDto adminDetail) {

        //get email of admin
        String email = adminDetail.getAdminEmail();

        //find the admin
        Admin existingAdmin = adminRepo.findFirstByAdminEmail(email);
        if(existingAdmin == null){
            return "Email is not registered. Sign up First!!!";
        }
        //checkPassword
        String password = adminDetail.getPassword();

        try {
            String passwordEncryptor = PasswordEncryptor.encrypt(password);
            if(existingAdmin.getPassword().equals(passwordEncryptor)){
                Tokens tokens = new Tokens(existingAdmin);
                tokenService.createToken(tokens);
                return tokens.getTokenValue();
            }else{
                return "Invalid credential!!!";
            }
        } catch (NoSuchAlgorithmException e) {
            return "Authentication Invalid!!!";
        }
    }

    public String adminSignOut(AdminAuth adminAuth) {

        if(tokenService.authenticate(adminAuth)) {
            String tokenValue = adminAuth.getTokenValue();
            tokenService.deleteToken(tokenValue);
            return "Sign Out successful!!";
        }
        else {
            return "Un Authenticated access!!!";
        }
    }
}
