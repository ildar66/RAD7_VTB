package com.vtb.ejb.websphere_deploy.ORACLE_V11_1;

/**
 * CommissionTypeEJBBeanExtractor_4217e032
 */
public class CommissionTypeEJBBeanExtractor_4217e032 extends com.ibm.ws.ejbpersistence.dataaccess.AbstractEJBExtractor {
	/**
	 * CommissionTypeEJBBeanExtractor_4217e032
	 */
	public CommissionTypeEJBBeanExtractor_4217e032() {
		int[] pkCols={1};
		setPrimaryKeyColumns(pkCols);

		int[] dataCols={1,2};
		setDataColumns(dataCols);
	}
	/**
	 * extractData
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry extractData(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] dataColumns = getDataColumns();

		com.vtb.ejb.websphere_deploy.ORACLE_V11_1.CommissionTypeEJBBeanCacheEntryImpl_4217e032 entry=
			(com.vtb.ejb.websphere_deploy.ORACLE_V11_1.CommissionTypeEJBBeanCacheEntryImpl_4217e032) createDataCacheEntry();

		entry.setDataForID_COMMISSION_TYPE(dataRow.getInt(dataColumns[0]), dataRow.wasNull());
		entry.setDataForNAME_COMMISSION_TYPE(dataRow.getString(dataColumns[1]));

		return entry;
	}
	/**
	 * extractPrimaryKey
	 */
	public Object extractPrimaryKey(com.ibm.ws.ejbpersistence.dataaccess.RawBeanData dataRow) throws com.ibm.ws.ejbpersistence.utilpm.ErrorProcessingResultCollectionRow, com.ibm.ws.ejbpersistence.utilpm.PersistenceManagerInternalError {
		int[] primaryKeyColumns = getPrimaryKeyColumns();

		java.lang.Integer key;
		key=new Integer(dataRow.getInt(primaryKeyColumns[0]));

		return key;
	}
	/**
	 * getHomeName
	 */
	public String getHomeName() {
		return "CommissionTypeEJB";
	}
	/**
	 * getChunkLength
	 */
	public int getChunkLength() {
		return 2;
	}
	/**
	 * createDataCacheEntry
	 */
	public com.ibm.ws.ejbpersistence.cache.DataCacheEntry createDataCacheEntry() {
		return new com.vtb.ejb.websphere_deploy.ORACLE_V11_1.CommissionTypeEJBBeanCacheEntryImpl_4217e032();
	}
}
