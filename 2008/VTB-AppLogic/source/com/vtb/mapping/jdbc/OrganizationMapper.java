package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.custom.OrganizationTO;
import com.vtb.domain.Organization;
import com.vtb.domain.VtbObject;
import com.vtb.exception.MappingException;
import com.vtb.exception.NoSuchObjectException;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;
import com.vtb.util.Converter;

public class OrganizationMapper extends OrganizationLinkMapper implements com.vtb.mapping.OrganizationMapper {
	
	protected static final String findListTObyNameSqlString = "SELECT spoID, crmID, ORGANIZATIONNAME name, FULLORGANIZATIONNAME fullName "
			+ "FROM V_organisation "
			+ "WHERE (LOWER(ORGANIZATIONNAME) like LOWER(?) OR LOWER(FULLORGANIZATIONNAME) like LOWER(?)) "
			+ "AND rownum < 501 ";
	
	protected static final String findListTO_ByGroup_SQL = "SELECT spoID, crmID, ORGANIZATIONNAME name, FULLORGANIZATIONNAME fullName "
		+ "FROM V_organisation "
		+ "WHERE spoID IN(SELECT id_organisation FROM R_org_orggroup WHERE ID_GROUP = ? ) "
		+ " OR crmID IN(SELECT crmorg FROM R_org_orggroup WHERE ID_GROUP = ? ) ";
	
	protected static final String findListTO_ByGroupCrm_SQL = "SELECT spoID, crmID, ORGANIZATIONNAME name, FULLORGANIZATIONNAME fullName "
		+ "FROM V_organisation "
		+ "WHERE spoID IN(SELECT id_organisation FROM R_org_orggroup WHERE crmgroup = ? ) "
		+ " OR crmID IN(SELECT crmorg FROM R_org_orggroup WHERE crmgroup = ? ) ";	

	protected static final String findByCrmKeySqlString = "SELECT spoID, crmID, ORGANIZATIONNAME, FULLORGANIZATIONNAME, WORKPHONE, FAX, RAITING, "
			+ "EMAIL, EMPLOYEESCOUNT, BUSINESSDESCRIPTION, ID_OKOPF, ID_REGION, ID_INDUSTRY, INN, KPP, CLIENTCATEGORY, SECTOR, DATEOFREGISTRATION, DEPARTMENT FROM "
			+ "V_organisation WHERE crmID = ? ";

	//private static final String selectCRM_SQL = "SELECT * FROM MY_CRMORG WHERE trim(CRMID) = ? ";
	private static final String insertCRM_SQL = "INSERT INTO MY_CRMORG(CRMID, MYREGION, MYINDUSTRY, MYOPF) VALUES (?,?,?,?) ";
	private static final String updateCRM_SQL = "UPDATE MY_CRMORG SET MYREGION=?, MYINDUSTRY=?, MYOPF=? WHERE CRMID = ? ";

	public ArrayList findListTO(String name, String orderBy) throws MappingException {
		ArrayList<OrganizationTO> list = new ArrayList<OrganizationTO>();
		OrganizationTO vo = null;
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
			ps.setString(2, name);
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

	public VtbObject findByCrmKey(VtbObject domainObjectWithKeyValues) throws NoSuchObjectException {
		Connection conn = null;
		Organization object = null;
		try {
			// get a connection
			conn = getConnection();
			// single transaction.
			String aId = null;
			if (domainObjectWithKeyValues instanceof Organization) {
				aId = ((Organization) domainObjectWithKeyValues).getAccountid();
			} else
				return null;
			PreparedStatement ps = conn.prepareStatement(findByCrmKeySqlString);
			ps.setObject(1, aId);
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

	protected Organization activate(ResultSet rs) throws SQLException {
		int i = 1;
		Organization vo = new Organization(Converter.toLong((BigDecimal) rs.getObject(i++)), rs.getString(i++), rs
				.getString(i++));
		vo.setAccount_fullname(rs.getString(i++));
		vo.setPhone(rs.getString(i++));
		vo.setFax(rs.getString(i++));
		vo.setRating(rs.getString(i++));
		vo.setEmail(rs.getString(i++));
		vo.setEmployees_count(rs.getInt(i++));
		vo.setBusiness_description(rs.getString(i++));
		vo.setId_opf(Converter.toLong((BigDecimal) rs.getObject(i++)));
		vo.setId_region(Converter.toLong((BigDecimal) rs.getObject(i++)));
		vo.setId_industry(Converter.toLong((BigDecimal) rs.getObject(i++)));
		vo.setINN(rs.getString(i++));
		vo.setKPP(rs.getString(i++));
		vo.setCategory(rs.getString(i++));
		i++;// SECTOR
		vo.setDate_of_registration(rs.getDate(i++));
		vo.setDepartment(rs.getString(i++));// DEPARTMENT
		return vo;
	}

	protected OrganizationTO activateTO(ResultSet rs) throws SQLException {
		OrganizationTO to = new OrganizationTO(Converter.toInteger((BigDecimal) rs.getObject(1)), rs.getString(2));
		to.setName(rs.getString(3));
		to.setFullName(rs.getString(4));
		return to;
	}

	public void updateCRM(Organization org) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		String idCRM = org.getAccountid();
		try {
			conn = getConnection();
			st = conn.prepareStatement(updateCRM_SQL);
			st.setObject(1, org.getId_region());
			st.setObject(2, org.getId_industry());
			st.setObject(3, org.getId_opf());
			st.setObject(4, idCRM);
			if (st.executeUpdate() < 1) {
				//запись не найдена:
				st = conn.prepareStatement(insertCRM_SQL);
				st.setObject(1, idCRM);
				st.setObject(2, org.getId_region());
				st.setObject(3, org.getId_industry());
				st.setObject(4, org.getId_opf());
				if (st.executeUpdate() != 1) {
					String err = "updateCRM(insert MY_CRMORG).organizationCrmKey=" + idCRM + " failed";
					throw new MappingException(err);
				}
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException updateCRM code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	public final static String TABLE = "ORGANIZATIONS";

	final static String FLD_ID = "IDCONTRACTOR";
	final static String FLD_ACCOUNTID = "IDORGANIZATIONCRM";
	final static String FLD_ACCOUNT = "ORGANIZATIONNAME";
	final static String FLD_FULLNAME = "FULLORGANIZATIONNAME";
	final static String FLD_RATING = "RAITING";
	final static String FLD_EMAIL = "EMAIL";
	final static String FLD_EMPLOYEESCOUNT = "EMPLOYEESCOUNT";
	final static String FLD_WORKPHONE = "WORKPHONE";
	final static String FLD_DATE_OF_REGISTRATION = "DATEOFREGISTRATION";
	final static String FLD_CLIENT_CATEGORY = "CLIENTCATEGORY";
	final static String FLD_SECTOR = "SECTOR";
	final static String FLD_BUSINESS_DESCR = "BUSINESSDESCRIPTION";
	final static String FLD_CITY = "CITY";
	final static String FLD_LEGAL_ADDRESS = "LEGALADDRESS";
	final static String FLD_REAL_ADDRESS = "REALADDRESS";
	final static String FLD_POSTALCODE = "POSTALCODE";
	final static String FLD_INN = "INN";
	final static String FLD_KPP = "KPP";
	final static String FLD_ID_REGION = "ID_REGION";
	final static String FLD_ID_INDUSTRY = "ID_INDUSTRY";
	final static String FLD_ID_OKOPF = "ID_OKOPF";
	final static String FLD_FAX = "FAX";

	final String CMD_FIND_BY_ACCOUNTID = "select " + FLD_ID + ", " + FLD_ACCOUNTID + "," + FLD_ACCOUNT + ", "
			+ FLD_FULLNAME + ", " + FLD_RATING + ", " + FLD_EMAIL + ", " + FLD_EMPLOYEESCOUNT + ", " + FLD_WORKPHONE
			+ ", " + FLD_DATE_OF_REGISTRATION + ", " + FLD_CLIENT_CATEGORY + ", " + FLD_SECTOR + ", "
			+ FLD_BUSINESS_DESCR + ", " + FLD_CITY + ", " + FLD_LEGAL_ADDRESS + ", " + FLD_REAL_ADDRESS + ", "
			+ FLD_POSTALCODE + ", " + FLD_INN + ", " + FLD_KPP + ", " + FLD_ID_REGION + ", " + FLD_ID_INDUSTRY + ", "
			+ FLD_ID_OKOPF + ", " + FLD_FAX + " " + "from " + TABLE + " where " + FLD_ACCOUNTID + "=?";
	final String CMD_FIND_BY_KEY = "select " + FLD_ID + ", " + FLD_ACCOUNTID + "," + FLD_ACCOUNT + ", " + FLD_FULLNAME
			+ ", " + FLD_RATING + ", " + FLD_EMAIL + ", " + FLD_EMPLOYEESCOUNT + ", " + FLD_WORKPHONE + ", "
			+ FLD_DATE_OF_REGISTRATION + ", " + FLD_CLIENT_CATEGORY + ", " + FLD_SECTOR + ", " + FLD_BUSINESS_DESCR
			+ ", " + FLD_CITY + ", " + FLD_LEGAL_ADDRESS + ", " + FLD_REAL_ADDRESS + ", " + FLD_POSTALCODE + ", "
			+ FLD_INN + ", " + FLD_KPP + ", " + FLD_ID_REGION + ", " + FLD_ID_INDUSTRY + ", " + FLD_ID_OKOPF + ", "
			+ FLD_FAX + " " + "from " + TABLE + " where " + FLD_ID + "=?";

	final String CMD_INSERT = "insert into " + TABLE + " (" + FLD_ID + ", " + FLD_ACCOUNTID + "," + FLD_ACCOUNT + ", "
			+ FLD_FULLNAME + ", " + FLD_RATING + ", " + FLD_EMAIL + ", " + FLD_EMPLOYEESCOUNT + ", " + FLD_WORKPHONE
			+ ", " + FLD_DATE_OF_REGISTRATION + ", " + FLD_CLIENT_CATEGORY + ", " + FLD_SECTOR + ", "
			+ FLD_BUSINESS_DESCR + ", " + FLD_CITY + ", " + FLD_LEGAL_ADDRESS + ", " + FLD_REAL_ADDRESS + ", "
			+ FLD_POSTALCODE + ", " + FLD_INN + ", " + FLD_KPP + ", " + FLD_ID_REGION + ", " + FLD_ID_INDUSTRY + ", "
			+ FLD_ID_OKOPF + ", " + FLD_FAX + " " + ") VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	final String CMD_UPDATE = "update " + TABLE + " set " + FLD_ACCOUNTID + "=?, " + FLD_ACCOUNT + "=?, "
			+ FLD_FULLNAME + "=?, " + FLD_RATING + "=?, " + FLD_EMAIL + "=?, " + FLD_EMPLOYEESCOUNT + "=?, "
			+ FLD_WORKPHONE + "=?, " + FLD_DATE_OF_REGISTRATION + "=?, " + FLD_CLIENT_CATEGORY + "=?, " + FLD_SECTOR
			+ "=?, " + FLD_BUSINESS_DESCR + "=?, " + FLD_CITY + "=?, " + FLD_LEGAL_ADDRESS + "=?, " + FLD_REAL_ADDRESS
			+ "=?, " + FLD_POSTALCODE + "=?, " + FLD_INN + "=?, " + FLD_KPP + "=?, " + FLD_ID_REGION + "=?, "
			+ FLD_ID_INDUSTRY + "=?, " + FLD_ID_OKOPF + "=?, " + FLD_FAX + "=? " + " where " + FLD_ID + "=?";

	final String CMD_REMOVE = "delete from " + TABLE + " where " + FLD_ID + "=?";

	final String CMD_FIND_LIST_BY_GROUP = "select " + FLD_ID + ", " + FLD_ACCOUNTID + ", " + FLD_ACCOUNT + ", "
			+ FLD_FULLNAME + ", " + FLD_RATING + ", " + FLD_EMAIL + ", " + FLD_EMPLOYEESCOUNT + ", " + FLD_WORKPHONE
			+ ", " + FLD_DATE_OF_REGISTRATION + ", " + FLD_CLIENT_CATEGORY + ", " + FLD_SECTOR + ", "
			+ FLD_BUSINESS_DESCR + ", " + FLD_CITY + ", " + FLD_LEGAL_ADDRESS + ", " + FLD_REAL_ADDRESS + ", "
			+ FLD_POSTALCODE + ", " + FLD_INN + ", " + FLD_KPP + ", " + FLD_ID_REGION + ", " + FLD_ID_INDUSTRY + ", "
			+ FLD_ID_OKOPF + ", " + FLD_FAX + " " + "from " + TABLE + " " + "WHERE " + FLD_ID
			+ " IN(SELECT id_organisation FROM R_org_orggroup WHERE ID_GROUP = ? )";

	final String CMD_FIND_LIST = "select " + FLD_ID + ", " + FLD_ACCOUNTID + ", " + FLD_ACCOUNT + ", " + FLD_FULLNAME
			+ ", " + FLD_RATING + ", " + FLD_EMAIL + ", " + FLD_EMPLOYEESCOUNT + ", " + FLD_WORKPHONE + ", "
			+ FLD_DATE_OF_REGISTRATION + ", " + FLD_CLIENT_CATEGORY + ", " + FLD_SECTOR + ", " + FLD_BUSINESS_DESCR
			+ ", " + FLD_CITY + ", " + FLD_LEGAL_ADDRESS + ", " + FLD_REAL_ADDRESS + ", " + FLD_POSTALCODE + ", "
			+ FLD_INN + ", " + FLD_KPP + ", " + FLD_ID_REGION + ", " + FLD_ID_INDUSTRY + ", " + FLD_ID_OKOPF + ", "
			+ FLD_FAX + " " + "from " + TABLE + " " + "WHERE LOWER(" + FLD_ACCOUNT + ") like LOWER(?) OR LOWER("
			+ FLD_FULLNAME + ") like LOWER(?)";

	@Override
	protected ArrayList findAllImpl(Connection conn) throws SQLException, MappingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void insertImpl(Connection conn, VtbObject anObject) throws SQLException, MappingException {
		if (anObject instanceof Organization) {
			Organization org = (Organization) anObject;
			PreparedStatement stmn = conn.prepareStatement(CMD_INSERT);
			int i = 1;
			stmn.setObject(i++, org.getId_contractor());
			stmn.setString(i++, org.getAccountid());
			stmn.setString(i++, org.getAccount_name());
			stmn.setString(i++, org.getAccount_fullname());
			stmn.setString(i++, org.getRating());
			stmn.setString(i++, org.getEmail());
			stmn.setObject(i++, org.getEmployees_count());
			stmn.setString(i++, org.getPhone());
			stmn.setDate(i++, org.getDate_of_registration());
			stmn.setString(i++, org.getCategory());
			stmn.setString(i++, null);// org.getSector()
			stmn.setString(i++, org.getBusiness_description());
			stmn.setString(i++, org.getCity());
			stmn.setString(i++, org.getLaw_address());
			stmn.setString(i++, org.getReal_address());
			stmn.setObject(i++, org.getPostal_code());
			stmn.setString(i++, org.getINN());
			stmn.setString(i++, org.getKPP());
			stmn.setObject(i++, org.getId_region());
			stmn.setObject(i++, org.getId_industry());
			stmn.setObject(i++, org.getId_opf());
			stmn.setObject(i++, org.getFax());

			stmn.execute();
			stmn.close();
		} else {
			throw new MappingException("ERROR: incorrect mapping to Organization object");
		}
	}

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected VtbObject findByPrimaryKeyImpl(Connection conn, VtbObject domainObjectWithKeyValues) throws SQLException,
			MappingException {
		boolean isExist = false;
		if (domainObjectWithKeyValues instanceof Organization) {
			Organization org = (Organization) domainObjectWithKeyValues;
			PreparedStatement stmn = conn.prepareStatement(CMD_FIND_BY_KEY);
			stmn.setObject(1, org.getId_contractor());
			ResultSet rs = stmn.executeQuery();
			if (rs.next()) {
				isExist = true;
				mapTableRow(org, rs);
			}

			stmn.close();
		} else {
			throw new MappingException("ERROR: incorrect mapping to Organization object");
		}
		return (isExist == true ? domainObjectWithKeyValues : null);

	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		if (domainObject instanceof Organization) {
			Organization org = (Organization) domainObject;
			PreparedStatement stmn = conn.prepareStatement(CMD_REMOVE);

			stmn.setObject(1, org.getId_contractor());

			stmn.execute();
			stmn.close();
		} else {
			throw new MappingException("ERROR: incorrect mapping to Organization object");
		}

	}

	@Override
	protected void updateImpl(Connection conn, VtbObject anObject) throws SQLException, MappingException {

		if (anObject instanceof Organization) {
			Organization org = (Organization) anObject;

			PreparedStatement stmn = conn.prepareStatement(CMD_UPDATE);
			int i = 1;
			stmn.setString(i++, org.getAccountid());
			stmn.setString(i++, org.getAccount_name());
			stmn.setString(i++, org.getAccount_fullname());
			stmn.setString(i++, org.getRating());
			stmn.setString(i++, org.getEmail());
			stmn.setObject(i++, org.getEmployees_count());
			stmn.setString(i++, org.getPhone());
			stmn.setDate(i++, org.getDate_of_registration());
			stmn.setString(i++, org.getCategory());
			stmn.setObject(i++, null);// org.getSector()
			stmn.setString(i++, org.getBusiness_description());
			stmn.setString(i++, org.getCity());
			stmn.setString(i++, org.getLaw_address());
			stmn.setString(i++, org.getReal_address());
			stmn.setObject(i++, org.getPostal_code());
			stmn.setString(i++, org.getINN());
			stmn.setString(i++, org.getKPP());
			stmn.setObject(i++, org.getId_region());
			stmn.setObject(i++, org.getId_industry());
			stmn.setObject(i++, org.getId_opf());
			stmn.setObject(i++, org.getFax());

			stmn.setObject(i++, org.getId_contractor());

			stmn.execute();
			stmn.close();
		} else {
			throw new MappingException("ERROR: incorrect mapping to Shareholder object");
		}
	}

	public ArrayList findByAccountID(Organization findObjects) throws SQLException, MappingException {
		Connection conn = null;
		ArrayList<Organization> objectList = new ArrayList<Organization>();
		try {
			// get a connection
			conn = getConnection();
			// single transaction.
			// conn.setAutoCommit(false);
			PreparedStatement stmn = conn.prepareStatement(CMD_FIND_BY_ACCOUNTID);
			stmn.setLong(1, findObjects.getId_contractor());
			ResultSet rs = stmn.executeQuery();
			while (rs.next()) {
				Organization org = new Organization();
				mapTableRow(org, rs);
				objectList.add(org);
			}

			// conn.commit();
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception " + e + " caught in findByAccountID()");
			throw new NoSuchObjectException("Wrapped Exception " + e + " caught in findByAccountID()");
		} finally {
			close(conn);
		}
		return objectList;
	}

	protected void mapTableRow(Organization org, ResultSet rs) throws SQLException {
		org.setId_contractor(Converter.toLong((BigDecimal) rs.getObject(FLD_ID)));
		org.setAccountid(rs.getString(FLD_ACCOUNTID));
		org.setAccount_name(rs.getString(FLD_ACCOUNT));
		org.setAccount_fullname(rs.getString(FLD_FULLNAME));
		org.setRating(rs.getString(FLD_RATING));
		org.setEmail(rs.getString(FLD_EMAIL));
		org.setEmployees_count(Converter.toInteger((BigDecimal) rs.getObject(FLD_EMPLOYEESCOUNT)));
		org.setPhone(rs.getString(FLD_WORKPHONE));
		org.setDate_of_registration(rs.getDate(FLD_DATE_OF_REGISTRATION));
		org.setCategory(rs.getString(FLD_CLIENT_CATEGORY));
		// org.setSector(rs.getString(FLD_SECTOR));
		org.setBusiness_description(rs.getString(FLD_BUSINESS_DESCR));
		org.setCity(rs.getString(FLD_CITY));
		org.setLaw_address(rs.getString(FLD_LEGAL_ADDRESS));
		org.setReal_address(rs.getString(FLD_REAL_ADDRESS));
		org.setPostal_code(rs.getString(FLD_POSTALCODE));
		org.setINN(rs.getString(FLD_INN));
		org.setKPP(rs.getString(FLD_KPP));
		org.setId_industry(Converter.toLong((BigDecimal) rs.getObject(FLD_ID_INDUSTRY)));
		org.setId_region(Converter.toLong((BigDecimal) rs.getObject(FLD_ID_REGION)));
		org.setId_opf(Converter.toLong((BigDecimal) rs.getObject(FLD_ID_OKOPF)));
		org.setFax(rs.getString(FLD_FAX));
	}

	public ArrayList findList(String name, String orderBy) throws MappingException {
		ArrayList<Organization> list = new ArrayList<Organization>();
		Organization organization = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(CMD_FIND_LIST);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setString(1, name);
			ps.setString(2, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				organization = new Organization();
				mapTableRow(organization, rs);
				list.add(organization);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	public ArrayList findListByGroup(Integer groupID, String orderBy) throws MappingException {
		ArrayList<Organization> list = new ArrayList<Organization>();
		Organization organization = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(CMD_FIND_LIST_BY_GROUP);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, groupID);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				organization = new Organization();
				mapTableRow(organization, rs);
				list.add(organization);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}
	
	public ArrayList findListTO_ByGroup(Integer groupID, String orderBy) throws MappingException {
		ArrayList<OrganizationTO> list = new ArrayList<OrganizationTO>();
		OrganizationTO vo = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findListTO_ByGroup_SQL);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, groupID);
			ps.setObject(2, groupID);
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
	public ArrayList findListTO_ByGroupCRM(String groupCrmID, String orderBy) throws MappingException {
		ArrayList<OrganizationTO> list = new ArrayList<OrganizationTO>();
		OrganizationTO vo = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findListTO_ByGroupCrm_SQL);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, groupCrmID);
			ps.setObject(2, groupCrmID);
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
	
	
}
