package com.example.ecommerce.Service;

import com.example.ecommerce.Entity.Contact;
import com.example.ecommerce.Repo.ContactRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;


@Service
@Transactional
public class ContactService {

    @Autowired
    private final ContactRepo contactRepo;

    public ContactService(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    public Contact save(Contact contact) throws ParseException {
        if (contact.getId() == 0)
            contact.setId(null);
        return contactRepo.save(contact);
    }
}