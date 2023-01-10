package com.zohoo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohoo.Entity.Billing;
import com.zohoo.Repository.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
@Autowired
private  BillingRepository billrepo;
	@Override
	public void savebill(Billing bill) {
		
		billrepo.save(bill);
	}

}
