package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.Govern;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;

public class GovernMapper extends JDBCMapper implements com.vtb.mapping.GovernMapper {
	protected static final String findByOrganizationSqlString = "SELECT id, name, docType, activityPeriod, isWithInAccount, organisation organizationID FROM "
			+ ApplProperties.getDatasourceSchema() + ".GOVERN  WHERE organisation = ?";

	protected static final String _loadString = "SELECT id, name, docType, activityPeriod, isWithInAccount, organisation organizationID FROM "
			+ ApplProperties.getDatasourceSchema() + ".GOVERN WHERE ID = ?";

	protected static final String _createString = "INSERT INTO "
			+ ApplProperties.getDatasourceSchema()
			+ ".GOVERN (id, name, docType, activityPeriod, isWithInAccount, organisation) VALUES (?, ?, ?, ?, ?, ?)";

	protected static final String _removeString = "DELETE FROM " + ApplProperties.getDatasourceSchema()
			+ ".GOVERN  WHERE ID = ?";

	protected static final String _storeString = "UPDATE "
			+ ApplProperties.getDatasourceSchema()
			+ ".GOVERN  SET name = ?, docType = ?, activityPeriod = ?, isWithInAccount = ?, organisation = ? WHERE id = ?";

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer id = null; // Код
		String name = null; // название органа
		String docType = null; // тип документа
		String activityPeriod = null; // Периодичность действия
		Boolean isWithInAccount = null; // Признак "Присутствие"(ДА,НЕТ)
		Integer organizationID = null; // внешний ключ на организацию
		if (domainObject instanceof Govern) {
			id = ((Govern) domainObject).getId();
			name = ((Govern) domainObject).getName();
			docType = ((Govern) domainObject).getDocType();
			activityPeriod = ((Govern) domainObject).getActivityPeriod();
			isWithInAccount = ((Govern) domainObject).getIsWithInAccount();
			organizationID = ((Govern) domainObject).getOrganizationID();
		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		int i = 1;
		ps.setObject(i++, id);
		ps.setObject(i++, name);
		ps.setObject(i++, docType);
		ps.setObject(i++, activityPeriod);
		ps.setObject(i++, (Boolean.TRUE.equals(isWithInAccount)) ? "Y" : "N");
		ps.setObject(i++, organizationID);
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
		Govern govern = null;
		Integer baseRateId = null;
		if (domainObjectWithKeyValues instanceof Govern) {
			baseRateId = ((Govern) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, baseRateId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		govern = activate(rs);
		return govern;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer aId = null;
		if (domainObject instanceof Govern) {
			aId = ((Govern) domainObject).getId();
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
		Integer id = null; // Код
		String name = null; // название органа
		String docType = null; // тип документа
		String activityPeriod = null; // Периодичность действия
		Boolean isWithInAccount = null; // Признак "Присутствие"(ДА,НЕТ)
		Integer organizationID = null; // внешний ключ на организацию
		if (domainObject instanceof Govern) {
			id = ((Govern) domainObject).getId();
			name = ((Govern) domainObject).getName();
			docType = ((Govern) domainObject).getDocType();
			activityPeriod = ((Govern) domainObject).getActivityPeriod();
			isWithInAccount = ((Govern) domainObject).getIsWithInAccount();
			organizationID = ((Govern) domainObject).getOrganizationID();
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);
		int i = 1;
		ps.setObject(i++, name);
		ps.setObject(i++, docType);
		ps.setObject(i++, activityPeriod);
		ps.setObject(i++, (Boolean.TRUE.equals(isWithInAccount)) ? "Y" : "N");
		ps.setObject(i++, organizationID);
		
		ps.setObject(i++, id);
		int rows = ps.executeUpdate();
		if (rows == 1)
			return;
		else
			// failed
			throw new MappingException("Update Failed " + domainObject);
	}

	public ArrayList findListByOrganization(Integer organizationID, String orderBy) throws MappingException {
		ArrayList<Govern> list = new ArrayList<Govern>();
		Govern govern = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findByOrganizationSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setInt(1, organizationID);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				govern = activate(rs);
				list.add(govern);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findListByOrganization code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected Govern activate(ResultSet rs) throws SQLException {
		int i = 1;
		Govern govern = new Govern(((BigDecimal) rs.getObject(i++)).intValue(), rs.getString(i++));
		govern.setDocType(rs.getString(i++));
		govern.setActivityPeriod(rs.getString(i++));
		govern.setIsWithInAccount(("Y".equals(rs.getString(i++)) ? Boolean.TRUE : Boolean.FALSE));		
		govern.setOrganizationID(((BigDecimal) rs.getObject(i++)).intValue());
		return govern;
	}

	public ArrayList findAll() throws MappingException {
		throw new MappingException("findAll not valid for this type");
	}

}
