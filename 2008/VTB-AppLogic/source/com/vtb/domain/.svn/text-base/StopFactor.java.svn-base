package com.vtb.domain;

/**
 * This class describes the type of stop factors in the system
 * 
 * @author Tormozov M.G.
 * 
 */
public class StopFactor extends VtbObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code = null;//
	private String description = null;

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof StopFactor)) {
			return false;
		}
		StopFactor aStopFactor = (StopFactor) anObject;
		return aStopFactor.getCode().equals(getCode());
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("StopFactor: ");
		sb.append(getCode() + "(" + getDescription() + ")");
		// sb.append('\n');
		// sb.append(" IsActive: ");
		// sb.append(getIsActive());

		return sb.toString();
	}

	public StopFactor(String code) {
		super();
		this.code = code;
	}

	public StopFactor(String code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
