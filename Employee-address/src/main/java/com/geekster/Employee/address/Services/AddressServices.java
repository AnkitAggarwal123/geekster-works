package com.geekster.Employee.address.Services;

import com.geekster.Employee.address.Model.Address;
import com.geekster.Employee.address.Repo.IAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServices {

    @Autowired
    IAddress address;

    public String addAddress(Address newAddress){
        address.save(newAddress);
        return "Added Successfully";
    }

    public List<Address> getAllAddress(){
        return address.findAll();
    }

    public Address getAddress(Long id){
        return address.findById(id).orElse(null);
    }

    public String updateAddress(Long id, Address newAddress){
        Address ads = address.findById(id).orElse(null);
        ads.setState(newAddress.getState());
        address.save(ads);
        return "Updated Successfully";
    }

    public String deleteById(Long id){
        address.deleteById(id);
        return "Deleted Successfully";
    }


}
