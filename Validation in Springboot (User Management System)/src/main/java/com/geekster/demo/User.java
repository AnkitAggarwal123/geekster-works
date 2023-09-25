package com.geekster.demo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class User {

    @Size(min = 1, max = 100)
    private Integer userId;
    @NotBlank
    private String name;
    private String userName;
    @Pattern(regexp = "^[0-9a-zA-Z,]+$")
    private String address;

    @Pattern(regexp = "^\\d{10}$")
    private String phoneNumber;

    public User(Integer userId, String name, String userName, String address, String phoneNumber) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
