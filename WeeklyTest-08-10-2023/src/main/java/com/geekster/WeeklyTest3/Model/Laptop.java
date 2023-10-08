package com.geekster.WeeklyTest3.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Laptop {

    @Id
    private String id;

    private String name;
    private String brand;
    private Integer price;

    @OneToOne
    @JoinColumn(name = "Student_fk")
    Student student;
}
