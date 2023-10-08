package com.geekster.WeeklyTest3.Controller;

import com.geekster.WeeklyTest3.Model.Laptop;
import com.geekster.WeeklyTest3.Repo.ILaptop;
import com.geekster.WeeklyTest3.Services.LaptopServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class LaptopController {

    @Autowired
    LaptopServices laptop;

    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop newLaptop){
        return laptop.addLaptop(newLaptop);
    }

    @PutMapping("laptop/{id}/{newPrice}")
    public String updateLaptop(String id, Integer newPrice){
        return laptop.updateLaptop(id,newPrice);
    }

    @DeleteMapping("delete/{id}")
    public String deleteLaptop(String id){
        return laptop.deleteLaptop(id);
    }

    @GetMapping("laptop")
    public List<Laptop> getAllLaptop(){
        return laptop.getAllLaptop();
    }
}
