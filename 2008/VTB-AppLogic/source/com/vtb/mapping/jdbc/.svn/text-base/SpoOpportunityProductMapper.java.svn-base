package com.vtb.mapping.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vtb.domain.SpoOpportunityProduct;
import com.vtb.domain.VtbObject;
import com.vtb.exception.MappingException;

public class SpoOpportunityProductMapper extends JDBCMapperCRM {
	//TODO обратить внимание на запросы
	//private static final String _loadString = "SELECT opp.OPPORTUNITYID, prod.QUANTITYVYDACHI, prod.DAYS, prod.PERIODISP, prod.STLIBORSROK, prod.STLIBORPERC, prod.STAVRAZWRK, prod.COMNEISP, prod.COMUPR "
	//		+ " FROM " + JDBCMapperCRM.DB_SCHEMA + ".V_SPO_OPPORTUNITY@" + JDBCMapperCRM.DB_LINK + " opp, " + JDBCMapperCRM.DB_SCHEMA + ".V_SPO_FB_OPPORTUNITY_PRODUCT@" + JDBCMapperCRM.DB_LINK + " prod "
	//		+ " WHERE opp.PRODUCTID = prod.OPPPRODUCTID AND opp.OPPORTUNITYID = ? ";

	//private static final String _loadString = "SELECT opp.OPPORTUNITYID, fbopprod.QUANTITYVYDACHI, opprod.UNIT, fbopprod.DAYS, fbopprod.PERIODISP, fbopprod.STLIBORSROK, fbopprod.STLIBORPERC, fbopprod.STAVRAZWRK, fbopprod.COMNEISP, fbopprod.COMUPR "
	//	+ " FROM sysdba.V_SPO_OPPORTUNITY opp, "
	//	+ " sysdba.V_SPO_FB_OPPORTUNITY_PRODUCT fbopprod, "
	//	+ " sysdba.V_SPO_OPPORTUNITY_PRODUCT opprod, "
	//	+ " sysdba.V_SPO_PRODUCT prod "
	//	+ " WHERE opp.OPPORTUNITYID = opprod.OPPORTUNITYID AND opprod.PRODUCTID = prod.PRODUCTID AND prod.PRODUCTID = fbopprod.OPPPRODUCTID " 
	//	+ " AND prod.PRODUCTID = opprod.OPPPRODUCTID AND opp.OPPORTUNITYID = ? ";
		//+ " WHERE opp.PRODUCTID = fbopprod.OPPPRODUCTID AND opp.PRODUCTID = oppprod.OPPPRODUCTID AND opp.OPPORTUNITYID = ? ";
	
	private static final String _loadString = "SELECT opp.OPPORTUNITYID, " +
												"decode(opprod.QUANTITY, " +
													"null, fbopprod.QUANTITYVYDACHI, " +
													"opprod.QUANTITY " +
												") quantity, " +
												"opprod.UNIT, fbopprod.DAYS, fbopprod.PERIODISP, fbopprod.STLIBORSROK, fbopprod.STLIBORPERC, fbopprod.STAVRAZWRK, fbopprod.COMNEISP, fbopprod.COMUPR " +
												"FROM sysdba.V_SPO_OPPORTUNITY opp, " +
												"sysdba.V_SPO_FB_OPPORTUNITY_PRODUCT fbopprod, " +
												"sysdba.V_SPO_OPPORTUNITY_PRODUCT opprod " +
												"WHERE opp.OPPORTUNITYID = opprod.OPPORTUNITYID " + 
												"AND opprod.OPPPRODUCTID = fbopprod.OPPPRODUCTID " + 
												"AND opp.OPPORTUNITYID = ? "; 

	
	@Override
	protected Object createImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		throw new MappingException("Insert not valid for this type");
	}

	@Override
	protected VtbObject findByPrimaryKeyImpl(Connection conn, VtbObject domainObjectWithKeyValues) throws SQLException,
			MappingException {
		SpoOpportunityProduct domainObject = null;
		String aId = null;
		if (domainObjectWithKeyValues instanceof SpoOpportunityProduct) {
			aId = ((SpoOpportunityProduct) domainObjectWithKeyValues).getId();
		} else
			return null;
		PreparedStatement ps = conn.prepareStatement(_loadString);
		ps.setObject(1, aId);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			domainObject = activate(rs);
		}
		return domainObject;
	}

	private SpoOpportunityProduct activate(ResultSet rs)  throws SQLException {
		int i = 1;
		SpoOpportunityProduct domainObject = new SpoOpportunityProduct(rs.getString(i++));
		domainObject.setQuantity((BigDecimal)rs.getObject(i++));
		domainObject.setUnit(rs.getString(i++));
		domainObject.setDays(rs.getString(i++));

		return domainObject;
	}

	@Override
	protected void removeImpl(Connection conn, VtbObject domainObject) throws SQLException, MappingException {
		throw new MappingException("Remote not valid for this type");
	}

	@Override
	protected void updateImpl(Connection conn, VtbObject anObject) throws SQLException, MappingException {
		throw new MappingException("Update not valid for this type");
	}

	public ArrayList findAll() throws MappingException {
		throw new MappingException("findAll not valid for this type");
	}

}
