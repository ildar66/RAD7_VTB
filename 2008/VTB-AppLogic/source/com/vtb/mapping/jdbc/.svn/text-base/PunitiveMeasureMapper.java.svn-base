package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.PunitiveMeasure;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;

public class PunitiveMeasureMapper extends JDBCMapper implements
		com.vtb.mapping.PunitiveMeasureMapper {
	protected static final String findByNameSqlString = "SELECT ID_MEASURE id, NAME_MEASURE name FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".PUNITIVE_MEASURE WHERE LOWER(NAME_MEASURE) like LOWER(?)";

	protected static final String _loadString = "SELECT ID_MEASURE id, NAME_MEASURE name FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".PUNITIVE_MEASURE WHERE ID_MEASURE = ?";

	protected static final String _createString = "INSERT INTO "
			+ ApplProperties.getDatasourceSchema()
			+ ".PUNITIVE_MEASURE (ID_MEASURE, NAME_MEASURE) VALUES (?, ?)";

	protected static final String _removeString = "DELETE FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".PUNITIVE_MEASURE  WHERE ID_MEASURE = ?";

	protected static final String _storeString = "UPDATE "
			+ ApplProperties.getDatasourceSchema()
			+ ".PUNITIVE_MEASURE  SET NAME_MEASURE = ? WHERE ID_MEASURE = ?";

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer id = null;
		String name = null;
		if (domainObject instanceof PunitiveMeasure) {
			id = ((PunitiveMeasure) domainObject).getId();
			name = ((PunitiveMeasure) domainObject).getName();
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
		PunitiveMeasure punitiveMeasure = null;
		Integer punitiveMeasureId = null;
		if (domainObjectWithKeyValues instanceof PunitiveMeasure) {
			punitiveMeasureId = ((PunitiveMeasure) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, punitiveMeasureId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		punitiveMeasure = activate(rs);
		return punitiveMeasure;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer aId = null;
		if (domainObject instanceof PunitiveMeasure) {
			aId = ((PunitiveMeasure) domainObject).getId();
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
		if (domainObject instanceof PunitiveMeasure) {
			id = ((PunitiveMeasure) domainObject).getId();
			name = ((PunitiveMeasure) domainObject).getName();
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
		PunitiveMeasure punitiveMeasure = null;
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
				punitiveMeasure = activate(rs);
				list.add(punitiveMeasure);
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

	protected PunitiveMeasure activate(ResultSet rs) throws SQLException {
		PunitiveMeasure punitiveMeasure = new PunitiveMeasure(((BigDecimal) rs.getObject(1))
				.intValue(), rs.getString(2));
		// punitiveMeasure.setPunitiveMeasure(rs.getString(2).trim());
		// punitiveMeasure.setMsPassword(rs.getString(3));
		return punitiveMeasure;
	}

	public ArrayList findAll() throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

}
