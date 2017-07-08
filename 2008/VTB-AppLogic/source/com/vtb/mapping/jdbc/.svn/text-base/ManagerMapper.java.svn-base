package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.Address;
import com.vtb.domain.Manager;
import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.util.ApplProperties;
import com.vtb.util.Converter;

public class ManagerMapper extends JDBCMapper implements com.vtb.mapping.ManagerMapper {
	protected static final String findByOrganizationSqlString = "SELECT ID_MANAGER id, reason, ID_CONTRACTOR organizationID, birthDay, lastName, firstName, middleName, alumni, title, ADDRESS addressID FROM "
			+ ApplProperties.getDatasourceSchema() + ".MANAGERS WHERE ID_CONTRACTOR = ?";

	protected static final String _loadString = "SELECT ID_MANAGER id, reason, ID_CONTRACTOR organizationID, birthDay, lastName, firstName, middleName, alumni, title, ADDRESS addressID FROM "
			+ ApplProperties.getDatasourceSchema() + ".MANAGERS WHERE ID_MANAGER = ?";

	protected static final String _createString = "INSERT INTO "
			+ ApplProperties.getDatasourceSchema()
			+ ".MANAGERS (ID_MANAGER, reason, ID_CONTRACTOR, birthDay, lastName, firstName, middleName, alumni, title, ADDRESS) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	protected static final String _removeString = "DELETE FROM " + ApplProperties.getDatasourceSchema()
			+ ".MANAGERS WHERE ID_MANAGER = ?";

	protected static final String _storeString = "UPDATE "
			+ ApplProperties.getDatasourceSchema()
			+ ".MANAGERS SET reason = ?, ID_CONTRACTOR = ?, birthDay = ?, lastName = ?, firstName = ?, middleName = ?, alumni = ?, title = ?, ADDRESS = ? WHERE ID_MANAGER = ?";

	private transient AddressMapper addressMapper = null;

	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer id = null;// идентификатор СПО
		String reason = null;// На основании чего действует
		Integer organizationID = null; // внешний ключ на организацию
		Date birthDay = null;// Год рождения
		String lastName = null;// Фамилия
		String firstName = null; // Имя
		String middleName = null; // Отчество
		String alumni = null;// ВУЗ
		String title = null;// Должность
		/**
		 * внешний ключ на адрес. Один адрес создается для одной организации У
		 * адреса поле IDORGANISATION должно быть null.
		 */
		Integer addressID = null;
		if (domainObject instanceof Manager) {
			id = ((Manager) domainObject).getId();
			reason = ((Manager) domainObject).getReason();
			organizationID = ((Manager) domainObject).getOrganizationID();
			birthDay = ((Manager) domainObject).getBirthDay();
			lastName = ((Manager) domainObject).getLastName();
			firstName = ((Manager) domainObject).getFirstName();
			middleName = ((Manager) domainObject).getMiddleName();
			alumni = ((Manager) domainObject).getAlumni();
			title = ((Manager) domainObject).getTitle();
			if (((Manager) domainObject).getAddress() != null) {
				addressID = createOrUpdateAddress(conn, ((Manager) domainObject).getAddress());
			}
		} else {
			// update fails
			throw new DuplicateKeyException("Create Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_createString);
		int i = 1;
		ps.setObject(i++, id);
		ps.setObject(i++, reason);
		ps.setObject(i++, organizationID);
		ps.setObject(i++, birthDay);
		ps.setObject(i++, lastName);
		ps.setObject(i++, firstName);
		ps.setObject(i++, middleName);
		ps.setObject(i++, alumni);
		ps.setObject(i++, title);
		ps.setObject(i++, addressID);

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
		Manager vo = null;
		Integer id = null;
		if (domainObjectWithKeyValues instanceof Manager) {
			id = ((Manager) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		vo = activate(conn, rs);
		return vo;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		Integer aId = null;
		if (domainObject instanceof Manager) {
			aId = ((Manager) domainObject).getId();
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
		Integer id = null;// идентификатор СПО
		String reason = null;// На основании чего действует
		Integer organizationID = null; // внешний ключ на организацию
		Date birthDay = null;// Год рождения
		String lastName = null;// Фамилия
		String firstName = null; // Имя
		String middleName = null; // Отчество
		String alumni = null;// ВУЗ
		String title = null;// Должность
		/**
		 * внешний ключ на адрес. Один адрес создается для одной организации У
		 * адреса поле IDORGANISATION должно быть null.
		 */
		Integer addressID = null;
		if (domainObject instanceof Manager) {
			id = ((Manager) domainObject).getId();
			reason = ((Manager) domainObject).getReason();
			organizationID = ((Manager) domainObject).getOrganizationID();
			birthDay = ((Manager) domainObject).getBirthDay();
			lastName = ((Manager) domainObject).getLastName();
			firstName = ((Manager) domainObject).getFirstName();
			middleName = ((Manager) domainObject).getMiddleName();
			alumni = ((Manager) domainObject).getAlumni();
			title = ((Manager) domainObject).getTitle();
			if (((Manager) domainObject).getAddress() != null) {
				addressID = createOrUpdateAddress(conn, ((Manager) domainObject).getAddress());
			}
		} else {
			// update fails
			throw new MappingException("Update Failed " + domainObject);
		}
		PreparedStatement ps = conn.prepareStatement(_storeString);
		int i = 1;
		ps.setObject(i++, reason);
		ps.setObject(i++, organizationID);
		ps.setObject(i++, birthDay);
		ps.setObject(i++, lastName);
		ps.setObject(i++, firstName);
		ps.setObject(i++, middleName);
		ps.setObject(i++, alumni);
		ps.setObject(i++, title);
		ps.setObject(i++, addressID);

		ps.setObject(i++, id);
		int rows = ps.executeUpdate();
		if (rows == 1)
			return;
		else
			// failed
			throw new MappingException("Update Failed " + domainObject);
	}

	/**
	 * @param conn
	 * @param domainObject
	 * @return
	 * @throws SQLException
	 * @throws MappingException
	 */
	private Integer createOrUpdateAddress(Connection conn, Address aAddress) throws SQLException, MappingException {
		Integer addressID = aAddress.getId();
		if(addressID != null){
			Address findAddress = (Address) getAddressMapper().findByPrimaryKeyImpl(conn, new Address(addressID));
			if(findAddress != null){
				getAddressMapper().updateImpl(conn, aAddress);
			}else {
				getAddressMapper().createImpl(conn, aAddress);
			}
		}
		return addressID;
	}
	
	/**
	 * findListByOrganization by Organization id.
	 */

	public ArrayList findListByOrganization(Integer organizationID, String orderBy) throws MappingException {
		ArrayList<Manager> list = new ArrayList<Manager>();
		Manager vo = null;
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
				vo = activate(conn, rs);
				list.add(vo);
			}
			return list;
		} catch (SQLException se) {
			se.printStackTrace(System.out);
			throw new MappingException(se, "SQLException findListByOrganization code=" + se.getErrorCode());
		} finally {
			close(conn);
		}
	}

	protected Manager activate(Connection conn, ResultSet rs) throws SQLException, MappingException {
		int i = 1;
		Manager vo = new Manager(Converter.toInteger((BigDecimal) rs.getObject(i++)));
		vo.setReason(rs.getString(i++));
		vo.setOrganizationID(Converter.toInteger((BigDecimal) rs.getObject(i++)));
		vo.setBirthDay((Date) rs.getObject(i++));
		vo.setLastName(rs.getString(i++));
		vo.setFirstName(rs.getString(i++));
		vo.setMiddleName(rs.getString(i++));
		vo.setAlumni(rs.getString(i++));
		vo.setTitle(rs.getString(i++));
		Integer addressId = Converter.toInteger((BigDecimal) rs.getObject(i++));
		if (addressId != null) {
			Address address = (Address) getAddressMapper().findByPrimaryKeyImpl(conn, new Address(addressId));
			vo.setAddress(address);
		}
		return vo;
	}

	public ArrayList findAll() throws MappingException {
		throw new MappingException("findAll not valid for this type");
	}

	private AddressMapper getAddressMapper() {
		if (addressMapper == null) {
			addressMapper = new AddressMapper();
		}
		return addressMapper;
	}

}
