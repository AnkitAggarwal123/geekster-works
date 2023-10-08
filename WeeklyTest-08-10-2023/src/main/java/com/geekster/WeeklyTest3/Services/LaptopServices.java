package com.geekster.WeeklyTest3.Services;

import com.geekster.WeeklyTest3.Model.Laptop;
import com.geekster.WeeklyTest3.Repo.ILaptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServices {

    @Autowired
    ILaptop laptop;

    public String addLaptop(Laptop newLaptop) {
        laptop.save(newLaptop);
        return "Added Successfully";
    }

    public String updateLaptop(String id, Integer newPrice) {

        Laptop laptop1 = laptop.findById(id).orElseThrow();
        laptop1.setPrice(newPrice);
        return "Updated Successfully";
    }

    public String deleteLaptop(String id) {
        laptop.deleteById(id);
        return "Deleted Successfully";
    }

    public List<Laptop> getAllLaptop() {
        return laptop.findAll();
    }
}
