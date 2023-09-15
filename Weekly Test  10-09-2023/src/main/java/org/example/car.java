package org.example;

import org.springframework.stereotype.Component;

@Component
public  class car {

    private  String CarName;

    car(){
        this.CarName = "Rolls Royce Boat Tail";
    }
    public  String getCarName() {
        return CarName;
    }




}
