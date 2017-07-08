package com.vtb.exception;

public class NoSuchOperatorException extends NoSuchObjectException {

	public NoSuchOperatorException() {
		super();
	}

	public NoSuchOperatorException(String arg0) {
		super(arg0);
	}

	public NoSuchOperatorException(Exception arg0, String desc) {
		super(arg0, desc);
	}

}
