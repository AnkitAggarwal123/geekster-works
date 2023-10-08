package com.geekster.WeeklyTest3.Services;

import com.geekster.WeeklyTest3.Model.Address;
import com.geekster.WeeklyTest3.Repo.IAddress;
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

    public String updateAddressInfo(Long id,String newAddress) {
        Address address1 = address.findById(id).orElseThrow();
        address1.setCountry(newAddress);
        address.save(address1);
        return "Updated Successfully";

    }

    public String deleteAddress(Long id) {
        address.deleteById(id);
        return "Delete Successfully";
    }

    public List<Address> getAllAddress() {
        return address.findAll();
    }
}
