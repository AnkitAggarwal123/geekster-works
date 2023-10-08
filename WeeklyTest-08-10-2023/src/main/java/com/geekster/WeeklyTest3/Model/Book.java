package com.geekster.WeeklyTest3.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {

    @Id
    private String id;

    private String title;
    private String description;
    private String price;

    @ManyToOne
    @JoinColumn(name = "Student_fk")
    Student student;


}
