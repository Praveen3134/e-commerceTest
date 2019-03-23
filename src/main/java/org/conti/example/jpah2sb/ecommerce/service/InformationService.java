package org.conti.example.jpah2sb.ecommerce.service;

import org.conti.example.jpah2sb.ecommerce.entity.Information;

public interface InformationService {
	public void addInformation(Information information);
	public Information getInformation(Long id);
	public void deleteInformation(Information information);
	public void updateInformation(Information information);
}
