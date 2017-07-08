package com.vtb.exception;

import java.io.Serializable;

public class VtbException extends WrappedException implements Serializable {

	/**
	 * Constructor for VtbException
	 */
	public VtbException() {
		super();
	}

	/**
	 * Constructor for VtbException
	 */
	public VtbException(String arg0) {
		super(arg0);
	}

	/**
	 * Constructor VtbException.
	 * @param arg0
	 */
	public VtbException(Exception arg0, String desc) {
		super(arg0, desc);
	}


}

