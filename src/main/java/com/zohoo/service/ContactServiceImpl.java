package com.zohoo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohoo.Entity.Contact;
import com.zohoo.Repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository contactrepo;

	@Override
	public void saveContactData(Contact con) {
	
		contactrepo.save(con);
	}

	@Override
	public List<Contact> getContactData() {
		List<Contact> cont = contactrepo.findAll();
		
		return cont;
	}

	@Override
	public Contact getcdata(long id) {
		Optional<Contact> findById = contactrepo.findById(id);
		Contact contact = findById.get();
		
		return contact;
	}

}
