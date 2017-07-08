package com.vtb.mapping.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.VtbObject;
import com.vtb.exception.MappingException;

public class ContractorMapper extends JDBCMapperExt {
	static final String TABLE = "contractor";
	
	static final String FLD_ID = "id_contractor";
	static final String FLD_TYPE = "type_contractor";
	
	static final String CMD_INSERT = "insert into "+TABLE+"("+ 
										FLD_ID+","+
										FLD_TYPE+""+
										") VALUES(?,?)";
	static final String CMD_UPDATE = "update "+TABLE+" set "+
										FLD_TYPE+"=? "+
										" where "+FLD_ID+"=?";
	static final String CMD_REMOVE = "delete from "+TABLE+ ""+
										" where "+FLD_ID+"=?";
	static final String CMD_FIND_BY_PK = "select "+
											FLD_ID+", "+
											FLD_TYPE+", "+
											" where "+FLD_ID+"=?";
	
	
	
	@Override
	protected ArrayList findAllImpl(Connection conn) throws SQLException,
			MappingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void insertImpl(Connection conn, VtbObject anObject)
			throws SQLException, MappingException {
		// TODO Auto-generated method stub

	}

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected VtbObject findByPrimaryKeyImpl(Connection conn,
			VtbObject domainObjectWithKeyValues) throws SQLException,
			MappingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		// TODO Auto-generated method stub

	}

	@Override
	protected void updateImpl(Connection conn, VtbObject anObject)
			throws SQLException, MappingException {
		// TODO Auto-generated method stub

	}

}
