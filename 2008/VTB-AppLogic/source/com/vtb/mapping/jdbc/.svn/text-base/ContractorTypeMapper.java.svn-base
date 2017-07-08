package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.ContractorType;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;

public class ContractorTypeMapper extends JDBCMapper implements
		com.vtb.mapping.ContractorTypeMapper {
	protected static final String findByNameSqlString = "SELECT ID_CONTRACTOR_TYPE id, NAME_CONTRACTOR_TYPE name FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".CONTRACTOR_TYPE WHERE LOWER(NAME_CONTRACTOR_TYPE) like LOWER(?)";

	protected static final String _loadString = "SELECT ID_CONTRACTOR_TYPE id, NAME_CONTRACTOR_TYPE name FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".CONTRACTOR_TYPE WHERE ID_CONTRACTOR_TYPE = ?";

	protected static final String _createString = "INSERT INTO "
			+ ApplProperties.getDatasourceSchema()
			+ ".CONTRACTOR_TYPE (ID_CONTRACTOR_TYPE, NAME_CONTRACTOR_TYPE) VALUES (?, ?)";

	protected static final String _removeString = "DELETE FROM "
			+ ApplProperties.getDatasourceSchema()
			+ ".CONTRACTOR_TYPE  WHERE ID_CONTRACTOR_TYPE = ?";

	protected static final String _storeString = "UPDATE "
			+ ApplProperties.getDatasourceSchema()
			+ ".CONTRACTOR_TYPE  SET NAME_CONTRACTOR_TYPE = ? WHERE ID_CONTRACTOR_TYPE = ?";

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer id = null;
		String name = null;
		if (domainObject instanceof ContractorType) {
			id = ((ContractorType) domainObject).getId();
			name = ((ContractorType) domainObject).getName();
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
		ContractorType contractorType = null;
		Integer contractorTypeId = null;
		if (domainObjectWithKeyValues instanceof ContractorType) {
			contractorTypeId = ((ContractorType) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, contractorTypeId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		contractorType = activate(rs);
		return contractorType;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		Integer aId = null;
		if (domainObject instanceof ContractorType) {
			aId = ((ContractorType) domainObject).getId();
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
		if (domainObject instanceof ContractorType) {
			id = ((ContractorType) domainObject).getId();
			name = ((ContractorType) domainObject).getName();
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
		ContractorType contractorType = null;
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
				contractorType = activate(rs);
				list.add(contractorType);
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

	protected ContractorType activate(ResultSet rs) throws SQLException {
		ContractorType contractorType = new ContractorType(((BigDecimal) rs.getObject(1))
				.intValue(), rs.getString(2));
		// contractorType.setContractorType(rs.getString(2).trim());
		// contractorType.setMsPassword(rs.getString(3));
		return contractorType;
	}

	public ArrayList findAll() throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

}
