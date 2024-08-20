package com.srk.UserFeedback.repository;

import com.srk.UserFeedback.model.FeedbackModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Feedbackrepo extends JpaRepository<FeedbackModel, Integer> {
    List<FeedbackModel> findByUserid(int userid);
}
