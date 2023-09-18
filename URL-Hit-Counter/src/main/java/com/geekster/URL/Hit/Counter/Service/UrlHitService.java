package com.geekster.URL.Hit.Counter.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UrlHitService {

    Integer count = 0;

    HashMap<String, Integer> hm = new HashMap<>();

    public String getCount(){
        count++;
        return "count" + ":" +count;

    }
    //Additional work
//    public HashMap<String, Integer> getHitCount(String name) {
//        count++;
//        hm.put(name, count);
//        return hm;
//    }

}
