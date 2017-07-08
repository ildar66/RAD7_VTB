package com.vtb.domain;

import java.sql.Date;

/**
 * VtbObject "C����� ��� ����� ������, ��������� ��������/���������, ��������
 * �������� ����� ��� � CRM"
 * 
 * @author IShafigullin
 * 
 */
public class SpoOpportunity extends VtbObject {

	private static final long serialVersionUID = 1L;

	private String id = null;// �������������

	public final static String SPO_SEND_OK = "1";// (1 - ����������)
	private String spoSend = null;// ������� �������� � ���
	private Date spoSendDate = null;// ���� � ����� �������� � ���

	public final static String SPO_ACCEPT_OK = "1";// 1 - �������
	public final static String SPO_ACCEPT_ERROR = "2";// 2 - ������ ��������
	private String spoAccept = null;// ������� ��������� �������� ���
	private Date spoAcceptDate = null;// ���� � ����� ��������� � ���

	public final static String SPO_TYPE_LIMIT = "L";
	public final static String SPO_TYPE_CREDIT = "K";
	private String spoType = null;// ��� ������(L � �����, K - ������)

	private String opportunityID = null;// ������������� ������/��� ������
	private String accountID = null;// id ����������� � CRM
	/**
	 * ������� -1, �������� �� ���� ������� -2, �������� �� -3, ����� ������� -4
	 */
	public final static String CALL_BACK_OK = "1";
	public final static String CALL_BACK_NO_SF = "2";
	public final static String CALL_BACK_NO_KK = "3";
	public final static String CALL_BACK_NO_KLIENT = "4";
	private String callBack = null;// ������ �������� ������ (���������)
	private Date callBackDate = null;// ���� � ����� ��������

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof SpoOpportunity)) {
			return false;
		}
		SpoOpportunity aSpoOpportunity = (SpoOpportunity) anObject;
		return aSpoOpportunity.getId().equals(getId());
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("SpoOpportunity: id=" + getId() + "; spoSendDate=" + getSpoSendDate());
		// sb.append('\n');
		// sb.append(" IsActive: ");
		// sb.append(getIsActive());

		return sb.toString();
	}


	public SpoOpportunity(String aId) {
		setId(aId);
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getCallBack() {
		return callBack;
	}

	public void setCallBack(String callBack) {
		this.callBack = callBack;
	}

	public Date getCallBackDate() {
		return callBackDate;
	}

	public void setCallBackDate(Date callBackDate) {
		this.callBackDate = callBackDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOpportunityID() {
		return opportunityID;
	}

	public void setOpportunityID(String opportunityID) {
		this.opportunityID = opportunityID;
	}

	public String getSpoAccept() {
		return spoAccept;
	}

	public void setSpoAccept(String spoAccept) {
		this.spoAccept = spoAccept;
	}

	public Date getSpoAcceptDate() {
		return spoAcceptDate;
	}

	public void setSpoAcceptDate(Date spoAcceptDate) {
		this.spoAcceptDate = spoAcceptDate;
	}

	public String getSpoSend() {
		return spoSend;
	}

	public void setSpoSend(String spoSend) {
		this.spoSend = spoSend;
	}

	public Date getSpoSendDate() {
		return spoSendDate;
	}

	public void setSpoSendDate(Date spoSendDate) {
		this.spoSendDate = spoSendDate;
	}

	public String getSpoType() {
		return spoType;
	}

	public void setSpoType(String spoType) {
		this.spoType = spoType;
	}

}
