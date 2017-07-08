package com.vtb.ejb.websphere_deploy.ORACLE_V11_1;

import com.ibm.ws.ejbdeploy.JVtb24Group.ORACLE_V11_1.RdbRuntimeUpdateTemplate;

/**
 * CommissionTypeEJBBeanPartialUpdateQueryHelper
 */
public class CommissionTypeEJBBeanPartialUpdateQueryHelper {
	/**
	 * getUpdateTemplates
	 */
	static java.util.List getUpdateTemplates() {
		java.util.List result = new java.util.ArrayList(1);
		{
			String[] assignmentColumns = {"NAME_COMMISSION_TYPE = ?, "};
			boolean isNullablePredicates = false;
			RdbRuntimeUpdateTemplate aTemplate0 = new RdbRuntimeUpdateTemplate(" UPDATE COMMISSION_TYPE SET ", " WHERE ID_COMMISSION_TYPE = ? ", assignmentColumns,86, isNullablePredicates);
			int[] dirtyMap = {1};
			aTemplate0.cmpFieldMap(dirtyMap);
			result.add(aTemplate0);
		}
		 return result;
	}
}
