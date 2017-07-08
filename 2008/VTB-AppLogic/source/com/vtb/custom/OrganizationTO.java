package com.vtb.custom;

/**
 * ������ ��������� (TO) "O����������" ��� �������������� � �������� CRM
 * 
 * @author ildar
 * 
 */
public class OrganizationTO {
	private Integer spoID = null; // id SPO
	private String crmID = null; // id CRM
	private String name = null; // ������������
	private String fullName = null; // ������ ����������� ������������

	public String getCrmID() {
		return crmID;
	}

	public void setCrmID(String crmID) {
		this.crmID = crmID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSpoID() {
		return spoID;
	}

	public void setSpoID(Integer spoID) {
		this.spoID = spoID;
	}

	public OrganizationTO(Integer spoID, String crmID) {
		super();
		this.spoID = spoID;
		this.crmID = crmID;
	}
}
