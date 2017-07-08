package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.custom.OkvedTO;
import com.vtb.domain.Okved;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;
import com.vtb.util.Converter;

public class OkvedMapper extends JDBCMapper implements com.vtb.mapping.OkvedMapper {
	
	protected static final String findByNameSqlString = "SELECT id, okved, OKVED_NAME name, description, OKVED_PARENTID parentID FROM "
		+ ApplProperties.getDatasourceSchema() + ".OKVED WHERE LOWER(OKVED_NAME) like LOWER(?)";
	
	protected static final String findByOrganizationSqlString = "SELECT id, okved, OKVED_NAME name, description, OKVED_PARENTID parentID FROM "
			+ ApplProperties.getDatasourceSchema() + ".OKVED WHERE id IN (SELECT okvedID FROM R_org_okved WHERE orgID  = ? ) ";

	protected static final String _loadString = "SELECT id, okved, OKVED_NAME name, description, OKVED_PARENTID parentID FROM "
			+ ApplProperties.getDatasourceSchema() + ".OKVED WHERE ID = ?";

	protected static final String _createString = "INSERT INTO "
			+ ApplProperties.getDatasourceSchema()
			+ ".OKVED (id, okved, OKVED_NAME, description, OKVED_PARENTID) VALUES (?, ?, ?, ?, ?)";

	protected static final String _removeString = "DELETE FROM " + ApplProperties.getDatasourceSchema()
			+ ".OKVED WHERE ID = ?";

	protected static final String _storeString = "UPDATE "
			+ ApplProperties.getDatasourceSchema()
			+ ".OKVED SET okved = ?, OKVED_NAME = ?, description = ?, OKVED_PARENTID = ?  WHERE id = ?";
	
	protected static final String findHierarchyListSqlString = "SELECT id, okved, OKVED_NAME name, description, OKVED_PARENTID parentID FROM "
		+ ApplProperties.getDatasourceSchema() + ".OKVED WHERE OKVED_PARENTID = ?";
	
	protected static final String findListTObyNameSqlString = "SELECT spoID, crmID, okved, OKVED_NAME name, description, spoParent, crm_parent FROM "
		+ "V_okved WHERE LOWER(okved_name) like LOWER(?) AND rownum < 501 ";
	
	protected static final String findListTObyOrganization_SQL = "SELECT spoID, crmID, okved, OKVED_NAME name, description, spoParent, crm_parent FROM "
		+ "V_okved WHERE (spoID IN (SELECT okvedID FROM R_org_okved WHERE orgID  = ?) OR crmID IN (SELECT crmOkvedID FROM R_org_okved WHERE orgID  = ?)) ";	

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer id = null; // id "ОКВЭД"
		String okved = null; // код оквэд
		String name = null; // название
		String description = null;// описание.
		Integer parentID = null; // родитель
		if (domainObject instanceof Okved) {
			id = ((Okved) domainObject).getId();
			okved = ((Okved) domainObject).getOkved();
			name = ((Okved) domainObject).getName();
			description = ((Okved) domainObject).getDescription();
			parentID = ((Okved) domainObject).getParent().getId();
		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		int i = 1;
		ps.setObject(i++, id);
		ps.setObject(i++, okved);
		ps.setObject(i++, name);
		ps.setObject(i++, description);
		ps.setObject(i++, parentID);
		
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
		Okved vo = null;
		Integer voId = null;
		if (domainObjectWithKeyValues instanceof Okved) {
			voId = ((Okved) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, voId);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			vo = activate(rs);
		}
		return vo;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer aId = null;
		if (domainObject instanceof Okved) {
			aId = ((Okved) domainObject).getId();
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
		Integer id = null; // id "ОКВЭД"
		String okved = null; // код оквэд
		String name = null; // название
		String description = null;// описание.
		Integer parentID = null; // родитель
		if (domainObject instanceof Okved) {
			id = ((Okved) domainObject).getId();
			okved = ((Okved) domainObject).getOkved();
			name = ((Okved) domainObject).getName();
			description = ((Okved) domainObject).getDescription();
			parentID = ((Okved) domainObject).getParent().getId();
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);
		int i = 1;
		ps.setObject(i++, okved);
		ps.setObject(i++, name);
		ps.setObject(i++, description);
		ps.setObject(i++, parentID);
		
		ps.setObject(i++, id);
		int rows = ps.executeUpdate();
		if (rows == 1)
			return;
		else
			// failed
			throw new MappingException("Update Failed " + domainObject);
	}

	public ArrayList findListByOrganization(Integer parentID, String orderBy) throws MappingException {
		ArrayList<Okved> list = new ArrayList<Okved>();
		Okved vo = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findByOrganizationSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setInt(1, parentID);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo = activate(conn, rs);
				list.add(vo);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.Vtb.mapping.OkvedMapper#findList(java.lang.String, java.lang.String)
	 */
	public ArrayList findList(String name, String orderBy) throws MappingException {
		ArrayList<Okved> list = new ArrayList<Okved>();
		Okved vo = null;
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
			// System.out.println("sql = " + sb.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo = activate(conn, rs);
				list.add(vo);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findList description=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	/**
	 * Интеграция с CRM
	 */
	public ArrayList findListTO(String name, String orderBy) throws MappingException {
		ArrayList<OkvedTO> list = new ArrayList<OkvedTO>();
		OkvedTO to = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findListTObyNameSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setString(1, name);
			// System.out.println("sql = " + sb.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				to = activateTO(conn, rs);
				list.add(to);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findListTO description=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	
	public ArrayList findListTO_ByOrganization(Integer organizationID, String orderBy) throws MappingException {
		ArrayList<OkvedTO> list = new ArrayList<OkvedTO>();
		OkvedTO to = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findListTObyOrganization_SQL);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, organizationID);
			ps.setObject(2, organizationID);
			// System.out.println("sql = " + sb.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				to = activateTO(conn, rs);
				list.add(to);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findListTO description=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	/**
	 * 
	 * @param conn
	 * @param rs
	 * @return
	 * @throws SQLException
	 * @throws MappingException
	 */
	protected OkvedTO activateTO(Connection conn, ResultSet rs) throws SQLException, MappingException {
		int i = 1;
		Integer spoID = Converter.toInteger((BigDecimal) rs.getObject(i++));
		OkvedTO to = new OkvedTO(spoID, rs.getString(i++));
		to.setOkved(rs.getString(i++));
		to.setName(rs.getString(i++));
		to.setDescription(rs.getString(i++));
		Integer parentSPO = Converter.toInteger((BigDecimal) rs.getObject(i++));
		if(parentSPO != null){
			Okved parentVO = (Okved)findByPrimaryKeyImpl(conn, new Okved(parentSPO));
			if(parentVO != null){
				to.setParent(parentVO);
			}
		}
		to.setParentCRM(rs.getString(i++));
		return to;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.Vtb.mapping.OkvedMapper#findHierarchyList(java.lang.Integer, java.lang.String)
	 */
	public ArrayList findHierarchyList(Integer parentID, String orderBy) throws MappingException {
		ArrayList<Okved> list = new ArrayList<Okved>();
		Okved vo = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findHierarchyListSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, parentID);
			// System.out.println("sql = " + sb.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo = activate(conn, rs);
				list.add(vo);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findList description=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}		

	protected Okved activate(Connection conn, ResultSet rs) throws SQLException, MappingException {
		int i = 1;
		Okved vo = new Okved(Converter.toInteger((BigDecimal) rs.getObject(i++)));
		vo.setOkved(rs.getString(i++));
		vo.setName(rs.getString(i++));
		vo.setDescription(rs.getString(i++));
		Integer parantID = Converter.toInteger((BigDecimal) rs.getObject(i++));
		Okved parentVO = (Okved)findByPrimaryKeyImpl(conn, new Okved(parantID));
		if(parentVO != null){
			vo.setParent(parentVO);
		}
		return vo;
	}
	
	protected Okved activate(ResultSet rs) throws SQLException, MappingException {
		int i = 1;
		Okved vo = new Okved(Converter.toInteger((BigDecimal) rs.getObject(i++)));
		vo.setOkved(rs.getString(i++));
		vo.setName(rs.getString(i++));
		vo.setDescription(rs.getString(i++));
		Integer parantID = Converter.toInteger((BigDecimal) rs.getObject(i++));
		if(vo.getParent() != null){
			vo.getParent().setId(parantID);
		}
		return vo;
	}	

	public ArrayList findAll() throws MappingException {
		throw new MappingException("findAll not valid for this type");
	}

}
