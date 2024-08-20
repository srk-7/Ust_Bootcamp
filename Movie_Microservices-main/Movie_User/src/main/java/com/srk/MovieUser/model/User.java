package com.srk.MovieUser.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "user")
public class User {
    @Id
    private int userid;
    private String user_name;
    private String user_email;
    private String user_pwd;
    private Integer mid;
}