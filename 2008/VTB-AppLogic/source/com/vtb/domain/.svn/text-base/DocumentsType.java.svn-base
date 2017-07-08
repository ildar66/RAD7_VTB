package com.vtb.domain;
/**
 * VtbObject "типов документов"
 * 
 * @author IShafigullin
 * 
 */
public class DocumentsType extends VtbObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4720075437712019978L;
	private Integer id = null; //Код типов документов 
	private String name = null; //Имя типов документов 
	private Integer groupID = null; //группа типов документов 

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof DocumentsType)) {
			return false;
		}
		DocumentsType aDocumentsType = (DocumentsType) anObject;
		return aDocumentsType.getId().intValue() == getId().intValue();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("DocumentsType: ");
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

	public DocumentsType(Integer aId, String aName) {
		setId(aId);
		setName(aName);
		setGroupID(null);
	}
	
	public DocumentsType(Integer aId) {
		setId(aId);
		setName("none");
	}

	public Integer getGroupID() {
		return groupID;
	}

	public void setGroupID(Integer groupID) {
		this.groupID = groupID;
	}	

}
