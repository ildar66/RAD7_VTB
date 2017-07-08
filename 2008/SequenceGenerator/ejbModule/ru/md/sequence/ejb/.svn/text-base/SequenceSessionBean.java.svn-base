package ru.md.sequence.ejb;

import java.util.Hashtable;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.TransactionRolledbackLocalException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Bean implementation class for Enterprise Bean: SequenceSession
 */
public class SequenceSessionBean implements javax.ejb.SessionBean {
	private class Entry {
		SequenceLocal sequence;
		long last;
		long current;
	};

	private java.util.Hashtable _entries = new Hashtable();
	private int _blockSize;
	private int _retryCount;
	private SequenceLocalHome _sequenceHome;
	private javax.ejb.SessionContext mySessionCtx;

	public long getNextNumberInSequence(String id) {
		try {
			Entry entry = (Entry) _entries.get(id);
			if (entry == null) {
				entry = new Entry();
				try {
					entry.sequence = _sequenceHome.findByPrimaryKey(new SequenceKey(id));
				} catch (FinderException e) {
					entry.sequence = _sequenceHome.create(id,0);
				}
				_entries.put(id, entry);
			}
			if (entry.current == entry.last) {
				for (int retry = 0; true; retry++) {
					try {
						entry.last = entry.sequence.getNextKeyAfterIncrementingBy(_blockSize);
						entry.current = entry.last - _blockSize;
						break;
					} catch (TransactionRolledbackLocalException tre) {
						if (retry < _retryCount) {
							continue;
						} else {
							throw new EJBException(tre);
						}
					}
				}
			}
			return ++entry.current;
		} catch (CreateException e) {
			throw new EJBException(e);
		}
	}

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
		try {
			Context namingContext = new InitialContext();
			_blockSize = ((Integer) namingContext.lookup("java:comp/env/blockSize")).intValue();
			_retryCount = ((Integer) namingContext.lookup("java:comp/env/retryCount")).intValue();
			_sequenceHome = ((SequenceLocalHome) namingContext.lookup("java:comp/env/ejb/Sequence"));
		} catch (NamingException e) {
			throw new EJBException(e);
		}
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
}