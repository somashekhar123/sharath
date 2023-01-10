package com.zohoo.service;

import java.util.List;

import com.zohoo.Entity.Lead;

public interface LeadService {

	void saveLead(Lead lead);

	Lead getLeadData(Long id);

	void deleteLeadData(long id);

	List<Lead> getLeads();



	

}
