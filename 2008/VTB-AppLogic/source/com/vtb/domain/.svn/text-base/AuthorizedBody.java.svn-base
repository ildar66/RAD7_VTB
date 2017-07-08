package com.vtb.domain;

/**
 * VtbObject "Уполномоченных органов"
 * @author IShafigullin
 *
 */
public class AuthorizedBody extends VtbObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8193840733902007792L;
	private Integer id = null; //Код "Уполномоченных органов"
	private String name = null; //Имя 
	private Boolean isColegial = null; //Признак коллегиальности(ДА,НЕТ)
	private Boolean isGeneral = null; //Признак ГО(ДА,НЕТ)	

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof AuthorizedBody)) {
			return false;
		}
		AuthorizedBody aAuthorizedBody = (AuthorizedBody) anObject;
		return aAuthorizedBody.getId().intValue() == getId().intValue();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("AuthorizedBody: ");
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

	public AuthorizedBody(Integer aId, String aName) {
		setId(aId);
		setName(aName);
	}
	
	public AuthorizedBody(Integer aId) {
		setId(aId);
		setName("none");
	}

	public Boolean getIsColegial() {
		return isColegial;
	}

	public void setIsColegial(Boolean isColegial) {
		this.isColegial = isColegial;
	}

	public Boolean getIsGeneral() {
		return isGeneral;
	}

	public void setIsGeneral(Boolean isGeneral) {
		this.isGeneral = isGeneral;
	}	

}
