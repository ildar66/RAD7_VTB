package com.vtb.mapping.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vtb.exception.MappingException;

public abstract class OrganizationLinkMapper extends JDBCMapperExt implements com.vtb.mapping.OrganizationLinkMapper {

	private static final String deleteLinkOrganizationCrmToGroup_SQL = "DELETE FROM R_org_orggroup WHERE id_group = ? AND crmOrg = ? ";
	private static final String addLinkOrganizationCrmToGroup_SQL = "INSERT INTO R_org_orggroup(id, id_group, crmOrg) VALUES (?,?,?) ";
	private static final String deleteLinkOrganizationToGroup_SQL = "DELETE FROM R_org_orggroup WHERE id_group = ? AND id_organisation = ? ";
	private static final String addLinkOrganizationToGroup_SQL = "INSERT INTO R_org_orggroup(id, id_group, id_organisation) VALUES (?,?,?) ";
	private static final String deleteLinkOrganizationCrmToGroupCrm_SQL = "DELETE FROM R_org_orggroup WHERE crmgroup = ? AND crmOrg = ? ";
	private static final String addLinkOrganizationCrmToGroupCrm_SQL = "INSERT INTO R_org_orggroup(id, crmgroup, crmOrg) VALUES (?,?,?) ";
	private static final String deleteLinkOrganizationToGroupCrm_SQL = "DELETE FROM R_org_orggroup WHERE crmgroup = ? AND id_organisation = ? ";
	private static final String addLinkOrganizationToGroupCrm_SQL = "INSERT INTO R_org_orggroup(id, crmgroup, id_organisation) VALUES (?,?,?) ";
	private static final String deleteLinkToOkved_SQL = "DELETE FROM R_org_okved WHERE okvedID = ? AND orgID = ? ";
	private static final String addLinkToOkved_SQL = "INSERT INTO R_org_okved(id, okvedID, orgID) VALUES (?,?,?) ";
	private static final String deleteLinkToOkvedCRM_SQL = "DELETE FROM R_org_okved WHERE crmOkvedID = ? AND orgID = ? ";
	private static final String addLinkToOkvedCRM_SQL = "INSERT INTO R_org_okved(id, crmOkvedID, orgID) VALUES (?,?,?) ";

	public OrganizationLinkMapper() {
		super();
	}

	public void addLinkGroupToOrganization(String groupKey, String organizationKey) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			st = conn.prepareStatement(addLinkOrganizationToGroup_SQL);
			st.setObject(1, System.currentTimeMillis());
			st.setString(2, groupKey);
			st.setString(3, organizationKey);
			if (st.executeUpdate() != 1) {
				String err = "addLinkGroupToOrganization.organizationKey=" + organizationKey + " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			if (se.getErrorCode() == -268) {
				throw new MappingException(se, "Данная связь присутствует!");
			}
			throw new MappingException(se, "SQLException addLinkGroupToOrganization code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	public void addLinkGroupToOrganizationCRM(String groupKey, String organizationCrmKey) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			st = conn.prepareStatement(addLinkOrganizationCrmToGroup_SQL);
			st.setObject(1, System.currentTimeMillis());
			st.setString(2, groupKey);
			st.setString(3, organizationCrmKey);
			if (st.executeUpdate() != 1) {
				String err = "addLinkGroupToOrganizationCRM.organizationCRM Key=" + organizationCrmKey + " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			if (se.getErrorCode() == -268) {
				throw new MappingException(se, "Данная связь присутствует!");
			}
			throw new MappingException(se, "SQLException addLinkGroupToOrganizationCRM code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	public void deleteLinkGroupToOrganization(String groupKey, String organizationKey) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			st = conn.prepareStatement(deleteLinkOrganizationToGroup_SQL);
			st.setString(1, groupKey);
			st.setString(2, organizationKey);
			if (st.executeUpdate() != 1) {
				String err = "deleteLinkGroupToOrganization.organizationKey=" + organizationKey + " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException deleteLinkGroupToOrganization code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	public void deleteLinkGroupToOrganizationCRM(String groupKey, String organizationCrmKey) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			st = conn.prepareStatement(deleteLinkOrganizationCrmToGroup_SQL);
			st.setString(1, groupKey);
			st.setString(2, organizationCrmKey);
			if (st.executeUpdate() != 1) {
				String err = "deleteLinkGroupToOrganizationCRM.organizationCRM Key=" + organizationCrmKey + " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException deleteLinkGroupToOrganizationCRM code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	public void addLinkOkvedToOrganization(String okvedKey, String organizationKey) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			st = conn.prepareStatement(addLinkToOkved_SQL);
			st.setObject(1, System.currentTimeMillis());
			st.setString(2, okvedKey);
			st.setString(3, organizationKey);
			if (st.executeUpdate() != 1) {
				String err = "addLinkOkvedToOrganization.organizationKey=" + organizationKey + " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			if (se.getErrorCode() == -268) {
				throw new MappingException(se, "Данная связь присутствует!");
			}
			throw new MappingException(se, "SQLException addLinkOperatorToRole code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	public void deleteLinkOkvedToOrganization(String okvedKey, String organizationKey) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			st = conn.prepareStatement(deleteLinkToOkved_SQL);
			st.setString(1, okvedKey);
			st.setString(2, organizationKey);
			if (st.executeUpdate() != 1) {
				String err = "deleteLinkOkvedToOrganization.organizationKey=" + organizationKey + " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException deleteLinkOkvedToOrganization code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}
	
	

	public void addLinkOkvedCrmToOrganization(String okvedCrmKey, String organizationKey) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			st = conn.prepareStatement(addLinkToOkvedCRM_SQL);
			st.setObject(1, System.currentTimeMillis());
			st.setString(2, okvedCrmKey);
			st.setString(3, organizationKey);
			if (st.executeUpdate() != 1) {
				String err = "addLinkOkvedToOrganization.organizationKey=" + organizationKey + " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			if (se.getErrorCode() == -268) {
				throw new MappingException(se, "Данная связь присутствует!");
			}
			throw new MappingException(se, "SQLException addLinkOperatorToRole code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	public void deleteLinkOkvedCrmToOrganization(String okvedCrmKey, String organizationKey) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			st = conn.prepareStatement(deleteLinkToOkvedCRM_SQL);
			st.setString(1, okvedCrmKey);
			st.setString(2, organizationKey);
			if (st.executeUpdate() != 1) {
				String err = "deleteLinkOkvedToOrganization.organizationKey=" + organizationKey + " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException deleteLinkOkvedToOrganization code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	public void addLinkGroupCrmToOrganization(String groupCrmKey, String organizationKey) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			st = conn.prepareStatement(addLinkOrganizationToGroupCrm_SQL);
			st.setObject(1, System.currentTimeMillis());
			st.setString(2, groupCrmKey);
			st.setString(3, organizationKey);
			if (st.executeUpdate() != 1) {
				String err = "addLinkGroupCrmToOrganization.organizationKey=" + organizationKey + " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			if (se.getErrorCode() == -268) {
				throw new MappingException(se, "Данная связь присутствует!");
			}
			throw new MappingException(se, "SQLException addLinkGroupCrmToOrganization code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	public void addLinkGroupCrmToOrganizationCRM(String groupCrmKey, String organizationCrmKey) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			st = conn.prepareStatement(addLinkOrganizationCrmToGroupCrm_SQL);
			st.setObject(1, System.currentTimeMillis());
			st.setString(2, groupCrmKey);
			st.setString(3, organizationCrmKey);
			if (st.executeUpdate() != 1) {
				String err = "addLinkGroupCrmToOrganizationCRM.organizationCRM Key=" + organizationCrmKey + " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			if (se.getErrorCode() == -268) {
				throw new MappingException(se, "Данная связь присутствует!");
			}
			throw new MappingException(se, "SQLException addLinkGroupCrmToOrganizationCRM code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	public void deleteLinkGroupCrmToOrganization(String groupCrmKey, String organizationKey) throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			st = conn.prepareStatement(deleteLinkOrganizationToGroupCrm_SQL);
			st.setString(1, groupCrmKey);
			st.setString(2, organizationKey);
			if (st.executeUpdate() != 1) {
				String err = "deleteLinkGroupCrmToOrganization.organizationKey=" + organizationKey + " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException deleteLinkGroupCrmToOrganization code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	public void deleteLinkGroupCrmToOrganizationCRM(String groupCrmKey, String organizationCrmKey)
			throws MappingException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = getConnection();
			st = conn.prepareStatement(deleteLinkOrganizationCrmToGroupCrm_SQL);
			st.setString(1, groupCrmKey);
			st.setString(2, organizationCrmKey);
			if (st.executeUpdate() != 1) {
				String err = "deleteLinkGroupCrmToOrganizationCRM.organizationCRM Key=" + organizationCrmKey
						+ " failed";
				throw new MappingException(err);
			}
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException deleteLinkGroupCrmToOrganizationCRM code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

}