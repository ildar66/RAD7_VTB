package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.Department;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;

public class DepartmentMapper extends JDBCMapper implements
		com.vtb.mapping.DepartmentMapper {
	protected static final String findByNameSqlString = "SELECT ID_DEPARTMENT id, SHORTNAME shortName, FULLNAME fullName, DEP_ID codeDep, CB_CD code FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".DEPARTMENTS WHERE LOWER(SHORTNAME) like LOWER(?) OR LOWER(FULLNAME) like LOWER(?) ";

	protected static final String _loadString = "SELECT ID_DEPARTMENT id, SHORTNAME shortName, FULLNAME fullName, DEP_ID codeDep, CB_CD code FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".DEPARTMENTS WHERE ID_DEPARTMENT = ?";

	protected static final String _createString = "INSERT INTO "
			+ ApplProperties.getDatasourceSchema()
			+ ".DEPARTMENTS (ID_DEPARTMENT, SHORTNAME, FULLNAME, DEP_ID, CB_CD) VALUES (?, ?, ?, ?, ?)";

	protected static final String _removeString = "DELETE FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".DEPARTMENTS  WHERE ID_DEPARTMENT = ?";

	protected static final String _storeString = "UPDATE "
			+ ApplProperties.getDatasourceSchema()
			+ ".DEPARTMENTS  SET SHORTNAME = ?, FULLNAME = ?, DEP_ID = ?, CB_CD = ? WHERE ID_DEPARTMENT = ?";

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer id = null;
		String shortName = null;
		String fullName = null;
		Integer codeDep = null;
		Integer code = null;
		if (domainObject instanceof Department) {
			id = ((Department) domainObject).getId();
			shortName = ((Department) domainObject).getShortName();
			fullName = ((Department) domainObject).getFullName();
			codeDep = ((Department) domainObject).getCodeDep();
			code = ((Department) domainObject).getCode();
		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		ps.setObject(1, id);
		ps.setObject(2, shortName);
		ps.setObject(3, fullName);
		ps.setObject(4, codeDep);
		ps.setObject(5, code);		
		
		int rows = ps.executeUpdate();
		if (rows == 1)
			return domainObject;
		else
			// failed
			throw new DuplicateKeyException("Create Failed " + domainObject);
	}

	@Override
	protected VtbObject findByPrimaryKeyImpl(Connection conn,
			VtbObject domainObjectWithKeyValues) throws SQLException,
			MappingException {
		Department departments = null;
		Integer departmentsId = null;
		if (domainObjectWithKeyValues instanceof Department) {
			departmentsId = ((Department) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, departmentsId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		departments = activate(rs);
		return departments;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer aId = null;
		if (domainObject instanceof Department) {
			aId = ((Department) domainObject).getId();
		} else
			throw new MappingException("Removed Failed" + domainObject);
		PreparedStatement ps = conn.prepareStatement(_removeString);
		ps.setObject(1, aId);
		int rows = ps.executeUpdate();
		if (rows == 1)
			return;
		else
			// failed
			throw new MappingException("Remove Failed " + domainObject);

	}

	@Override
	protected void updateImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer id = null;
		String shortName = null;
		String fullName = null;
		Integer codeDep = null;
		Integer code = null;
		if (domainObject instanceof Department) {
			id = ((Department) domainObject).getId();
			shortName = ((Department) domainObject).getShortName();
			fullName = ((Department) domainObject).getFullName();
			codeDep = ((Department) domainObject).getCodeDep();
			code = ((Department) domainObject).getCode();
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);
		ps.setObject(1, shortName);
		ps.setObject(2, fullName);
		ps.setObject(3, codeDep);
		ps.setObject(4, code);
		ps.setObject(5, id);
		
		int rows = ps.executeUpdate();
		if (rows == 1)
			return;
		else
			// failed
			throw new MappingException("Update Failed " + domainObject);
	}

	public ArrayList findByName(String name, String orderBy)
			throws MappingException {
		ArrayList list = new ArrayList();
		Department departments = null;
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
			ps.setString(2, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				departments = activate(rs);
				list.add(departments);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code="
					+ se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected Department activate(ResultSet rs) throws SQLException {
		Department department = new Department(
				((BigDecimal) rs.getObject(1)).intValue(), rs.getString(2), rs
						.getString(3));
		if(rs.getObject(4) != null){
			department.setCodeDep(((BigDecimal)rs.getObject(4)).intValue());
		}
		if(rs.getObject(5) != null){
			department.setCode(((BigDecimal)rs.getObject(5)).intValue());
		}
		return department;
	}

	public ArrayList findAll() throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

}
