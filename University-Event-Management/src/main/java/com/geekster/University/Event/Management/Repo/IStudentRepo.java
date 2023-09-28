package com.geekster.University.Event.Management.Repo;

import com.geekster.University.Event.Management.Model.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo extends CrudRepository<StudentEntity, Integer> {


}
