package org.conti.example.jpah2sb.ecommerce.dao;

import org.conti.example.jpah2sb.ecommerce.entity.BillingInfo;

public interface BillingInfoDAO {
	public void addBillingInfo(BillingInfo billingInfo);
	public BillingInfo getBillingInfo(Long id);
	public void deleteBillingInfo(BillingInfo billingInfo);
	public void updateBillingInfo(BillingInfo billingInfo);
}
