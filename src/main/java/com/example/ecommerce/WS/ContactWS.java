package com.example.ecommerce.WS;

import com.example.ecommerce.Entity.Contact;
import com.example.ecommerce.Entity.PanierDetail;
import com.example.ecommerce.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/contact")
public class ContactWS {
    @Autowired
    private final ContactService contactService;

    public ContactWS(ContactService contactService) {
        this.contactService = contactService;
    }


    @PostMapping("/")
    public ResponseEntity<Contact> save(@RequestBody Contact contact) throws ParseException {
        Contact savedDetail = contactService.save(contact);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }


}