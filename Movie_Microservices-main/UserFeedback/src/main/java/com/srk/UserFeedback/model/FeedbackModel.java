package com.srk.UserFeedback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class FeedbackModel {
    @Id
    public Integer fid;
    public String comment;
    public Integer rating;
    public Integer userid;
    public Integer mid;
}
