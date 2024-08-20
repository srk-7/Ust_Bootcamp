package com.srk.UserFeedback.service;

import com.srk.UserFeedback.model.FeedbackModel;
import com.srk.UserFeedback.repository.Feedbackrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Feedbackservice {
    @Autowired
    public Feedbackrepo repo;

    public FeedbackModel addFeedback(FeedbackModel feedbackModel){
        return repo.save(feedbackModel);
    }

    public String deleteFeedback(int fid){
       repo.deleteById(fid);
       return "Feedback deleted successfully";
    }

    public List<FeedbackModel> getFeedback(){
        return repo.findAll();
    }

    public List<FeedbackModel> getFeedbacksForUser(int userid) {
        return repo.findByUserid(userid);
    }
}
