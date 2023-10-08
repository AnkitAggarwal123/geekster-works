package com.geekster.WeeklyTest3.Repo;

import com.geekster.WeeklyTest3.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudent extends JpaRepository<Student, String> {
}
