package com.geekster.WeeklyTest15102023.Controller;

import com.geekster.WeeklyTest15102023.Model.Post;
import com.geekster.WeeklyTest15102023.Model.User;
import com.geekster.WeeklyTest15102023.Model.dto.SignInDto;
import com.geekster.WeeklyTest15102023.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;

@RestController
public class UserController {

    @Autowired
    UserServices userServices;

    @PostMapping("user/signUp")
    public String signUp(@RequestBody User user){
        return userServices.signUp(user);
    }


    @PostMapping("user/signIn")
    public String signIn(@RequestBody SignInDto signInDto){
        return userServices.signIn(signInDto);
    }




}
