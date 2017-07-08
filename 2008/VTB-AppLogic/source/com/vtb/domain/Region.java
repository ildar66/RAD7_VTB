package com.vtb.domain;
/**
 * VtbObject "регионов"
 * 
 * @author IShafigullin
 * 
 */
public class Region extends VtbObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3168625084056882002L;
	private Integer id = null; //Код регионов 
	private String name = null; //Имя регионов 
	private String rating = null; //рейтинг регионов 

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof Region)) {
			return false;
		}
		Region aRegion = (Region) anObject;
		return aRegion.getId().intValue() == getId().intValue();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Region: ");
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

	public Region(Integer aId, String aName) {
		setId(aId);
		setName(aName);
		setRating(null);
	}
	
	public Region(Integer aId) {
		setId(aId);
		setName("none");
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String aRating) {
		this.rating = aRating;
	}	

}
