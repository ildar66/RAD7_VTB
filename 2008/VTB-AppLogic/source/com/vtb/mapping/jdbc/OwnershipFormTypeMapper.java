/*
 * Created on 31.07.2007
 *
 * MapperImp Должность.
 */
package com.vtb.mapping.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.OwnershipFormType;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;

/**
 * @author IShaffigulin
 * 
 * MapperImp Организационно-правовые формы.
 */
public class OwnershipFormTypeMapper extends JDBCMapper implements com.vtb.mapping.OwnershipFormTypeMapper {
	protected static final String findByNameSqlString = "SELECT ID_OKOPF id, NAME_OPF name, CODE_OPF code, ISASSOCIATION association FROM "
			+ ApplProperties.getDatasourceSchema() + ".ownership_form_type WHERE LOWER(NAME_OPF) like LOWER(?)";

	protected static final String _loadString = "SELECT ID_OKOPF id, NAME_OPF name, CODE_OPF code, ISASSOCIATION association FROM "
			+ ApplProperties.getDatasourceSchema() + ".ownership_form_type WHERE ID_OKOPF = ?";

	protected static final String _createString = "INSERT INTO " + ApplProperties.getDatasourceSchema()
			+ ".ownership_form_type (ID_OKOPF, NAME_OPF, CODE_OPF, ISASSOCIATION) VALUES (?, ?, ?, ?)";

	protected static final String _removeString = "DELETE FROM " + ApplProperties.getDatasourceSchema()
			+ ".ownership_form_type  WHERE ID_OKOPF = ?";

	protected static final String _storeString = "UPDATE " + ApplProperties.getDatasourceSchema()
			+ ".ownership_form_type SET NAME_OPF = ?, CODE_OPF = ?, ISASSOCIATION = ? WHERE ID_OKOPF = ?";

	/**
	 * 
	 */
	public OwnershipFormTypeMapper() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vtb.mapping.jdbc.JDBCMapper#createImpl(java.sql.Connection,
	 *      com.vtb.domain.VtbObject)
	 */
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer id = null;
		String name = null;
		Integer code = null;
		String association = null;
		if (domainObject instanceof OwnershipFormType) {
			id = ((OwnershipFormType) domainObject).getId();
			name = ((OwnershipFormType) domainObject).getName();
			code = ((OwnershipFormType) domainObject).getCode();
			association = ((OwnershipFormType) domainObject).getAssociation();
		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		ps.setObject(1, id);
		ps.setObject(2, name);
		ps.setObject(3, code);
		ps.setObject(4, association);
		int rows = ps.executeUpdate();
		if (rows == 1)
			return domainObject;
		else
			// failed
			throw new DuplicateKeyException("Create Failed " + domainObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vtb.mapping.jdbc.JDBCMapper#findByPrimaryKeyImpl(java.sql.Connection,
	 *      com.vtb.domain.VtbObject)
	 */
	protected VtbObject findByPrimaryKeyImpl(Connection conn, VtbObject domainObjectWithKeyValues) throws SQLException,
			MappingException {
		OwnershipFormType domainObject = null;
		Integer opportunityTypeId = null;
		if (domainObjectWithKeyValues instanceof OwnershipFormType) {
			opportunityTypeId = ((OwnershipFormType) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, opportunityTypeId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		domainObject = activate(rs);
		return domainObject;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.Vtb.mapping.jdbc.JDBCMapper#removeImpl(java.sql.Connection,
	 *      com.Vtb.domain.VtbObject)
	 */
	protected void removeImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer aId = null;
		if (domainObject instanceof OwnershipFormType) {
			aId = ((OwnershipFormType) domainObject).getId();
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.Vtb.mapping.jdbc.JDBCMapper#updateImpl(java.sql.Connection,
	 *      com.Vtb.domain.VtbObject)
	 */
	protected void updateImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer id = null;
		String name = null;
		Integer code = null;
		String association = null;
		if (domainObject instanceof OwnershipFormType) {
			id = ((OwnershipFormType) domainObject).getId();
			name = ((OwnershipFormType) domainObject).getName();
			code = ((OwnershipFormType) domainObject).getCode();
			association = ((OwnershipFormType) domainObject).getAssociation();
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);
		ps.setObject(1, name);
		ps.setObject(2, code);
		ps.setObject(3, association);
		ps.setObject(4, id);
		int rows = ps.executeUpdate();
		if (rows == 1)
			return;
		else
			// failed
			throw new MappingException("Update Failed " + domainObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.Vtb.mapping.OwnershipFormTypeMapper#findByName(java.lang.String,
	 *      java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findByName(String name, String orderBy) throws MappingException {
		ArrayList<OwnershipFormType> list = new ArrayList<OwnershipFormType>();
		OwnershipFormType ownershipFormType = null;
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
				ownershipFormType = activate(rs);
				list.add(ownershipFormType);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected OwnershipFormType activate(ResultSet rs) throws SQLException {
		OwnershipFormType ownershipFormType = new OwnershipFormType(((java.math.BigDecimal) rs.getObject(1)).intValue());
		ownershipFormType.setName(rs.getString(2).trim());
		if(rs.getObject(3) != null){
			ownershipFormType.setCode(((java.math.BigDecimal) rs.getObject(3)).intValue());
		}
		ownershipFormType.setAssociation(rs.getString(4));
		// ownershipFormType.setIsActive(("Y".equals(rs.getString(5)) ?
		// Boolean.TRUE : Boolean.FALSE));
		return ownershipFormType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.Vtb.mapping.Mapper#findAll()
	 */
	public ArrayList findAll() throws MappingException {
		throw new MappingException("findAll not valid for this type");
	}

}
