package com.vtb.custom;

import com.vtb.domain.Attachment;

public class AttachmentDisplay extends Attachment {
	String downloadLink="";
	String expiration="";
	String addition="";
	String accept="";
	
	public AttachmentDisplay() {
		
	}
	
	public AttachmentDisplay(Attachment attach) {
		super(attach);
	}
	
	public String getDownloadLink() {
		return downloadLink;
	}
	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}
	public String getAccept() {
		return accept;
	}
	public void setAccept(String accept) {
		this.accept = accept;
	}
	public String getAddition() {
		return addition;
	}
	public void setAddition(String addition) {
		this.addition = addition;
	}
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}	
}
