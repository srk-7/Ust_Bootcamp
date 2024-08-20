package com.ust.M_service.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fullresponse {
    public Long mcode;
    public String companyname;
    public String companyaddress;
    public String companyemail;
    public String companycontact;
    public String companywebsite;
    public String companylogo;
    public List<Product> product;


}
