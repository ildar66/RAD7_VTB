package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.Address;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;
import com.vtb.util.Converter;

public class AddressMapper extends JDBCMapper implements com.vtb.mapping.AddressMapper {
	protected static final String findByOrganizationSqlString = "SELECT id, city, postalCode, country, county, description, address1, address2, address3, address4, IDORGANISATION organizationID FROM "
			+ ApplProperties.getDatasourceSchema() + ".ADDRESS  WHERE IDORGANISATION = ?";

	protected static final String _loadString = "SELECT id, city, postalCode, country, county, description, address1, address2, address3, address4, IDORGANISATION organizationID FROM "
			+ ApplProperties.getDatasourceSchema() + ".ADDRESS WHERE ID = ?";

	protected static final String _createString = "INSERT INTO "
			+ ApplProperties.getDatasourceSchema()
			+ ".ADDRESS (id, city, postalCode, country, county, description, address1, address2, address3, address4, IDORGANISATION) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	protected static final String _removeString = "DELETE FROM " + ApplProperties.getDatasourceSchema()
			+ ".ADDRESS  WHERE ID = ?";

	protected static final String _storeString = "UPDATE "
			+ ApplProperties.getDatasourceSchema()
			+ ".ADDRESS  SET city = ?, postalCode = ?, country = ?, county = ?, description = ?, address1 = ?, address2 = ?, address3 = ?, address4 = ?, IDORGANISATION = ?  WHERE id = ?";

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer id = null; // id "адреса"
		String city = null; // город
		String postalCode = null; // индекс
		String country = null; // страна
		String county = null; // округ
		String description = null;// юридический или фактический.
		String address1 = null;//
		String address2 = null;//
		String address3 = null;//
		String address4 = null;//
		Integer organizationID = null; // внешний ключ на организацию
		if (domainObject instanceof Address) {
			id = ((Address) domainObject).getId();
			city = ((Address) domainObject).getCity();
			postalCode = ((Address) domainObject).getPostalCode();
			country = ((Address) domainObject).getCountry();
			county = ((Address) domainObject).getCounty();
			description = ((Address) domainObject).getDescription();
			address1 = ((Address) domainObject).getAddress1();
			address2 = ((Address) domainObject).getAddress2();
			address3 = ((Address) domainObject).getAddress3();
			address4 = ((Address) domainObject).getAddress4();
			organizationID = ((Address) domainObject).getOrganizationID();
		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		int i = 1;
		ps.setObject(i++, id);
		ps.setObject(i++, city);
		ps.setObject(i++, postalCode);
		ps.setObject(i++, country);
		ps.setObject(i++, county);
		ps.setObject(i++, description);
		ps.setObject(i++, address1);
		ps.setObject(i++, address2);
		ps.setObject(i++, address3);
		ps.setObject(i++, address4);
		ps.setObject(i++, organizationID);
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
		Address address = null;
		Integer addressId = null;
		if (domainObjectWithKeyValues instanceof Address) {
			addressId = ((Address) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, addressId);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			address = activate(rs);
		}
		return address;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer aId = null;
		if (domainObject instanceof Address) {
			aId = ((Address) domainObject).getId();
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
		Integer id = null; // id "адреса"
		String city = null; // город
		String postalCode = null; // индекс
		String country = null; // страна
		String county = null; // округ
		String description = null;// юридический или фактический.
		String address1 = null;//
		String address2 = null;//
		String address3 = null;//
		String address4 = null;//
		Integer organizationID = null; // внешний ключ на организацию
		if (domainObject instanceof Address) {
			id = ((Address) domainObject).getId();
			city = ((Address) domainObject).getCity();
			postalCode = ((Address) domainObject).getPostalCode();
			country = ((Address) domainObject).getCountry();
			county = ((Address) domainObject).getCounty();
			description = ((Address) domainObject).getDescription();
			address1 = ((Address) domainObject).getAddress1();
			address2 = ((Address) domainObject).getAddress2();
			address3 = ((Address) domainObject).getAddress3();
			address4 = ((Address) domainObject).getAddress4();
			organizationID = ((Address) domainObject).getOrganizationID();
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);
		int i = 1;
		ps.setObject(i++, city);
		ps.setObject(i++, postalCode);
		ps.setObject(i++, country);
		ps.setObject(i++, county);
		ps.setObject(i++, description);
		ps.setObject(i++, address1);
		ps.setObject(i++, address2);
		ps.setObject(i++, address3);
		ps.setObject(i++, address4);
		ps.setObject(i++, organizationID);
		
		ps.setObject(i++, id);
		int rows = ps.executeUpdate();
		if (rows == 1)
			return;
		else
			// failed
			throw new MappingException("Update Failed " + domainObject);
	}

	public ArrayList findListByOrganization(Integer organizationID, String orderBy) throws MappingException {
		ArrayList<Address> list = new ArrayList<Address>();
		Address address = null;
		Connection conn = null;
		StringBuffer sb = new StringBuffer(findByOrganizationSqlString);
		try {
			conn = getConnection();
			PreparedStatement ps = null;
			if (orderBy != null && !orderBy.equals("")) {
				sb.append(" order by " + orderBy);
			}
			ps = conn.prepareStatement(sb.toString());
			ps.setInt(1, organizationID);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				address = activate(rs);
				list.add(address);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findByName code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected Address activate(ResultSet rs) throws SQLException {
		int i = 1;
		Address address = new Address(Converter.toInteger((BigDecimal) rs.getObject(i++)));
		address.setCity(rs.getString(i++));
		address.setPostalCode(rs.getString(i++));
		address.setCountry(rs.getString(i++));
		address.setCounty(rs.getString(i++));
		address.setDescription(rs.getString(i++));
		address.setAddress1(rs.getString(i++));
		address.setAddress2(rs.getString(i++));
		address.setAddress3(rs.getString(i++));
		address.setAddress4(rs.getString(i++));
		address.setOrganizationID(Converter.toInteger((BigDecimal) rs.getObject(i++)));
		return address;
	}

	public ArrayList findAll() throws MappingException {
		throw new MappingException("findAll not valid for this type");
	}

}
