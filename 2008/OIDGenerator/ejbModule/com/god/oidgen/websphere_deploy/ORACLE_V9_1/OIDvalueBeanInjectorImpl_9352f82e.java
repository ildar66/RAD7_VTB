package com.god.oidgen.websphere_deploy.ORACLE_V9_1;

/**
 * OIDvalueBeanInjectorImpl_9352f82e
 */
public class OIDvalueBeanInjectorImpl_9352f82e implements com.god.oidgen.websphere_deploy.OIDvalueBeanInjector_9352f82e {
	/**
	 * ejbCreate
	 */
	public void ejbCreate(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.god.oidgen.ConcreteOIDvalue_9352f82e concreteBean=(com.god.oidgen.ConcreteOIDvalue_9352f82e)cb;
		record.set(0,concreteBean.getType());
		record.set(1,new Integer(concreteBean.getNextOID()));
	}
	/**
	 * ejbStore
	 */
	public void ejbStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.god.oidgen.ConcreteOIDvalue_9352f82e concreteBean=(com.god.oidgen.ConcreteOIDvalue_9352f82e)cb;
		record.set(0,concreteBean.getType());
		record.set(1,new Integer(concreteBean.getNextOID()));
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.god.oidgen.ConcreteOIDvalue_9352f82e concreteBean=(com.god.oidgen.ConcreteOIDvalue_9352f82e)cb;
		record.set(0,concreteBean.getType());
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public void ejbFindByPrimaryKey(Object pkeyObject, javax.resource.cci.IndexedRecord record) {
		java.lang.String pkey=(java.lang.String)pkeyObject;
		record.set(0,pkey);
	}
	/**
	 * readReadChecking
	 */
	public void readReadChecking(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.god.oidgen.ConcreteOIDvalue_9352f82e concreteBean=(com.god.oidgen.ConcreteOIDvalue_9352f82e)cb;
		record.set(0,concreteBean.getType());
		record.set(1,new Integer(concreteBean.getNextOID()));
	}
	/**
	 * ejbPartialStore
	 */
	public void ejbPartialStore(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, javax.resource.cci.IndexedRecord record) {
		com.god.oidgen.ConcreteOIDvalue_9352f82e concreteBean=(com.god.oidgen.ConcreteOIDvalue_9352f82e)cb;
		com.ibm.ws.ejbpersistence.beanextensions.ConcreteBeanInstanceExtension  instanceExtension = (com.ibm.ws.ejbpersistence.beanextensions.ConcreteBeanInstanceExtension)concreteBean._WSCB_getInstanceInfo();
		 
		record.set(0,concreteBean.getType());
		if(instanceExtension.isDirty(0))
		{
			record.set(1,new Integer(concreteBean.getNextOID()));
		}
	}
	/**
	 * ejbStoreGetDirtyColumnFields
	 */
	public void ejbStoreGetDirtyColumnFields(com.ibm.ws.ejbpersistence.beanextensions.ConcreteBean cb, boolean[] dirtyBitmap) {
		
	}
}
