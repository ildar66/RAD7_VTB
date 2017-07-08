package com.vtb.mapping;

import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.VtbObject;
import com.vtb.exception.MappingException;

/**
 * @author Sergey
 * Расширение интерфейса <code>{@link com.vtb.mapping.Mapper Mapper}</code>
 *
 */
public interface SPOMessageMapper extends Mapper {
	
	/**
	 * Выборка всех писем. Фильтр по отправителю <code>sender</code>
	 * 
	 * @param sender Отправитель
	 * @param orderBy Список полей, подлещащих сортировке в SQL формате 
	 * @return Список писем отфильтрованных по отправителю <code>{@link java.util.ArrayList ArrayList}</code>
	 * @throws SQLException 
	 * @throws MappingException
	 */
	public ArrayList findBySender(VtbObject domainObjectWithSender, String orderBy) throws MappingException, SQLException;
	
	/**
	 * Выборка всех писем. Фильтр по приемнику <code>receiver</code>
	 * 
	 * @param receiver Приемник
	 * @param orderBy Список полей, подлещащих сортировке в SQL формате 
	 * @return Список писем отфильтрованных по приемнику <code>{@link java.util.ArrayList ArrayList}</code>
	 * @throws SQLException 
	 * @throws MappingException 
	 */
	public ArrayList findByReceiver(VtbObject domainObjectWithReceiver, String orderBy) throws MappingException, SQLException;
}
