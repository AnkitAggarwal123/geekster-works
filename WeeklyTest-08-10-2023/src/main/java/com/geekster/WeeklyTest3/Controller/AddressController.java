package com.geekster.WeeklyTest3.Controller;

import com.geekster.WeeklyTest3.Model.Address;
import com.geekster.WeeklyTest3.Services.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressServices addressServices;

    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressServices.addAddress(address);
    }

    @PutMapping("address/{id}/{address}")
    public String updateAddress(@PathVariable Long id ,@PathVariable String address){
        return addressServices.updateAddressInfo(id, address);
    }

    @DeleteMapping("address/{id}")
    public String deleteAddress(@PathVariable Long id){
        return addressServices.deleteAddress(id);
    }

    @GetMapping("Address")
    public List<Address> getAllAddress(){
        return addressServices.getAllAddress();
    }
}
