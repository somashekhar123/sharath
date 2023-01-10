package com.zohoo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohoo.Entity.Contact;


public interface ContactRepository extends JpaRepository<Contact, Long> {

}
