package com.zohoo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohoo.Entity.Lead;
import com.zohoo.Repository.LeadRepository;
@Service
public class LeadServiceimpl implements LeadService {
@Autowired
private LeadRepository leadRepo;
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
		
	}
	@Override
	public Lead getLeadData(Long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override
	public void deleteLeadData(long id) {
		leadRepo.deleteById(id); 
		
	}
	@Override
	public List<Lead> getLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}
	
	
	
	

}
