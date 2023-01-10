package com.zohoo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bills")
public class Billing {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	@Column(name="first_name",nullable =false,length = 56 )
	private String firstName;
	@Column(name="last_name",nullable =false,length = 56 )
	private String lastName;
	@Column(name="email",nullable = false,unique = true,length = 128)
	private String email;
	@Column(name="mobile",nullable = false,unique = true,length = 128)
	private String mobile;
	@Column(name="product",nullable = false,length = 128)
	private String product;
	@Column(name="amount",nullable = false,length = 128)
	private int amount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
 