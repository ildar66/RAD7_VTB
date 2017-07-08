package com.vtb.domain;
/**
 * VtbObject "отраслей"
 * 
 * @author IShafigullin
 * 
 */
public class Industry extends VtbObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5843730821594121256L;
	private Integer id = null; //Код отрасли
	private String name = null; //Имя отрасли
	private String rating = null; //рейтинг
	private String type = null; //Тип отрасли(Производственный/непроизводственный)

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof Industry)) {
			return false;
		}
		Industry aIndustry = (Industry) anObject;
		return aIndustry.getId().intValue() == getId().intValue();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Industry: ");
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

	public Industry(Integer aId, String aName) {
		setId(aId);
		setName(aName);
		setRating(null);
	}
	
	public Industry(Integer aId) {
		setId(aId);
		setName("none");
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String aRating) {
		this.rating = aRating;
	}

	public String getType() {
		return type;
	}
	public String getTypeStr() {
		String assStr = getType();
		if ("P".equalsIgnoreCase(type)) {
			assStr = "производственный";
		} else if ("N".equalsIgnoreCase(type)) {
			assStr = "непроизводственный";
		}
		return assStr;
	}	

	public void setType(String type) {
		this.type = type;
	}	

}
