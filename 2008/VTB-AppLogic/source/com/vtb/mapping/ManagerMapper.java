package com.vtb.mapping;

import java.util.ArrayList;

import com.vtb.exception.MappingException;

public interface ManagerMapper extends Mapper {
	public ArrayList findListByOrganization(Integer organizationID, String orderBy) throws MappingException;
}
