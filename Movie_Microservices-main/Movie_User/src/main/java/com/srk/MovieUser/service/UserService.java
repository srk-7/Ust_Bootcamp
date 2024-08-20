package com.srk.MovieUser.service;

import com.srk.MovieUser.client.Feedback;
import com.srk.MovieUser.client.FullResponse;
import com.srk.MovieUser.feign.FeedbackClient;
import com.srk.MovieUser.model.User;
import com.srk.MovieUser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepository repo;
    @Autowired
    public FeedbackClient c;

    public User createUser(User user) {
        return repo.save(user);
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public String deleteUser(int id) {
        repo.deleteById(id);
        return "User deleted successfully";
    }

    public List<User> getUsersByMid(Integer mid) {
        return repo.findByMid(mid);
    }

    public FullResponse getUserWithFeedbacks(int userid) {
        FullResponse response = new FullResponse();
        User user = repo.findById(userid).orElse(null);
        if (user != null) {
            List<Feedback> feedbacks = c.getFeedbacksForUser(userid);
            response.setUser(user);
            response.setFeedback(feedbacks);
        }
        return response;
    }
}