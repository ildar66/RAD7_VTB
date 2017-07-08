package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.Region;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;

public class RegionMapper extends JDBCMapper implements
		com.vtb.mapping.RegionMapper {
	protected static final String findByNameSqlString = "SELECT ID_REGION id, NAME_REGION name, REGION_RATING rating FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".REGIONS WHERE LOWER(NAME_REGION) like LOWER(?)";

	protected static final String _loadString = "SELECT ID_REGION id, NAME_REGION name, REGION_RATING rating FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".REGIONS WHERE ID_REGION = ?";

	protected static final String _createString = "INSERT INTO "
			+ ApplProperties.getDatasourceSchema()
			+ ".REGIONS (ID_REGION, NAME_REGION, REGION_RATING) VALUES (?, ?, ?)";

	protected static final String _removeString = "DELETE FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".REGIONS  WHERE ID_REGION = ?";

	protected static final String _storeString = "UPDATE "
			+ ApplProperties.getDatasourceSchema()
			+ ".REGIONS  SET NAME_REGION = ?, REGION_RATING = ? WHERE ID_REGION = ?";

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer id = null;
		String name = null;
		String rating = null;
		if (domainObject instanceof Region) {
			id = ((Region) domainObject).getId();
			name = ((Region) domainObject).getName();
			rating = ((Region)domainObject).getRating();
		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		ps.setObject(1, id);
		ps.setObject(2, name);
		ps.setObject(3, rating);
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
		Region region = null;
		Integer regionId = null;
		if (domainObjectWithKeyValues instanceof Region) {
			regionId = ((Region) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, regionId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		region = activate(rs);
		return region;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer aId = null;
		if (domainObject instanceof Region) {
			aId = ((Region) domainObject).getId();
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
		if (domainObject instanceof Region) {
			id = ((Region) domainObject).getId();
			name = ((Region) domainObject).getName();
			rating = ((Region) domainObject).getRating();
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);
		ps.setObject(1, name);
		ps.setObject(2, rating);
		ps.setObject(3, id);
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
		Region region = null;
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
				region = activate(rs);
				list.add(region);
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

	protected Region activate(ResultSet rs) throws SQLException {
		Region region = new Region(((BigDecimal) rs.getObject(1))
				.intValue(), rs.getString(2));
		region.setRating(rs.getString(3));
		// region.setMsPassword(rs.getString(3));
		return region;
	}

	public ArrayList findAll() throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

}
