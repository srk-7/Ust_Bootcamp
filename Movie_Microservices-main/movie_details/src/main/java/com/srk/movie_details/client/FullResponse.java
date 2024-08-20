package com.srk.movie_details.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FullResponse
{
    public int mid;
    public String mname;
    public String director;
    public String release_year;
    public List<User> users;
}