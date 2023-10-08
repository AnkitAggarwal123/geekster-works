package com.geekster.WeeklyTest3.Services;

import com.geekster.WeeklyTest3.Model.Course;
import com.geekster.WeeklyTest3.Repo.ICourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServices {

    @Autowired
    ICourse course;

    public String addCourse(Course newCourse) {
        course.save(newCourse);
        return "Added Successfully";
    }

    public String updateCourse(String id, String newTittle) {
        Course course1 = course.findById(id).orElseThrow();
        course1.setTittle(newTittle);
        course.save(course1);
        return "Updated Successfully";

    }

    public String deleteCourse(String id) {
        course.deleteById(id);
        return "Deleted Successfully";
    }

    public List<Course> getAllCourse() {
        return course.findAll();
    }
}
