package com.contactapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contactapp.entity.ContactEntity;
public interface ContactService {
	boolean saveContact(ContactEntity c);
	List<ContactEntity> getAllContacts();
	ContactEntity getContactById(Integer cid);
	boolean updateContact(ContactEntity c);
	boolean deleteContact(Integer cid);
	
	
}
