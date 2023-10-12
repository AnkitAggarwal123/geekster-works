package com.geekster.Restaurant.App.Model.Users;


import com.geekster.Restaurant.App.Model.Orders;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String userName;

    private String userEmail;

    private String userPassword;

    @OneToMany(mappedBy = "user")
    private List<Orders> myOrders;
}
