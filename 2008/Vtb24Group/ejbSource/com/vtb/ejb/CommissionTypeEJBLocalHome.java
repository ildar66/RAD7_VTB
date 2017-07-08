package com.vtb.ejb;

/**
 * Local Home interface for Enterprise Bean: CommissionTypeEJB
 */
public interface CommissionTypeEJBLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: CommissionTypeEJB
	 */
	public com.vtb.ejb.CommissionTypeEJBLocal findByPrimaryKey(
		java.lang.Integer primaryKey) throws javax.ejb.FinderException;

	/**
	 * @param id
	 * @param newName
	 * @return
	 * @throws javax.ejb.CreateException
	 */
	public com.vtb.ejb.CommissionTypeEJBLocal create(java.lang.Integer id, String newName) throws javax.ejb.CreateException;
}
