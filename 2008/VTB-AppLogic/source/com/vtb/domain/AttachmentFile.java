package com.vtb.domain;

import java.sql.Blob;

public class AttachmentFile extends VtbObject {
	String unid;
	String filename;
	byte[] filedata;
	
	
	public AttachmentFile() {
		// TODO Auto-generated constructor stub
	}
	
	public AttachmentFile(String unid) {
		// TODO Auto-generated constructor stub
		this.unid = unid;
	}
	
	
	public byte[] getFiledata() {
		return filedata;
	}

	public void setFiledata(byte[] filedata) {
		this.filedata = filedata;
	}

	public String getUnid() {
		return unid;
	}
	public void setUnid(String unid) {
		this.unid = unid;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}	
}
