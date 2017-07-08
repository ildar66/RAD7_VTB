package com.god.oidgen;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import com.god.oidgen.websphere_deploy.OIDvalueBeanCacheEntry_9352f82e;

/**
 * Bean implementation class for Enterprise Bean: OIDvalue
 */
public class ConcreteOIDvalue_9352f82e extends com.god.oidgen.OIDvalueBean implements javax.ejb.EntityBean, ConcreteBean {
	static final long serialVersionUID = 61;
	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		super.setEntityContext(ctx);
		instanceExtension.setEntityContext(ctx);
	}
	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		super.unsetEntityContext();
		instanceExtension.unsetEntityContext();
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
			super.ejbActivate();
			instanceExtension.ejbActivate();
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		instanceExtension.ejbLoad();
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
		super.ejbPassivate();
		instanceExtension.ejbPassivate();
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
		super.ejbRemove();
		instanceExtension.ejbRemove();
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
		super.ejbStore();
		instanceExtension.ejbStore();
	}
	private ConcreteBeanInstanceExtension instanceExtension;
	private OIDvalueBeanCacheEntry_9352f82e dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcreteOIDvalue_9352f82e
	 */
	public ConcreteOIDvalue_9352f82e() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private com.god.oidgen.websphere_deploy.OIDvalueBeanInjector_9352f82e getInjector() {
		return (com.god.oidgen.websphere_deploy.OIDvalueBeanInjector_9352f82e)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (com.god.oidgen.websphere_deploy.OIDvalueBeanCacheEntry_9352f82e) inRecord;
		super.ejbLoad();
	}
	/**
	 * resetCMP
	 */
	public void resetCMP() {
			dataCacheEntry = null;
	}
	/**
	 * resetCMR
	 */
	public void resetCMR() {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public java.lang.String ejbFindByPrimaryKey(java.lang.String primaryKey) throws javax.ejb.FinderException {
		return (java.lang.String)instanceExtension.ejbFindByPrimaryKey(primaryKey);
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public Object ejbFindByPrimaryKey(java.lang.Object pk) throws javax.ejb.FinderException {
		return ejbFindByPrimaryKey((java.lang.String)pk);
	}
	/**
	 * ejbFindByPrimaryKeyForCMR_Local
	 */
	public java.lang.String ejbFindByPrimaryKeyForCMR_Local(java.lang.String pk) throws javax.ejb.FinderException {
		return (java.lang.String)instanceExtension.ejbFindByPrimaryKey(pk);
	}
	/**
	 * ejbCreate
	 */
	public java.lang.String ejbCreate(java.lang.String type) throws javax.ejb.CreateException {
		dataCacheEntry = (OIDvalueBeanCacheEntry_9352f82e) instanceExtension.createDataCacheEntry();
		 super.ejbCreate(type);
		return (java.lang.String)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.String type) throws javax.ejb.CreateException {
		super.ejbPostCreate(type);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * createPrimaryKey
	 */
	public Object createPrimaryKey() {
		return getType();
	}
	/**
	 * getNumberOfFields
	 */
	public int getNumberOfFields() {
		return 2;
	}
	/**
	 * getOCCColumn
	 */
	public long getOCCColumn() {
		return dataCacheEntry.getOCCColumn();
	}
	/**
	 * Get accessor for persistent attribute: nextOID
	 */
	public int getNextOID() {
		return dataCacheEntry.getNextOID();
	}
	/**
	 * Set accessor for persistent attribute: nextOID
	 */
	public void setNextOID(int newNextOID) {
		if (instanceExtension.needValuesOnMarkDirty())
			instanceExtension.markDirty(0,getNextOID(),newNextOID);
		else
			instanceExtension.markDirty(0);
		dataCacheEntry.setNextOID(newNextOID);
	}
	/**
	 * Get accessor for persistent attribute: type
	 */
	public java.lang.String getType() {
		return dataCacheEntry.getType();
	}
	/**
	 * Set accessor for persistent attribute: type
	 */
	public void setType(java.lang.String newType) {
		if (instanceExtension.needValuesOnMarkDirty())
			instanceExtension.markDirty(1,getType(),newType);
		else
			instanceExtension.markDirty(1);
		dataCacheEntry.setType(newType);
	}
}
