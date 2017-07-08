package com.vtb.mapping;

import java.util.ArrayList;

import com.vtb.domain.Operator;
import com.vtb.exception.MappingException;
import com.vtb.exception.NoSuchOperatorException;

public interface OperatorMapper extends Mapper {
	public ArrayList findByName(Integer departmentKey, String likeName, String orderBy) throws MappingException;
	public Operator findOperatorByLogin(String aLogin)  throws NoSuchOperatorException, MappingException;
}
