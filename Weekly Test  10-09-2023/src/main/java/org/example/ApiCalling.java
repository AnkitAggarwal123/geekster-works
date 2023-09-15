package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiCalling {

    @Autowired
    car carname;



    @GetMapping("api/car/name")
    public car getCar(){
        MailHandler.sendMail(carname.getCarName());
        return carname;
    }


}
