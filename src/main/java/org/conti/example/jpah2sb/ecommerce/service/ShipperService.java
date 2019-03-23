package org.conti.example.jpah2sb.ecommerce.service;

import org.conti.example.jpah2sb.ecommerce.entity.Shipper;

public interface ShipperService {
	public void addShipper(Shipper shipper);
	public Shipper getShipper(Long id);
	public void deleteShipper(Shipper shipper);
	public void updateShipper(Shipper shipper);
}
