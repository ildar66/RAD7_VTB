package com.vtb.ejb.websphere_deploy.ORACLE_V11_1;

/**
 * CommissionTypeEJBBeanCacheEntryImpl_4217e032
 */
public class CommissionTypeEJBBeanCacheEntryImpl_4217e032 extends com.ibm.ws.ejbpersistence.cache.DataCacheEntry implements com.vtb.ejb.websphere_deploy.CommissionTypeEJBBeanCacheEntry_4217e032 {
	static final long serialVersionUID = 61;
	/**
	 * getId
	 */
	public java.lang.Integer getId() {
		if(ID_COMMISSION_TYPE_IsNull)
			return null;
		else
			return new Integer(ID_COMMISSION_TYPE_Data);
	}
	/**
	 * setId
	 */
	public void setId(Integer data) {
		if (data == null)
			this.ID_COMMISSION_TYPE_IsNull= true;
		else {
			this.ID_COMMISSION_TYPE_IsNull= false;
			this.ID_COMMISSION_TYPE_Data=data.intValue(); }
	}
	/**
	 * setDataForID_COMMISSION_TYPE
	 */
	public void setDataForID_COMMISSION_TYPE(int data, boolean isNull) {
		this.ID_COMMISSION_TYPE_Data=data;
		this.ID_COMMISSION_TYPE_IsNull=isNull;
	}
	private int ID_COMMISSION_TYPE_Data;
	private boolean ID_COMMISSION_TYPE_IsNull = true;
	/**
	 * getName
	 */
	public java.lang.String getName() {
		return NAME_COMMISSION_TYPE_Data;
	}
	/**
	 * setName
	 */
	public void setName(String data) {
		this.NAME_COMMISSION_TYPE_Data=data;
	}
	/**
	 * setDataForNAME_COMMISSION_TYPE
	 */
	public void setDataForNAME_COMMISSION_TYPE(String data) {
		this.NAME_COMMISSION_TYPE_Data=data;
	}
	private String NAME_COMMISSION_TYPE_Data;
	/**
	 * getOCCColumn
	 */
	public long getOCCColumn() {
		return 0;
	}
}
