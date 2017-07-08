package com.vtb.model;

import java.util.ArrayList;

import com.ibm.ws.wim.bridge.model.Organization;
import com.vtb.exception.NoSuchObjectException;

public interface CRMActionProcessor {
	
	public Organization findOrganizationByPK(com.vtb.domain.Organization domainObjectWithKey) throws NoSuchObjectException; 
	public ArrayList findLinkedOrganizationsFor(com.vtb.domain.Organization domainObjectWithKeys) throws NoSuchObjectException;
	
	public Object findLimitInformationByPK(Object domainObjectWithKey) throws NoSuchObjectException;
	public Object findOpportunityInformationByPK(Object domainObjectWithKey) throws NoSuchObjectException;
	
}
