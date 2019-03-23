package org.conti.example.jpah2sb.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="find_admin_by_Name",query="select sys from SystemAdmin sys where sys.name=?1")
public class SystemAdmin {

	@Id
	@GeneratedValue
	private Long id;
	private String userId;
	private String password;
	private String name;
	public SystemAdmin() {
		super();
	}
	public SystemAdmin(Long id,String userId, String password, String name) {
		super();
		this.id=id;
		this.userId = userId;
		this.password = password;
		this.name = name;
	}
	public SystemAdmin(String userId, String password, String name) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", userId=" + userId + ", password=" + password + ", name=" + name + "]";
	}
}
