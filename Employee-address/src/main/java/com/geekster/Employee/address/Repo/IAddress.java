package com.geekster.Employee.address.Repo;

import com.geekster.Employee.address.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddress extends JpaRepository<Address, Long> {
}
