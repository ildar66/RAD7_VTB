package com.vtb.mapping.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.SpoAccount;
import com.vtb.domain.SpoAddress;
import com.vtb.domain.VtbObject;
import com.vtb.exception.MappingException;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;

public class SpoAccountMapper extends JDBCMapperCRM {

	//TODO обратить внимание на запросы
	
	private static final String _loadString = "SELECT acc.ACCOUNTID, acc.ACCOUNT, acc.INDUSTRY, acc.TERRITORY, acc.ADDRESSID, "
			+ " facc.OGRN, facc.OGRN_DATE , facc.OGRN_PLACE , facc.INN, facc.OKPO_CD, acc.REGION "
			+ " FROM sysdba.V_SPO_ACCOUNT acc, " 
			+ " sysdba.V_SPO_FB_ACCOUNT facc "
			+ " WHERE acc.ACCOUNTID = facc.ACCOUNTID AND acc.ACCOUNTID = ? ";
	
	//private static final String _loadString = "SELECT acc.CRMID, acc.ORGANIZATIONNAME, null as INDUSTRY, null as TERRITORY, null as ADDRESSID, "
	//	+ " acc.OGRN, acc.DATEOFREGISTRATION , null as OGRN_PLACE , acc.INN, null as OKPO_CD "
	//	+ " FROM V_CRM_ORGANISATION_FULL acc "
	//	+ " WHERE acc.CRMID = ? ";
	
	private transient SpoAddressMapper addressMapper = null;

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		throw new MappingException("Insert not valid for this type");
	}

	@Override
	protected VtbObject findByPrimaryKeyImpl(Connection conn, VtbObject domainObjectWithKeyValues) throws SQLException,
			MappingException {
		SpoAccount domainObject = null;
		String aId = null;
		if (domainObjectWithKeyValues instanceof SpoAccount) {
			aId = ((SpoAccount) domainObjectWithKeyValues).getAccountID();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, aId);
		//ps.setString(1, aId);
		ResultSet rs = ps.executeQuery();
		if (rs.next())
			domainObject = activate(conn, rs);
		
		return domainObject;
	}

	private SpoAccount activate(Connection conn, ResultSet rs)  throws SQLException, MappingException {
		int i = 1;
		SpoAccount domainObject = new SpoAccount(rs.getString(i++));
		domainObject.setAccount(rs.getString(i++));
		domainObject.setIndustry(rs.getString(i++));
		domainObject.setTerritory(rs.getString(i++));
		String addressId = rs.getString(i++);
		if(addressId != null){
			//SpoAddress address =  (SpoAddress)getSpoAddressMapper().findByPrimaryKeyImpl(conn, new SpoAddress(addressId));
			//domainObject.setAddress(address);			
		}
		domainObject.setOgrn(rs.getString(i++));
		domainObject.setOgrnDate(rs.getDate(i++));
		domainObject.setOgrnPlace(rs.getString(i++));
		domainObject.setInn(rs.getString(i++));
		domainObject.setOkpo(rs.getString(i++));
		domainObject.setRegion(rs.getString(i++));
		return domainObject;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		throw new MappingException("Remote not valid for this type");
	}

	@Override
	protected void updateImpl(Connection conn, VtbObject anObject) throws SQLException, MappingException {
		throw new MappingException("Update not valid for this type");
	}

	public ArrayList findAll() throws MappingException {
		throw new MappingException("findAll not valid for this type");
	}
	
	private SpoAddressMapper getSpoAddressMapper() {
		if (addressMapper == null)
			addressMapper = new SpoAddressMapper();
		return addressMapper;
	}	

}
