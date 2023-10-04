package com.geekster.Employee.address.Controller;

import com.geekster.Employee.address.Model.Address;
import com.geekster.Employee.address.Services.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressServices address;

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress){
        return address.addAddress(newAddress);
    }

    @GetMapping("address")
    public List<Address> getAllAddress(){
        return address.getAllAddress();
    }

    @GetMapping("address/id/{id}")
    public Address getById(@PathVariable Long id){
        return address.getAddress(id);
    }

    @PutMapping("address/{id}")
    public String updateById(@PathVariable Long id, @RequestBody Address newAddress){

        return address.updateAddress(id, newAddress);
    }

    @DeleteMapping("address/{id}")
     public String deletedById(@PathVariable Long id){
        return address.deleteById(id);
     }
}
