package com.srk.MovieUser.client;

import com.srk.MovieUser.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FullResponse {
    private User user;
    private List<Feedback> feedback;
}
