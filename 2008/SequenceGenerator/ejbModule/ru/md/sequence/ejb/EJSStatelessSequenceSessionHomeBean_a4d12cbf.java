package ru.md.sequence.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSStatelessSequenceSessionHomeBean_a4d12cbf
 */
public class EJSStatelessSequenceSessionHomeBean_a4d12cbf extends EJSHome {
	static final long serialVersionUID = 61;
	/**
	 * EJSStatelessSequenceSessionHomeBean_a4d12cbf
	 */
	public EJSStatelessSequenceSessionHomeBean_a4d12cbf() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create
	 */
	public ru.md.sequence.ejb.SequenceSession create() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
ru.md.sequence.ejb.SequenceSession result = null;
boolean createFailed = false;
try {
	result = (ru.md.sequence.ejb.SequenceSession) super.createWrapper(null);
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
	if (createFailed) {
		super.createFailure(beanO);
	}
}
return result;	}
	/**
	 * create_Local
	 */
	public ru.md.sequence.ejb.SequenceSessionLocal create_Local() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
ru.md.sequence.ejb.SequenceSessionLocal result = null;
boolean createFailed = false;
boolean preCreateFlag = false;
try {
	result = (ru.md.sequence.ejb.SequenceSessionLocal) super.createWrapper_Local(null);
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
	if (createFailed) {
		super.createFailure(beanO);
	}
}
return result;	}
}
