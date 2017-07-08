package com.vtb.mapping.jdbc;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.AttachmentFile;
import com.vtb.domain.VtbObject;
import com.vtb.exception.MappingException;

public class AttachmentFileMapper extends JDBCMapperExt {
	final String TABLE = "Appfiles";
	final String FLD_UNID = "unid";
	final String FLD_FILENAME = "filename";
	final String FLD_FILEDATA = "filedata";
	
	final String CMD_INSERT = "insert into "+TABLE+" ("+
								FLD_UNID+", "+
								FLD_FILENAME+", "+
								FLD_FILEDATA+
								") VALUES(?,?)";
	final String CMD_UPDATE = "update "+TABLE+ " set "+
								FLD_FILENAME+"=?, "+
								FLD_FILEDATA+"=? "+ 
								" where "+ FLD_UNID+"=?";
	final String CMD_REMOVE = "delete from "+TABLE+" where "+FLD_UNID+"=?";
	final String CMD_FIND_BY_KEY = "select "+
									FLD_FILENAME+", "+
									FLD_FILEDATA+" "+
									" from "+TABLE+
									" where "+FLD_UNID+"=?";
	
	
	@Override
	protected ArrayList findAllImpl(Connection conn) throws SQLException,
			MappingException {
		// TODO Автоматически созданная заглушка метода
		throw new MappingException("ERROR: incorrect using of AttacmentFile object");
		//return null;
	}

	@Override
	protected void insertImpl(Connection conn, VtbObject anObject)
			throws SQLException, MappingException {
		// TODO Автоматически созданная заглушка метода
		throw new MappingException("ERROR: incorrect using of AttacmentFile object");
	}

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		// TODO Автоматически созданная заглушка метода
		throw new MappingException("ERROR: incorrect using of AttacmentFile object");
		//return null;
	}

	@Override
	public VtbObject findByPrimaryKeyImpl(Connection conn,
			VtbObject domainObjectWithKeyValues) throws SQLException,
			MappingException {
		// TODO Автоматически созданная заглушка метода
		boolean isExist = false;
		if (domainObjectWithKeyValues instanceof AttachmentFile) {
			AttachmentFile file = (AttachmentFile) domainObjectWithKeyValues;	
			PreparedStatement stmn = conn.prepareStatement(CMD_FIND_BY_KEY);			
			stmn.setString(1, file.getUnid());			
			ResultSet rs = stmn.executeQuery();
			if(rs.next()) {				
				isExist = true;
				file.setFilename(rs.getString(FLD_FILENAME));
				Blob blobData = rs.getBlob(FLD_FILEDATA);				
				if (blobData != null) {
					try {
						InputStream is = blobData.getBinaryStream();
						byte[] fileData = new byte[(int)blobData.length()];
						is.read(fileData);
						file.setFiledata(fileData);
					} catch(Exception e) {
						
					}
				}else
					file.setFiledata(null);
								
				
			}			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to AttacmentFile object");
		}
		return (isExist == true? domainObjectWithKeyValues : null);
	}

	@Override
	public void removeImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		// TODO Автоматически созданная заглушка метода
		if (domainObject instanceof AttachmentFile) {
			AttachmentFile file = (AttachmentFile) domainObject;	
			PreparedStatement stmn = conn.prepareStatement(CMD_REMOVE);
							
			stmn.setString(1, file.getUnid());
			
			stmn.execute();			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to AttachmentFile object");
		}

	}

	@Override
	public void updateImpl(Connection conn, VtbObject anObject)
			throws SQLException, MappingException {
		// TODO Автоматически созданная заглушка метода
		if (anObject instanceof AttachmentFile) {
			AttachmentFile file = (AttachmentFile) anObject;	
			PreparedStatement stmn = conn.prepareStatement(CMD_UPDATE);						
			
			stmn.setString(1, file.getFilename());
			byte[] fileData = file.getFiledata();
			stmn.setBinaryStream(2, new ByteArrayInputStream(fileData),fileData.length);
			stmn.setString(3, file.getUnid());			
			
			stmn.execute();			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to AttachmentFile object");
		}
	}

}
