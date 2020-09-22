package com.contactapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.contactapp.dto.Contact;
import com.contactapp.entity.ContactEntity;
import com.contactapp.service.ContactService;

@Controller
public class ContactInfoController {
	
	@Autowired
	private ContactService service;
	
	@GetMapping(value = {"/","/addContact"})
	public String loadform(Model model)
	{
		Contact c=new Contact();
		model.addAttribute("contact",c);
		return "contactinfo";
	}
	@PostMapping(value = "/saveContact")
	public String handleSubmitBtn(ContactEntity	c,Model model)
	{
		boolean issaved=service.saveContact(c);
		if(issaved)
		{
			model.addAttribute("succmsg","ContactSaved");
		}else 
		{
			model.addAttribute("errmsg","Failed to save Contact");
		}
		return "contactinfo";
	}
}
