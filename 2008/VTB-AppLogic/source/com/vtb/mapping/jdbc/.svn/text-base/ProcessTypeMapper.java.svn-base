/**
 * 
 */
package com.vtb.mapping.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.ProcessType;
import com.vtb.domain.VtbObject;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;

/**
 * @author Admin
 *
 */
public class ProcessTypeMapper extends JDBCMapper implements com.vtb.mapping.ProcessTypeMapper {
	
	protected static final String findByNameSqlString = "SELECT ID_TYPE_PROCESS id, DESCRIPTION_PROCESS description FROM "
		+ ApplProperties.getDatasourceSchema() + ".TYPE_PROCESS WHERE LOWER(DESCRIPTION_PROCESS) like LOWER(?)";
	/* (non-Javadoc)
	 * @see com.vtb.mapping.jdbc.JDBCMapper#createImpl(java.sql.Connection, com.vtb.domain.VtbObject)
	 */
	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vtb.mapping.jdbc.JDBCMapper#findByPrimaryKeyImpl(java.sql.Connection, com.vtb.domain.VtbObject)
	 */
	@Override
	protected VtbObject findByPrimaryKeyImpl(Connection conn, VtbObject domainObjectWithKeyValues) throws SQLException,
			MappingException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.vtb.mapping.jdbc.JDBCMapper#removeImpl(java.sql.Connection, com.vtb.domain.VtbObject)
	 */
	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vtb.mapping.jdbc.JDBCMapper#updateImpl(java.sql.Connection, com.vtb.domain.VtbObject)
	 */
	@Override
	protected void updateImpl(Connection conn, VtbObject anObject) throws SQLException, MappingException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.vtb.mapping.ProcessTypeMapper#findByName(java.lang.String, java.lang.String)
	 */
	public ArrayList findByName(String name, String orderBy) throws MappingException {
		ArrayList<ProcessType> list = new ArrayList<ProcessType>();
		ProcessType vo = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findByNameSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setString(1, name);
			//System.out.println("sql = " + sb.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo = activate(rs);
				list.add(vo);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	/**
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	protected ProcessType activate(ResultSet rs) throws SQLException {
		ProcessType vo = new ProcessType(((java.math.BigDecimal) rs.getObject(1)).intValue(), rs.getString(2).trim());
		// ownershipFormType.setIsActive(("Y".equals(rs.getString(5)) ?
		// Boolean.TRUE : Boolean.FALSE));
		return vo;
	}
	/* (non-Javadoc)
	 * @see com.vtb.mapping.Mapper#findAll()
	 */
	public ArrayList findAll() throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

}
