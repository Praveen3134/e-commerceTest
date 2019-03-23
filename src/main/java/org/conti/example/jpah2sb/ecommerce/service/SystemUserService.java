package org.conti.example.jpah2sb.ecommerce.service;

import org.conti.example.jpah2sb.ecommerce.entity.SystemUser;

public interface SystemUserService {
	public void addUser(SystemUser user);
	public SystemUser getUser(Long id);
	public void deleteUser(SystemUser user);
	public void updateUser(SystemUser user);
}
