package com.vtb.mapping;

import java.util.ArrayList;

import com.vtb.exception.MappingException;

public interface StopFactorMapper extends Mapper {
	public ArrayList findByName(String name, String orderBy) throws MappingException;
}
