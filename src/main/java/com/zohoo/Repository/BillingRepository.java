package com.zohoo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohoo.Entity.Billing;


public interface BillingRepository extends JpaRepository<Billing, Long> {

}
