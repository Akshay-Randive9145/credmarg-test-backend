package com.credmarg.test.service;

import com.credmarg.test.entity.Email;
import com.credmarg.test.entity.Vendors;
import com.credmarg.test.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailLogRepository;

    public Email sendEmail(Vendors vendors) {
        String content = "Sending payments to vendor" + vendors.getName() + " at upi " + vendors.getUpi();
        Email emailLog = new Email();
        emailLog.setToEmail(vendors.getEmail());
        emailLog.setContent(content);
        System.out.println("content:" + content);
        return emailLogRepository.save(emailLog);

    }

    public List<Email> getAllEmail(){
        return emailLogRepository.findAll();
    }
}
