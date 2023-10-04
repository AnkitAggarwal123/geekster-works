package com.geekster.Employee.address.Services;

import com.geekster.Employee.address.Model.Address;
import com.geekster.Employee.address.Model.Employee;
import com.geekster.Employee.address.Repo.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServices {

    @Autowired
    IEmployee employee;

    public String addEmployee(Employee newEmployee){
        employee.save(newEmployee);
        return "Added Successfully";
    }

    public List<Employee> getAllEmployee(){
        return employee.findAll();
    }

    public Employee getEmployee(Long id){

        return employee.findById(id).orElse(null);
    }

    public String updateEmployeeInformation(Long id, String newLastName){
        Employee newEmployee = employee.findById(id).orElse(null);
        newEmployee.setLastName(newLastName);
        employee.save(newEmployee);
        return "Updated Successfully";
    }

    public String deleteEmployee(Long id){
        employee.deleteById(id);
        return "Deleted Successfully";
    }


}
