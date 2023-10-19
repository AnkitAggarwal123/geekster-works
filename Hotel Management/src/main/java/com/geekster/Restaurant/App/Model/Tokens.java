package com.geekster.Restaurant.App.Model;


import com.geekster.Restaurant.App.Model.Users.Admin;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tokens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tokenId;
    private String tokenValue;
    private LocalDateTime tokenCreationTime;

    @OneToOne
    Admin admin;

    public Tokens(Admin admin) {
        this.admin = admin;
        this.tokenCreationTime = LocalDateTime.now();
        this.tokenValue = UUID.randomUUID().toString();
    }
}
