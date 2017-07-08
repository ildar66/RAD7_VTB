package com.vtb.mapping;

import java.util.ArrayList;

import com.vtb.exception.MappingException;

public interface AddressMapper extends Mapper {
	public ArrayList findListByOrganization(Integer organizationID, String orderBy) throws MappingException;
}
