package com.geekster.WeeklyTest3.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;
}
