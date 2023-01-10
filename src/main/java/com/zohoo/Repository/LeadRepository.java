package com.zohoo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohoo.Entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
