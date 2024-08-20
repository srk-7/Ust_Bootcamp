package com.srk.MovieUser.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feedback {
    public Integer fid;
    public String comment;
    public Integer rating;
    public Integer userid;
    public Integer mid;
}