package com.srk.movie_details.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User
{
    public int user_id;
    public String user_name;
    public String user_email;
    public String user_pwd;
    public Integer mid;
}