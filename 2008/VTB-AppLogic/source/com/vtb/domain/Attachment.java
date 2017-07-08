package com.vtb.domain;

import java.sql.Timestamp;
import java.util.Date;



/**
 * Объект, описывает прикреплённые файлы в системе.* 
 *
 */
public class Attachment extends VtbObject {
	
	public static int CONST_CONTRACTOR_FILE = 1;
	public static int CONST_APPLICATION_FILE = 0;
	
	public static int CONST_IS_ACCEPTED = 1;
	public static int CONST_NOT_ACCEPTED = 0;
	
	
	String unid;
	String filename;
	String filetype;
	String signature;
	
	
	//This fields are needed for 
	long id_owner; //Binding ID
	int owner_type; //File bind with CONTRACTOR or LOAN APPLICATION
	long who_add;	//ID User, who add file 
	Timestamp date_of_addition; //Date, when user added file
	Timestamp date_of_expiration;
	
	//This fields are needed for accept(sign) files by 
	int isAccepted;
	long who_accept;	
	Timestamp date_of_accept;
	
	public Attachment() {	
	
	}
	
	public Attachment(Attachment attach) {	
		this.unid = attach.unid;
				
		this.filename = attach.filename;
		this.filetype = attach.filetype;
		this.id_owner = attach.id_owner;
		this.owner_type = attach.owner_type;
		this.signature = attach.signature;
		
		this.who_add = attach.who_add;
		this.date_of_addition = attach.date_of_addition;
		this.date_of_expiration = attach.date_of_expiration;
		
		this.isAccepted = attach.isAccepted;
		this.who_accept = attach.who_accept;
		this.date_of_accept = attach.date_of_accept;
	}
	
	public Attachment(String unid) {		
		this.unid = unid;
	}
	
	public Attachment(long id_owner, int owner_type) {
		this.id_owner = id_owner;
		this.owner_type = owner_type;
	}
	
	public Attachment(String unid, String filename, String filetype, long id_owner, int owner_type) {
		
		this.unid = unid;
		
		this.filename = filename;
		this.filetype = filetype;
		this.id_owner = id_owner;
		this.owner_type = owner_type;
	}
	
	
	public Timestamp getDate_of_accept() {
		return date_of_accept;
	}
	public void setDate_of_accept(Timestamp date_of_accept) {
		this.date_of_accept = date_of_accept;
	}
	public Timestamp getDate_of_addition() {
		return date_of_addition;
	}
	public void setDate_of_addition(Timestamp date_of_addition) {
		this.date_of_addition = date_of_addition;
	}
	public Timestamp getDate_of_expiration() {
		return date_of_expiration;
	}
	public void setDate_of_expiration(Timestamp date_of_expiration) {
		this.date_of_expiration = date_of_expiration;
	}
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFiletype() {
		return filetype;
	}
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
	public long getId_owner() {
		return id_owner;
	}
	public void setId_owner(long id_owner) {
		this.id_owner = id_owner;
	}
	public int isAccepted() {
		return isAccepted;
	}
	public void setAccepted(int isAccepted) {
		this.isAccepted = isAccepted;
	}
	public int getOwner_type() {
		return owner_type;
	}
	public void setOwner_type(int owner_type) {
		this.owner_type = owner_type;
	}
	public String getUnid() {
		return unid;
	}
	public void setUnid(String unid) {
		this.unid = unid;
	}
	public long getWho_accept() {
		return who_accept;
	}
	public void setWho_accept(long who_accept) {
		this.who_accept = who_accept;
	}
	public long getWho_add() {
		return who_add;
	}
	public void setWho_add(long who_add) {
		this.who_add = who_add;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
		
}
