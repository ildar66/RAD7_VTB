package com.vtb.domain;

import java.sql.Date;

/**
 * @author Sergey
 *
 * Объект представляющий уведомления, использующиеся внутри СПО
 */
public class SPOMessage extends VtbObject {
	private boolean isRead;
	private String sender;
	private String senderFullName;
	private String receiver;
	private String receiverFullName;
	private String subject;
	private String message;
	private Date timestamp;
	
	private int idMessage;
	
	public SPOMessage(){}
	
	public SPOMessage(int idMessage, 
					  String sender, 
					  String receiver, 
					  String subject, 
					  String message,
					  Date timestamp,
					  String senderFullName,
					  String receiverFullName,
					  boolean isRead) {
		this.idMessage = idMessage;
		this.sender = sender;
		this.receiver = receiver;
		this.subject = subject;
		this.message = message;
		this.timestamp = timestamp;
		this.senderFullName = senderFullName;
		this.receiverFullName = receiverFullName;
		this.isRead = isRead;
	}
	

	public int getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}

	public boolean isRead() {
		return isRead;
	}

	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getReceiverFullName() {
		return receiverFullName;
	}

	public void setReceiverFullName(String receiverFullName) {
		this.receiverFullName = receiverFullName;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSenderFullName() {
		return senderFullName;
	}

	public void setSenderFullName(String senderFullName) {
		this.senderFullName = senderFullName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
