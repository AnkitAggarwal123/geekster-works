package com.geekster.Employee.address.Controller;

import com.geekster.Employee.address.Model.Address;
import com.geekster.Employee.address.Model.Employee;
import com.geekster.Employee.address.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeServices employee;

    @PostMapping("employee")
    public String addEmployee(@RequestBody Employee newEmployee){
        return employee.addEmployee(newEmployee);
    }

    @GetMapping("employees")
    public List<Employee> getAllEmployee(){
        return employee.getAllEmployee();
    }

    @GetMapping("employee/id/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employee.getEmployee(id);
    }

    @PutMapping("employee/{id}")
    public String updateEmployee(@PathVariable Long id, String lastname){
        return employee.updateEmployeeInformation(id, lastname);
    }

    @DeleteMapping("employee/{id}")
    public String deleteEmployee(@PathVariable Long id){
        return employee.deleteEmployee(id);
    }

}
