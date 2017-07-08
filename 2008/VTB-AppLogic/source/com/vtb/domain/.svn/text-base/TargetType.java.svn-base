package com.vtb.domain;
/**
 * VtbObject "целей кредитования"
 * 
 * @author IShafigullin
 * 
 */
public class TargetType extends VtbObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = -753977501192380686L;
	private Integer id = null; //Код целей кредитования 
	private String name = null; //Имя целей кредитования 

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof TargetType)) {
			return false;
		}
		TargetType aTargetType = (TargetType) anObject;
		return aTargetType.getId().intValue() == getId().intValue();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("TargetType: ");
		sb.append(getId() + "(" + getName() + ")");
		//sb.append('\n');
		//sb.append(" IsActive: ");
		//sb.append(getIsActive());

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

	public TargetType(Integer aId, String aName) {
		setId(aId);
		setName(aName);
	}
	
	public TargetType(Integer aId) {
		setId(aId);
		setName("none");
	}	

}
