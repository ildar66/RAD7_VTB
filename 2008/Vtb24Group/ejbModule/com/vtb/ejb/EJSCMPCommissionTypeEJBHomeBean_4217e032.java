package com.vtb.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSCMPCommissionTypeEJBHomeBean_4217e032
 */
public class EJSCMPCommissionTypeEJBHomeBean_4217e032 extends EJSHome {
	static final long serialVersionUID = 61;
	/**
	 * EJSCMPCommissionTypeEJBHomeBean_4217e032
	 */
	public EJSCMPCommissionTypeEJBHomeBean_4217e032() throws java.rmi.RemoteException {
		super();	}
	/**
	 * findByPrimaryKey_Local
	 */
	public com.vtb.ejb.CommissionTypeEJBLocal findByPrimaryKey_Local(java.lang.Integer primaryKey) throws javax.ejb.FinderException, java.rmi.RemoteException {
		return (com.vtb.ejb.CommissionTypeEJBLocal)super.activateBean_Local(primaryKey);
	}
	/**
	 * create_Local
	 */
	public com.vtb.ejb.CommissionTypeEJBLocal create_Local(java.lang.Integer id, java.lang.String newName) throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		com.vtb.ejb.CommissionTypeEJBLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			com.vtb.ejb.CommissionTypeEJBBean bean = (com.vtb.ejb.CommissionTypeEJBBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			bean.ejbCreate(id, newName);
			Object ejsKey = keyFromBean(bean);
			result = (com.vtb.ejb.CommissionTypeEJBLocal) super.postCreate_Local(beanO, ejsKey, true);
			bean.ejbPostCreate(id, newName);
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
	 * keyFromBean
	 */
	public Object keyFromBean(javax.ejb.EntityBean generalEJB) {
		com.vtb.ejb.ConcreteCommissionTypeEJB_4217e032 tmpEJB = (com.vtb.ejb.ConcreteCommissionTypeEJB_4217e032) generalEJB;
		return tmpEJB.getId();
	}
	/**
	 * keyFromFields
	 */
	public java.lang.Integer keyFromFields(java.lang.Integer f0) {
		return f0;
	}
}
