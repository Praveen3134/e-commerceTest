package org.conti.example.jpah2sb.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Information {

	@Id
	@GeneratedValue
	private Long id;
//	@OneToMany(mappedBy="info")
//	private List<Address> addresses;
//	public Information(){}
//	public List<Address> getAddresses() {
//		return addresses;
//	}
//	public void addAddress(Address address) {
//		this.addresses.add(address);
//	}
//	public void removeAddress(Address address) {
//		this.addresses.remove(address);
//	}
	public Long getId() {
		return id;
	}
//	@Override
//	public String toString() {
//		return "Information [id=" + id + ", addresses=" + addresses + "]";
//	}
}
