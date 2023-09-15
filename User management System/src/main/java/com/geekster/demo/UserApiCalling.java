package com.geekster.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserApiCalling {

    @Autowired
    List<User> users;


    @PostMapping("addUser")
    public String addUser(@RequestBody User data){

        users.add(data);
        return "Added Successfully";
    }

    @GetMapping("getUser/{userid}")
    public User getUsers(@PathVariable int userid){

        for(User user : users){
            if(user.getUserId().equals(userid)){
                return user;
            }
        }
        return null;

    }

    @GetMapping("getAllUser")
    public List<User> getAllUser(){
        return users;
    }

    @PutMapping("updateUserInfo/{updateInfo}")
    public String update(@PathVariable Integer updateInfo,@RequestBody  User updateUser){

        for(User user1 : users){
            if(user1.getUserId().equals(updateInfo)){
                user1.setAddress(updateUser.getAddress());
                user1.setPhoneNumber(updateUser.getPhoneNumber());
                return "updated" + user1.getUserId();
            }

        }

        return "Invalid";

    }

    @DeleteMapping("deleteUser")
    public String delete(@RequestParam Integer user){

        for(User user1 : users){
            if(user1.getUserId().equals(user)){
                users.remove(user1);
                return "delete successfully";
            }
        }
        return "invalid";

    }


}
