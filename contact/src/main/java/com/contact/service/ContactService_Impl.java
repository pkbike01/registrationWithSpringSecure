package com.contact.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.entities.Contact;
import com.contact.repository.ContactRepository;

@Service
public class ContactService_Impl implements ContactService{
	
	
	
	@Autowired
	private ContactRepository contactRepo;
	
	
	

	@Override
	public void saveOneContact(Contact contact) {
		contactRepo.save(contact);
		
	}




	@Override
	public Contact getOneuser(long contactId) {
		Optional<Contact> user = contactRepo.findById(contactId);
		return user.get();
	}
}