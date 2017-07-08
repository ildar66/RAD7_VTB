package com.vtb.domain;

import java.sql.Date;

/**
 * VtbObject "������� ����������� ������ ".
 * � ������ ������� ������� ��� ���������� ���������� � ����������� ������
 * 
 * @author IShafigullin
 * 
 */
public class SpoHistory extends VtbObject {

	private static final long serialVersionUID = 1L;

	private String id = null;// �������������

	/**
	 * ���, ���������, �������������(����������� � ���)
	 */
	private String spoExpert = null;

	/**
	 * ������ ������������(���������� ������ �� ���)
	 */
	private String spoOpportunityID = null;

	/**
	 * ������ ������������ ��������� (���������� �������� �� ���)
	 */
	private String spoStep = null;// ������ ������������ ���������
	private Date stepchDate = null;// ���� ��������� �������

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof SpoHistory)) {
			return false;
		}
		SpoHistory aSpoHistory = (SpoHistory) anObject;
		return aSpoHistory.getId().equals(getId());
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("SpoHistory: ");
		sb.append(getId() + "(StepchDate=" + getStepchDate() + ", SpoExpert=" + getSpoExpert() + ")");

		// sb.append('\n');
		// sb.append(" IsActive: ");
		// sb.append(getIsActive());

		return sb.toString();
	}

	/**
	 * 
	 * @param id
	 * @param spoExpert
	 * @param spoOpportunityID
	 * @param spoStep
	 * @param stepchDate
	 */
	public SpoHistory(String id, String spoExpert, String spoOpportunityID, String sposter, Date stepchDate) {
		super();
		this.id = id;
		this.spoExpert = spoExpert;
		this.spoOpportunityID = spoOpportunityID;
		this.spoStep = sposter;
		this.stepchDate = stepchDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSpoExpert() {
		return spoExpert;
	}

	public void setSpoExpert(String spoExpert) {
		this.spoExpert = spoExpert;
	}

	public String getSpoOpportunityID() {
		return spoOpportunityID;
	}

	public void setSpoOpportunityID(String spoOpportunityID) {
		this.spoOpportunityID = spoOpportunityID;
	}

	public String getSpoStep() {
		return spoStep;
	}

	public void setSpoStep(String sposter) {
		this.spoStep = sposter;
	}

	public Date getStepchDate() {
		return stepchDate;
	}

	public void setStepchDate(Date stepchDate) {
		this.stepchDate = stepchDate;
	}

}
