package com.geekster.WeeklyTest3.Repo;

import com.geekster.WeeklyTest3.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptop extends JpaRepository<Laptop, String> {

}
