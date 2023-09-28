package com.geekster.University.Event.Management.Controller;

import com.geekster.University.Event.Management.Model.EventEntity;
import com.geekster.University.Event.Management.Model.StudentEntity;
import com.geekster.University.Event.Management.Model.Type;
import com.geekster.University.Event.Management.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    Services services;

    @PostMapping("add/student")
    public String addStudent(@RequestBody List<StudentEntity> student){
        return services.addStudent(student);
    }

    @PutMapping("update/department")
    public String updateStudent(@RequestBody Integer id, Type department){
        return services.updateDetails(id, department);
    }

    @GetMapping("students")
    public List<StudentEntity> getAllStudent(){
        return services.getAllStudent();
    }
    @GetMapping("student/{id}")
    public StudentEntity getStudentById(@PathVariable Integer id){
        return services.studentById(id);
    }

    public String addEvent(List<EventEntity> event){
        return services.addEvent(event);
    }
    @PutMapping("update/event/{id}/{name}")
    public String update(@PathVariable Integer id, String name){
        return services.update(id, name);
    }
    @GetMapping("event/{id}")
    public String delete(@PathVariable Integer id){
        return services.deleteEvent(id);
    }

    public List<EventEntity> getAllEventByDate(LocalDate date){
        return services.getAllByDate(date);
    }
}
