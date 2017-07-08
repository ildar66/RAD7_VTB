package com.vtb.mapping.jdbc;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.Attachment;
import com.vtb.domain.VtbObject;
import com.vtb.exception.MappingException;
import com.vtb.exception.NoSuchObjectException;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;

public class AttachmentMapper extends JDBCMapperExt {
		
	final static String TABLE = "APPFILES";
	final static String FLD_UNID = "UNID";
	final static String FLD_FILETYPE = "FILETYPE";
	final static String FLD_FILENAME = "FILENAME";
	final static String FLD_SIGNATURE = "SIGNATURE";
	
	final static String FLD_ID_OWNER = "ID_OWNER";
	final static String FLD_OWNER_TYPE = "OWNER_TYPE";
	
	final static String FLD_DATE_OF_EXPIRATION = "DATE_OF_EXPIRATION";
	final static String FLD_DATE_OF_ADDITION = "DATE_OF_ADDITION";
	final static String FLD_WHO_ADD = "WHO_ADD";
	
	final static String FLD_ISACCEPTED = "ISACCEPTED";
	final static String FLD_WHO_ACCEPT = "WHOACCEPTED";	
	final static String FLD_DATE_OF_ACCEPT = "DATE_OF_ACCEPT";
	
	
	
	final String CMD_FIND_BY_OWNER_AND_TYPE = "select " +
												FLD_UNID+", "+
												FLD_FILENAME+"," +
												FLD_FILETYPE+"," +
												FLD_ID_OWNER+"," +
												FLD_OWNER_TYPE+"," +
												FLD_DATE_OF_EXPIRATION+"," +
												FLD_DATE_OF_ADDITION+"," +
												FLD_WHO_ADD+"," +
												FLD_ISACCEPTED+"," +
												FLD_WHO_ACCEPT+"," +
												FLD_DATE_OF_ACCEPT+", " +
												FLD_SIGNATURE+" " +
											"from APPFILES where "+FLD_ID_OWNER+"=? and " + 
												FLD_OWNER_TYPE+"=?";
	final String CMD_FIND_BY_KEY = "select " +
										FLD_UNID+", "+
										FLD_FILENAME+"," +
										FLD_FILETYPE+"," +
										FLD_ID_OWNER+"," +
										FLD_OWNER_TYPE+"," +
										FLD_DATE_OF_EXPIRATION+"," +
										FLD_DATE_OF_ADDITION+"," +
										FLD_WHO_ADD+"," +
										FLD_ISACCEPTED+"," +
										FLD_WHO_ACCEPT+"," +
										FLD_DATE_OF_ACCEPT+", " +
										FLD_SIGNATURE+" " +
									"from APPFILES where "+FLD_UNID+"=?";
	
	final String CMD_INSERT = "insert into "+TABLE+" ("+
								FLD_UNID+", "+
								FLD_FILENAME+"," +
								FLD_FILETYPE+"," +
								FLD_ID_OWNER+"," +
								FLD_OWNER_TYPE+"," +
								FLD_DATE_OF_EXPIRATION+"," +
								FLD_DATE_OF_ADDITION+"," +
								FLD_WHO_ADD+"," +
								FLD_ISACCEPTED+"," +
								FLD_WHO_ACCEPT+"," +
								FLD_DATE_OF_ACCEPT+"," +
								FLD_SIGNATURE+" "+
								") VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
	final String CMD_UPDATE = "update "+TABLE+" set "+
								FLD_FILENAME+"=?, " +
								FLD_FILETYPE+"=?, " +
								FLD_ID_OWNER+"=?, " +
								FLD_OWNER_TYPE+"=?, " +
								FLD_DATE_OF_EXPIRATION+"=?, " +
								FLD_DATE_OF_ADDITION+"=?, " +
								FLD_WHO_ADD+"=?, " +
								FLD_ISACCEPTED+"=?, " +
								FLD_WHO_ACCEPT+"=?, " +
								FLD_DATE_OF_ACCEPT+"=?, " +								
								FLD_SIGNATURE+"=? "+
								" where "+FLD_UNID+"=?";
	
	final String CMD_REMOVE = "delete from "+TABLE+" where "+FLD_UNID+"=?";
	
	
	
	@Override
	protected void insertImpl(Connection conn, VtbObject anObject)
			throws SQLException, MappingException {
		// TODO Автоматически созданная заглушка метода
		if (anObject instanceof Attachment) {
			Attachment file = (Attachment) anObject;	
			PreparedStatement stmn = conn.prepareStatement(CMD_INSERT);
			
			stmn.setString(1, file.getUnid());
			stmn.setString(2, file.getFilename());
			stmn.setString(3, file.getFiletype());
			stmn.setLong(4, file.getId_owner());
			stmn.setInt(5, file.getOwner_type());
			stmn.setTimestamp(6, file.getDate_of_expiration());
			stmn.setTimestamp(7, file.getDate_of_addition());			
			stmn.setLong(8, file.getWho_add());
			stmn.setInt(9, file.isAccepted());
			stmn.setLong(10, file.getWho_accept());
			stmn.setTimestamp(11, file.getDate_of_accept());
			byte[] signature = file.getSignature().getBytes();
			if (signature != null && signature.length>0)
				stmn.setBinaryStream(12, new ByteArrayInputStream(signature), signature.length);
			else 
				stmn.setObject(12, null);
				
			
			stmn.execute();			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to AttachmentFile object");
		}
	}

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	protected VtbObject findByPrimaryKeyImpl(Connection conn,
			VtbObject domainObjectWithKeyValues) throws SQLException,
			MappingException {
		// TODO Автоматически созданная заглушка метода
		boolean isExist = false;
		if (domainObjectWithKeyValues instanceof Attachment) {
			Attachment file = (Attachment) domainObjectWithKeyValues;	
			PreparedStatement stmn = conn.prepareStatement(CMD_FIND_BY_KEY);
			AppService.log(1, "Fimd unid = "+file.getUnid());
			stmn.setString(1, file.getUnid());
			ResultSet rs = stmn.executeQuery();
			if (rs.next()) {
				isExist = true;
				mapTableRow(file, rs);
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
		// TODO Автоматически созданная заглушка метода
		if (domainObject instanceof Attachment) {
			Attachment file = (Attachment) domainObject;	
			PreparedStatement stmn = conn.prepareStatement(CMD_REMOVE);
							
			stmn.setString(1, file.getUnid());
			
			stmn.execute();			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to AttachmentFile object");
		}
	}

	@Override
	protected void updateImpl(Connection conn, VtbObject anObject)
			throws SQLException, MappingException {
		// TODO Автоматически созданная заглушка метода
		if (anObject instanceof Attachment) {
			Attachment file = (Attachment) anObject;	
			PreparedStatement stmn = conn.prepareStatement(CMD_UPDATE);
								
			stmn.setString(1, file.getFilename());
			stmn.setString(2, file.getFiletype());
			stmn.setLong(3, file.getId_owner());
			stmn.setInt(4, file.getOwner_type());
			stmn.setTimestamp(5, file.getDate_of_expiration());
			stmn.setTimestamp(6, file.getDate_of_addition());
			stmn.setLong(7, file.getWho_add());
			stmn.setInt(8, file.isAccepted());
			stmn.setLong(9, file.getWho_accept());
			stmn.setTimestamp(10, file.getDate_of_accept());
			byte[] signature = file.getSignature().getBytes();
			if (signature != null && signature.length>0)
				stmn.setBinaryStream(11, new ByteArrayInputStream(signature), signature.length);
			else 
				stmn.setObject(11, null);
			stmn.setString(12, file.getUnid());			
			
			stmn.execute();			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to AttachmentFile object");
		}
	}
	

	@Override
	protected ArrayList findAllImpl(Connection conn) throws SQLException, MappingException {
		// TODO Автоматически созданная заглушка метода
		
		return null;
	}
	
	public ArrayList findByOwnerAndType(Attachment findObjects) throws SQLException, MappingException {
		// TODO Автоматически созданная заглушка метода
		Connection conn = null;
		ArrayList objectList=new ArrayList<Attachment>();
		try {
			// get a connection
			conn = getConnection();
			// single transaction.			
			//conn.setAutoCommit(false);
			PreparedStatement stmn = conn.prepareStatement(CMD_FIND_BY_OWNER_AND_TYPE);
			stmn.setLong(1, findObjects.getId_owner());
			stmn.setInt(2, findObjects.getOwner_type());
			ResultSet rs = stmn.executeQuery();
			while(rs.next()) {
				Attachment attach = new Attachment();
				mapTableRow(attach, rs);
				objectList.add(attach);
			}
			
			
			//conn.commit();
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL,"Exception " + e + " caught in insert()");
			throw new NoSuchObjectException("Wrapped Exception " + e + " caught in insert()");
		} finally {
			close(conn);
		}
		return objectList;		
	}
	
	protected void mapTableRow(Attachment attach, ResultSet rs) throws SQLException {
		attach.setUnid(rs.getString(FLD_UNID));
		attach.setFilename(rs.getString(FLD_FILENAME));
		attach.setFiletype(rs.getString(FLD_FILETYPE));
		attach.setId_owner(rs.getLong(FLD_ID_OWNER));
		attach.setOwner_type(rs.getInt(FLD_OWNER_TYPE));
		attach.setWho_add(rs.getLong(FLD_WHO_ADD));
		attach.setDate_of_addition(rs.getTimestamp(FLD_DATE_OF_ADDITION));
		attach.setDate_of_expiration(rs.getTimestamp(FLD_DATE_OF_EXPIRATION));
		attach.setWho_accept(rs.getLong(FLD_WHO_ACCEPT));
		attach.setDate_of_accept(rs.getTimestamp(FLD_DATE_OF_ACCEPT));
		attach.setAccepted(rs.getInt(FLD_ISACCEPTED));
		Blob blobData = rs.getBlob(FLD_SIGNATURE);				
		if (blobData != null) {
			try {
				//System.out.println("!!! SIGNATURE is NOT NULL");
				InputStream is = blobData.getBinaryStream();
				byte[] fileData = new byte[(int)blobData.length()];
				is.read(fileData);
				attach.setSignature(new String(fileData));
				//System.out.println("!!! SIGNATURE = "+attach.getSignature());
			} catch(Exception e) {
				
			}
		}
		
	}
	
	

}
