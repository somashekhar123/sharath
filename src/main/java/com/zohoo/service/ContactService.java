package com.zohoo.service;

import java.util.List;

import com.zohoo.Entity.Contact;

public interface ContactService {

	void saveContactData(Contact con);

	List<Contact> getContactData();

	Contact getcdata(long id);

}
