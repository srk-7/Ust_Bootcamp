package com.ust.Security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job")
public class Job {
    @Id
    public int id;
    public String jobtitle;
    public String jobdescription;
    public String joblocation;
    public String jobtype;
    public String jobpostdate;
    public String jobskills;
    public String jobexperience;
    public String jobpackage;
}