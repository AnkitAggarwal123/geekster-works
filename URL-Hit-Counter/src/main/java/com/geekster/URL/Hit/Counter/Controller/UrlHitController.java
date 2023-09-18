package com.geekster.URL.Hit.Counter.Controller;

import com.geekster.URL.Hit.Counter.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UrlHitController {

    @Autowired
    UrlHitService US;

    @GetMapping("count")
    public String getCount(){
        return US.getCount();
    }


// Additional work
//    @GetMapping("api/v1/visitor-count-app/username/{yourusername}/count")
//    public HashMap<String, Integer> getHitCount(@PathVariable String yourusername){
//        return US.getHitCount(yourusername);
//    }
}
