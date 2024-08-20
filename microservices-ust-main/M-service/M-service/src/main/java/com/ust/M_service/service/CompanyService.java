package com.ust.M_service.service;

import com.ust.M_service.client.Fullresponse;
import com.ust.M_service.client.Product;
import com.ust.M_service.fegin.ProductClient;
import com.ust.M_service.model.Minfo;
import com.ust.M_service.repo.Companyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private Companyrepo repo;
    @Autowired
    private ProductClient client;
    public Minfo saveCompany(Minfo company) {
        return repo.save(company);
    }

    public Fullresponse findcompanyByMcode(Long mcode) {
        Minfo c=  repo.findByMcode(mcode).orElse(null);
        List<Product> list=client.findProductsByMcode(mcode);
        Fullresponse res= new Fullresponse();
        res.setCompanyname(c.getCompanyname());
        res.setMcode(c.getMcode());
        res.setCompanyaddress(c.getCompanyaddress());
        res.setCompanyemail(c.getCompanyemail());
        res.setCompanycontact(c.getCompanycontact());
        res.setCompanywebsite(c.getCompanywebsite());
        res.setCompanylogo(c.getCompanylogo());
        res.setProduct(list);

        return res;
    }
}
