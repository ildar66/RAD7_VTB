package com.vtb.mapping;

import java.util.ArrayList;

import com.vtb.exception.MappingException;

/**
 * @author IShaffigulin
 * 
 * Mapper "Организационно-правовые формы".
 */
public interface OwnershipFormTypeMapper extends Mapper {
	public ArrayList findByName(String name, String orderBy) throws MappingException;
}
