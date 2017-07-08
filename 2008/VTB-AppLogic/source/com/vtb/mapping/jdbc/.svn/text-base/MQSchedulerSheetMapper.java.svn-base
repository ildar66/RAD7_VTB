package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.MQSchedulerSheet;
import com.vtb.domain.VtbObject;
import com.vtb.exception.MappingException;
import com.vtb.util.Converter;

public class MQSchedulerSheetMapper extends JDBCMapperExt implements
com.vtb.mapping.MQSchedulerSheetMapper{
	final String TABLE = "MQSchedulerSheet";
	final String FLD_ID = "ID";
	final String FLD_STARTTIME = "START_TIME";
	final String FLD_ENDTIME = "END_TIME";
	final String FLD_ID_DEPARTMENT = "ID_DEPARTMENT";
	final String FLD_DAYSOFWEEK = "DAYS_OF_WEEK";
	final String FLD_STATUS = "STATUS";
	
	final String CMD_INSERT = "insert into "+TABLE+" ("+
								FLD_ID+", "+
								FLD_STARTTIME+", "+
								FLD_ENDTIME+", "+
								FLD_ID_DEPARTMENT+", "+
								FLD_DAYSOFWEEK+", "+
								FLD_STATUS+
								") VALUES(?,?,?,?,?,?)";
	final String CMD_UPDATE = "update "+TABLE+" set "+
								FLD_STARTTIME+"=?, " +
								FLD_ENDTIME+"=?, " +
								FLD_ID_DEPARTMENT+"=?, " +
								FLD_DAYSOFWEEK+"=?, " +
								FLD_STATUS+"=? " +
								" where "+FLD_ID+"=?";
	final String CMD_REMOVE = "delete from "+TABLE+" where "+FLD_ID+"=?";
	final String CMD_FIND_BY_KEY = "select "+
									FLD_ID+", "+
									FLD_STARTTIME+", "+
									FLD_ENDTIME+", "+
									FLD_ID_DEPARTMENT+", "+
									FLD_DAYSOFWEEK+", "+
									FLD_STATUS+
									" from "+TABLE+
									" where "+FLD_ID+"=?";
	final String CMD_FIND_LIST = "select "+
									FLD_ID+", "+
									FLD_STARTTIME+", "+
									FLD_ENDTIME+", "+
									FLD_ID_DEPARTMENT+", "+
									FLD_DAYSOFWEEK+", "+
									FLD_STATUS+
									" from "+TABLE+
									" where "+FLD_ID_DEPARTMENT+"=?";	
	
	@Override
	protected ArrayList findAllImpl(Connection conn) throws SQLException,
			MappingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void insertImpl(Connection conn, VtbObject anObject)
			throws SQLException, MappingException {

		if (anObject instanceof MQSchedulerSheet) {
			MQSchedulerSheet sheet = (MQSchedulerSheet) anObject;
			
			if (sheet.getId().equals(new Long(MQSchedulerSheet.CONST_ID_UNKNOWN)))
			{				
				//TODO INSERT ID GENERATION
				throw new MappingException("ERROR: error id generation");
			}
			
			PreparedStatement stmn = conn.prepareStatement(CMD_INSERT);
			
			stmn.setObject(1, sheet.getId());
			stmn.setTime(2, sheet.getStartTime());
			stmn.setTime(3, sheet.getEndTime());
			stmn.setObject(4, sheet.getId_department());
			stmn.setObject(5, sheet.getDaysOfWeek());
			stmn.setObject(6, sheet.getStatus());
		
			stmn.execute();			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to AttachmentFile object");
		}
	}

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected VtbObject findByPrimaryKeyImpl(Connection conn,
			VtbObject domainObjectWithKeyValues) throws SQLException,
			MappingException {
		// TODO Auto-generated method stub
		boolean isExist = false;
		if (domainObjectWithKeyValues instanceof MQSchedulerSheet) {
			MQSchedulerSheet sheet = (MQSchedulerSheet) domainObjectWithKeyValues;	
			PreparedStatement stmn = conn.prepareStatement(CMD_FIND_BY_KEY);
			
			stmn.setObject(1, sheet.getId());
			ResultSet rs = stmn.executeQuery();
			if (rs.next()) {
				isExist = true;
				mapTableRow(sheet, rs);
			}
			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to AttachmentFile object");
		}		
		return (isExist == true? domainObjectWithKeyValues : null);		
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		// TODO Auto-generated method stub
		if (domainObject instanceof MQSchedulerSheet) {
			MQSchedulerSheet sheet = (MQSchedulerSheet) domainObject;	
			PreparedStatement stmn = conn.prepareStatement(CMD_REMOVE);
							
			stmn.setObject(1, sheet.getId());
			
			stmn.execute();			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to AttachmentFile object");
		}
	}

	@Override
	protected void updateImpl(Connection conn, VtbObject anObject)
			throws SQLException, MappingException {
		// TODO Auto-generated method stub
		if (anObject instanceof MQSchedulerSheet) {
			MQSchedulerSheet sheet = (MQSchedulerSheet) anObject;	
			PreparedStatement stmn = conn.prepareStatement(CMD_UPDATE);
						
			stmn.setTime(1, sheet.getStartTime());
			stmn.setTime(2, sheet.getEndTime());
			stmn.setObject(3, sheet.getId_department());
			stmn.setObject(4, sheet.getDaysOfWeek());
			stmn.setObject(5, sheet.getStatus());
			stmn.setObject(6, sheet.getId());
			
			stmn.execute();			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to AttachmentFile object");
		}
	}
	
	protected void mapTableRow(MQSchedulerSheet sheet, ResultSet rs) throws SQLException {
		sheet.setId(Converter.toLong((BigDecimal)rs.getObject(FLD_ID)));
		sheet.setStartTime(rs.getTime(FLD_STARTTIME));
		sheet.setEndTime(rs.getTime(FLD_ENDTIME));
		sheet.setId_department(Converter.toLong((BigDecimal)rs.getObject(FLD_ID_DEPARTMENT)));
		sheet.setDaysOfWeek(Converter.toInteger((BigDecimal)rs.getObject(FLD_DAYSOFWEEK)));
		sheet.setStatus(Converter.toInteger((BigDecimal)rs.getObject(FLD_STATUS)));
		
	}


	public ArrayList findList(Integer departmentKey, String status, String orderBy) throws MappingException {
		ArrayList list = new ArrayList();
		MQSchedulerSheet mqSchedulerSheet = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(CMD_FIND_LIST);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setObject(1, departmentKey);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				mqSchedulerSheet = new MQSchedulerSheet();
				mapTableRow(mqSchedulerSheet, rs);
				list.add(mqSchedulerSheet);
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

}
