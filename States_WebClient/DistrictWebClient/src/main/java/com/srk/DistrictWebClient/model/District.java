package com.srk.DistrictWebClient.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class District {
    @Id
    public Integer did;
    public String dname;
    public String scode;
}
