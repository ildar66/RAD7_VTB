package com.god.oidgen.websphere_deploy.ORACLE_V11_1;

/**
 * OIDvalueBeanCacheEntryImpl_9352f82e
 */
public class OIDvalueBeanCacheEntryImpl_9352f82e extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.god.oidgen.websphere_deploy.OIDvalueBeanCacheEntry_9352f82e {
	static final long serialVersionUID = 61;
	/**
	 * getNextOID
	 */
	public int getNextOID() {
		return VALUE_Data;
	}
	/**
	 * setNextOID
	 */
	public void setNextOID(int data) {
		this.VALUE_Data=data;
	}
	/**
	 * setDataForVALUE
	 */
	public void setDataForVALUE(int data) {
		this.VALUE_Data=data;
	}
	private int VALUE_Data;
	/**
	 * getType
	 */
	public java.lang.String getType() {
		return ID_Data;
	}
	/**
	 * setType
	 */
	public void setType(String data) {
		this.ID_Data=data;
	}
	/**
	 * setDataForID
	 */
	public void setDataForID(String data) {
		this.ID_Data=data;
	}
	private String ID_Data;
	/**
	 * getOCCColumn
	 */
	public long getOCCColumn() {
		return 0;
	}
}
