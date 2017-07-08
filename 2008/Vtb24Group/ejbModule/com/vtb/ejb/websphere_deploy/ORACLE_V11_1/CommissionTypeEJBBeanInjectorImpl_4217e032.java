package com.vtb.ejb.websphere_deploy.ORACLE_V11_1;

/**
 * CommissionTypeEJBBeanInjectorImpl_4217e032
 */
public class CommissionTypeEJBBeanInjectorImpl_4217e032 implements com.vtb.ejb.websphere_deploy.CommissionTypeEJBBeanInjector_4217e032 {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.vtb.ejb.ConcreteCommissionTypeEJB_4217e032 concreteBean=(com.vtb.ejb.ConcreteCommissionTypeEJB_4217e032)cb;
		record.set(0,concreteBean.getId());
		record.set(1,concreteBean.getName());
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.vtb.ejb.ConcreteCommissionTypeEJB_4217e032 concreteBean=(com.vtb.ejb.ConcreteCommissionTypeEJB_4217e032)cb;
		record.set(0,concreteBean.getId());
		record.set(1,concreteBean.getName());
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.vtb.ejb.ConcreteCommissionTypeEJB_4217e032 concreteBean=(com.vtb.ejb.ConcreteCommissionTypeEJB_4217e032)cb;
		record.set(0,concreteBean.getId());
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public void ejbFindByPrimaryKey(Object pkeyObject, javax.resource.cci.IndexedRecord record) {
		java.lang.Integer pkey=(java.lang.Integer)pkeyObject;
		record.set(0,pkey);
	}
	/**
	 * readReadChecking
	 */
	public void readReadChecking(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.vtb.ejb.ConcreteCommissionTypeEJB_4217e032 concreteBean=(com.vtb.ejb.ConcreteCommissionTypeEJB_4217e032)cb;
		record.set(0,concreteBean.getId());
	}
	/**
	 * ejbPartialStore
	 */
	public void ejbPartialStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.vtb.ejb.ConcreteCommissionTypeEJB_4217e032 concreteBean=(com.vtb.ejb.ConcreteCommissionTypeEJB_4217e032)cb;
		com.ibm.ws.ejbpersistence.beanextensions.ConcreteBeanInstanceExtension  instanceExtension = (com.ibm.ws.ejbpersistence.beanextensions.ConcreteBeanInstanceExtension)concreteBean._WSCB_getInstanceInfo();
		 
		record.set(0,concreteBean.getId());
		if(instanceExtension.isDirty(1))
		{
			record.set(1,concreteBean.getName());
		}
	}
	/**
	 * ejbStoreGetDirtyColumnFields
	 */
	public void ejbStoreGetDirtyColumnFields(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, boolean[] dirtyBitmap) {
		
	}
}
