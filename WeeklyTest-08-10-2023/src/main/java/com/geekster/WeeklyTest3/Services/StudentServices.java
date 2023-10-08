package com.geekster.WeeklyTest3.Services;

import com.geekster.WeeklyTest3.Model.Student;
import com.geekster.WeeklyTest3.Repo.IStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    @Autowired
    IStudent student;


    public String addStudent(Student newStudent) {
        student.save(newStudent);
        return "Added Successfully";
    }

    public String updateStudent(String id, String newBranch) {
        Student student1 = student.findById(id).orElseThrow();
        student1.setBranch(newBranch);
        student.save(student1);
        return "Udated Successfully";
    }

    public String deleteStudent(String id) {
        student.deleteById(id);
        return "deleted Successfully";
    }


    public List<Student> getAllStudent() {
        return student.findAll();
    }
}
