package com.credmarg.test.service;

import com.credmarg.test.entity.Vendors;
import com.credmarg.test.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {
    @Autowired
    VendorRepository vendorRepository;

     public List<Vendors> saveVendors(List<Vendors> vendors){
         return vendorRepository.saveAll(vendors);
     }

     public List<Vendors> getAllVendors(){
         return vendorRepository.findAll();
     }
}
