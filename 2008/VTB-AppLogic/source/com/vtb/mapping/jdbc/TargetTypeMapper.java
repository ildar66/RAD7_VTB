package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.TargetType;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;

public class TargetTypeMapper extends JDBCMapper implements
		com.vtb.mapping.TargetTypeMapper {
	protected static final String findByNameSqlString = "SELECT ID_TARGET_TYPE id, NAME_TARGET_TYPE name FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".TARGET_TYPE WHERE LOWER(NAME_TARGET_TYPE) like LOWER(?)";

	protected static final String _loadString = "SELECT ID_TARGET_TYPE id, NAME_TARGET_TYPE name FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".TARGET_TYPE WHERE ID_TARGET_TYPE = ?";

	protected static final String _createString = "INSERT INTO "
			+ ApplProperties.getDatasourceSchema()
			+ ".TARGET_TYPE (ID_TARGET_TYPE, NAME_TARGET_TYPE) VALUES (?, ?)";

	protected static final String _removeString = "DELETE FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".TARGET_TYPE  WHERE ID_TARGET_TYPE = ?";

	protected static final String _storeString = "UPDATE "
			+ ApplProperties.getDatasourceSchema()
			+ ".TARGET_TYPE  SET NAME_TARGET_TYPE = ? WHERE ID_TARGET_TYPE = ?";

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer id = null;
		String name = null;
		if (domainObject instanceof TargetType) {
			id = ((TargetType) domainObject).getId();
			name = ((TargetType) domainObject).getName();
		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		ps.setObject(1, id);
		ps.setObject(2, name);
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
		TargetType targetType = null;
		Integer targetTypeId = null;
		if (domainObjectWithKeyValues instanceof TargetType) {
			targetTypeId = ((TargetType) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, targetTypeId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		targetType = activate(rs);
		return targetType;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer aId = null;
		if (domainObject instanceof TargetType) {
			aId = ((TargetType) domainObject).getId();
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
		String name = null;
		if (domainObject instanceof TargetType) {
			id = ((TargetType) domainObject).getId();
			name = ((TargetType) domainObject).getName();
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);
		ps.setObject(1, name);
		ps.setObject(2, id);
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
		TargetType targetType = null;
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
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				targetType = activate(rs);
				list.add(targetType);
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

	protected TargetType activate(ResultSet rs) throws SQLException {
		TargetType targetType = new TargetType(((BigDecimal) rs.getObject(1))
				.intValue(), rs.getString(2));
		// targetType.setTargetType(rs.getString(2).trim());
		// targetType.setMsPassword(rs.getString(3));
		return targetType;
	}

	public ArrayList findAll() throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

}
