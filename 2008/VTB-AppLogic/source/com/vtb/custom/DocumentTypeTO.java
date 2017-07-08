package com.vtb.custom;

import java.io.Serializable;

/**
 * TO_Object "типов документов"
 * 
 * @author IShafigullin
 * 
 */
public class DocumentTypeTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4720075437712019978L;
	private Integer id = null; //Код типов документов 
	private String name = null; //Имя типов документов 
	private String groupName = null; //группа типов документов 

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof DocumentTypeTO)) {
			return false;
		}
		DocumentTypeTO aDocumentsType = (DocumentTypeTO) anObject;
		return aDocumentsType.getId().intValue() == getId().intValue();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("DocumentsTypeTO: ");
		sb.append(getId() + "(" + getName() + ")");
		sb.append('\n');
		sb.append(" groupName: ");
		sb.append(getGroupName());

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

	public DocumentTypeTO(Integer aId, String aName) {
		setId(aId);
		setName(aName);
		setGroupName(null);
	}
	
	public DocumentTypeTO(Integer aId) {
		setId(aId);
		setName("none");
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}	

}
