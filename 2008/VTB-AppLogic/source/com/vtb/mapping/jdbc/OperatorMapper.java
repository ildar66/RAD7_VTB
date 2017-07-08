package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.Operator;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;

public class OperatorMapper extends JDBCMapper implements com.vtb.mapping.OperatorMapper {
	protected static final String findByNameSqlString = "SELECT ID_OPERATOR id, LOGIN login, FA, IM, OT, ID_DEPARTMENT, EMAIL FROM " + ApplProperties.getDatasourceSchema()
			+ ".OPERATOR WHERE ID_DEPARTMENT = ? AND LOWER(LOGIN) like LOWER(?)";

	protected static final String _loadString = "SELECT ID_OPERATOR, LOGIN, FA, IM, OT, ID_DEPARTMENT, EMAIL FROM " + ApplProperties.getDatasourceSchema() + ".OPERATOR WHERE ID_OPERATOR = ?";

	protected static final String _createString = "INSERT INTO " + ApplProperties.getDatasourceSchema()
			+ ".OPERATOR (ID_OPERATOR, LOGIN, FA, IM, OT, ID_DEPARTMENT, EMAIL) VALUES (?, ?, ?, ?, ?, ?, ?)";

	protected static final String _removeString = "DELETE FROM " + ApplProperties.getDatasourceSchema() + ".OPERATOR  WHERE ID_OPERATOR = ?";

	protected static final String _storeString = "UPDATE " + ApplProperties.getDatasourceSchema()
			+ ".OPERATOR  SET LOGIN = ?, FA = ?, IM = ?, OT = ?, ID_DEPARTMENT = ?, EMAIL = ? WHERE ID_OPERATOR = ?";
	
	protected static final String findByLoginSqlString = "SELECT ID_OPERATOR id, LOGIN login, FA, IM, OT, ID_DEPARTMENT, EMAIL FROM " + ApplProperties.getDatasourceSchema()
	+ ".OPERATOR WHERE LOGIN = ?";
	

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer id = null;
		String login = null;
		String fieldFA = null;
		String fieldIM = null;
		String fieldOT = null;
		Integer departmentID = null;
		String eMail = null;

		if (domainObject instanceof Operator) {
			id = ((Operator) domainObject).getId();
			login = ((Operator) domainObject).getLogin();
			fieldFA = ((Operator) domainObject).getFieldFA();
			fieldIM = ((Operator) domainObject).getFieldIM();
			fieldOT = ((Operator) domainObject).getFieldOT();
			departmentID = ((Operator) domainObject).getDepartmentID();
			eMail = ((Operator) domainObject).getEMail();

		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		int i = 1;
		ps.setObject(i++, id);
		ps.setObject(i++, login);
		ps.setObject(i++, fieldFA);
		ps.setObject(i++, fieldIM);
		ps.setObject(i++, fieldOT);
		ps.setObject(i++, departmentID);
		ps.setObject(i++, eMail);
		int rows = ps.executeUpdate();
		if (rows == 1)
			return domainObject;
		else
			// failed
			throw new DuplicateKeyException("Create Failed " + domainObject);
	}

	@Override
	protected VtbObject findByPrimaryKeyImpl(Connection conn, VtbObject domainObjectWithKeyValues) throws SQLException, MappingException {
		Operator operator = null;
		Integer operatorId = null;
		if (domainObjectWithKeyValues instanceof Operator) {
			operatorId = ((Operator) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, operatorId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		operator = activate(rs);
		return operator;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer aId = null;
		if (domainObject instanceof Operator) {
			aId = ((Operator) domainObject).getId();
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
		String login = null;
		String fieldFA = null;
		String fieldIM = null;
		String fieldOT = null;
		Integer departmentID = null;
		String eMail = null;
		if (domainObject instanceof Operator) {
			id = ((Operator) domainObject).getId();
			login = ((Operator) domainObject).getLogin();
			fieldFA = ((Operator) domainObject).getFieldFA();
			fieldIM = ((Operator) domainObject).getFieldIM();
			fieldOT = ((Operator) domainObject).getFieldOT();
			departmentID = ((Operator) domainObject).getDepartmentID();
			eMail = ((Operator) domainObject).getEMail();
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);

		int i = 1;
		ps.setObject(i++, login);
		ps.setObject(i++, fieldFA);
		ps.setObject(i++, fieldIM);
		ps.setObject(i++, fieldOT);
		ps.setObject(i++, departmentID);
		ps.setObject(i++, eMail);
		
		ps.setObject(i++, id);
		int rows = ps.executeUpdate();
		if (rows == 1)
			return;
		else
			// failed
			throw new MappingException("Update Failed " + domainObject);
	}

	public ArrayList findByName(Integer departmentId, String likeName, String orderBy) throws MappingException {
		ArrayList list = new ArrayList();
		Operator operator = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findByNameSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, departmentId);
			ps.setString(2, likeName);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				operator = activate(rs);
				list.add(operator);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected Operator activate(ResultSet rs) throws SQLException {
		int i = 1;
		Operator operator = new Operator(((BigDecimal) rs.getObject(i++)).intValue(), rs.getString(i++));
		operator.setFieldFA(rs.getString(i++));
		operator.setFieldIM(rs.getString(i++));
		operator.setFieldOT(rs.getString(i++));
		if (rs.getObject(i) != null) {
			operator.setDepartmentID(((BigDecimal) rs.getObject(i++)).intValue());
		}
		operator.setEMail(rs.getString(i++));
		return operator;
	}

	public ArrayList findAll() throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

	public Operator findOperatorByLogin(String aLogin) throws MappingException {
		Operator operator = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findByLoginSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, aLogin);
			ResultSet rs = ps.executeQuery();
			rs.next();
			operator = activate(rs);
			return operator;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

}
