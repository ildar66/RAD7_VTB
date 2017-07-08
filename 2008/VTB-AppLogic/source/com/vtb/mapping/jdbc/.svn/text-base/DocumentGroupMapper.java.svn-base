package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.DocumentGroup;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;

public class DocumentGroupMapper extends JDBCMapper implements com.vtb.mapping.DocumentGroupMapper {
	protected static final String findByNameSqlString = "SELECT ID_GROUP id, NAME_DOCUMENT_GROUP name FROM "
			+ ApplProperties.getDatasourceSchema() + ".DOCUMENT_GROUP WHERE LOWER(NAME_DOCUMENT_GROUP) like LOWER(?)";

	protected static final String _loadString = "SELECT ID_GROUP id, NAME_DOCUMENT_GROUP name FROM "
			+ ApplProperties.getDatasourceSchema() + ".DOCUMENT_GROUP WHERE ID_GROUP = ?";

	protected static final String _createString = "INSERT INTO " + ApplProperties.getDatasourceSchema()
			+ ".DOCUMENT_GROUP (ID_GROUP, NAME_DOCUMENT_GROUP) VALUES (?, ?)";

	protected static final String _removeString = "DELETE FROM " + ApplProperties.getDatasourceSchema()
			+ ".DOCUMENT_GROUP  WHERE ID_GROUP = ?";

	protected static final String _storeString = "UPDATE " + ApplProperties.getDatasourceSchema()
			+ ".DOCUMENT_GROUP  SET NAME_DOCUMENT_GROUP = ? WHERE ID_GROUP = ?";

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Object id = null;
		String name = null;
		if (domainObject instanceof DocumentGroup) {
			id = ((DocumentGroup) domainObject).getId_document_group();
			name = ((DocumentGroup) domainObject).getName_document_group();
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
	protected VtbObject findByPrimaryKeyImpl(Connection conn, VtbObject domainObjectWithKeyValues) throws SQLException,
			MappingException {
		DocumentGroup documentGroup = null;
		Object documentGroupId = null;
		if (domainObjectWithKeyValues instanceof DocumentGroup) {
			documentGroupId = ((DocumentGroup) domainObjectWithKeyValues).getId_document_group();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, documentGroupId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		documentGroup = activate(rs);
		return documentGroup;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Object aId = null;
		if (domainObject instanceof DocumentGroup) {
			aId = ((DocumentGroup) domainObject).getId_document_group();
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
	protected void updateImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Object id = null;
		String name = null;
		if (domainObject instanceof DocumentGroup) {
			id = ((DocumentGroup) domainObject).getId_document_group();
			name = ((DocumentGroup) domainObject).getName_document_group();
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

	public ArrayList findByName(String name, String orderBy) throws MappingException {
		ArrayList<DocumentGroup> list = new ArrayList<DocumentGroup>();
		DocumentGroup documentGroup = null;
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
				documentGroup = activate(rs);
				list.add(documentGroup);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected DocumentGroup activate(ResultSet rs) throws SQLException {
		DocumentGroup documentGroup = new DocumentGroup(((BigDecimal) rs.getObject(1)).intValue());
	    documentGroup.setName_document_group( rs.getString(2));
		return documentGroup;
	}

	public ArrayList findAll() throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}
}
