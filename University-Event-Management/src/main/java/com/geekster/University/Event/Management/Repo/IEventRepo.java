package com.geekster.University.Event.Management.Repo;

import com.geekster.University.Event.Management.Model.EventEntity;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface IEventRepo extends CrudRepository<EventEntity, Integer> {


    List<EventEntity> findByDateEquals(LocalDate date);
}
