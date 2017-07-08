package com.vtb.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalStatelessDictionaryActionProcessorFacade_6a25d1ca
 */
public class EJSLocalStatelessDictionaryActionProcessorFacade_6a25d1ca extends EJSLocalWrapper implements com.vtb.ejb.DictionaryActionProcessorFacadeLocal {
	/**
	 * EJSLocalStatelessDictionaryActionProcessorFacade_6a25d1ca
	 */
	public EJSLocalStatelessDictionaryActionProcessorFacade_6a25d1ca() {
		super();	}
	/**
	 * findAuthorizedBodyByKey
	 */
	public com.vtb.domain.AuthorizedBody findAuthorizedBodyByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchAuthorizedBodyException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.AuthorizedBody _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 0, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findAuthorizedBodyByKey(aId);
		}
		catch (com.vtb.exception.NoSuchAuthorizedBodyException ex) {
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
	 * findBaseRateByKey
	 */
	public com.vtb.domain.BaseRate findBaseRateByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchBaseRateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.BaseRate _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 1, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findBaseRateByKey(aId);
		}
		catch (com.vtb.exception.NoSuchBaseRateException ex) {
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
	 * findCommissionTypeByKey
	 */
	public com.vtb.domain.CommissionType findCommissionTypeByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchCommissionTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.CommissionType _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 2, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findCommissionTypeByKey(aId);
		}
		catch (com.vtb.exception.NoSuchCommissionTypeException ex) {
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
	 * findContractorTypeByKey
	 */
	public com.vtb.domain.ContractorType findContractorTypeByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchContractorTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.ContractorType _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 3, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findContractorTypeByKey(aId);
		}
		catch (com.vtb.exception.NoSuchContractorTypeException ex) {
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
	 * findDocumentGroupByKey
	 */
	public com.vtb.domain.DocumentGroup findDocumentGroupByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchDocumentGroupException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.DocumentGroup _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 4, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findDocumentGroupByKey(aId);
		}
		catch (com.vtb.exception.NoSuchDocumentGroupException ex) {
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
	 * findDocumentsTypeByKey
	 */
	public com.vtb.domain.DocumentsType findDocumentsTypeByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchDocumentsTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.DocumentsType _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 5, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findDocumentsTypeByKey(aId);
		}
		catch (com.vtb.exception.NoSuchDocumentsTypeException ex) {
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
	 * findIndustryByKey
	 */
	public com.vtb.domain.Industry findIndustryByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchIndustryException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.Industry _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 6, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findIndustryByKey(aId);
		}
		catch (com.vtb.exception.NoSuchIndustryException ex) {
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
	 * findLimitTypeByKey
	 */
	public com.vtb.domain.LimitType findLimitTypeByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchLimitTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.LimitType _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 7, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findLimitTypeByKey(aId);
		}
		catch (com.vtb.exception.NoSuchLimitTypeException ex) {
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
	 * findOpportunityTypeByKey
	 */
	public com.vtb.domain.OpportunityType findOpportunityTypeByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchOpportunityTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.OpportunityType _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 8, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOpportunityTypeByKey(aId);
		}
		catch (com.vtb.exception.NoSuchOpportunityTypeException ex) {
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
	 * findPatternPaidPercentTypeByKey
	 */
	public com.vtb.domain.PatternPaidPercentType findPatternPaidPercentTypeByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchPatternPaidPercentTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.PatternPaidPercentType _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 9, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findPatternPaidPercentTypeByKey(aId);
		}
		catch (com.vtb.exception.NoSuchPatternPaidPercentTypeException ex) {
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
	 * findPunitiveMeasureByKey
	 */
	public com.vtb.domain.PunitiveMeasure findPunitiveMeasureByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchPunitiveMeasureException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.PunitiveMeasure _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 10, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findPunitiveMeasureByKey(aId);
		}
		catch (com.vtb.exception.NoSuchPunitiveMeasureException ex) {
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
	 * findRatingTypeByKey
	 */
	public com.vtb.domain.RatingType findRatingTypeByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchRatingTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.RatingType _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 11, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findRatingTypeByKey(aId);
		}
		catch (com.vtb.exception.NoSuchRatingTypeException ex) {
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
	 * findRegionByKey
	 */
	public com.vtb.domain.Region findRegionByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchRegionException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.Region _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 12, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findRegionByKey(aId);
		}
		catch (com.vtb.exception.NoSuchRegionException ex) {
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
	 * findStopFactorByKey
	 */
	public com.vtb.domain.StopFactor findStopFactorByKey(java.lang.String aId) throws com.vtb.exception.NoSuchStopFactorException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.StopFactor _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 13, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findStopFactorByKey(aId);
		}
		catch (com.vtb.exception.NoSuchStopFactorException ex) {
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
	 * findTargetTypeByKey
	 */
	public com.vtb.domain.TargetType findTargetTypeByKey(java.lang.Integer aId) throws com.vtb.exception.NoSuchTargetTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.domain.TargetType _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 14, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findTargetTypeByKey(aId);
		}
		catch (com.vtb.exception.NoSuchTargetTypeException ex) {
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
	 * findAuthorizedBodies
	 */
	public java.util.ArrayList findAuthorizedBodies(java.lang.String nameAuthorizedBody, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameAuthorizedBody;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 15, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findAuthorizedBodies(nameAuthorizedBody, orderBy);
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
	 * findBaseRates
	 */
	public java.util.ArrayList findBaseRates(java.lang.String nameBaseRate, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameBaseRate;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 16, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findBaseRates(nameBaseRate, orderBy);
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
	 * findCommissionTypes
	 */
	public java.util.ArrayList findCommissionTypes(java.lang.String nameCommissionType, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameCommissionType;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 17, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findCommissionTypes(nameCommissionType, orderBy);
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
	 * findContractorTypes
	 */
	public java.util.ArrayList findContractorTypes(java.lang.String nameContractorType, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameContractorType;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 18, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findContractorTypes(nameContractorType, orderBy);
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
	 * findDocumentGroupList
	 */
	public java.util.ArrayList findDocumentGroupList(java.lang.String nameDocumentGroup, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameDocumentGroup;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 19, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findDocumentGroupList(nameDocumentGroup, orderBy);
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
	 * findDocumentsTypes
	 */
	public java.util.ArrayList findDocumentsTypes(java.lang.String nameDocumentsType, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameDocumentsType;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 20, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findDocumentsTypes(nameDocumentsType, orderBy);
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
	 * findIndustries
	 */
	public java.util.ArrayList findIndustries(java.lang.String nameIndustry, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameIndustry;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 21, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findIndustries(nameIndustry, orderBy);
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
	 * findLimitTypes
	 */
	public java.util.ArrayList findLimitTypes(java.lang.String nameLimitType, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameLimitType;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 22, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findLimitTypes(nameLimitType, orderBy);
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
	 * findListStopFactor
	 */
	public java.util.ArrayList findListStopFactor(java.lang.String nameStopFactor, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameStopFactor;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 23, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findListStopFactor(nameStopFactor, orderBy);
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
	 * findOpportunityTypes
	 */
	public java.util.ArrayList findOpportunityTypes(java.lang.String nameOpportunityType, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameOpportunityType;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 24, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findOpportunityTypes(nameOpportunityType, orderBy);
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
	 * findPatternPaidPercentTypes
	 */
	public java.util.ArrayList findPatternPaidPercentTypes(java.lang.String namePatternPaidPercentType, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = namePatternPaidPercentType;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 25, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findPatternPaidPercentTypes(namePatternPaidPercentType, orderBy);
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
	 * findPunitiveMeasures
	 */
	public java.util.ArrayList findPunitiveMeasures(java.lang.String namePunitiveMeasure, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = namePunitiveMeasure;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 26, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findPunitiveMeasures(namePunitiveMeasure, orderBy);
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
	 * findRatingTypes
	 */
	public java.util.ArrayList findRatingTypes(java.lang.String nameRatingType, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameRatingType;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 27, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findRatingTypes(nameRatingType, orderBy);
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
	 * findRegions
	 */
	public java.util.ArrayList findRegions(java.lang.String nameRegion, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameRegion;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 28, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findRegions(nameRegion, orderBy);
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
	 * findTargetTypes
	 */
	public java.util.ArrayList findTargetTypes(java.lang.String nameTargetType, java.lang.String orderBy) throws com.vtb.exception.ModelException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.util.ArrayList _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = nameTargetType;
				_jacc_parms[1] = orderBy;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 29, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.findTargetTypes(nameTargetType, orderBy);
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
	 * addAuthorizedBody
	 */
	public void addAuthorizedBody(com.vtb.domain.AuthorizedBody newAuthorizedBody) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newAuthorizedBody;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 30, _EJS_s, _jacc_parms);
			beanRef.addAuthorizedBody(newAuthorizedBody);
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
				container.postInvoke(this, 30, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addBaseRate
	 */
	public void addBaseRate(com.vtb.domain.BaseRate newBaseRate) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newBaseRate;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 31, _EJS_s, _jacc_parms);
			beanRef.addBaseRate(newBaseRate);
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
				container.postInvoke(this, 31, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addCommissionType
	 */
	public void addCommissionType(com.vtb.domain.CommissionType newCommissionType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newCommissionType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 32, _EJS_s, _jacc_parms);
			beanRef.addCommissionType(newCommissionType);
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
				container.postInvoke(this, 32, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addContractorType
	 */
	public void addContractorType(com.vtb.domain.ContractorType newContractorType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newContractorType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 33, _EJS_s, _jacc_parms);
			beanRef.addContractorType(newContractorType);
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
				container.postInvoke(this, 33, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addDocumentGroup
	 */
	public void addDocumentGroup(com.vtb.domain.DocumentGroup newDocumentGroup) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newDocumentGroup;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 34, _EJS_s, _jacc_parms);
			beanRef.addDocumentGroup(newDocumentGroup);
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
				container.postInvoke(this, 34, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addDocumentsType
	 */
	public void addDocumentsType(com.vtb.domain.DocumentsType newDocumentsType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newDocumentsType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 35, _EJS_s, _jacc_parms);
			beanRef.addDocumentsType(newDocumentsType);
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
				container.postInvoke(this, 35, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addIndustry
	 */
	public void addIndustry(com.vtb.domain.Industry newIndustry) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newIndustry;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 36, _EJS_s, _jacc_parms);
			beanRef.addIndustry(newIndustry);
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
				container.postInvoke(this, 36, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addLimitType
	 */
	public void addLimitType(com.vtb.domain.LimitType newLimitType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newLimitType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 37, _EJS_s, _jacc_parms);
			beanRef.addLimitType(newLimitType);
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
				container.postInvoke(this, 37, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addOpportunityType
	 */
	public void addOpportunityType(com.vtb.domain.OpportunityType newOpportunityType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newOpportunityType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 38, _EJS_s, _jacc_parms);
			beanRef.addOpportunityType(newOpportunityType);
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
				container.postInvoke(this, 38, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addPatternPaidPercentType
	 */
	public void addPatternPaidPercentType(com.vtb.domain.PatternPaidPercentType newPatternPaidPercentType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newPatternPaidPercentType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 39, _EJS_s, _jacc_parms);
			beanRef.addPatternPaidPercentType(newPatternPaidPercentType);
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
				container.postInvoke(this, 39, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addPunitiveMeasure
	 */
	public void addPunitiveMeasure(com.vtb.domain.PunitiveMeasure newPunitiveMeasure) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newPunitiveMeasure;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 40, _EJS_s, _jacc_parms);
			beanRef.addPunitiveMeasure(newPunitiveMeasure);
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
				container.postInvoke(this, 40, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addRatingType
	 */
	public void addRatingType(com.vtb.domain.RatingType newRatingType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newRatingType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 41, _EJS_s, _jacc_parms);
			beanRef.addRatingType(newRatingType);
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
				container.postInvoke(this, 41, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * addRegion
	 */
	public void addRegion(com.vtb.domain.Region newRegion) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newRegion;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 42, _EJS_s, _jacc_parms);
			beanRef.addRegion(newRegion);
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
	 * addStopFactor
	 */
	public void addStopFactor(com.vtb.domain.StopFactor newStopFactor) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newStopFactor;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 43, _EJS_s, _jacc_parms);
			beanRef.addStopFactor(newStopFactor);
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
	 * addTargetType
	 */
	public void addTargetType(com.vtb.domain.TargetType newTargetType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newTargetType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 44, _EJS_s, _jacc_parms);
			beanRef.addTargetType(newTargetType);
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
	 * removeAuthorizedBody
	 */
	public void removeAuthorizedBody(java.lang.Integer aId) throws com.vtb.exception.NoSuchAuthorizedBodyException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 45, _EJS_s, _jacc_parms);
			beanRef.removeAuthorizedBody(aId);
		}
		catch (com.vtb.exception.NoSuchAuthorizedBodyException ex) {
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
	 * removeBaseRate
	 */
	public void removeBaseRate(java.lang.Integer aId) throws com.vtb.exception.NoSuchBaseRateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 46, _EJS_s, _jacc_parms);
			beanRef.removeBaseRate(aId);
		}
		catch (com.vtb.exception.NoSuchBaseRateException ex) {
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
	 * removeCommissionType
	 */
	public void removeCommissionType(java.lang.Integer aId) throws com.vtb.exception.NoSuchCommissionTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 47, _EJS_s, _jacc_parms);
			beanRef.removeCommissionType(aId);
		}
		catch (com.vtb.exception.NoSuchCommissionTypeException ex) {
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
	 * removeContractorType
	 */
	public void removeContractorType(java.lang.Integer aId) throws com.vtb.exception.NoSuchContractorTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 48, _EJS_s, _jacc_parms);
			beanRef.removeContractorType(aId);
		}
		catch (com.vtb.exception.NoSuchContractorTypeException ex) {
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
	 * removeDocumentGroup
	 */
	public void removeDocumentGroup(java.lang.Integer aId) throws com.vtb.exception.NoSuchDocumentGroupException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 49, _EJS_s, _jacc_parms);
			beanRef.removeDocumentGroup(aId);
		}
		catch (com.vtb.exception.NoSuchDocumentGroupException ex) {
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
	 * removeDocumentsType
	 */
	public void removeDocumentsType(java.lang.Integer aId) throws com.vtb.exception.NoSuchDocumentsTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 50, _EJS_s, _jacc_parms);
			beanRef.removeDocumentsType(aId);
		}
		catch (com.vtb.exception.NoSuchDocumentsTypeException ex) {
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
	 * removeIndustry
	 */
	public void removeIndustry(java.lang.Integer aId) throws com.vtb.exception.NoSuchIndustryException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 51, _EJS_s, _jacc_parms);
			beanRef.removeIndustry(aId);
		}
		catch (com.vtb.exception.NoSuchIndustryException ex) {
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
	 * removeLimitType
	 */
	public void removeLimitType(java.lang.Integer aId) throws com.vtb.exception.NoSuchLimitTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 52, _EJS_s, _jacc_parms);
			beanRef.removeLimitType(aId);
		}
		catch (com.vtb.exception.NoSuchLimitTypeException ex) {
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
	 * removeOpportunityType
	 */
	public void removeOpportunityType(java.lang.Integer aId) throws com.vtb.exception.NoSuchOpportunityTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 53, _EJS_s, _jacc_parms);
			beanRef.removeOpportunityType(aId);
		}
		catch (com.vtb.exception.NoSuchOpportunityTypeException ex) {
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
	 * removePatternPaidPercentType
	 */
	public void removePatternPaidPercentType(java.lang.Integer aId) throws com.vtb.exception.NoSuchPatternPaidPercentTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 54, _EJS_s, _jacc_parms);
			beanRef.removePatternPaidPercentType(aId);
		}
		catch (com.vtb.exception.NoSuchPatternPaidPercentTypeException ex) {
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
	 * removePunitiveMeasure
	 */
	public void removePunitiveMeasure(java.lang.Integer aId) throws com.vtb.exception.NoSuchPunitiveMeasureException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 55, _EJS_s, _jacc_parms);
			beanRef.removePunitiveMeasure(aId);
		}
		catch (com.vtb.exception.NoSuchPunitiveMeasureException ex) {
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
	 * removeRatingType
	 */
	public void removeRatingType(java.lang.Integer aId) throws com.vtb.exception.NoSuchRatingTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 56, _EJS_s, _jacc_parms);
			beanRef.removeRatingType(aId);
		}
		catch (com.vtb.exception.NoSuchRatingTypeException ex) {
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
	 * removeRegion
	 */
	public void removeRegion(java.lang.Integer aId) throws com.vtb.exception.NoSuchRegionException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 57, _EJS_s, _jacc_parms);
			beanRef.removeRegion(aId);
		}
		catch (com.vtb.exception.NoSuchRegionException ex) {
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
	 * removeStopFactor
	 */
	public void removeStopFactor(java.lang.String aId) throws com.vtb.exception.NoSuchStopFactorException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 58, _EJS_s, _jacc_parms);
			beanRef.removeStopFactor(aId);
		}
		catch (com.vtb.exception.NoSuchStopFactorException ex) {
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
	 * removeTargetType
	 */
	public void removeTargetType(java.lang.Integer aId) throws com.vtb.exception.NoSuchTargetTypeException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aId;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 59, _EJS_s, _jacc_parms);
			beanRef.removeTargetType(aId);
		}
		catch (com.vtb.exception.NoSuchTargetTypeException ex) {
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
	 * updateAuthorizedBody
	 */
	public void updateAuthorizedBody(com.vtb.domain.AuthorizedBody aAuthorizedBody) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aAuthorizedBody;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 60, _EJS_s, _jacc_parms);
			beanRef.updateAuthorizedBody(aAuthorizedBody);
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
	 * updateBaseRate
	 */
	public void updateBaseRate(com.vtb.domain.BaseRate aBaseRate) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aBaseRate;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 61, _EJS_s, _jacc_parms);
			beanRef.updateBaseRate(aBaseRate);
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
	 * updateCommissionType
	 */
	public void updateCommissionType(com.vtb.domain.CommissionType aCommissionType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aCommissionType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 62, _EJS_s, _jacc_parms);
			beanRef.updateCommissionType(aCommissionType);
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
	 * updateContractorType
	 */
	public void updateContractorType(com.vtb.domain.ContractorType aContractorType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aContractorType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 63, _EJS_s, _jacc_parms);
			beanRef.updateContractorType(aContractorType);
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
	 * updateDocumentGroup
	 */
	public void updateDocumentGroup(com.vtb.domain.DocumentGroup aDocumentGroup) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aDocumentGroup;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 64, _EJS_s, _jacc_parms);
			beanRef.updateDocumentGroup(aDocumentGroup);
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
	 * updateDocumentsType
	 */
	public void updateDocumentsType(com.vtb.domain.DocumentsType aDocumentsType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aDocumentsType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 65, _EJS_s, _jacc_parms);
			beanRef.updateDocumentsType(aDocumentsType);
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
	 * updateIndustry
	 */
	public void updateIndustry(com.vtb.domain.Industry aIndustry) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aIndustry;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 66, _EJS_s, _jacc_parms);
			beanRef.updateIndustry(aIndustry);
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
	 * updateLimitType
	 */
	public void updateLimitType(com.vtb.domain.LimitType aLimitType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aLimitType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 67, _EJS_s, _jacc_parms);
			beanRef.updateLimitType(aLimitType);
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
	 * updateOpportunityType
	 */
	public void updateOpportunityType(com.vtb.domain.OpportunityType aOpportunityType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aOpportunityType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 68, _EJS_s, _jacc_parms);
			beanRef.updateOpportunityType(aOpportunityType);
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
	 * updatePatternPaidPercentType
	 */
	public void updatePatternPaidPercentType(com.vtb.domain.PatternPaidPercentType aPatternPaidPercentType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aPatternPaidPercentType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 69, _EJS_s, _jacc_parms);
			beanRef.updatePatternPaidPercentType(aPatternPaidPercentType);
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
	 * updatePunitiveMeasure
	 */
	public void updatePunitiveMeasure(com.vtb.domain.PunitiveMeasure aPunitiveMeasure) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aPunitiveMeasure;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 70, _EJS_s, _jacc_parms);
			beanRef.updatePunitiveMeasure(aPunitiveMeasure);
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
	 * updateRatingType
	 */
	public void updateRatingType(com.vtb.domain.RatingType aRatingType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aRatingType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 71, _EJS_s, _jacc_parms);
			beanRef.updateRatingType(aRatingType);
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
	 * updateRegion
	 */
	public void updateRegion(com.vtb.domain.Region aRegion) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aRegion;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 72, _EJS_s, _jacc_parms);
			beanRef.updateRegion(aRegion);
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
	 * updateStopFactor
	 */
	public void updateStopFactor(com.vtb.domain.StopFactor aStopFactor) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aStopFactor;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 73, _EJS_s, _jacc_parms);
			beanRef.updateStopFactor(aStopFactor);
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
	 * updateTargetType
	 */
	public void updateTargetType(com.vtb.domain.TargetType aTargetType) throws com.vtb.exception.MappingException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = aTargetType;
			}
	com.vtb.ejb.DictionaryActionProcessorFacadeBean beanRef = (com.vtb.ejb.DictionaryActionProcessorFacadeBean)container.preInvoke(this, 74, _EJS_s, _jacc_parms);
			beanRef.updateTargetType(aTargetType);
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
				container.postInvoke(this, 74, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
