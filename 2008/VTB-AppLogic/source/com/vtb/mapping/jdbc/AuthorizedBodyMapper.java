package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.AuthorizedBody;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;

public class AuthorizedBodyMapper extends JDBCMapper implements
		com.vtb.mapping.AuthorizedBodyMapper {
	protected static final String findByNameSqlString = "SELECT ID_BODY id, NAME_BODY name, ISCOLEGIAL isColegial, ISGENERAL isGeneral FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".AUTHORIZED_BODY WHERE LOWER(NAME_BODY) like LOWER(?)";

	protected static final String _loadString = "SELECT ID_BODY id, NAME_BODY name, ISCOLEGIAL isColegial, ISGENERAL isGeneral FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".AUTHORIZED_BODY WHERE ID_BODY = ?";

	protected static final String _createString = "INSERT INTO "
			+ ApplProperties.getDatasourceSchema()
			+ ".AUTHORIZED_BODY (ID_BODY, NAME_BODY, ISCOLEGIAL, ISGENERAL) VALUES (?, ?, ?, ?)";

	protected static final String _removeString = "DELETE FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".AUTHORIZED_BODY  WHERE ID_BODY = ?";

	protected static final String _storeString = "UPDATE "
			+ ApplProperties.getDatasourceSchema()
			+ ".AUTHORIZED_BODY  SET NAME_BODY = ?, ISCOLEGIAL = ?, ISGENERAL = ? WHERE ID_BODY = ?";

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer id = null;
		String name = null;
		Boolean isColegial = null;
		Boolean isGeneral = null;
		if (domainObject instanceof AuthorizedBody) {
			id = ((AuthorizedBody) domainObject).getId();
			name = ((AuthorizedBody) domainObject).getName();
			isColegial = ((AuthorizedBody) domainObject).getIsColegial();
			isGeneral = ((AuthorizedBody) domainObject).getIsGeneral();
		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		ps.setObject(1, id);
		ps.setObject(2, name);
		ps.setObject(3, (Boolean.TRUE.equals(isColegial)) ? "Y" : "N");
		ps.setObject(4, (Boolean.TRUE.equals(isGeneral)) ? "Y" : "N");
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
		AuthorizedBody authorizedBody = null;
		Integer authorizedBodyId = null;
		if (domainObjectWithKeyValues instanceof AuthorizedBody) {
			authorizedBodyId = ((AuthorizedBody) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, authorizedBodyId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		authorizedBody = activate(rs);
		return authorizedBody;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer aId = null;
		if (domainObject instanceof AuthorizedBody) {
			aId = ((AuthorizedBody) domainObject).getId();
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
		Boolean isColegial = null;
		Boolean isGeneral = null;
		if (domainObject instanceof AuthorizedBody) {
			id = ((AuthorizedBody) domainObject).getId();
			name = ((AuthorizedBody) domainObject).getName();
			isColegial = ((AuthorizedBody) domainObject).getIsColegial();
			isGeneral = ((AuthorizedBody) domainObject).getIsGeneral();
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);
		ps.setObject(1, name);
		ps.setObject(2, (Boolean.TRUE.equals(isColegial)) ? "Y" : "N");
		ps.setObject(3, (Boolean.TRUE.equals(isGeneral)) ? "Y" : "N");
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
		AuthorizedBody authorizedBody = null;
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
				authorizedBody = activate(rs);
				list.add(authorizedBody);
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

	protected AuthorizedBody activate(ResultSet rs) throws SQLException {
		AuthorizedBody authorizedBody = new AuthorizedBody(((BigDecimal) rs.getObject(1))
				.intValue(), rs.getString(2));
		authorizedBody.setIsColegial(("Y".equals(rs.getString(3)) ? Boolean.TRUE : Boolean.FALSE));
		authorizedBody.setIsGeneral(("Y".equals(rs.getString(4)) ? Boolean.TRUE : Boolean.FALSE));
		return authorizedBody;
	}

	public ArrayList findAll() throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

}
