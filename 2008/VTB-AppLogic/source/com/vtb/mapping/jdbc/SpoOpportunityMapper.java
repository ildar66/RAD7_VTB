package com.vtb.mapping.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.SpoOpportunity;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;

/**
 * Mapper "Cлужит для связи заявки, признаков отправке/получения, статусов
 * возврата между СПО и CRM"
 * 
 * @author IShafigullin
 * 
 */
public class SpoOpportunityMapper extends JDBCMapperCRM implements com.vtb.mapping.SpoOpportunityMapper {
	
	protected static final String findByFilterSqlString = "SELECT FB_SPO_OPPORTUNITYID id, SPOSEND, SPOSENDDATE, SPOACCEPT, SPOACCEPTDATE, SPOTYPE, OPPORTUNITYID, ACCOUNTID, CALLBACK, CALLBACKDATE FROM "
		+ "sysdba.FB_SPO_OPPORTUNITY WHERE (SPOACCEPT != ? OR SPOACCEPT IS NULL) and  SPOSEND = ?";

	
	protected static final String _loadString = "SELECT FB_SPO_OPPORTUNITYID id, SPOSEND, SPOSENDDATE, SPOACCEPT, SPOACCEPTDATE, SPOTYPE, OPPORTUNITYID, ACCOUNTID, CALLBACK, CALLBACKDATE FROM "
		+ "sysdba.FB_SPO_OPPORTUNITY WHERE FB_SPO_OPPORTUNITYID = ?";

	protected static final String _createString = "INSERT INTO "
			+ "sysdba.FB_SPO_OPPORTUNITY (FB_SPO_OPPORTUNITYID, SPOSEND, SPOSENDDATE, SPOACCEPT, SPOACCEPTDATE, SPOTYPE, OPPORTUNITYID, ACCOUNTID, CALLBACK, CALLBACKDATE ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	protected static final String _removeString = "DELETE FROM FB_SPO_OPPORTUNITY  WHERE FB_SPO_OPPORTUNITYID = ?";

	protected static final String _storeString = "UPDATE "
			+ "sysdba.FB_SPO_OPPORTUNITY  SET SPOSEND = ?, SPOSENDDATE = ?, SPOACCEPT = ?, SPOACCEPTDATE = ?, SPOTYPE = ?, OPPORTUNITYID = ?, ACCOUNTID =?, CALLBACK = ?, CALLBACKDATE = ?  WHERE FB_SPO_OPPORTUNITYID = ?";

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		String id = null;
		String spoSend = null;
		Date spoSendDate = null;
		String spoAccept = null;
		Date spoAcceptDate = null;
		String spoType = null;
		String opportunityID = null;
		String accountID = null;
		String callBack = null;
		Date callBackDate = null;

		if (domainObject instanceof SpoOpportunity) {
			id = ((SpoOpportunity) domainObject).getId();
			spoSend = ((SpoOpportunity) domainObject).getSpoSend();
			spoSendDate = ((SpoOpportunity) domainObject).getSpoSendDate();
			spoAccept = ((SpoOpportunity) domainObject).getSpoAccept();
			spoAcceptDate = ((SpoOpportunity) domainObject).getSpoAcceptDate();
			spoType = ((SpoOpportunity) domainObject).getSpoType();
			opportunityID = ((SpoOpportunity) domainObject).getOpportunityID();
			accountID = ((SpoOpportunity) domainObject).getAccountID();
			callBackDate = ((SpoOpportunity) domainObject).getCallBackDate();

		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		int i = 1;
		ps.setObject(i++, id);
		ps.setObject(i++, spoSend);
		ps.setObject(i++, spoSendDate);
		ps.setObject(i++, spoAccept);
		ps.setObject(i++, spoAcceptDate);
		ps.setObject(i++, spoType);
		ps.setObject(i++, opportunityID);
		ps.setObject(i++, accountID);
		ps.setObject(i++, callBack);
		ps.setObject(i++, callBackDate);

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
		SpoOpportunity spoOpportunity = null;
		String aId = null;
		if (domainObjectWithKeyValues instanceof SpoOpportunity) {
			aId = ((SpoOpportunity) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, aId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		spoOpportunity = activate(rs);
		return spoOpportunity;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		String aId = null;
		if (domainObject instanceof SpoOpportunity) {
			aId = ((SpoOpportunity) domainObject).getId();
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
		String id = null;
		String spoSend = null;
		Date spoSendDate = null;
		String spoAccept = null;
		Date spoAcceptDate = null;
		String spoType = null;
		String opportunityID = null;
		String accountID = null;
		String callBack = null;
		Date callBackDate = null;
		if (domainObject instanceof SpoOpportunity) {
			id = ((SpoOpportunity) domainObject).getId();
			spoSend = ((SpoOpportunity) domainObject).getSpoSend();
			spoSendDate = ((SpoOpportunity) domainObject).getSpoSendDate();
			spoAccept = ((SpoOpportunity) domainObject).getSpoAccept();
			spoAcceptDate = ((SpoOpportunity) domainObject).getSpoAcceptDate();
			spoType = ((SpoOpportunity) domainObject).getSpoType();
			opportunityID = ((SpoOpportunity) domainObject).getOpportunityID();
			accountID = ((SpoOpportunity) domainObject).getAccountID();
			callBackDate = ((SpoOpportunity) domainObject).getCallBackDate();
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);
		int i = 1;
		ps.setObject(i++, spoSend);
		ps.setObject(i++, spoSendDate);
		ps.setObject(i++, spoAccept);
		ps.setObject(i++, spoAcceptDate);
		ps.setObject(i++, spoType);
		ps.setObject(i++, opportunityID);
		ps.setObject(i++, accountID);
		ps.setObject(i++, callBack);
		ps.setObject(i++, callBackDate);
		ps.setObject(i++, id);
		int rows = ps.executeUpdate();
		if (rows == 1)
			return;
		else
			// failed
			throw new MappingException("Update Failed " + domainObject);
	}

	public ArrayList findByFilter(String isAccept, String isSend, String orderBy) throws MappingException {
		ArrayList<SpoOpportunity> list = new ArrayList<SpoOpportunity>();
		SpoOpportunity spoOpportunity = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findByFilterSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setString(1, isAccept);
			ps.setString(2, isSend);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				spoOpportunity = activate(rs);
				list.add(spoOpportunity);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected SpoOpportunity activate(ResultSet rs) throws SQLException {
		int i = 1;
		SpoOpportunity spoOpportunity = new SpoOpportunity(rs.getString(i++));
		spoOpportunity.setSpoSend(rs.getString(i++));
		spoOpportunity.setSpoSendDate((Date)rs.getObject(i++));
		spoOpportunity.setSpoAccept(rs.getString(i++));
		spoOpportunity.setSpoAcceptDate((Date)rs.getObject(i++));
		spoOpportunity.setSpoType(rs.getString(i++));
		spoOpportunity.setOpportunityID(rs.getString(i++));
		spoOpportunity.setAccountID(rs.getString(i++));
		spoOpportunity.setCallBack(rs.getString(i++));
		spoOpportunity.setCallBackDate((Date)rs.getObject(i++));
		return spoOpportunity;
	}

	public ArrayList findAll() throws MappingException {
		// TODO Auto-generated method stub
		return null;
	}

}
