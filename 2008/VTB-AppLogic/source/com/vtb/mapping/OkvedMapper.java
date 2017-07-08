package com.vtb.mapping;

import java.util.ArrayList;

import com.vtb.exception.MappingException;

public interface OkvedMapper extends Mapper {
	public ArrayList findListByOrganization(Integer organizationID, String orderBy) throws MappingException;

	public ArrayList findList(String name, String orderBy) throws MappingException;

	public ArrayList findHierarchyList(Integer parentID, String orderBy) throws MappingException;

	public ArrayList findListTO(String name, String orderBy) throws MappingException;

	public ArrayList findListTO_ByOrganization(Integer organizationID, String orderBy) throws MappingException;

}
