package com.vtb.domain;

/**
 * VtbObject "филиалов"
 * 
 * @author IShafigullin
 * 
 */
public class Department extends VtbObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8767056901430555418L;

	private Integer id = null; // Код филиалов
	private String shortName = null; // Короткое имя филиала
	private String fullName = null; // Полное имя филиала
	private Integer codeDep = null; // Код DEP_ID
	private Integer code = null;// Код CB_CD

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getCodeDep() {
		return codeDep;
	}

	public void setCodeDep(Integer codeDep) {
		this.codeDep = codeDep;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof Department)) {
			return false;
		}
		Department aDepartments = (Department) anObject;
		return aDepartments.getId().intValue() == getId().intValue();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Departments: ");
		sb.append(getId() + "(" + getFullName() + ")");
		// sb.append('\n');
		// sb.append(" IsActive: ");
		// sb.append(getIsActive());

		return sb.toString();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Department(Integer aId, String aShortName, String aFullName) {
		setId(aId);
		setShortName(aShortName);
		setFullName(aFullName);
	}

	public Department(Integer aId) {
		setId(aId);
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
