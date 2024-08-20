package com.ust.M_service.model;

import com.ust.M_service.client.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "m_info")
public class Minfo {
    @Id
    public Long mcode;//pk/fk
    public String companyname;
    public String companyaddress;
    public String companyemail;
    public String companycontact;
    public String companywebsite;
    public String companylogo;
    public String gstnumber;


}
