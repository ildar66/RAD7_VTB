package com.vtb.domain;
/**
 * VtbObject "Порядок уплаты процентов "
 * 
 * @author IShafigullin
 * 
 */
public class PatternPaidPercentType extends VtbObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8888198789810692227L;
	private Integer id = null; //Код "Порядок уплаты процентов"
	private String name = null; //Наименование способа(порядка)

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof PatternPaidPercentType)) {
			return false;
		}
		PatternPaidPercentType aPatternPaidPercentType = (PatternPaidPercentType) anObject;
		return aPatternPaidPercentType.getId().intValue() == getId().intValue();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("PatternPaidPercentType: ");
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

	public PatternPaidPercentType(Integer aId, String aName) {
		setId(aId);
		setName(aName);
	}
	
	public PatternPaidPercentType(Integer aId) {
		setId(aId);
		setName("none");
	}	

}
