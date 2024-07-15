package com.credmarg.test.controller;

import com.credmarg.test.entity.Vendors;
import com.credmarg.test.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VendorController {

    @Autowired
    VendorService vendorService;
    @PostMapping("/vendor")
    public ResponseEntity<List<Vendors>> createVendors(@RequestBody List<Vendors> vendor){
        List<Vendors> vendors = vendorService.saveVendors(vendor);
        return new ResponseEntity<>(vendors, HttpStatus.CREATED);
    }
    @GetMapping("/getAll")
    public List<Vendors> getAllVendors(){
        return vendorService.getAllVendors();
    }


}
