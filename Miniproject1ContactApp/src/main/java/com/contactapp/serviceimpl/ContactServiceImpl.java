package com.contactapp.serviceimpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.contactapp.dao.ContactDtlsRepository;
import com.contactapp.entity.ContactEntity;
import com.contactapp.service.ContactService;
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private ContactDtlsRepository contactRepo;
	@Override
	public boolean saveContact(ContactEntity c) {
		ContactEntity entity=new ContactEntity();
		BeanUtils.copyProperties(c, entity);
		ContactEntity savedentity=contactRepo.save(entity);
		return savedentity.getContactId() !=null;
	}

	@Override
	public List<ContactEntity> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContactEntity getContactById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateContact(ContactEntity c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}

}
