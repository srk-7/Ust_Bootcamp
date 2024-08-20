package com.ust.M_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="m_info")
public class Minfo {
    @Id
    public Long mcode;//primary key and foreign keys
    public String companyname;
    public String companyaddress;
    public String companyemail;
    public String companycontact;
    public String companywebsite;
    public String companylogo;
    public String gstnumber;
}