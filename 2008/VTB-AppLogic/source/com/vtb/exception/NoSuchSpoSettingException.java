package com.vtb.exception;

public class NoSuchSpoSettingException extends NoSuchObjectException {

	public NoSuchSpoSettingException() {
	}

	public NoSuchSpoSettingException(String arg0) {
		super(arg0);
	}

	public NoSuchSpoSettingException(Exception arg0, String desc) {
		super(arg0, desc);
	}

}
