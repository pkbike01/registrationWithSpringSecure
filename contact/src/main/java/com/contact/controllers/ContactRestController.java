package com.contact.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entities.Contact;
import com.contact.service.ContactService;

@RestController

@RequestMapping("/api/contact")
public class ContactRestController {
	
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/{contactId}")
	public Contact getOneUser(@PathVariable("contactId") long contactId) {
		Contact user = contactService.getOneuser(contactId);
		return user;
		
	}
	
	@GetMapping
	public List<Contact> getAllContact(){
		return null;
	}

}
