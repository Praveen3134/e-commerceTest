package org.conti.example.jpah2sb.ecommerce.dao;

import org.conti.example.jpah2sb.ecommerce.entity.PersonalInfo;

public interface PersonalInfoDAO {
	public void addPersonalInfo(PersonalInfo personalInfo);
	public PersonalInfo getPersonalInfo(Long id);
	public void deletePersonalInfo(PersonalInfo personalInfo);
	public void updatePersonalInfo(PersonalInfo personalInfo);
}
