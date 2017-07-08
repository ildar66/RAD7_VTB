package com.god.oidgen;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

/**
 * Bean implementation class for Enterprise Bean: OIDGeneratorSession
 */
public class OIDGeneratorSessionBean implements javax.ejb.SessionBean {

	static final long serialVersionUID = 3206093459760846163L;

	private javax.ejb.SessionContext mySessionCtx;

	/**
	 * getSessionContext
	 */
	public javax.ejb.SessionContext getSessionContext() {
		return mySessionCtx;
	}

	/**
	 * setSessionContext
	 */
	public void setSessionContext(javax.ejb.SessionContext ctx) {
		mySessionCtx = ctx;
	}

	/**
	 * ejbCreate
	 */
	public void ejbCreate() throws javax.ejb.CreateException {
	}

	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}

	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}

	/**
	 * ejbRemove
	 */
	public void ejbRemove() {
	}

	private static InitialContext initContext = null;

	protected static final String OIDHOME_JNDINAME = "java:comp/env/ejb/oidValues";

	protected static final synchronized OIDvalueLocalHome getOIDHome()
			throws NamingException, ClassCastException {

		OIDvalueLocalHome result = null;
		if (initContext == null)
			initContext = new InitialContext();
		Object nsEntry = initContext.lookup(OIDHOME_JNDINAME);
		result = (OIDvalueLocalHome) PortableRemoteObject.narrow(nsEntry,
				OIDvalueLocalHome.class);

		return result;
	}

	public int getNextOID(String type) {
		int result = -1;
		OIDvalueLocal existingOid = null;
		try {
			existingOid = getOIDHome().findByPrimaryKey(type);
		} catch (FinderException e) {
			// Bootstrapping case, create the new OID value
			try {
				existingOid = getOIDHome().create(type);
			} catch (CreateException ee) {
				log("Create Exception creating OID for type: " + type
						+ "; error: " + ee);
			} catch (NamingException ee) {
				log("Naming Exception creating OID; error: " + ee);
			}
		} catch (NamingException e) {
			log("Naming Exception getting OID; error: " + e);
		}
		if (existingOid != null) {
			result = existingOid.increment();
		}
		return result;
	}

	/**
	 * Method log.
	 * 
	 * @param string
	 */
	private void log(String string) {
		System.out.println(string);
	}

}
