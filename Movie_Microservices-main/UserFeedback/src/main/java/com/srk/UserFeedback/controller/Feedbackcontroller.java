package com.srk.UserFeedback.controller;

import com.srk.UserFeedback.model.FeedbackModel;
import com.srk.UserFeedback.service.Feedbackservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class Feedbackcontroller {
    @Autowired
    public Feedbackservice service;

    @GetMapping("/getFeedback")
    public List<FeedbackModel> getFeedback(){
        return service.getFeedback();
    }

    @DeleteMapping("/deleteFeedback/{fid}")
    public String deleteFeedback(@PathVariable int fid) {
        return service.deleteFeedback(fid);
    }

    @PostMapping("/addFeedback")
    public FeedbackModel addFeedback(@RequestBody FeedbackModel feedback) {
        return service.addFeedback(feedback);
    }

    @GetMapping("/getFeedbacksForUser/{userid}")
    public List<FeedbackModel> getFeedbacksForUser(@PathVariable int userid){
        return service.getFeedbacksForUser(userid);
    }
}
