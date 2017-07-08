package com.vtb.domain;

/**
 * VtbObject "Организационно-правовые формы"
 * 
 * @author IShafigullin
 * 
 */
public class OwnershipFormType extends VtbObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1617548421634985240L;
	/**
	 * 
	 */
	private Integer id = null; // id Организационно-правовые формы
	private String name = null; // Имя Организационно-правовые формы
	private Integer code = null; // Код "CODE_OPF" Организационно-правовые
	// формы
	private String association = null; // ассоциация

	public String getAssociation() {
		return association;
	}

	public String getAssociationStr() {
		String assStr = getAssociation();
		if ("O".equalsIgnoreCase(association)) {
			assStr = "Общество";
		} else if ("C".equalsIgnoreCase(association)) {
			assStr = "Предприятие";
		}
		return assStr;
	}

	public void setAssociation(String association) {
		this.association = association;
	}

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof OwnershipFormType)) {
			return false;
		}
		OwnershipFormType aLimitType = (OwnershipFormType) anObject;
		return aLimitType.getId().intValue() == getId().intValue();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("OwnershipFormType: ");
		sb.append(getId() + "(" + getName() + ")");
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OwnershipFormType(Integer aId, String aName) {
		setId(aId);
		setName(aName);
	}

	public OwnershipFormType(Integer aId) {
		setId(aId);
		setName("");
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}
