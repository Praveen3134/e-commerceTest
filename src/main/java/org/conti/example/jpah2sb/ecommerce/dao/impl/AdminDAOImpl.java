package org.conti.example.jpah2sb.ecommerce.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.conti.example.jpah2sb.ecommerce.dao.AdminDAO;
import org.conti.example.jpah2sb.ecommerce.entity.Shipper;
import org.conti.example.jpah2sb.ecommerce.entity.Supplier;
import org.conti.example.jpah2sb.ecommerce.entity.SystemAdmin;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public void addAdmin(SystemAdmin admin) {
		em.merge(admin);
	}

	@Override
	@Transactional
	public SystemAdmin getAdmin(Long id) {
		SystemAdmin admin = em.find(SystemAdmin.class, id);
		return admin;
	}

	@Override
	public void deleteAdmin(SystemAdmin admin) {
	}

	@Override
	public void updateAdmin(SystemAdmin admin) {

	}

	@Override
//	@Transactional
	public SystemAdmin getAdminByName(String name) {
		TypedQuery<SystemAdmin> adminByName = em.createNamedQuery("find_admin_by_Name", SystemAdmin.class);
		adminByName.setParameter(1, name);
		SystemAdmin admin = adminByName.getSingleResult();
		return admin;
	}

	@Override
	public void addSupplier(Supplier supplier) {
		em.persist(supplier);
	}

	@Override
	public void addShipper(Shipper shipper) {
		em.persist(shipper);
	}

}
