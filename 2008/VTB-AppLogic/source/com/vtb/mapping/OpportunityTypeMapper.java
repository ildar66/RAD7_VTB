package com.vtb.mapping;

import java.util.ArrayList;

import com.vtb.exception.MappingException;

public interface OpportunityTypeMapper extends Mapper {
	public ArrayList findByName(String name, String orderBy) throws MappingException;
}
