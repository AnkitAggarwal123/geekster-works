package com.geekster.University.Event.Management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {

    @Id
    private Integer studentId;

    @Pattern(regexp = "^[A-Z][a-zA-Z0-9_]*$")
    private String firstName;

    private String lastName;

    @Size(min = 18, max = 25)
    private Integer age;

    private Type department;


}
