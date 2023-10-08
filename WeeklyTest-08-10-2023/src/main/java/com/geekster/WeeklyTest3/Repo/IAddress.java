package com.geekster.WeeklyTest3.Repo;

import com.geekster.WeeklyTest3.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddress extends JpaRepository<Address, Long> {
}
