package com.ust.Security.Controller;

import com.ust.Security.model.Job;
import com.ust.Security.model.Userinfo;
import com.ust.Security.service.Jobservice;
import com.ust.Security.service.Userservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

//    @GetMapping("/")
//    public String home(){
//        return "Welcome to Home Page SRK!";
//    }

    @Autowired
    private Userservices service;

    @Autowired
    private Jobservice ser;

    @PostMapping("/adduser")
    public Userinfo adduser(@RequestBody Userinfo userinfo){
        return service.adduser(userinfo);
    }

    @PostMapping("/addjob")
    public Job addjob(@RequestBody Job job){
        return ser.addjob(job);
    }

    @GetMapping("/getalljobs")
    public List<Job> getalljobs(){
        return ser.getalljobs();
    }

    @GetMapping("/getallusers")
    public List<Userinfo> getallusers(){
        return service.getallusers();
    }
}