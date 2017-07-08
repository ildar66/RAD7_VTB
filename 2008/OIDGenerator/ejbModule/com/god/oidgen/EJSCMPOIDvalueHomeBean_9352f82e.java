package com.god.oidgen;

import com.ibm.ejs.container.*;

/**
 * EJSCMPOIDvalueHomeBean_9352f82e
 */
public class EJSCMPOIDvalueHomeBean_9352f82e extends EJSHome {
	static final long serialVersionUID = 61;
	/**
	 * EJSCMPOIDvalueHomeBean_9352f82e
	 */
	public EJSCMPOIDvalueHomeBean_9352f82e() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create_Local
	 */
	public com.god.oidgen.OIDvalueLocal create_Local(java.lang.String type) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.god.oidgen.OIDvalueLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.god.oidgen.OIDvalueBean bean = (com.god.oidgen.OIDvalueBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(type);
			Object ejsKey = keyFromBean(bean);
			result = (com.god.oidgen.OIDvalueLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(type);
			super.afterPostCreate(beanO, ejsKey);
		}
		catch (javax.ejb.CreateException ex) {
			createFailed = true;
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			createFailed = true;
			throw ex;
		} catch (Throwable ex) {
			createFailed = true;
			throw new CreateFailureException(ex);
		} finally {
			if(preCreateFlag && !createFailed)
				super.afterPostCreateCompletion(beanO);
			if (createFailed) {
				super.createFailure(beanO);
			}
		}
		return result;
	}
	/**
	 * findByPrimaryKey_Local
	 */
	public com.god.oidgen.OIDvalueLocal findByPrimaryKey_Local(java.lang.String primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (com.god.oidgen.OIDvalueLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * keyFromBean
	 */
	public Object keyFromBean(javax.ejb.EntityBean generalEJB) {
		com.god.oidgen.ConcreteOIDvalue_9352f82e tmpEJB = (com.god.oidgen.ConcreteOIDvalue_9352f82e) generalEJB;
		return tmpEJB.getType();
	}
	/**
	 * keyFromFields
	 */
	public java.lang.String keyFromFields(java.lang.String f0) {
		return f0;
	}
}
