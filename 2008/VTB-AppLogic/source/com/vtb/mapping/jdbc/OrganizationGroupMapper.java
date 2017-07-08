/*
 * Created on 31.07.2007
 *
 * MapperImp ���������.
 */
package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.custom.OrganizationGroupTO;
import com.vtb.domain.OrganizationGroup;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.exception.NoSuchObjectException;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;
import com.vtb.util.ApplProperties;
import com.vtb.util.Converter;

/**
 * @author IShaffigulin
 * 
 * MapperImp "������ ��������".
 */
public class OrganizationGroupMapper extends JDBCMapper implements com.vtb.mapping.OrganizationGroupMapper {

	protected static final String findByNameSqlString = "SELECT organisationGroupID  id, NAME name, DESCRIPTION description, GROUPTYPE type, INN, OGRN, OKPO_CD, ID_INDUSTRY, ID_Region, IDCRM FROM "
			+ ApplProperties.getDatasourceSchema() + ".organisationGroup WHERE LOWER(NAME) like LOWER(?)";

	protected static final String _loadString = "SELECT organisationGroupID  id, NAME name, DESCRIPTION description, GROUPTYPE type, INN, OGRN, OKPO_CD, ID_INDUSTRY, ID_Region, IDCRM FROM "
			+ ApplProperties.getDatasourceSchema() + ".organisationGroup WHERE organisationGroupID  = ?";

	protected static final String _createString = "INSERT INTO "
			+ ApplProperties.getDatasourceSchema()
			+ ".organisationGroup (organisationGroupID , NAME, DESCRIPTION, GROUPTYPE, INN, OGRN, OKPO_CD, ID_INDUSTRY, ID_Region, IDCRM) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	protected static final String _removeString = "DELETE FROM " + ApplProperties.getDatasourceSchema()
			+ ".organisationGroup  WHERE organisationGroupID  = ?";

	protected static final String _storeString = "UPDATE "
			+ ApplProperties.getDatasourceSchema()
			+ ".organisationGroup SET NAME = ?, DESCRIPTION = ?, GROUPTYPE = ?, INN = ?, OGRN = ?, OKPO_CD = ?, ID_INDUSTRY = ?, ID_Region = ?, IDCRM = ? WHERE organisationGroupID  = ?";
	
	protected static final String findByGroupSqlString = "SELECT organisationGroupID  id, NAME name, DESCRIPTION description, GROUPTYPE type, INN, OGRN, OKPO_CD, ID_INDUSTRY, ID_Region, IDCRM FROM "
		+ ApplProperties.getDatasourceSchema() + ".organisationGroup WHERE organisationGroupID IN (SELECT ID_GROUP FROM R_org_orggroup WHERE id_organisation  = ? ) ";
	
	protected static final String findListTObyNameSqlString = "SELECT spoID, crmID, name, description, GROUPTYPE type FROM "
		+ "V_companygroup WHERE LOWER(name) like LOWER(?) AND rownum < 501 ";
	
	protected static final String findListTObyOrganizationSqlString = "SELECT spoID, crmID, name, description, GROUPTYPE type FROM "
		+ "V_companygroup WHERE spoID IN(SELECT ID_GROUP FROM R_org_orggroup WHERE id_organisation = ? ) "
		+ " OR crmID IN(SELECT crmgroup FROM R_org_orggroup WHERE id_organisation = ? ) ";
	
	protected static final String findListTObyOrganizationCrmSqlString = "SELECT spoID, crmID, name, description, GROUPTYPE type FROM "
		+ "V_companygroup WHERE spoID IN(SELECT ID_GROUP FROM R_org_orggroup WHERE CRMORG = ? ) "
		+ " OR crmID IN(SELECT crmgroup FROM R_org_orggroup WHERE CRMORG = ? ) ";	
	
	protected static final String findByCrmKeySqlString = "SELECT spoID, name, description, GROUPTYPE, inn, OGRN, OKPO_CD, ID_INDUSTRY, ID_REGION, crmID FROM "
		+ "V_companygroup WHERE crmID = ? ";
	
	/**
	 * 
	 */
	public OrganizationGroupMapper() {
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
		String description = null;
		String type = null;
		String inn = null;
		String ogrn = null; // ����
		String okpo = null;// ��� ����
		Integer industryID = null; // �������
		Integer regionID = null; // ������
		String crmID = null; // ��� � ������� CRM
		if (domainObject instanceof OrganizationGroup) {
			id = ((OrganizationGroup) domainObject).getId();
			name = ((OrganizationGroup) domainObject).getName();
			description = ((OrganizationGroup) domainObject).getDescription();
			type = ((OrganizationGroup) domainObject).getType();
			inn = ((OrganizationGroup) domainObject).getInn();
			ogrn = ((OrganizationGroup) domainObject).getOgrn();
			okpo = ((OrganizationGroup) domainObject).getOkpo();
			industryID = ((OrganizationGroup) domainObject).getIndustryID();
			regionID = ((OrganizationGroup) domainObject).getRegionID();
			crmID = ((OrganizationGroup) domainObject).getCrmID();
		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		int i = 1;
		ps.setObject(i++, id);
		ps.setObject(i++, name);
		ps.setObject(i++, description);
		ps.setObject(i++, type);
		ps.setObject(i++, inn);
		ps.setObject(i++, ogrn);
		ps.setObject(i++, okpo);
		ps.setObject(i++, industryID);
		ps.setObject(i++, regionID);
		ps.setObject(i++, crmID);
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
		OrganizationGroup domainObject = null;
		Integer aID = null;
		if (domainObjectWithKeyValues instanceof OrganizationGroup) {
			aID = ((OrganizationGroup) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, aID);
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
		if (domainObject instanceof OrganizationGroup) {
			aId = ((OrganizationGroup) domainObject).getId();
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
		String description = null;
		String type = null;
		String inn = null;
		String ogrn = null; // ����
		String okpo = null;// ��� ����
		Integer industryID = null; // �������
		Integer regionID = null; // ������
		String crmID = null; // ��� � ������� CRM		
		if (domainObject instanceof OrganizationGroup) {
			id = ((OrganizationGroup) domainObject).getId();
			name = ((OrganizationGroup) domainObject).getName();
			description = ((OrganizationGroup) domainObject).getDescription();
			type = ((OrganizationGroup) domainObject).getType();
			inn = ((OrganizationGroup) domainObject).getInn();
			ogrn = ((OrganizationGroup) domainObject).getOgrn();
			okpo = ((OrganizationGroup) domainObject).getOkpo();
			industryID = ((OrganizationGroup) domainObject).getIndustryID();
			regionID = ((OrganizationGroup) domainObject).getRegionID();
			crmID = ((OrganizationGroup) domainObject).getCrmID();			
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);
		int i = 1;
		ps.setObject(i++, name);
		ps.setObject(i++, description);
		ps.setObject(i++, type);
		ps.setObject(i++, inn);
		ps.setObject(i++, ogrn);
		ps.setObject(i++, okpo);
		ps.setObject(i++, industryID);
		ps.setObject(i++, regionID);
		ps.setObject(i++, crmID);
		
		ps.setObject(i++, id);
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
	 * @see com.Vtb.mapping.OrganizationGroupMapper#findByName(java.lang.String,
	 *      java.lang.Boolean, java.lang.String)
	 */
	public ArrayList findList(String name, String orderBy) throws MappingException {
		ArrayList<OrganizationGroup> list = new ArrayList<OrganizationGroup>();
		OrganizationGroup vo = null;
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
				vo = activate(rs);
				list.add(vo);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName description=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}
	
	public ArrayList findListByOrganization(Integer organizationID, String orderBy) throws MappingException {
		ArrayList<OrganizationGroup> list = new ArrayList<OrganizationGroup>();
		OrganizationGroup vo = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findByGroupSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, organizationID);
			// System.out.println("sql = " + sb.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo = activate(rs);
				list.add(vo);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findListByOrganization description=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}	

	protected OrganizationGroup activate(ResultSet rs) throws SQLException {
		int i = 1;
		OrganizationGroup vo = new OrganizationGroup(Converter.toInteger((java.math.BigDecimal) rs.getObject(i++)));
		vo.setName(rs.getString(i++));
		vo.setDescription(rs.getString(i++));
		vo.setType(rs.getString(i++));
		vo.setInn(rs.getString(i++));
		vo.setOgrn(rs.getString(i++));
		vo.setOkpo(rs.getString(i++));
		vo.setIndustryID(Converter.toInteger((java.math.BigDecimal) rs.getObject(i++)));
		vo.setRegionID(Converter.toInteger((java.math.BigDecimal) rs.getObject(i++)));
		vo.setCrmID(rs.getString(i++));
		// vo.setIsActive(("Y".equals(rs.getString(i++)) ?
		// Boolean.TRUE : Boolean.FALSE));
		return vo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.Vtb.mapping.Mapper#findAll()
	 */
	public ArrayList findAll() throws MappingException {
		throw new MappingException("findAll not valid for this type");
	}
	
	public ArrayList findListTO(String name, String orderBy) throws MappingException {
		ArrayList<OrganizationGroupTO> list = new ArrayList<OrganizationGroupTO>();
		OrganizationGroupTO vo = null;
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
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo = activateTO(rs);
				list.add(vo);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findListTO code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}
	
	public ArrayList findListTO_ByOrganization(Integer organizationID, String orderBy) throws MappingException {
		ArrayList<OrganizationGroupTO> list = new ArrayList<OrganizationGroupTO>();
		OrganizationGroupTO vo = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findListTObyOrganizationSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, organizationID);
			ps.setObject(2, organizationID);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo = activateTO(rs);
				list.add(vo);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findListTO code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}
	
	public ArrayList findListTO_ByOrganizationCRM(String orgCrmID, String orderBy) throws MappingException {
		ArrayList<OrganizationGroupTO> list = new ArrayList<OrganizationGroupTO>();
		OrganizationGroupTO vo = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findListTObyOrganizationCrmSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, orgCrmID);
			ps.setObject(2, orgCrmID);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo = activateTO(rs);
				list.add(vo);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findListTO code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected OrganizationGroupTO activateTO(ResultSet rs) throws SQLException {
		OrganizationGroupTO to = new OrganizationGroupTO(Converter.toInteger((BigDecimal) rs.getObject(1)), rs.getString(2));
		to.setName(rs.getString(3));
		to.setDescription(rs.getString(4));
		to.setType(rs.getString(5));
		return to;
	}
	
	public VtbObject findByCrmKey(VtbObject domainObjectWithKeyValues) throws NoSuchObjectException {
		Connection conn = null;
		OrganizationGroup object = null;
		try {
			// get a connection
			conn = getConnection();
			// single transaction.
			String aIdCRM = null;
			if (domainObjectWithKeyValues instanceof OrganizationGroup) {
				aIdCRM = ((OrganizationGroup) domainObjectWithKeyValues).getCrmID();
			} else
				return null;
			PreparedStatement ps = conn.prepareStatement(findByCrmKeySqlString);
			ps.setObject(1, aIdCRM);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				object = activate(rs);
			}
			if (object == null)
				throw new NoSuchObjectException("No object found");
			return object;
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in findByCrmKey()");
			throw new NoSuchObjectException("Wrapped Exception " + e + " caught in findByCrmKey()");
		} finally {
			close(conn);
		}
	}	
}