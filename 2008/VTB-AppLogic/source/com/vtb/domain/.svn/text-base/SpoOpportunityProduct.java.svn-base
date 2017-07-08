package com.vtb.domain;

import java.math.BigDecimal;
/**
 * VtbObject "»нформаци€ о продукте кредита из системы CRM".
 * 
 * @author IShafigullin
 * 
 */
public class SpoOpportunityProduct extends VtbObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id = null; // id product(id opportunity)
	private BigDecimal quantity = null;// Ћимит выдачи Ц сумма
	private String unit = null;// ¬алюта кредитной линии
	private String days = null;// —рок кредитной линии

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null) {
			return false;
		}
		if (!(anObject instanceof SpoOpportunityProduct)) {
			return false;
		}
		SpoOpportunityProduct aSpoOpportunityProduct = (SpoOpportunityProduct) anObject;
		return aSpoOpportunityProduct.getId().equals(getId());
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("SpoOpportunityProduct: id=");
		sb.append(getId() + "(quantity=" + getQuantity() + ", unit=" + getUnit() + ", days=" + getDays() + ")");
		// sb.append('\n');
		// sb.append(" IsActive: ");
		// sb.append(getIsActive());

		return sb.toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public SpoOpportunityProduct(String id) {
		super();
		this.id = id;
	}
}
