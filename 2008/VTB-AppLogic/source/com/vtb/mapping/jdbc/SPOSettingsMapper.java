package com.vtb.mapping.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.SPOSettings;
import com.vtb.domain.VtbObject;
import com.vtb.exception.MappingException;
import com.vtb.exception.NoSuchObjectException;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;

public class SPOSettingsMapper extends JDBCMapperExt {
	static final String CMD_CREATE = "insert into SPO_Settings(id_department, filehost_ip, filehost_type, mq_hostname, mq_port, mq_queuemanager, mq_serverchannel, mq_queuename) VALUES(?,?,?,?,?,?,?,?)";
	static final String CMD_REMOVE = "delete from SPO_Settings where id_department=?";
	static final String CMD_UPDATE = "update SPO_Settings set filehost_ip=?, filehost_type=?, mq_hostname=?, mq_port=?, mq_queuemanager=?, mq_serverchannel=?, mq_queuename=?  where id_department=?";
	static final String CMD_FIND_BY_KEY = "select * from SPO_Settings where id_department=?";
	static final String CMD_FIND_ALL = "select * from SPO_Settings";
	static final String CMD_FIND_BY_SERVER_TYPE = "select * from SPO_Settings where filehost_type=?";
	
	@Override
	protected void insertImpl(Connection conn, VtbObject anObject)
			throws SQLException, MappingException {
		// TODO Автоматически созданная заглушка метода
		if (anObject instanceof SPOSettings) {
			SPOSettings settings = (SPOSettings) anObject;	
			PreparedStatement stmn = conn.prepareStatement(CMD_CREATE);
			
			stmn.setLong(1, settings.getId_department());
			stmn.setString(2, settings.getFileHost_IP());
			stmn.setInt(3, settings.getFileHost_Type());
			stmn.setString(4, settings.getMq_hostname());
			stmn.setString(5, settings.getMq_port());
			stmn.setString(6, settings.getMq_queuemanagerName());
			stmn.setString(7, settings.getMq_serverChannel());
			stmn.setString(8, settings.getMq_queueName());			
			
			stmn.execute();			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to FileRequest object");
		}

	}

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		// TODO Автоматически созданная заглушка метода
		if (domainObject instanceof SPOSettings) {
			SPOSettings settings = (SPOSettings) domainObject;
			//GENERATE ID
			insertImpl(conn, settings);			
		} else {
			throw new MappingException("ERROR: incorrect mapping to FileRequest object");
		}		
		return null;
	}

	@Override
	protected VtbObject findByPrimaryKeyImpl(Connection conn,
			VtbObject domainObjectWithKeyValues) throws SQLException,
			MappingException {
		// TODO Автоматически созданная заглушка метода
		boolean isExist = false;
		if (domainObjectWithKeyValues instanceof SPOSettings) {
			SPOSettings settings = (SPOSettings) domainObjectWithKeyValues;			
			PreparedStatement stmn = conn.prepareStatement(CMD_FIND_BY_KEY);			
			stmn.setLong(1, settings.getId_department());
			ResultSet rs = stmn.executeQuery();
			if(rs.next()) {
				isExist = true;
				settings.setFileHost_IP(rs.getString("filehost_ip"));
				settings.setFileHost_Type(rs.getInt("filehost_type"));
				settings.setMq_hostname(rs.getString("mq_hostname"));
				settings.setMq_port(rs.getString("mq_port"));
				settings.setMq_queuemanagerName(rs.getString("mq_queuemanager"));
				settings.setMq_serverChannel(rs.getString("mq_serverchannel"));
				settings.setMq_queueName(rs.getString("mq_queuename"));
				
			}			
			stmn.close();
		} else {
			throw new MappingException("ERROR: incorrect mapping to FileRequest object");
		}
		
		return (isExist == true? domainObjectWithKeyValues : null);
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject)
			throws SQLException, MappingException {
		// TODO Автоматически созданная заглушка метода
		if (domainObject instanceof SPOSettings) {
			SPOSettings settings = (SPOSettings) domainObject;	
			PreparedStatement stmn = conn.prepareStatement(CMD_REMOVE);
							
			stmn.setLong(1, settings.getId_department());
			
			stmn.execute();			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to FileRequest object");
		}
	}

	@Override
	protected void updateImpl(Connection conn, VtbObject anObject)
			throws SQLException, MappingException {
		// TODO Автоматически созданная заглушка метода
		if (anObject instanceof SPOSettings) {
			SPOSettings settings = (SPOSettings) anObject;	
			PreparedStatement stmn = conn.prepareStatement(CMD_UPDATE);
						
			stmn.setString(1, settings.getFileHost_IP());
			stmn.setInt(2, settings.getFileHost_Type());
			stmn.setString(3, settings.getMq_hostname());
			stmn.setString(4, settings.getMq_port());
			stmn.setString(5, settings.getMq_queuemanagerName());
			stmn.setString(6, settings.getMq_serverChannel());
			stmn.setString(7, settings.getMq_queueName());
			stmn.setLong(8, settings.getId_department());
			
			stmn.execute();			
			stmn.close();			
		} else {
			throw new MappingException("ERROR: incorrect mapping to FileRequest object");
		}
	}

	public ArrayList findAll() throws MappingException {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	protected ArrayList findAllImpl(Connection conn) throws SQLException, MappingException {
		// TODO Автоматически созданная заглушка метода
		return null;
	}


	public SPOSettings findMainSettings() throws SQLException,
			MappingException {
		// TODO Автоматически созданная заглушка метода
		Connection conn = null;
		boolean isExist = false;
		SPOSettings settings = null;
		try {
			// get a connection
			conn = getConnection();
			// single transaction.			
			//conn.setAutoCommit(false);
			PreparedStatement stmn = conn.prepareStatement(CMD_FIND_BY_SERVER_TYPE);
			stmn.setInt(1, SPOSettings.CONST_SERVER_TYPE_WAS);
			ResultSet rs = stmn.executeQuery();
			if(rs.next()) {
				settings = new SPOSettings(0);
				mapTableRow(settings, rs);				
			}
			
			
			//conn.commit();
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL,"Exception " + e + " caught in insert()");
			throw new NoSuchObjectException("Wrapped Exception " + e + " caught in insert()");
		} finally {
			close(conn);
		}
		return settings;	
	}
	
	protected void mapTableRow(SPOSettings settings, ResultSet rs) throws SQLException {
		settings.setFileHost_IP(rs.getString("filehost_ip"));
		settings.setFileHost_Type(rs.getInt("filehost_type"));
		settings.setMq_hostname(rs.getString("mq_hostname"));
		settings.setMq_port(rs.getString("mq_port"));
		settings.setMq_queuemanagerName(rs.getString("mq_queuemanager"));
		settings.setMq_serverChannel(rs.getString("mq_serverchannel"));
		settings.setMq_queueName(rs.getString("mq_queuename"));
	}
}
