package com.vtb.mapping;

import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.VtbObject;
import com.vtb.exception.MappingException;

/**
 * @author Sergey
 * ���������� ���������� <code>{@link com.vtb.mapping.Mapper Mapper}</code>
 *
 */
public interface SPOMessageMapper extends Mapper {
	
	/**
	 * ������� ���� �����. ������ �� ����������� <code>sender</code>
	 * 
	 * @param sender �����������
	 * @param orderBy ������ �����, ���������� ���������� � SQL ������� 
	 * @return ������ ����� ��������������� �� ����������� <code>{@link java.util.ArrayList ArrayList}</code>
	 * @throws SQLException 
	 * @throws MappingException
	 */
	public ArrayList findBySender(VtbObject domainObjectWithSender, String orderBy) throws MappingException, SQLException;
	
	/**
	 * ������� ���� �����. ������ �� ��������� <code>receiver</code>
	 * 
	 * @param receiver ��������
	 * @param orderBy ������ �����, ���������� ���������� � SQL ������� 
	 * @return ������ ����� ��������������� �� ��������� <code>{@link java.util.ArrayList ArrayList}</code>
	 * @throws SQLException 
	 * @throws MappingException 
	 */
	public ArrayList findByReceiver(VtbObject domainObjectWithReceiver, String orderBy) throws MappingException, SQLException;
}
