package com.vtb.exception;

public class NoSuchOrganizationException extends NoSuchObjectException {

	public NoSuchOrganizationException() {
		super();
	}

	public NoSuchOrganizationException(String arg0) {
		super(arg0);
	}

	public NoSuchOrganizationException(Exception arg0, String desc) {
		super(arg0, desc);
	}

}
