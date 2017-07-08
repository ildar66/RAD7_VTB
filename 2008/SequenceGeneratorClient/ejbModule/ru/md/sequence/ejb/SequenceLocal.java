package ru.md.sequence.ejb;

/**
 * Local interface for Enterprise Bean: Sequence
 */
public interface SequenceLocal extends javax.ejb.EJBLocalObject {
	 public String getId();	 
	 public long getValue();
	 public void setValue(long value);
	 
	 public long getNextKeyAfterIncrementingBy(int blockSize);
}
