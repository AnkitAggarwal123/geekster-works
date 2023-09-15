# <h1 align = "center"> User Management </h1>

## Overview

This project, named "User Management System" is a robust Spring Boot application designed for managing user data efficiently. It provides a set of RESTful API endpoints that allow you to perform various operations on user records, such as adding, retrieving, updating, and deleting user information.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

## Data Flow

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

1. **Add User:** `POST /api/user`
2. **Get All Users:** `GET /all/user`
3. **Get User by ID:** `GET /api/user/{id}/detail`
4. **Update User Id, Name, Number:** `PUT /user/api/user/{id}/number/`
5. **Delete User by ID:** `DELETE /api/user/{id}/id`

```java
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
```

## Database Design

The project's database design includes tables for user management, with fields such as:

- `userId` (User ID)
- `userName` (User Name)
- `name` (name)
- `userContactNo` (Phone Number)

### ArrayList

The project utilizes the `ArrayList` data structure to store and manage lists of `User` objects in various parts of the application. `ArrayList` provides dynamic sizing and efficient element retrieval, making it suitable for storing user records and performing operations on them.

These data structures enable the application to organize and manipulate user data efficiently while maintaining data integrity.


## Project Summary

The User Management project is a robust Spring Boot application designed for efficient user data management. It offers a set of RESTful API endpoints for various user-related operations, including adding, retrieving, updating, and deleting user information.

### Key Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven


    
