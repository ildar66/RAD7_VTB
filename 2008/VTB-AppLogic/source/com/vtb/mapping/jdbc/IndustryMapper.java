package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.Industry;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;

public class IndustryMapper extends JDBCMapper implements
		com.vtb.mapping.IndustryMapper {
	protected static final String findByNameSqlString = "SELECT ID_INDUSTRY id, NAME_INDUSTRY name, INDUSTRY_RATING rating, INDUSTRY_TYPE type FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".INDUSTRY WHERE LOWER(NAME_INDUSTRY) like LOWER(?)";

	protected static final String _loadString = "SELECT ID_INDUSTRY id, NAME_INDUSTRY name, INDUSTRY_RATING rating, INDUSTRY_TYPE type FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".INDUSTRY WHERE ID_INDUSTRY = ?";

	protected static final String _createString = "INSERT INTO "
			+ ApplProperties.getDatasourceSchema()
			+ ".INDUSTRY (ID_INDUSTRY, NAME_INDUSTRY, INDUSTRY_RATING, INDUSTRY_TYPE) VALUES (?, ?, ?, ?)";

	protected static final String _removeString = "DELETE FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".INDUSTRY  WHERE ID_INDUSTRY = ?";

	protected static final String _storeString = "UPDATE "
			+ ApplProperties.getDatasourceSchema()
			+ ".INDUSTRY  SET NAME_INDUSTRY = ?, INDUSTRY_RATING = ?, INDUSTRY_TYPE = ? WHERE ID_INDUSTRY = ?";

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer id = null;
		String name = null;
		String rating = null;
		String type = null;
		if (domainObject instanceof Industry) {
			id = ((Industry) domainObject).getId();
			name = ((Industry) domainObject).getName();
			rating = ((Industry)domainObject).getRating();
			type = ((Industry)domainObject).getType();
		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		ps.setObject(1, id);
		ps.setObject(2, name);
		ps.setObject(3, rating);
		ps.setObject(4, type);
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
		Industry industry = null;
		Integer industryId = null;
		if (domainObjectWithKeyValues instanceof Industry) {
			industryId = ((Industry) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, industryId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		industry = activate(rs);
		return industry;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer aId = null;
		if (domainObject instanceof Industry) {
			aId = ((Industry) domainObject).getId();
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
		String rating = null;
		String type = null;
		if (domainObject instanceof Industry) {
			id = ((Industry) domainObject).getId();
			name = ((Industry) domainObject).getName();
			rating = ((Industry) domainObject).getRating();
			type = ((Industry) domainObject).getType();
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);
		ps.setObject(1, name);
		ps.setObject(2, rating);
		ps.setObject(3, type);
		ps.setObject(4, id);
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
		Industry industry = null;
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
				industry = activate(rs);
				list.add(industry);
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

	protected Industry activate(ResultSet rs) throws SQLException {
		Industry industry = new Industry(((BigDecimal) rs.getObject(1))
				.intValue(), rs.getString(2));
		industry.setRating(rs.getString(3));
		industry.setType(rs.getString(4));
		// industry.setMsPassword(rs.getString(3));
		return industry;
	}

	public ArrayList findAll() throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

}
