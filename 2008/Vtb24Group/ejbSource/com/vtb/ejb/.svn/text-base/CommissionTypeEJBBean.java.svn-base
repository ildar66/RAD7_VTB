package com.vtb.ejb;

/**
 * Bean implementation class for Enterprise Bean: CommissionTypeEJB
 */
public abstract class CommissionTypeEJBBean implements javax.ejb.EntityBean {

	private javax.ejb.EntityContext myEntityCtx;

	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		myEntityCtx = ctx;
	}

	/**
	 * getEntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return myEntityCtx;
	}

	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		myEntityCtx = null;
	}

	/**
	 * ejbCreate
	 */
	public java.lang.Integer ejbCreate(java.lang.Integer id, String newName)
		throws javax.ejb.CreateException {
		setId(id);
		setName(newName);
		return null;
	}

	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(java.lang.Integer id, String newName)
		throws javax.ejb.CreateException {
	}

	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}

	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
	}

	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}

	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
	}

	/**
	 * ejbStore
	 */
	public void ejbStore() {
	}

	/**
	 * Get accessor for persistent attribute: id
	 */
	public abstract java.lang.Integer getId();

	/**
	 * Set accessor for persistent attribute: id
	 */
	public abstract void setId(java.lang.Integer newId);

	/**
	 * Get accessor for persistent attribute: name
	 */
	public abstract java.lang.String getName();

	/**
	 * Set accessor for persistent attribute: name
	 */
	public abstract void setName(java.lang.String newName);
}
