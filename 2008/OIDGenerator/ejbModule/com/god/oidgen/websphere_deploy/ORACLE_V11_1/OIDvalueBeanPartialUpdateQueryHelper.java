package com.god.oidgen.websphere_deploy.ORACLE_V11_1;

import com.ibm.ws.ejbdeploy.JOIDGenerator.ORACLE_V11_1.RdbRuntimeUpdateTemplate;

/**
 * OIDvalueBeanPartialUpdateQueryHelper
 */
public class OIDvalueBeanPartialUpdateQueryHelper {
	/**
	 * getUpdateTemplates
	 */
	static java.util.List getUpdateTemplates() {
		java.util.List result = new java.util.ArrayList(1);
		{
			String[] assignmentColumns = {"VALUE = ?, "};
			boolean isNullablePredicates = false;
			RdbRuntimeUpdateTemplate aTemplate0 = new RdbRuntimeUpdateTemplate(" UPDATE SEQUENCES SET ", " WHERE ID = ? ", assignmentColumns,49, isNullablePredicates);
			String[] predicateColumns = {"VALUE"};
			aTemplate0.setPredicateColumns(predicateColumns,74);
			int[] dirtyMap = {0};
			aTemplate0.cmpFieldMap(dirtyMap);
			result.add(aTemplate0);
		}
		 return result;
	}
}
