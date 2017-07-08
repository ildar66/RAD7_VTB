package com.vtb.mapping;

import java.util.ArrayList;

import com.vtb.domain.FileRequest;
import com.vtb.exception.MappingException;

public interface FileRequestMapper extends Mapper {
	public ArrayList findNotCompletedRequestForExec() throws MappingException;
	public FileRequest findNotCompletedRequestForExecByUnidAndIdDep(String unid, long id_department) throws MappingException;
}
