package com.contact.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.contact.entities.Contact;
import com.contact.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	
	
	@RequestMapping("/view")
	public String newContact() {
		return "newRegis";
	}
	
	
	@RequestMapping("/save")
	public String saveOneContact(@ModelAttribute("contact") Contact contact,Model model) {
		contactService.saveOneContact(contact);
		model.addAttribute("msg","your data has been saved.....");
		return "newRegis";
		
	}
	
	

}
