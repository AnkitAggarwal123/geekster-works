package com.geekster.Employee.address.Repo;

import com.geekster.Employee.address.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployee extends JpaRepository<Employee, Long> {
}
