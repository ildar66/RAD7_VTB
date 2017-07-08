package com.vtb.mapping.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.AttachmentFile;
import com.vtb.domain.SPOMessage;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.exception.NoSuchObjectException;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;

/**
 * @author Sergey
 *
 * JDBC-реализация интерфейса <code>SPOMessageMapper</code>  
 */
public class SPOMessageMapper extends JDBCMapperExt implements com.vtb.mapping.SPOMessageMapper {
	static final public String TABLE = "message";
	static final public String FLD_ID = "idMessage";
	static final public String FLD_FROM = "mFrom";
	static final public String FLD_TO = "mTo";
	static final public String FLD_SUBJECT = "mSubject";
	static final public String FLD_MESSAGE = "message";
	static final public String FLD_TIMESTAMP = "mTimestamp";
	static final public String FLD_FROMFULL = "mFromFull";
	static final public String FLD_TOFULL = "mToFull";	
	static final public String FLD_ISREAD = "isRead";
	
	static final private String CMD_INSERT = "insert into " + SPOMessageMapper.TABLE + " (" +
											 SPOMessageMapper.FLD_FROM + "," + 
											 SPOMessageMapper.FLD_TO + "," + 
											 SPOMessageMapper.FLD_SUBJECT + "," + 
											 SPOMessageMapper.FLD_MESSAGE + "," + 
											 SPOMessageMapper.FLD_FROMFULL + "," + 
											 SPOMessageMapper.FLD_TOFULL + "," +
											 SPOMessageMapper.FLD_ISREAD + ") " +
											 "VALUES(?, ?, ?, ?, ?, ?, ?)";
	
	static final private String CMD_REMOVE = "delete from " + SPOMessageMapper.TABLE + 
											 " where " + SPOMessageMapper.FLD_ID + " = ?";
	
	static final private String CMD_UPDATE = "update " + SPOMessageMapper.TABLE + 
											 " set " + SPOMessageMapper.FLD_FROM + "=?," +
											 SPOMessageMapper.FLD_TO + "=?," +
											 SPOMessageMapper.FLD_SUBJECT + "=?," +
											 SPOMessageMapper.FLD_MESSAGE + "=?," +
											 SPOMessageMapper.FLD_TIMESTAMP + "=?," +
											 SPOMessageMapper.FLD_FROMFULL + "=?," +
											 SPOMessageMapper.FLD_TOFULL + "=?, " +
											 SPOMessageMapper.FLD_ISREAD + "=? " +
											 "where " + SPOMessageMapper.FLD_ID + "=?";
	
	static final private String CMD_FIND_BY_KEY = "select * from " + SPOMessageMapper.TABLE + 
												  " where " + SPOMessageMapper.FLD_ID + "=?";
	
	static final private String CMD_FIND_BY_RECEIVER = "select * from " + SPOMessageMapper.TABLE + 
													   " where " + SPOMessageMapper.FLD_TO + "=?";
	
	static final private String CMD_FIND_BY_SENDER = "select * from " + SPOMessageMapper.TABLE + 
	   												   " where " + SPOMessageMapper.FLD_FROM + "=?";
	
	static final private String CMD_FIND_ALL = "select * from " + SPOMessageMapper.TABLE;
	
	/* (non-Javadoc)
	 * @see com.vtb.mapping.SPOMessageMapper#findByReceiver(java.lang.String)
	 */
	public ArrayList findByReceiver(VtbObject domainObjectWithReceiver, String orderBy) throws SQLException, MappingException {
		Connection conn = null;
		ArrayList objectList = null;
		try {
			// get a connection
			conn = getConnection();
			// single transaction.			
			//conn.setAutoCommit(false);
			if (domainObjectWithReceiver instanceof SPOMessage) {
				SPOMessage message = (SPOMessage) domainObjectWithReceiver;	
				if (orderBy != null && !orderBy.equals("")) 
					objectList = findByOneParamImpl(conn, SPOMessageMapper.CMD_FIND_BY_RECEIVER + " order by " + orderBy, message.getReceiver());
				else
					objectList = findByOneParamImpl(conn, SPOMessageMapper.CMD_FIND_BY_RECEIVER, message.getReceiver());
			} else
				throw new MappingException("ERROR: incorrect mapping to SPOMessage object");
					
			//conn.commit();
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL,"Exception " + e + " caught in findByReceiver()");
			throw new MappingException("Wrapped Exception " + e + " caught in findByReceiver()");
		} finally {
			close(conn);
		}
		return objectList;
	}

	/* (non-Javadoc)
	 * @see com.vtb.mapping.SPOMessageMapper#findBySender(java.lang.String)
	 */
	public ArrayList findBySender(VtbObject domainObjectWithSender, String orderBy) throws SQLException, MappingException {
		Connection conn = null;
		ArrayList objectList = null;
		try {
			// get a connection
			conn = getConnection();
			// single transaction.			
			//conn.setAutoCommit(false);
			if (domainObjectWithSender instanceof SPOMessage) {
				SPOMessage message = (SPOMessage) domainObjectWithSender;
				if (orderBy != null && !orderBy.equals(""))
					objectList = findByOneParamImpl(conn, SPOMessageMapper.CMD_FIND_BY_SENDER + " order by " + orderBy, message.getSender());
				else
					objectList = findByOneParamImpl(conn, SPOMessageMapper.CMD_FIND_BY_SENDER, message.getSender());
			} else
				throw new MappingException("ERROR: incorrect mapping to SPOMessage object");
			//conn.commit();
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL,"Exception " + e + " caught in findBySender()");
			throw new MappingException("Wrapped Exception " + e + " caught in findBySender()");
		} finally {
			close(conn);
		}
		return objectList;
	}
	
	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		if (domainObject instanceof SPOMessage) {
			SPOMessage message = (SPOMessage) domainObject;	
			PreparedStatement stmn = conn.prepareStatement(SPOMessageMapper.CMD_INSERT);
							
			stmn.setString(1, message.getSender());
			stmn.setString(2, message.getReceiver());
			stmn.setString(3, message.getSubject());
			stmn.setString(4, message.getMessage());
			stmn.setString(5, message.getSenderFullName());
			stmn.setString(6, message.getReceiverFullName());
			stmn.setBoolean(7, message.isRead());
			
			stmn.execute();			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to SPOMessage object");
		}
		
		return domainObject;
	}

	@Override
	protected VtbObject findByPrimaryKeyImpl(Connection conn, VtbObject domainObjectWithKeyValues) throws SQLException, MappingException {
		boolean isExist = false;
		SPOMessage message = null;
		if (domainObjectWithKeyValues instanceof SPOMessage) {
			message = (SPOMessage) domainObjectWithKeyValues;	
			PreparedStatement stmn = conn.prepareStatement(SPOMessageMapper.CMD_FIND_BY_KEY);			
			stmn.setInt(1, message.getIdMessage());			
			ResultSet rs = stmn.executeQuery();
			if(rs.next()) {				
				isExist = true;
				message = initSPOMessage(rs);
			}			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to SPOMessage object");
		}
		return (isExist == true? message : null);
	}
	
	@Override
	protected ArrayList findAllImpl(Connection conn) throws SQLException, MappingException {
		SPOMessage message = null;
		ArrayList listMessages = new ArrayList();
		
		PreparedStatement stmn = conn.prepareStatement(SPOMessageMapper.CMD_FIND_ALL);						
		ResultSet rs = stmn.executeQuery();
		
		while(rs.next()) {
			message = initSPOMessage(rs);			
			listMessages.add(message);
		}			
		stmn.close();
		
		return listMessages;
	}
	
	private ArrayList findByOneParamImpl(Connection conn, String query, String param) throws SQLException, MappingException {
		SPOMessage message = null;
		ArrayList listMessages = new ArrayList();
		
		PreparedStatement stmn = conn.prepareStatement(query);	
		stmn.setString(1, param);	
		ResultSet rs = stmn.executeQuery();
		
		while(rs.next()) {				
			message = initSPOMessage(rs);
			listMessages.add(message);
		}			
		stmn.close();
		
		return listMessages;
	}
	
	private SPOMessage initSPOMessage(ResultSet rs) throws SQLException, MappingException {
		SPOMessage message = new SPOMessage(rs.getInt(SPOMessageMapper.FLD_ID),
											rs.getString(SPOMessageMapper.FLD_FROM), 
											rs.getString(SPOMessageMapper.FLD_TO),
											rs.getString(SPOMessageMapper.FLD_SUBJECT),
											rs.getString(SPOMessageMapper.FLD_MESSAGE),
											rs.getDate(SPOMessageMapper.FLD_TIMESTAMP),
											rs.getString(SPOMessageMapper.FLD_FROMFULL),
											rs.getString(SPOMessageMapper.FLD_TOFULL),
											rs.getBoolean(SPOMessageMapper.FLD_ISREAD)
											);
		return message;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		if (domainObject instanceof SPOMessage) {
			SPOMessage message = (SPOMessage) domainObject;	
			PreparedStatement stmn = conn.prepareStatement(SPOMessageMapper.CMD_REMOVE);			
			stmn.setInt(1, message.getIdMessage());			
			stmn.executeQuery();
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to SPOMessage object");
		}

	}

	@Override	
	protected void updateImpl(Connection conn, VtbObject anObject) throws SQLException, MappingException {
		if (anObject instanceof SPOMessage) {
			SPOMessage message = (SPOMessage) anObject;	
			PreparedStatement stmn = conn.prepareStatement(SPOMessageMapper.CMD_UPDATE);
							
			stmn.setString(1, message.getSender());
			stmn.setString(2, message.getReceiver());
			stmn.setString(3, message.getSubject());
			stmn.setString(4, message.getMessage());
			stmn.setDate(5, message.getTimestamp());
			stmn.setString(6, message.getSenderFullName());
			stmn.setString(7, message.getReceiverFullName());
			stmn.setBoolean(8, message.isRead());
			stmn.setInt(9, message.getIdMessage());
			
			stmn.execute();			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to SPOMessage object");
		}

	}
	
	@Override
	protected void insertImpl(Connection conn, VtbObject anObject) throws SQLException, MappingException {
		this.createImpl(conn, anObject);
	}
}
