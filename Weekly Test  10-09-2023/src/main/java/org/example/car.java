package org.example;

import org.springframework.stereotype.Component;

@Component
public  class car {

    private static String CarName;

    car(){
        this.CarName = "Rolls Royce Boat Tail";
    }
    public  String getCarName() {
        return CarName;
    }

    public static String getcarname1(){
        return CarName;
    }



}
