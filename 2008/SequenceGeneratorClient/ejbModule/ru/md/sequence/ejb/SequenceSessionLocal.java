package ru.md.sequence.ejb;

/**
 * Local interface for Enterprise Bean: SequenceSession
 */
public interface SequenceSessionLocal extends javax.ejb.EJBLocalObject {
	public long getNextNumberInSequence(String id);
}
