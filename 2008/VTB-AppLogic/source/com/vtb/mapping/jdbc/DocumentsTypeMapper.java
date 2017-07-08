package com.vtb.mapping.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.custom.DocumentTypeTO;
import com.vtb.domain.DocumentsType;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;

public class DocumentsTypeMapper extends JDBCMapper implements com.vtb.mapping.DocumentsTypeMapper {
	protected static final String findByNameSqlString = "SELECT dt.ID_DOCUMENT_TYPE id, dt.NAME_DOCUMENT_TYPE name, dt.ID_GROUP idGroup, dg.NAME_DOCUMENT_GROUP groupName FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".DOCUMENTS_TYPE dt, "
			+ ApplProperties.getDatasourceSchema()
			+ ".DOCUMENT_GROUP dg " + "WHERE dt.ID_GROUP = dg.ID_GROUP AND LOWER(dt.NAME_DOCUMENT_TYPE) like LOWER(?)";

	protected static final String _loadString = "SELECT ID_DOCUMENT_TYPE, NAME_DOCUMENT_TYPE, ID_GROUP FROM "
			+ ApplProperties.getDatasourceSchema() + ".DOCUMENTS_TYPE WHERE ID_DOCUMENT_TYPE = ?";

	protected static final String _createString = "INSERT INTO " + ApplProperties.getDatasourceSchema()
			+ ".DOCUMENTS_TYPE (ID_DOCUMENT_TYPE, NAME_DOCUMENT_TYPE, ID_GROUP) VALUES (?, ?, ?)";

	protected static final String _removeString = "DELETE FROM " + ApplProperties.getDatasourceSchema()
			+ ".DOCUMENTS_TYPE  WHERE ID_DOCUMENT_TYPE = ?";

	protected static final String _storeString = "UPDATE " + ApplProperties.getDatasourceSchema()
			+ ".DOCUMENTS_TYPE  SET NAME_DOCUMENT_TYPE = ?, ID_GROUP = ? WHERE ID_DOCUMENT_TYPE = ?";

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer id = null;
		String name = null;
		Integer groupId = null;
		if (domainObject instanceof DocumentsType) {
			id = ((DocumentsType) domainObject).getId();
			name = ((DocumentsType) domainObject).getName();
			groupId = ((DocumentsType) domainObject).getGroupID();
		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		ps.setObject(1, id);
		ps.setObject(2, name);
		ps.setObject(3, groupId);
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
		DocumentsType documentsType = null;
		Integer documentsTypeId = null;
		if (domainObjectWithKeyValues instanceof DocumentsType) {
			documentsTypeId = ((DocumentsType) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, documentsTypeId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		documentsType = activate(rs);
		return documentsType;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer aId = null;
		if (domainObject instanceof DocumentsType) {
			aId = ((DocumentsType) domainObject).getId();
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
		Integer id = null;
		String name = null;
		Integer groupId = null;
		if (domainObject instanceof DocumentsType) {
			id = ((DocumentsType) domainObject).getId();
			name = ((DocumentsType) domainObject).getName();
			groupId = ((DocumentsType) domainObject).getGroupID();
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);
		ps.setObject(1, name);
		ps.setObject(2, groupId);
		ps.setObject(3, id);
		int rows = ps.executeUpdate();
		if (rows == 1)
			return;
		else
			// failed
			throw new MappingException("Update Failed " + domainObject);
	}

	public ArrayList findByName(String name, String orderBy) throws MappingException {
		ArrayList<DocumentTypeTO> list = new ArrayList<DocumentTypeTO>();
		DocumentTypeTO documentTypeTO = null;
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
				documentTypeTO = new DocumentTypeTO(((java.math.BigDecimal) rs.getObject(1)).intValue(), rs.getString(2));
				documentTypeTO.setGroupName(rs.getString(4));
				list.add(documentTypeTO);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected DocumentsType activate(ResultSet rs) throws SQLException {
		DocumentsType documentsType = new DocumentsType(((java.math.BigDecimal) rs.getObject(1)).intValue(), rs
				.getString(2));
		java.math.BigDecimal groupID = (java.math.BigDecimal) rs.getObject(3);
		if (groupID != null) {
			documentsType.setGroupID(groupID.intValue());
		}
		return documentsType;
	}

	public ArrayList findAll() throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

}
