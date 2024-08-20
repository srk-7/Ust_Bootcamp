package com.srk.MovieUser.feign;

import com.srk.MovieUser.client.Feedback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="UserFeedback", url="http://localhost:9097/feedback")
public interface FeedbackClient {
    @GetMapping("/getFeedbacksForUser/{userid}")
    public List<Feedback> getFeedbacksForUser(@PathVariable int userid);
}