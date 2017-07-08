package com.vtb.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalStatelessSecurityActionProcessorFacade_97697a53
 */
public class EJSLocalStatelessSecurityActionProcessorFacade_97697a53 extends EJSLocalWrapper implements com.vtb.ejb.SecurityActionProcessorFacadeLocal {
	/**
	 * EJSLocalStatelessSecurityActionProcessorFacade_97697a53
	 */
	public EJSLocalStatelessSecurityActionProcessorFacade_97697a53() {
		super();	}
	/**
	 * findAddressByKey
	 */
	public com.vtb.domain.Address findAddressByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchAddressException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.Address _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 0, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findAddressByKey(aId);
		}
		catch (com.vtb.exception.NoSuchAddressException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 0, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findDepartmentByKey
	 */
	public com.vtb.domain.Department findDepartmentByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchDepartmentException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.Department _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 1, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findDepartmentByKey(aId);
		}
		catch (com.vtb.exception.NoSuchDepartmentException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 1, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findGovernByKey
	 */
	public com.vtb.domain.Govern findGovernByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchGovernException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.Govern _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 2, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findGovernByKey(aId);
		}
		catch (com.vtb.exception.NoSuchGovernException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 2, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findMqSchedulerSheetByKey
	 */
	public com.vtb.domain.MQSchedulerSheet findMqSchedulerSheetByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchMqSchedulerSheetException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.MQSchedulerSheet _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 3, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findMqSchedulerSheetByKey(aId);
		}
		catch (com.vtb.exception.NoSuchMqSchedulerSheetException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 3, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findManagerByKey
	 */
	public com.vtb.domain.Manager findManagerByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchManagerException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.Manager _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 4, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findManagerByKey(aId);
		}
		catch (com.vtb.exception.NoSuchManagerException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 4, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOkvedByKey
	 */
	public com.vtb.domain.Okved findOkvedByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchOkvedException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.Okved _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 5, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOkvedByKey(aId);
		}
		catch (com.vtb.exception.NoSuchOkvedException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 5, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOperatorByKey
	 */
	public com.vtb.domain.Operator findOperatorByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchOperatorException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.Operator _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 6, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOperatorByKey(aId);
		}
		catch (com.vtb.exception.NoSuchOperatorException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 6, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOperatorByLogin
	 */
	public com.vtb.domain.Operator findOperatorByLogin(java.lang.String aLogin) throws com.vtb.exception.NoSuchOperatorException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.Operator _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aLogin;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 7, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOperatorByLogin(aLogin);
		}
		catch (com.vtb.exception.NoSuchOperatorException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 7, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOrganizationByCrmKey
	 */
	public com.vtb.domain.Organization findOrganizationByCrmKey(java.lang.String aIdCrm) throws com.vtb.exception.NoSuchOrganizationException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.Organization _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aIdCrm;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 8, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOrganizationByCrmKey(aIdCrm);
		}
		catch (com.vtb.exception.NoSuchOrganizationException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 8, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOrganizationByKey
	 */
	public com.vtb.domain.Organization findOrganizationByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchOrganizationException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.Organization _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 9, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOrganizationByKey(aId);
		}
		catch (com.vtb.exception.NoSuchOrganizationException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 9, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOrganizationGroupByCrmKey
	 */
	public com.vtb.domain.OrganizationGroup findOrganizationGroupByCrmKey(java.lang.String aCrmKey) throws com.vtb.exception.NoSuchOrganizationGroupException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.OrganizationGroup _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aCrmKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 10, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOrganizationGroupByCrmKey(aCrmKey);
		}
		catch (com.vtb.exception.NoSuchOrganizationGroupException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 10, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOrganizationGroupByKey
	 */
	public com.vtb.domain.OrganizationGroup findOrganizationGroupByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchOrganizationGroupException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.OrganizationGroup _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 11, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOrganizationGroupByKey(aId);
		}
		catch (com.vtb.exception.NoSuchOrganizationGroupException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 11, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOwnershipFormTypeByKey
	 */
	public com.vtb.domain.OwnershipFormType findOwnershipFormTypeByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchOwnershipFormTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.OwnershipFormType _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 12, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOwnershipFormTypeByKey(aId);
		}
		catch (com.vtb.exception.NoSuchOwnershipFormTypeException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 12, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findSpoSettingByKey
	 */
	public com.vtb.domain.SPOSettings findSpoSettingByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchSpoSettingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.SPOSettings _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 13, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findSpoSettingByKey(aId);
		}
		catch (com.vtb.exception.NoSuchSpoSettingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 13, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findShareholderByKey
	 */
	public com.vtb.domain.Shareholder findShareholderByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchShareholderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.Shareholder _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 14, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findShareholderByKey(aId);
		}
		catch (com.vtb.exception.NoSuchShareholderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 14, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findAddressListByOrganization
	 */
	public java.util.ArrayList findAddressListByOrganization(java.lang.Integer organizationID, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = organizationID;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 15, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findAddressListByOrganization(organizationID, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 15, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findDepartments
	 */
	public java.util.ArrayList findDepartments(java.lang.String nameDepartment, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameDepartment;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 16, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findDepartments(nameDepartment, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 16, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findGovernListByOrganization
	 */
	public java.util.ArrayList findGovernListByOrganization(java.lang.Integer organizationID, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = organizationID;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 17, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findGovernListByOrganization(organizationID, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 17, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findGroupListByOrganization
	 */
	public java.util.ArrayList findGroupListByOrganization(java.lang.Integer organizationID, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = organizationID;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 18, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findGroupListByOrganization(organizationID, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 18, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findGroupListTO_ByOrganization
	 */
	public java.util.ArrayList findGroupListTO_ByOrganization(java.lang.Integer organizationID, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = organizationID;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 19, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findGroupListTO_ByOrganization(organizationID, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 19, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findGroupListTO_ByOrganizationCRM
	 */
	public java.util.ArrayList findGroupListTO_ByOrganizationCRM(java.lang.String orgCrmID, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = orgCrmID;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 20, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findGroupListTO_ByOrganizationCRM(orgCrmID, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 20, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findManagerListByOrganization
	 */
	public java.util.ArrayList findManagerListByOrganization(java.lang.Integer organizationID, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = organizationID;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 21, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findManagerListByOrganization(organizationID, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 21, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findMqSchedulerSheetList
	 */
	public java.util.ArrayList findMqSchedulerSheetList(java.lang.Integer departmentKey, java.lang.String searchStr, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[3];
				_jacc_parms[0] = departmentKey;
				_jacc_parms[1] = searchStr;
				_jacc_parms[2] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 22, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findMqSchedulerSheetList(departmentKey, searchStr, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 22, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOkvedHierarchyList
	 */
	public java.util.ArrayList findOkvedHierarchyList(java.lang.Integer parentID, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = parentID;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 23, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOkvedHierarchyList(parentID, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 23, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOkvedList
	 */
	public java.util.ArrayList findOkvedList(java.lang.String nameOkved, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameOkved;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 24, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOkvedList(nameOkved, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 24, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOkvedListByOrganization
	 */
	public java.util.ArrayList findOkvedListByOrganization(java.lang.Integer organizationID, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = organizationID;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 25, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOkvedListByOrganization(organizationID, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 25, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOkvedListTO
	 */
	public java.util.ArrayList findOkvedListTO(java.lang.String nameOkved, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameOkved;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 26, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOkvedListTO(nameOkved, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 26, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOkvedListTO_ByOrganization
	 */
	public java.util.ArrayList findOkvedListTO_ByOrganization(java.lang.Integer organizationID, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = organizationID;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 27, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOkvedListTO_ByOrganization(organizationID, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 27, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOperatorToRoleAccessList
	 */
	public java.util.ArrayList findOperatorToRoleAccessList(java.lang.String operatorKey, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = operatorKey;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 28, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOperatorToRoleAccessList(operatorKey, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 28, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOperatorToRoleAccessList
	 */
	public java.util.ArrayList findOperatorToRoleAccessList(java.lang.String operatorKey, java.lang.String aProcessID, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[3];
				_jacc_parms[0] = operatorKey;
				_jacc_parms[1] = aProcessID;
				_jacc_parms[2] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 29, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOperatorToRoleAccessList(operatorKey, aProcessID, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 29, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOperatorToRoleList
	 */
	public java.util.ArrayList findOperatorToRoleList(java.lang.String operatorKey, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = operatorKey;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 30, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOperatorToRoleList(operatorKey, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 30, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOperators
	 */
	public java.util.ArrayList findOperators(java.lang.Integer departmentKey, java.lang.String nameOperator, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[3];
				_jacc_parms[0] = departmentKey;
				_jacc_parms[1] = nameOperator;
				_jacc_parms[2] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 31, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOperators(departmentKey, nameOperator, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 31, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOrganizationGroupList
	 */
	public java.util.ArrayList findOrganizationGroupList(java.lang.String nameOrganizationGroup, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameOrganizationGroup;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 32, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOrganizationGroupList(nameOrganizationGroup, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 32, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOrganizationGroupListTO
	 */
	public java.util.ArrayList findOrganizationGroupListTO(java.lang.String nameOrganizationGroup, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameOrganizationGroup;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 33, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOrganizationGroupListTO(nameOrganizationGroup, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 33, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOrganizationList
	 */
	public java.util.ArrayList findOrganizationList(java.lang.String nameOrganization, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameOrganization;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 34, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOrganizationList(nameOrganization, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 34, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOrganizationListByGroup
	 */
	public java.util.ArrayList findOrganizationListByGroup(java.lang.Integer groupID, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = groupID;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 35, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOrganizationListByGroup(groupID, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 35, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOrganizationListTO
	 */
	public java.util.ArrayList findOrganizationListTO(java.lang.String nameOrganization, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameOrganization;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 36, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOrganizationListTO(nameOrganization, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 36, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOrganizationListTO_ByGroup
	 */
	public java.util.ArrayList findOrganizationListTO_ByGroup(java.lang.Integer groupID, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = groupID;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 37, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOrganizationListTO_ByGroup(groupID, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 37, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOrganizationListTO_ByGroupCRM
	 */
	public java.util.ArrayList findOrganizationListTO_ByGroupCRM(java.lang.String groupCrmID, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = groupCrmID;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 38, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOrganizationListTO_ByGroupCRM(groupCrmID, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 38, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findOwnershipFormTypeList
	 */
	public java.util.ArrayList findOwnershipFormTypeList(java.lang.String nameOwnershipFormType, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameOwnershipFormType;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 39, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOwnershipFormTypeList(nameOwnershipFormType, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 39, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findProcessTypeList
	 */
	public java.util.ArrayList findProcessTypeList(java.lang.String nameProcessType, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameProcessType;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 40, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findProcessTypeList(nameProcessType, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 40, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findShareholderListByOrganization
	 */
	public java.util.ArrayList findShareholderListByOrganization(java.lang.Integer organizationID, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = organizationID;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 41, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findShareholderListByOrganization(organizationID, orderBy);
		}
		catch (com.vtb.exception.ModelException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 41, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * addAddress
	 */
	public void addAddress(com.vtb.domain.Address newAddress) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newAddress;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 42, _EJS_s, _jacc_parms);
			beanRef.addAddress(newAddress);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 42, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addDepartment
	 */
	public void addDepartment(com.vtb.domain.Department newDepartment) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newDepartment;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 43, _EJS_s, _jacc_parms);
			beanRef.addDepartment(newDepartment);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 43, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addGovern
	 */
	public void addGovern(com.vtb.domain.Govern newGovern) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newGovern;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 44, _EJS_s, _jacc_parms);
			beanRef.addGovern(newGovern);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 44, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addLinkGroupCrmToOrganization
	 */
	public void addLinkGroupCrmToOrganization(java.lang.String groupCrmKey, java.lang.String organizationKey) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = groupCrmKey;
				_jacc_parms[1] = organizationKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 45, _EJS_s, _jacc_parms);
			beanRef.addLinkGroupCrmToOrganization(groupCrmKey, organizationKey);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 45, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addLinkGroupCrmToOrganizationCRM
	 */
	public void addLinkGroupCrmToOrganizationCRM(java.lang.String groupCrmKey, java.lang.String organizationCrmKey) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = groupCrmKey;
				_jacc_parms[1] = organizationCrmKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 46, _EJS_s, _jacc_parms);
			beanRef.addLinkGroupCrmToOrganizationCRM(groupCrmKey, organizationCrmKey);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 46, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addLinkGroupToOrganization
	 */
	public void addLinkGroupToOrganization(java.lang.String groupKey, java.lang.String organizationKey) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = groupKey;
				_jacc_parms[1] = organizationKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 47, _EJS_s, _jacc_parms);
			beanRef.addLinkGroupToOrganization(groupKey, organizationKey);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 47, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addLinkGroupToOrganizationCRM
	 */
	public void addLinkGroupToOrganizationCRM(java.lang.String groupKey, java.lang.String organizationCrmKey) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = groupKey;
				_jacc_parms[1] = organizationCrmKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 48, _EJS_s, _jacc_parms);
			beanRef.addLinkGroupToOrganizationCRM(groupKey, organizationCrmKey);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 48, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addLinkOkvedCrmToOrganization
	 */
	public void addLinkOkvedCrmToOrganization(java.lang.String okvedCrmKey, java.lang.String organizationKey) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = okvedCrmKey;
				_jacc_parms[1] = organizationKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 49, _EJS_s, _jacc_parms);
			beanRef.addLinkOkvedCrmToOrganization(okvedCrmKey, organizationKey);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 49, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addLinkOkvedToOrganization
	 */
	public void addLinkOkvedToOrganization(java.lang.String okvedKey, java.lang.String organizationKey) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = okvedKey;
				_jacc_parms[1] = organizationKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 50, _EJS_s, _jacc_parms);
			beanRef.addLinkOkvedToOrganization(okvedKey, organizationKey);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 50, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addLinkOperatorToRole
	 */
	public void addLinkOperatorToRole(java.lang.String operatorKey, java.lang.String roleKey) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = operatorKey;
				_jacc_parms[1] = roleKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 51, _EJS_s, _jacc_parms);
			beanRef.addLinkOperatorToRole(operatorKey, roleKey);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 51, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addManager
	 */
	public void addManager(com.vtb.domain.Manager newManager) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newManager;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 52, _EJS_s, _jacc_parms);
			beanRef.addManager(newManager);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 52, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addMqSchedulerSheet
	 */
	public void addMqSchedulerSheet(com.vtb.domain.MQSchedulerSheet newMqSchedulerSheet) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newMqSchedulerSheet;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 53, _EJS_s, _jacc_parms);
			beanRef.addMqSchedulerSheet(newMqSchedulerSheet);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 53, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addOkved
	 */
	public void addOkved(com.vtb.domain.Okved newOkved) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newOkved;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 54, _EJS_s, _jacc_parms);
			beanRef.addOkved(newOkved);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 54, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addOperator
	 */
	public void addOperator(com.vtb.domain.Operator newOperator) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newOperator;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 55, _EJS_s, _jacc_parms);
			beanRef.addOperator(newOperator);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 55, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addOrganization
	 */
	public void addOrganization(com.vtb.domain.Organization newOrganization) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newOrganization;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 56, _EJS_s, _jacc_parms);
			beanRef.addOrganization(newOrganization);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 56, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addOrganizationGroup
	 */
	public void addOrganizationGroup(com.vtb.domain.OrganizationGroup newOrganizationGroup) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newOrganizationGroup;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 57, _EJS_s, _jacc_parms);
			beanRef.addOrganizationGroup(newOrganizationGroup);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 57, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addOwnershipFormType
	 */
	public void addOwnershipFormType(com.vtb.domain.OwnershipFormType newOwnershipFormType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newOwnershipFormType;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 58, _EJS_s, _jacc_parms);
			beanRef.addOwnershipFormType(newOwnershipFormType);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 58, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addShareholder
	 */
	public void addShareholder(com.vtb.domain.Shareholder newShareholder) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newShareholder;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 59, _EJS_s, _jacc_parms);
			beanRef.addShareholder(newShareholder);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 59, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addSpoSetting
	 */
	public void addSpoSetting(com.vtb.domain.SPOSettings newSpoSetting) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newSpoSetting;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 60, _EJS_s, _jacc_parms);
			beanRef.addSpoSetting(newSpoSetting);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 60, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * deleteLinkGroupCrmToOrganization
	 */
	public void deleteLinkGroupCrmToOrganization(java.lang.String groupCrmKey, java.lang.String organizationKey) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = groupCrmKey;
				_jacc_parms[1] = organizationKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 61, _EJS_s, _jacc_parms);
			beanRef.deleteLinkGroupCrmToOrganization(groupCrmKey, organizationKey);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 61, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * deleteLinkGroupCrmToOrganizationCRM
	 */
	public void deleteLinkGroupCrmToOrganizationCRM(java.lang.String groupCrmKey, java.lang.String organizationCrmKey) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = groupCrmKey;
				_jacc_parms[1] = organizationCrmKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 62, _EJS_s, _jacc_parms);
			beanRef.deleteLinkGroupCrmToOrganizationCRM(groupCrmKey, organizationCrmKey);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 62, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * deleteLinkGroupToOrganization
	 */
	public void deleteLinkGroupToOrganization(java.lang.String groupKey, java.lang.String organizationKey) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = groupKey;
				_jacc_parms[1] = organizationKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 63, _EJS_s, _jacc_parms);
			beanRef.deleteLinkGroupToOrganization(groupKey, organizationKey);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 63, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * deleteLinkGroupToOrganizationCRM
	 */
	public void deleteLinkGroupToOrganizationCRM(java.lang.String groupKey, java.lang.String organizationCrmKey) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = groupKey;
				_jacc_parms[1] = organizationCrmKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 64, _EJS_s, _jacc_parms);
			beanRef.deleteLinkGroupToOrganizationCRM(groupKey, organizationCrmKey);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 64, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * deleteLinkOkvedCrmToOrganization
	 */
	public void deleteLinkOkvedCrmToOrganization(java.lang.String okvedCrmKey, java.lang.String organizationKey) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = okvedCrmKey;
				_jacc_parms[1] = organizationKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 65, _EJS_s, _jacc_parms);
			beanRef.deleteLinkOkvedCrmToOrganization(okvedCrmKey, organizationKey);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 65, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * deleteLinkOkvedToOrganization
	 */
	public void deleteLinkOkvedToOrganization(java.lang.String okvedKey, java.lang.String organizationKey) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = okvedKey;
				_jacc_parms[1] = organizationKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 66, _EJS_s, _jacc_parms);
			beanRef.deleteLinkOkvedToOrganization(okvedKey, organizationKey);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 66, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * deleteLinkOperatorToRole
	 */
	public void deleteLinkOperatorToRole(java.lang.String operatorKey, java.lang.String roleKey) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = operatorKey;
				_jacc_parms[1] = roleKey;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 67, _EJS_s, _jacc_parms);
			beanRef.deleteLinkOperatorToRole(operatorKey, roleKey);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 67, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeAddress
	 */
	public void removeAddress(java.lang.Integer aId) throws com.vtb.exception.NoSuchAddressException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 68, _EJS_s, _jacc_parms);
			beanRef.removeAddress(aId);
		}
		catch (com.vtb.exception.NoSuchAddressException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 68, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeDepartment
	 */
	public void removeDepartment(java.lang.Integer aId) throws com.vtb.exception.NoSuchDepartmentException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 69, _EJS_s, _jacc_parms);
			beanRef.removeDepartment(aId);
		}
		catch (com.vtb.exception.NoSuchDepartmentException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 69, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeGovern
	 */
	public void removeGovern(java.lang.Integer aId) throws com.vtb.exception.NoSuchGovernException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 70, _EJS_s, _jacc_parms);
			beanRef.removeGovern(aId);
		}
		catch (com.vtb.exception.NoSuchGovernException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 70, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeManager
	 */
	public void removeManager(java.lang.Integer aId) throws com.vtb.exception.NoSuchManagerException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 71, _EJS_s, _jacc_parms);
			beanRef.removeManager(aId);
		}
		catch (com.vtb.exception.NoSuchManagerException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 71, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeMqSchedulerSheet
	 */
	public void removeMqSchedulerSheet(java.lang.Integer aId) throws com.vtb.exception.NoSuchMqSchedulerSheetException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 72, _EJS_s, _jacc_parms);
			beanRef.removeMqSchedulerSheet(aId);
		}
		catch (com.vtb.exception.NoSuchMqSchedulerSheetException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 72, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeOkved
	 */
	public void removeOkved(java.lang.Integer aId) throws com.vtb.exception.NoSuchOkvedException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 73, _EJS_s, _jacc_parms);
			beanRef.removeOkved(aId);
		}
		catch (com.vtb.exception.NoSuchOkvedException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 73, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeOperator
	 */
	public void removeOperator(java.lang.Integer aId) throws com.vtb.exception.NoSuchOperatorException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 74, _EJS_s, _jacc_parms);
			beanRef.removeOperator(aId);
		}
		catch (com.vtb.exception.NoSuchOperatorException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 74, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeOrganization
	 */
	public void removeOrganization(java.lang.Integer aId) throws com.vtb.exception.NoSuchOrganizationException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 75, _EJS_s, _jacc_parms);
			beanRef.removeOrganization(aId);
		}
		catch (com.vtb.exception.NoSuchOrganizationException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 75, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeOrganizationGroup
	 */
	public void removeOrganizationGroup(java.lang.Integer aId) throws com.vtb.exception.NoSuchOrganizationGroupException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 76, _EJS_s, _jacc_parms);
			beanRef.removeOrganizationGroup(aId);
		}
		catch (com.vtb.exception.NoSuchOrganizationGroupException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 76, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeOwnershipFormType
	 */
	public void removeOwnershipFormType(java.lang.Integer aId) throws com.vtb.exception.NoSuchOwnershipFormTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 77, _EJS_s, _jacc_parms);
			beanRef.removeOwnershipFormType(aId);
		}
		catch (com.vtb.exception.NoSuchOwnershipFormTypeException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 77, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeShareholder
	 */
	public void removeShareholder(java.lang.Integer aId) throws com.vtb.exception.NoSuchShareholderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 78, _EJS_s, _jacc_parms);
			beanRef.removeShareholder(aId);
		}
		catch (com.vtb.exception.NoSuchShareholderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 78, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * removeSpoSetting
	 */
	public void removeSpoSetting(java.lang.Integer aId) throws com.vtb.exception.NoSuchSpoSettingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 79, _EJS_s, _jacc_parms);
			beanRef.removeSpoSetting(aId);
		}
		catch (com.vtb.exception.NoSuchSpoSettingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 79, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * setStatusLinkOperatorToRole
	 */
	public void setStatusLinkOperatorToRole(java.lang.String operatorKey, java.lang.String roleKey, java.lang.String status) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[3];
				_jacc_parms[0] = operatorKey;
				_jacc_parms[1] = roleKey;
				_jacc_parms[2] = status;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 80, _EJS_s, _jacc_parms);
			beanRef.setStatusLinkOperatorToRole(operatorKey, roleKey, status);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 80, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateAddress
	 */
	public void updateAddress(com.vtb.domain.Address aAddress) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aAddress;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 81, _EJS_s, _jacc_parms);
			beanRef.updateAddress(aAddress);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 81, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateDepartment
	 */
	public void updateDepartment(com.vtb.domain.Department aDepartment) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aDepartment;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 82, _EJS_s, _jacc_parms);
			beanRef.updateDepartment(aDepartment);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 82, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateGovern
	 */
	public void updateGovern(com.vtb.domain.Govern aGovern) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aGovern;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 83, _EJS_s, _jacc_parms);
			beanRef.updateGovern(aGovern);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 83, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateManager
	 */
	public void updateManager(com.vtb.domain.Manager aManager) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aManager;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 84, _EJS_s, _jacc_parms);
			beanRef.updateManager(aManager);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 84, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateMqSchedulerSheet
	 */
	public void updateMqSchedulerSheet(com.vtb.domain.MQSchedulerSheet aMqSchedulerSheet) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aMqSchedulerSheet;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 85, _EJS_s, _jacc_parms);
			beanRef.updateMqSchedulerSheet(aMqSchedulerSheet);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 85, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateOkved
	 */
	public void updateOkved(com.vtb.domain.Okved aOkved) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aOkved;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 86, _EJS_s, _jacc_parms);
			beanRef.updateOkved(aOkved);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 86, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateOperator
	 */
	public void updateOperator(com.vtb.domain.Operator aOperator) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aOperator;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 87, _EJS_s, _jacc_parms);
			beanRef.updateOperator(aOperator);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 87, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateOrganization
	 */
	public void updateOrganization(com.vtb.domain.Organization aOrganization) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aOrganization;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 88, _EJS_s, _jacc_parms);
			beanRef.updateOrganization(aOrganization);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 88, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateOrganizationCRM
	 */
	public void updateOrganizationCRM(com.vtb.domain.Organization aOrganization) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aOrganization;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 89, _EJS_s, _jacc_parms);
			beanRef.updateOrganizationCRM(aOrganization);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 89, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateOrganizationGroup
	 */
	public void updateOrganizationGroup(com.vtb.domain.OrganizationGroup aOrganizationGroup) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aOrganizationGroup;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 90, _EJS_s, _jacc_parms);
			beanRef.updateOrganizationGroup(aOrganizationGroup);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 90, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateOwnershipFormType
	 */
	public void updateOwnershipFormType(com.vtb.domain.OwnershipFormType aOwnershipFormType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aOwnershipFormType;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 91, _EJS_s, _jacc_parms);
			beanRef.updateOwnershipFormType(aOwnershipFormType);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 91, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateShareholder
	 */
	public void updateShareholder(com.vtb.domain.Shareholder aShareholder) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aShareholder;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 92, _EJS_s, _jacc_parms);
			beanRef.updateShareholder(aShareholder);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 92, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * updateSpoSetting
	 */
	public void updateSpoSetting(com.vtb.domain.SPOSettings aSpoSetting) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aSpoSetting;
			}
	com.vtb.ejb.SecurityActionProcessorFacadeBean beanRef = (com.vtb.ejb.SecurityActionProcessorFacadeBean)container.preInvoke(this, 93, _EJS_s, _jacc_parms);
			beanRef.updateSpoSetting(aSpoSetting);
		}
		catch (com.vtb.exception.MappingException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 93, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
