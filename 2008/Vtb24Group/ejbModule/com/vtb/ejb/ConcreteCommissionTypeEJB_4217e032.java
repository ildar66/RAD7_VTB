package com.vtb.ejb;

import com.ibm.ws.ejbpersistence.beanextensions.*;
import com.ibm.websphere.cpmi.*;
import com.vtb.ejb.websphere_deploy.CommissionTypeEJBBeanCacheEntry_4217e032;

/**
 * Bean implementation class for Enterprise Bean: CommissionTypeEJB
 */
public class ConcreteCommissionTypeEJB_4217e032 extends com.vtb.ejb.CommissionTypeEJBBean implements javax.ejb.EntityBean, ConcreteBean {
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
	private CommissionTypeEJBBeanCacheEntry_4217e032 dataCacheEntry;
	/**
	 * _WSCB_getInstanceInfo
	 */
	public PMConcreteBeanInstanceInfo _WSCB_getInstanceInfo() {
			return instanceExtension;
	}
	/**
	 * ConcreteCommissionTypeEJB_4217e032
	 */
	public ConcreteCommissionTypeEJB_4217e032() {
		super();
		instanceExtension = ConcreteBeanInstanceExtensionFactory.getInstance(this);
	}
	/**
	 * getInjector
	 */
	private com.vtb.ejb.websphere_deploy.CommissionTypeEJBBeanInjector_4217e032 getInjector() {
		return (com.vtb.ejb.websphere_deploy.CommissionTypeEJBBeanInjector_4217e032)instanceExtension.getInjector();
	}
	/**
	 * hydrate
	 */
	public void hydrate(Object inRecord) {
		dataCacheEntry = (com.vtb.ejb.websphere_deploy.CommissionTypeEJBBeanCacheEntry_4217e032) inRecord;
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
	public java.lang.Integer ejbFindByPrimaryKey(java.lang.Integer primaryKey) throws javax.ejb.FinderException {
		return (java.lang.Integer)instanceExtension.ejbFindByPrimaryKey(primaryKey);
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public Object ejbFindByPrimaryKey(java.lang.Object pk) throws javax.ejb.FinderException {
		return ejbFindByPrimaryKey((java.lang.Integer)pk);
	}
	/**
	 * ejbFindByPrimaryKeyForCMR_Local
	 */
	public java.lang.Integer ejbFindByPrimaryKeyForCMR_Local(java.lang.Integer pk) throws javax.ejb.FinderException {
		return (java.lang.Integer)instanceExtension.ejbFindByPrimaryKey(pk);
	}
	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(java.lang.Integer id, java.lang.String newName) throws javax.ejb.CreateException {
		dataCacheEntry = (CommissionTypeEJBBeanCacheEntry_4217e032) instanceExtension.createDataCacheEntry();
		 super.ejbCreate(id, newName);
		return (java.lang.Integer)instanceExtension.ejbCreate();
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer id, java.lang.String newName) throws javax.ejb.CreateException {
		super.ejbPostCreate(id, newName);
		instanceExtension.ejbPostCreate();
	}
	/**
	 * createPrimaryKey
	 */
	public Object createPrimaryKey() {
		return getId();
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
	 * Get accessor for persistent attribute: id
	 */
	public java.lang.Integer getId() {
		return dataCacheEntry.getId();
	}
	/**
	 * Set accessor for persistent attribute: id
	 */
	public void setId(java.lang.Integer newId) {
		if (instanceExtension.needValuesOnMarkDirty())
			instanceExtension.markDirty(0,getId(),newId);
		else
			instanceExtension.markDirty(0);
		dataCacheEntry.setId(newId);
	}
	/**
	 * Get accessor for persistent attribute: name
	 */
	public java.lang.String getName() {
		return dataCacheEntry.getName();
	}
	/**
	 * Set accessor for persistent attribute: name
	 */
	public void setName(java.lang.String newName) {
		if (instanceExtension.needValuesOnMarkDirty())
			instanceExtension.markDirty(1,getName(),newName);
		else
			instanceExtension.markDirty(1);
		dataCacheEntry.setName(newName);
	}
}
