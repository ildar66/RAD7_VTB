package com.vtb.domain;
/**
 * VtbObject "вида сделок"
 * 
 * @author IShafigullin
 * 
 */
public class OpportunityType extends VtbObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5295714699482937457L;
	private Integer id = null; //Код вида сделок 
	private String name = null; //Имя вида сделок 

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof OpportunityType)) {
			return false;
		}
		OpportunityType aOpportunityType = (OpportunityType) anObject;
		return aOpportunityType.getId().intValue() == getId().intValue();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("OpportunityType: ");
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

	public OpportunityType(Integer aId, String aName) {
		setId(aId);
		setName(aName);
	}
	
	public OpportunityType(Integer aId) {
		setId(aId);
		setName("none");
	}	

}
