package com.vtb.model;

import java.util.ArrayList;

import com.vtb.domain.SPOMessage;
import com.vtb.exception.MappingException;


/**
 * @author Sergey
 *
 * Интерфейс взаимодействия с уведомлениями внутри СПО
 */
public interface SPOMessageActionProcessor {
	
	/**
	 * Создание <b>уведомления</b> внутри СПО
	 * 
	 * @param message Объект уведомления типа <code>SPOMessage</code>
	 * @throws MappingException
	 */
	public void createMessage(SPOMessage message) throws MappingException;
	
	/**
	 * Получение объекта <b>уведомления</b> по его идентификатору
	 * 
	 * @param messageWithKeyValues Объект <b>уведомления</b> типа <code>SPOMessage</code> с заполненным полем <code>idMessage</code>
	 * @return Объект <b>уведомления</b> типа <code>SPOMessage</code>
	 * @throws MappingException
	 */
	public SPOMessage getMessage(SPOMessage messageWithKeyValues) throws MappingException;
	
	/**
	 * Обновление объекта <b>уведомления</b> по его идентификатору
	 * 
	 * @param messageWithKeyValues Объект <b>уведомления</b> типа <code>SPOMessage</code> с заполненным полем <code>idMessage</code>
	 * @throws MappingException
	 */
	public void updateMessage(SPOMessage messageWithKeyValues) throws MappingException;
	
	/**
	 * Получение списка объектов <b>уведомлений</b> по <b>отправителю</b> 
	 * 
	 * @param messageWithSender Объект <b>уведомления</b> типа <code>SPOMessage</code> с заполненным полем <code>sender</code>
	 * @param orderBy Список полей, подлещащих сортировке в SQL формате 
	 * @return Список <code>ArrayList</code> объектов <b>уведомлений</b> типа <code>SPOMessage</code> отфильтрованных по <b>отправителю</b> 
	 * @throws MappingException
	 */
	public ArrayList getListBySender(SPOMessage messageWithSender, String orderBy) throws MappingException;
	
	/**
	 * Получение списка объектов <b>уведомлений</b> по <b>получателю</b>
	 * 
	 * @param messageWithReceiver Объект <b>уведомления</b> типа <code>SPOMessage</code> с заполненным полем <code>receiver</code>
	 * @param orderBy Список полей, подлещащих сортировке в SQL формате 
	 * @return Список <code>ArrayList</code> объектов <b>уведомлений</b> типа <code>SPOMessage</code> отфильтрованных по <b>получателю</b>
	 * @throws MappingException
	 */
	public ArrayList getListByReceiver(SPOMessage messageWithReceiver, String orderBy) throws MappingException;
}
