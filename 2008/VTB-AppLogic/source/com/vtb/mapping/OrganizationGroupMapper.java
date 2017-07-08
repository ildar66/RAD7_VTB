package com.vtb.mapping;

import java.util.ArrayList;

import com.vtb.domain.VtbObject;
import com.vtb.exception.MappingException;
import com.vtb.exception.NoSuchObjectException;

public interface OrganizationGroupMapper extends Mapper {
	/**
	 * 
	 * @param name
	 * @param orderBy
	 * @return
	 * @throws MappingException
	 */
	public ArrayList findList(String name, String orderBy) throws MappingException;
	
	/**
	 * 
	 * @param organizationID
	 * @param orderBy
	 * @return
	 */
	public ArrayList findListByOrganization(Integer organizationID, String orderBy) throws MappingException;
	
	/**
	 * 
	 * @param organizationID
	 * @param orderBy
	 * @return
	 */
	public ArrayList findListTO_ByOrganization(Integer organizationID, String orderBy) throws MappingException;
	
	/**
	 * 
	 * @param orgCrmID
	 * @param orderBy
	 * @return
	 */
	public ArrayList findListTO_ByOrganizationCRM(String orgCrmID, String orderBy) throws MappingException;	
	
	/**
	 * 
	 * @param name
	 * @param orderBy
	 * @return
	 * @throws MappingException
	 */
	public ArrayList findListTO(String name, String orderBy) throws MappingException;

	/**
	 * Retrieve a single object matching this object.
	 *
	 * @return VtbObject
	 */
	public VtbObject findByCrmKey(VtbObject anObject) throws NoSuchObjectException, MappingException;

}
