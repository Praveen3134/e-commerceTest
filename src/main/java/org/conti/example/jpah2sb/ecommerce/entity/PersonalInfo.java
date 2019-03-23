package org.conti.example.jpah2sb.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class PersonalInfo extends Information{
	private String phoneNo;
	private String email;
	@OneToOne
	private SystemUser user;
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "PersonalInfo [phoneNo=" + phoneNo + ", email=" + email + "]";
	}
}
