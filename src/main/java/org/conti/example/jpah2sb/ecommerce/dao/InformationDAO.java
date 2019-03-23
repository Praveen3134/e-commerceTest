package org.conti.example.jpah2sb.ecommerce.dao;

import org.conti.example.jpah2sb.ecommerce.entity.Information;

public interface InformationDAO {
	public void addInformation(Information information);
	public Information getInformation(Long id);
	public void deleteInformation(Information information);
	public void updateInformation(Information information);
}
