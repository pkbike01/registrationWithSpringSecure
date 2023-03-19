package com.contact.service;

import com.contact.entities.Contact;

public interface ContactService {



	public void saveOneContact(Contact contact);

	public Contact getOneuser(long contactId);
}
