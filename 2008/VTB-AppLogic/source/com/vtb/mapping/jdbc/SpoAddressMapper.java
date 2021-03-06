package com.vtb.mapping.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.SpoAddress;
import com.vtb.domain.VtbObject;
import com.vtb.exception.MappingException;

public class SpoAddressMapper extends JDBCMapperCRM {

	private static final String _loadString = "SELECT addressID, city, country, county, postalCode, state "
			+ " FROM sysdba.V_SPO_ADDRESS "
			+ " WHERE addressID = ? ";;

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		throw new MappingException("Insert not valid for this type");
	}

	@Override
	protected VtbObject findByPrimaryKeyImpl(Connection conn, VtbObject domainObjectWithKeyValues) throws SQLException,
			MappingException {
		SpoAddress domainObject = null;
		String aId = null;
		if (domainObjectWithKeyValues instanceof SpoAddress) {
			aId = ((SpoAddress) domainObjectWithKeyValues).getAddressID();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, aId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		domainObject = activate(rs);
		return domainObject;
	}

	private SpoAddress activate(ResultSet rs)  throws SQLException {
		int i = 1;
		SpoAddress domainObject = new SpoAddress(rs.getString(i++));
		domainObject.setCity(rs.getString(i++));
		domainObject.setCountry(rs.getString(i++));
		domainObject.setCounty(rs.getString(i++));
		domainObject.setPostalCode(rs.getString(i++));
		domainObject.setState(rs.getString(i++));

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

}
