package com.credmarg.test.controller;

import com.credmarg.test.entity.Email;
import com.credmarg.test.entity.Vendors;
import com.credmarg.test.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmailController {

    @Autowired
    EmailService emailLogService;
    @PostMapping("/emails")
    public Email sendEmail(@RequestBody Vendors vendor){
        return emailLogService.sendEmail(vendor);
    }
    @GetMapping("/getEmail")
    public List<Email> getEmail(){
        return emailLogService.getAllEmail();
    }
}
