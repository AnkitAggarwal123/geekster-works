package com.geekster.WeeklyTest3.Controller;

import com.geekster.WeeklyTest3.Model.Student;
import com.geekster.WeeklyTest3.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class StudentController {

    @Autowired
    StudentServices studentServices;

    @PostMapping("student")
    public String addStudent(@RequestBody Student newStudent){
        return studentServices.addStudent(newStudent);
    }

    @PutMapping("student/{id}/{newBranch}")
    public String updateStudent(@PathVariable String id,@PathVariable String newBranch){
        return studentServices.updateStudent(id, newBranch);
    }

    @DeleteMapping("student/{id}")
    public String deleteStudent(@PathVariable String id){
        return studentServices.deleteStudent(id);
    }

    @GetMapping("student")
    public List<Student> getAllStudent(){
        return studentServices.getAllStudent();
    }
}
