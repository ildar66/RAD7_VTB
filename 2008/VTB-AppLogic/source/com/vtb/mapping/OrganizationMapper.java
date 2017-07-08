package com.vtb.mapping;

import java.util.ArrayList;

import com.vtb.domain.Organization;
import com.vtb.domain.VtbObject;
import com.vtb.exception.MappingException;
import com.vtb.exception.NoSuchObjectException;

public interface OrganizationMapper extends Mapper {
	public ArrayList findList(String name, String orderBy) throws MappingException;

	/**
	 * 
	 * @param groupID
	 * @param orderBy
	 * @return
	 * @throws MappingException
	 */
	public ArrayList findListByGroup(Integer groupID, String orderBy) throws MappingException;

	/**
	 * 
	 * @param groupID
	 * @param orderBy
	 * @return
	 * @throws MappingException
	 */
	public ArrayList findListTO_ByGroup(Integer groupID, String orderBy) throws MappingException;

	/**
	 * 
	 * @param groupCrmID
	 * @param orderBy
	 * @return
	 * @throws MappingException
	 */
	public ArrayList findListTO_ByGroupCRM(String groupCrmID, String orderBy) throws MappingException;
	
	/**
	 * для взаимодействия с системой CRM
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

	public void updateCRM(Organization organization) throws MappingException;	
	
}
