package com.ust.Security.service;

import com.ust.Security.model.Userinfo;
import com.ust.Security.repository.Userinforepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservices {

    @Autowired
    public Userinforepository repo;

    public Userinfo adduser(Userinfo userinfo) {
        return repo.save(userinfo);
    }

    public List<Userinfo> getallusers(){
        return repo.findAll();
    }
}
