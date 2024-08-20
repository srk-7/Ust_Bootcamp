package com.srk.movie_details.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="movie")
public class Movie
{
    @Id
    private int mid;
    private String mname;
    private String director;
    private String release_year;
}