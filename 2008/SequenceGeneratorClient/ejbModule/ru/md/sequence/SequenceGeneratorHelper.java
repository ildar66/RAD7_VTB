package ru.md.sequence;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import ru.md.sequence.ejb.SequenceSessionLocal;
import ru.md.sequence.ejb.SequenceSessionLocalHome;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class SequenceGeneratorHelper {
	protected static final String OIDGEN_JNDINAME = "java:comp/env/ejb/SequenceGenerator";
	private static Context context;
	private static SequenceSessionLocalHome oidHome;
	private static SequenceSessionLocal oidGenerator;
	
	private static SequenceSessionLocalHome getOIDGenHome() throws NamingException {
		if (oidHome == null) {
			if (context == null)
				context = new InitialContext();
			oidHome = (SequenceSessionLocalHome) context.lookup(OIDGEN_JNDINAME);
		}
		return oidHome;
	}
	
	private static SequenceSessionLocal getSequence() throws CreateException, NamingException, RemoteException {
		if (oidGenerator == null)
			oidGenerator = getOIDGenHome().create();
		return oidGenerator;
	} 
	
	public static long getNextId(String type) {
		try {
			return getSequence().getNextNumberInSequence(type);
		} catch (Exception e) {
			throw new EJBException("Failed to get the next Sequence for" + type);
		}
	}

}
