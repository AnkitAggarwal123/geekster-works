package com.geekster.WeeklyTest3.Controller;

import com.geekster.WeeklyTest3.Model.Course;
import com.geekster.WeeklyTest3.Services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseServices courseServices;

    @PostMapping("course")
    public String addCourse(@RequestBody Course newCourse){
        return courseServices.addCourse(newCourse);
    }

    @PutMapping("course/{id}/{newTittle}")
    public String updateCourse(@PathVariable String id,@PathVariable String newTittle){
        return courseServices.updateCourse(id, newTittle);
    }

    @DeleteMapping("course/{id}")
    public String deleteCourse(@PathVariable String id){
        return courseServices.deleteCourse(id);
    }

    @GetMapping("course")
    public List<Course> getAllCourse(){
        return courseServices.getAllCourse();
    }
}
