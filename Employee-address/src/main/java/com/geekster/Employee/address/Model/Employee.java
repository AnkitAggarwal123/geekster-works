package com.geekster.Employee.address.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

    @Id
    private Long id;
    private String firstName;
    private String lastName;

    @OneToOne
    @JoinColumn(name = "fk_addressId")
    Address address;
}
