package org.conti.example.jpah2sb.ecommerce.dao;

import org.conti.example.jpah2sb.ecommerce.entity.Shipper;

public interface ShipperDAO {
	public void addShipper(Shipper shipper);
	public Shipper getShipper(Long id);
	public void deleteShipper(Shipper shipper);
	public void updateShipper(Shipper shipper);
}
