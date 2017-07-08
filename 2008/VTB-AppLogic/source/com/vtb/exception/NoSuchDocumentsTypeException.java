package com.vtb.exception;

public class NoSuchDocumentsTypeException extends NoSuchObjectException {

	public NoSuchDocumentsTypeException() {
		super();
	}

	public NoSuchDocumentsTypeException(String arg0) {
		super(arg0);
	}

	public NoSuchDocumentsTypeException(Exception arg0, String desc) {
		super(arg0, desc);
	}
}
