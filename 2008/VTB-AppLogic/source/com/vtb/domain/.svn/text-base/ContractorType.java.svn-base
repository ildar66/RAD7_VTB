package com.vtb.domain;

/**
 * VtbObject "типов контрагентов"
 * 
 * @author IShafigullin
 * 
 */
public class ContractorType extends VtbObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7971534459975511036L;
	private Integer id = null; //Код типов контрагентов 
	private String name = null; //Имя типов контрагентов 

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof ContractorType)) {
			return false;
		}
		ContractorType aContractorType = (ContractorType) anObject;
		return aContractorType.getId().intValue() == getId().intValue();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ContractorType: ");
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

	public ContractorType(Integer aId, String aName) {
		setId(aId);
		setName(aName);
	}
	
	public ContractorType(Integer aId) {
		setId(aId);
		setName("none");
	}	

}
