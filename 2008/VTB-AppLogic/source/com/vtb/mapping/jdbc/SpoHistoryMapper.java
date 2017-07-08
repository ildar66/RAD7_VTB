package com.vtb.mapping.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.SpoHistory;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;
/**
 * JDBCMapper "История прохождения заявки".
 * В данную таблицу система СПО записывает информацию о прохождении заявки
 * 
 * @author IShafigullin
 * 
 */
public class SpoHistoryMapper extends JDBCMapperCRM implements
		com.vtb.mapping.SpoHistoryMapper {
	
	protected static final String findByNameSqlString = "SELECT FB_SPO_HISTORYID id, SPOEXPERT spoExpert, FB_SPO_OPPORTUNITYID spoOpportunityID, SPOSTEP sposter, STEPCHDATE stepchDate FROM "
		+ "sysdba.FB_SPO_HISTORY WHERE LOWER(SPOEXPERT) like LOWER(?)";

	protected static final String _loadString = "SELECT FB_SPO_HISTORYID id, SPOEXPERT spoExpert, FB_SPO_OPPORTUNITYID spoOpportunityID, SPOSTEP sposter, STEPCHDATE stepchDate FROM "
		+ "sysdba.FB_SPO_HISTORY WHERE FB_SPO_HISTORYID = ?";

	protected static final String _createString = "INSERT INTO "
			+ "sysdba.FB_SPO_HISTORY (FB_SPO_HISTORYID, SPOEXPERT, FB_SPO_OPPORTUNITYID, SPOSTEP, STEPCHDATE) VALUES (?, ?, ?, ?, ?) ";

	protected static final String _removeString = "DELETE FROM "
			+ "sysdba.FB_SPO_HISTORY  WHERE FB_SPO_HISTORYID = ?";

	protected static final String _storeString = "UPDATE "
			+ "sysdba.FB_SPO_HISTORY  SET SPOEXPERT = ?, FB_SPO_OPPORTUNITYID = ?, SPOSTEP = ?, STEPCHDATE = ? WHERE FB_SPO_HISTORYID = ?";

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		String id = null;
		String spoExpert = null;
		String spoOpportunityID = null;
		String sposter = null;
		Date stepchDate = null;
		if (domainObject instanceof SpoHistory) {
			id = ((SpoHistory) domainObject).getId();
			spoExpert = ((SpoHistory) domainObject).getSpoExpert();
			spoOpportunityID = ((SpoHistory) domainObject).getSpoOpportunityID();
			sposter = ((SpoHistory) domainObject).getSpoStep();
			stepchDate = ((SpoHistory) domainObject).getStepchDate();
		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		int i = 1;
		ps.setObject(i++, id);
		ps.setObject(i++, spoExpert);
		ps.setObject(i++, spoOpportunityID);
		ps.setObject(i++, sposter);
		ps.setObject(i++, stepchDate);
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
		SpoHistory domainObject = null;
		String aId = null;
		if (domainObjectWithKeyValues instanceof SpoHistory) {
			aId = ((SpoHistory) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, aId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		domainObject = activate(rs);
		return domainObject;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		String aId = null;
		if (domainObject instanceof SpoHistory) {
			aId = ((SpoHistory) domainObject).getId();
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
		String id = null;
		String spoExpert = null;
		String spoOpportunityID = null;
		String sposter = null;
		Date stepchDate = null;
		if (domainObject instanceof SpoHistory) {
			id = ((SpoHistory) domainObject).getId();
			spoExpert = ((SpoHistory) domainObject).getSpoExpert();
			spoOpportunityID = ((SpoHistory) domainObject).getSpoOpportunityID();
			sposter = ((SpoHistory) domainObject).getSpoStep();
			stepchDate = ((SpoHistory) domainObject).getStepchDate();
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);
		int i = 1;
		ps.setObject(i++, spoExpert);
		ps.setObject(i++, spoOpportunityID);
		ps.setObject(i++, sposter);
		ps.setObject(i++, stepchDate);
		ps.setObject(i++, id);
		int rows = ps.executeUpdate();
		if (rows == 1)
			return;
		else
			// failed
			throw new MappingException("Update Failed " + domainObject);
	}

	public ArrayList findByName(String spoExpert, String orderBy)
			throws MappingException {
		ArrayList<SpoHistory> list = new ArrayList<SpoHistory>();
		SpoHistory domainObject = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findByNameSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setString(1, spoExpert);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				domainObject = activate(rs);
				list.add(domainObject);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName spoExpert="
					+ se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected SpoHistory activate(ResultSet rs) throws SQLException {
		int i = 1;
		SpoHistory domainObject = new SpoHistory(rs.getString(i++), rs.getString(i++), rs.getString(i++), rs.getString(i++), rs.getDate(i++));
		return domainObject;
	}

	public ArrayList findAll() throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

}
