package ru.md.sequence.ejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.NoSuchEntityException;
import javax.ejb.ObjectNotFoundException;
import javax.ejb.RemoveException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * Bean implementation class for Enterprise Bean: Sequence
 */
public class SequenceBean implements javax.ejb.EntityBean {
	static String TABLE = "SEQUENCES";
	static String FLD_ID = "ID";
	static String FLD_VALUE = "VALUE";
	
	final String CMD_INSERT = "insert into "+TABLE+" ("+
								FLD_ID+", "+
								FLD_VALUE+" "+								
								") VALUES(?,?)";
	final String CMD_UPDATE = "update "+TABLE+ " set "+
								FLD_VALUE+"=? "+ 
								" where "+ FLD_ID+"=?";
	final String CMD_REMOVE = "delete from "+TABLE+" where "+FLD_ID+"=?";
	final String CMD_LOAD = "select "+
								FLD_ID+", "+							
								FLD_VALUE+" "+
								" from "+TABLE+
								" where "+FLD_ID+"=?";
	final String CMD_FIND_BY_KEY = "select "+
									FLD_ID+" "+							
									" from "+TABLE+
									" where "+FLD_ID+"=?";
	
	
	
	
	private javax.ejb.EntityContext myEntityCtx;
	private String id;
	private long value;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	
	public long getNextKeyAfterIncrementingBy(int blockSize) {
		this.setValue(this.getValue() + blockSize);
		return this.getValue();

	}

	private Connection getConnection() throws NamingException, SQLException {
	    InitialContext ctx = new InitialContext();
	    DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/SequenceDB");
	    return ds.getConnection();
	}
	
	
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}

	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		Connection conn = null;
		try {
			String key = ((SequenceKey)myEntityCtx.getPrimaryKey()).getKey();
		    conn = getConnection();
		    
		    PreparedStatement stmn = conn.prepareStatement(CMD_LOAD);	
		    stmn.setString(1, key);
		    ResultSet rs = stmn.executeQuery();
		    if(!rs.next()) {
		    	// not found in database
		        throw new NoSuchEntityException();
		    }
		      // set the beans fields with the data from the DB row
		      this.id = rs.getString(FLD_ID);
		      this.value = rs.getLong(FLD_VALUE);
		      // cleanup the ResultSet and the Statement
		      rs.close();
		      stmn.close();
		}
		catch(Exception e) {		      
			e.printStackTrace();
		    throw new EJBException(e.getMessage());
		}
		finally {
			// ensure that the connection is returned to the connection pool
		    if(conn != null) {
		    	try { conn.close(); }
		    	catch(SQLException e) {}
		    }
		}		
	}

	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}

	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
		Connection conn = null;
	    try {
	      conn = getConnection();	      
	      PreparedStatement stmn = conn.prepareStatement(CMD_REMOVE);	      
	      stmn.setString(1, this.id);
	      stmn.execute();
	      stmn.close();
	    }
	    catch(Exception e) {	      
	      e.printStackTrace();
	      throw new EJBException(e.getMessage());
	    }
	    finally {
	      // ensure that the connection is returned to the connection pool
	      if(conn != null) {
	        try { conn.close(); }
	        catch(SQLException e) {}
	      }
	    }	
	}

	/**
	 * ejbStore
	 */
	public void ejbStore() {
		Connection conn = null;
	    try {
	      conn = getConnection();	      
	      PreparedStatement stmn = conn.prepareStatement(CMD_UPDATE);
	      stmn.setLong(1, this.value);
	      stmn.setString(2, this.id);
	      stmn.execute();
	      stmn.close();
	    }
	    catch(Exception e) {	      
	      e.printStackTrace();
	      throw new EJBException(e.getMessage());
	    }
	    finally {
	      // ensure that the connection is returned to the connection pool
	      if(conn != null) {
	        try { conn.close(); }
	        catch(SQLException e) {}
	      }
	    }		
	}

	/**
	 * getEntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return myEntityCtx;
	}

	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		myEntityCtx = ctx;
	}

	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		myEntityCtx = null;
	}

	/**
	 * ejbCreate
	 */
	public SequenceKey ejbCreate(String id, long value)
		throws javax.ejb.CreateException {
//		 set the beans fields
	    this.id = id;
	    this.value = value;
	    Connection conn = null;
	    try {
	      conn = getConnection();
	      PreparedStatement stmn = conn.prepareStatement(CMD_INSERT);
	      stmn.setString(1, this.id);
	      stmn.setLong(2, this.value);
	      stmn.execute();
	      stmn.close();
	    }
	    catch(Exception e) {	      
	      e.printStackTrace();
	      throw new CreateException(e.getMessage());
	    }
	    finally {
	      // ensure that the connection is returned to the connection pool
	      if(conn != null) {
	        try { conn.close(); }
	        catch(SQLException e) {}
	      }
	    }
	    return new SequenceKey(id);
	}

	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(String id, long value) throws javax.ejb.CreateException {
	}

	/**
	 * ejbFindByPrimaryKey
	 */
	public SequenceKey ejbFindByPrimaryKey(
		SequenceKey key)
		throws javax.ejb.FinderException {
		Connection conn = null;
	    try {
	      conn = getConnection();	      
	      PreparedStatement stmn = conn.prepareStatement(CMD_FIND_BY_KEY);
	      stmn.setString(1, key.getKey());
	      ResultSet rs = stmn.executeQuery();
	      if(!rs.next()) {
	        throw new ObjectNotFoundException();
	      }
	      rs.close();
	      stmn.close();
	    }
	    catch(Exception e) {	      
	      e.printStackTrace();
	      throw new FinderException(e.getMessage());
	    }
	    finally {
	      // ensure that the connection is returned to the connection pool
	      if(conn != null) {
	        try { conn.close(); }
	        catch(SQLException e) {}
	      }
	    }
	    return key;
	}
}
