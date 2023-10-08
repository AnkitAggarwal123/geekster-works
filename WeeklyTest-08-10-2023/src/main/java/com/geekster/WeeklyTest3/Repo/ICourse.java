package com.geekster.WeeklyTest3.Repo;

import com.geekster.WeeklyTest3.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourse extends JpaRepository<Course, String> {
}
