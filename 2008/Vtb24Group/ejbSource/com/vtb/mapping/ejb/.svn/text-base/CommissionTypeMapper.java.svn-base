package com.vtb.mapping.ejb;

import java.util.ArrayList;

import javax.ejb.EJBLocalObject;

import com.vtb.domain.CommissionType;
import com.vtb.domain.VtbObject;
import com.vtb.ejb.CommissionTypeEJBLocal;
import com.vtb.ejb.CommissionTypeEJBLocalHome;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.exception.NoSuchObjectException;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;

public class CommissionTypeMapper extends DomainEJBMapper implements com.vtb.mapping.CommissionTypeMapper {
	CommissionTypeEJBLocalHome commissionTypeHome;

	/**
	 * 
	 */
	public CommissionTypeMapper() {
		super();
		createInitialContext();
		createCommissionTypeHome();
	}

	/**
	 * This method retrieves an instance of CommissionTypeEJBHome from the JNDI
	 * initial context. Creation date: (2/19/00 3:02:08 PM)
	 */
	protected void createCommissionTypeHome() {
		try {
			commissionTypeHome = (CommissionTypeEJBLocalHome) initContext.lookup("java:comp/env/ejb/CommissionTypeEJB");
		} catch (Exception e) { // Error getting the home interface
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " in createCommissionTypeHome()");
		}
	}

	@Override
	protected EJBLocalObject findEJBObjectMatching(VtbObject domainObject) throws MappingException {
		CommissionTypeEJBLocal commissionTypeEJB = null;
		try {
			CommissionType commissionType = (CommissionType) domainObject;
			commissionTypeEJB = commissionTypeHome.findByPrimaryKey(commissionType.getId());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in CommissionTypeMapper.findEJBObjectMatching()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in in CommissionTypeMapper.findEJBObjectMatching()"));
		}
		return commissionTypeEJB;
	}

	@Override
	public VtbObject map(EJBLocalObject input) throws MappingException {
		CommissionTypeEJBLocal ejb;
		try {
			ejb = (CommissionTypeEJBLocal) input;
		} catch (ClassCastException e) {
			throw new MappingException(e, "Attempt to map a non CommissionTypeEJB in CommissionTypeMapper");
		}
		CommissionType commissionType = null;
		try {
			commissionType = new CommissionType((Integer) ejb.getPrimaryKey());
			commissionType.setName(ejb.getName());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in CommissionTypeMapper.map()");
			throw new MappingException(e, "Wrapped Exception caught in CommissionTypeMapper.map()");
		}
		return commissionType;
	}

	public ArrayList findByName(String name, String orderBy) throws MappingException {
		throw new MappingException("findByName not valid for this type");
	}

	public void insert(VtbObject anObject) throws DuplicateKeyException, MappingException {
		try {
			CommissionType commissionType = (CommissionType) anObject;
			commissionTypeHome.create(commissionType.getId(), commissionType.getName());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in CommissionTypeMapper.insert()");
			throw new MappingException(e, ("Wrapped Exception " + e + " caught in CommissionTypeMapper.insert()"));
		}
	}

	public void update(VtbObject anObject) throws NoSuchObjectException, MappingException {
		try {
			CommissionType commissionType = (CommissionType) anObject;
			CommissionTypeEJBLocal commissionTypeEJB = commissionTypeHome.findByPrimaryKey(commissionType.getId());
			commissionTypeEJB.setName(commissionType.getName());
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in CommissionTypeMapper.update()");
			throw new MappingException(e, "Wrapped Exception caught in CommissionTypeMapper.update()");
		}
	}

}
