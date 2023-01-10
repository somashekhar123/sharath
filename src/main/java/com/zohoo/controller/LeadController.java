package com.zohoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohoo.Entity.Billing;
import com.zohoo.Entity.Contact;
import com.zohoo.Entity.Lead;
import com.zohoo.service.BillingService;
import com.zohoo.service.ContactService;
import com.zohoo.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadservo;
	@Autowired
	private ContactService contactservo;
	@Autowired
	private BillingService billservo;
	@RequestMapping("/servlet")
	public String viewPage() {
		
		return "create_lead";
		
	}
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead")Lead lead,ModelMap model)
	{
		leadservo.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";     
		
	}
	@RequestMapping("/convertLead")
	public String getLeadData(@RequestParam("id")long id)
	{
		Lead lead =leadservo.getLeadData(id);
		
		Contact con=new Contact();
		
		con.setFirstName(lead.getFirstName());
		con.setLastName(lead.getLastName());
		con.setEmail(lead.getEmail());
		con.setMobile(lead.getMobile());
		contactservo.saveContactData(con);
		leadservo.deleteLeadData(lead.getId());
		return "create_lead";
		
	}
	@RequestMapping("/listall")
	public String getLeadData(ModelMap model)
	{
		List<Lead>leads=leadservo.getLeads();
		model.addAttribute("leads", leads);
		return "list_lead";
		
	}
	@RequestMapping("/finddata")
	public String getLeadOne(@RequestParam("id")long id,ModelMap model)
	{
		Lead lead =leadservo.getLeadData(id);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
	@RequestMapping("/listcontact")
	public String listContactData(ModelMap model)
	{
		List<Contact> cont=contactservo.getContactData();
		model.addAttribute("cont", cont);
		return "list_contact";
		
		
	}
	@RequestMapping("/generatebill")
public String bill(@RequestParam("id")long id,ModelMap m)
{
		Contact contact=contactservo.getcdata(id);
		m.addAttribute("con",contact );
	return "list_contacts";
}
	@RequestMapping("/saveBill")
	public String saveBilllData(@ModelAttribute("bill")Billing bill)
	{
		billservo.savebill(bill);
		return "list_contacts";
		
	}
	
}
