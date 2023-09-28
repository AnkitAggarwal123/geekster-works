package com.geekster.University.Event.Management.Service;

import com.geekster.University.Event.Management.Model.EventEntity;
import com.geekster.University.Event.Management.Model.StudentEntity;
import com.geekster.University.Event.Management.Model.Type;
import com.geekster.University.Event.Management.Repo.IEventRepo;
import com.geekster.University.Event.Management.Repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class Services {

    @Autowired
    IEventRepo eventRepo;

    @Autowired
    IStudentRepo studentRepo;

    //Student Entity

    public String addStudent(List<StudentEntity> student){
         studentRepo.saveAll(student);
         return "Added Successfully";
    }

    public String updateDetails(Integer id, Type department){

        StudentEntity student = studentRepo.findById(id).orElse(null);

        if(student != null){
            student.setDepartment(department);
            studentRepo.save(student);
            return "Updated Successfully";
        }else{
            return "Id is Invalid";
        }

    }

    public List<StudentEntity> getAllStudent(){
        return (List<StudentEntity>) studentRepo.findAll();
    }

    public StudentEntity studentById(Integer id){
        return studentRepo.findById(id).orElse(null);
    }

    // event entity
    public String addEvent(List<EventEntity> event){
        eventRepo.saveAll(event);
        return "Added Successfully";
    }

    public String update(Integer id, String name){
        EventEntity event = eventRepo.findById(id).orElse(null);
        if(event != null){
            event.setEventName(name);
            eventRepo.save(event);
            return "Updated Successfully";
        }else{
            return "Invalid";
        }
    }

    public String deleteEvent(Integer id){
        eventRepo.deleteById(id);
        return "Deleted Successfully";
    }

    public List<EventEntity> getAllByDate(LocalDate date){
        return eventRepo.findByDateEquals(date);
    }

}
