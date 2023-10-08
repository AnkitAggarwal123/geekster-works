package com.geekster.WeeklyTest3.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
//@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Course.class,property="id")
public class Course {

    @Id
    private String id;

    private String tittle;
    private String description;
    private String duration;

    @ManyToMany
    @JoinTable(
    name = "course_Student_Mapping",
    joinColumns = @JoinColumn(name = "Course_fk"),
    inverseJoinColumns = @JoinColumn(name = "Student_fk")
    )
    List<Student> studentSet;

}
