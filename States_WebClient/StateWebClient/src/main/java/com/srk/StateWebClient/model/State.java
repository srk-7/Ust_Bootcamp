package com.srk.StateWebClient.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class State {
    @Id
    public Integer sid;
    public String sname;
    public String scode;
}
