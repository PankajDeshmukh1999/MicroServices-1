package com.contact.controller;
import com.contact.entity.Contact;
import com.contact.service.ContactService;
import com.contact.service.ContactServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ContactController {

    @Autowired
    private ContactService contactService;


    @RequestMapping("/contact/{userId}")    
    public List<Contact> getContacts(@PathVariable("userId") Long userId) {
        return this.contactService.getContactsOfUser(userId);
    }
    
 

}
