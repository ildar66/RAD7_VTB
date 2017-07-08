package com.vtb.command;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.ejb.NoSuchEntityException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


import com.vtb.custom.LoaderFromCRM;
import com.vtb.domain.SpoAccount;
import com.vtb.domain.SpoHistory;
import com.vtb.domain.SpoOpportunity;
import com.vtb.domain.SpoOpportunityProduct;
import com.vtb.exception.ModelException;
import com.vtb.mapping.Mapper;
import com.vtb.mapping.MapperFactory;
import com.vtb.mapping.SpoOpportunityMapper;
import com.vtb.mapping.jdbc.JDBCMapperCRM;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;


public class LoaderFromCRMCommand implements Command {

	private final static String SEQUENCE_TYPE_APPLICATION = "Application";
	private final static String SEQUENCE_TYPE_CRM_HISTORY = "CRMHistory";
	
	private final static String SEQUENCE_EJB = "java:comp/env/ejb/SequenceGenerator";
	
	private final static String PUP_CONFIG_PARAM_ADMIN = "ADMINISTRATOR";
	private final static String PUP_EJB = "java:comp/env/ejb/DBFlexWorkflow";
	
	private final static String PUP_PROCESS_NAME_CREDITGO = "Сделка в рамках лимита в ГО";
	private final static String PUP_PROCESS_NAME_CREDITFILIAL = "Сделка в рамках только Филиала";
	private final static String PUP_PROCESS_NAME_LIMITGO = "Лимит в ГО";
	private final static String PUP_PROCESS_NAME_LIMITFILIAL = "Лимит в рамках только Филиала";
	
	private final static String PUP_PROCESS_VALUE_TYPE_LIMIT = "Установление кредитного лимита";
	private final static String PUP_PROCESS_VALUE_TYPE_CREDIT = "Сделка в рамках имеющегося лимита";
	
	private final static String PUP_PROCESS_NAME_TYPE_PERIOD = "Дней";
	
	private final static String PUP_PROCESS_PARAM_OPPORTUNITY_TYPE = "Тип кредитной заявки";
	private final static String PUP_PROCESS_PARAM_QUANTITY = "Сумма лимита";
	private final static String PUP_PROCESS_PARAM_QUANTITY_TYPE = "Валюта";
	private final static String PUP_PROCESS_PARAM_PERIOD = "Срок действия лимита";
	private final static String PUP_PROCESS_PARAM_PERIODTYPE = "Тип срока действия";
	private final static String PUP_PROCESS_PARAM_REGION = "Инициирующее подразделение";
	private final static String PUP_PROCESS_PARAM_MANAGER = "Менеджер сделки";
	private final static String PUP_PROCESS_PARAM_OPPORTUNITY_NUM = "Заявка №";
	//private final static String PUP_PROCESS_PARAM_CONTRACTORS_SPO_ID = "IDSPO_Контрагенты";
	private final static String PUP_PROCESS_PARAM_CONTRACTORS_CRM_ID = "IDCRM_Контрагенты";
	//private final static String PUP_PROCESS_PARAM_CONTRACTORS_SPO_NAME = "SPO_Контрагенты";
	private final static String PUP_PROCESS_PARAM_CONTRACTORS_CRM_NAME = "CRM_Контрагенты";
	private final static String PUP_PROCESS_PARAM_OPPORTUNITY_ID = "IDCRM_Заявка";
	
	/*private SequenceLocal nextIdApplication = null;
	private SequenceLocal nextIdCRMHistory = null;
	
	private long idApplication = 0;
	private long idCRMHistory = 0;*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void execute() throws ModelException {
		AppService.log(TraceCapable.INFO_LEVEL, "------START executeCommand from CRM !!!---------------");
		SpoOpportunity spoOpportunity = getNextSpoOpportunity();
		if (spoOpportunity != null) {			
			setAccessStatusForSpoOpportunity(spoOpportunity);
			AppService.log(TraceCapable.INFO_LEVEL, "LoaderFromCRMCommand execute: setAccessStatusForSpoOpportunity success");
			
			//Писать в FB_SPO_HISTORY будет PUP
			//insertSpoHistory(spoOpportunity);
			//AppService.log(TraceCapable.INFO_LEVEL, "LoaderFromCRMCommand execute: insertSpoHistory success");
			
			LoaderFromCRM to = getDataFromCRM(spoOpportunity);
			AppService.log(TraceCapable.INFO_LEVEL, "LoaderFromCRMCommand execute: getDataFromCRM success");
			
			//setDataInSPO(to);
			//AppService.log(TraceCapable.INFO_LEVEL, "LoaderFromCRMCommand execute: setDataInSPO success");
		}
		AppService.log(TraceCapable.INFO_LEVEL, "------------END executeCommand from CRM !!!------------");
	}

	/**
	 * 
	 */
	private void setDataInSPO(LoaderFromCRM aTO) throws ModelException {}
	

	/**
	 * 
	 */
	private LoaderFromCRM getDataFromCRM(SpoOpportunity spoOpportunity) throws ModelException {
		try {
			//init SpoAccount:
			Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(SpoAccount.class);
			
			AppService.log(TraceCapable.INFO_LEVEL, "getDataFromCRM: AccountID =" + spoOpportunity.getAccountID().trim());
			
			SpoAccount acc = (SpoAccount) mapper.findByPrimaryKey(new SpoAccount(spoOpportunity
					.getAccountID()));
			AppService.log(TraceCapable.INFO_LEVEL, "getDataFromCRM: acc =" + acc);
			//init SpoProduct:
			//mapper = MapperFactory.getSystemMapperFactory().getMapper(SpoOpportunityProduct.class);
			
			//AppService.log(TraceCapable.INFO_LEVEL, "getDataFromCRM: OpportunityID =" + spoOpportunity.getOpportunityID());
			
			//SpoOpportunityProduct product = (SpoOpportunityProduct) mapper.findByPrimaryKey(new SpoOpportunityProduct(spoOpportunity.getOpportunityID().trim()));
			//AppService.log(TraceCapable.INFO_LEVEL, "getDataFromCRM: product =" + product);
			//return LoaderFromCRM vo:
			LoaderFromCRM retVO = new LoaderFromCRM(spoOpportunity);
			retVO.setAccountVO(acc);
			//retVO.setProductVO(product);
			return retVO;
		} catch (Exception e) {
			e.printStackTrace();
			throw new ModelException(e, ("Exception caught in getDataFromCRM " + e));
		}
	}

	/**
	 * @param spoOpportunity
	 * @throws ModelException
	 */
	private void insertSpoHistory(SpoOpportunity spoOpportunity) throws ModelException {
		//String aID = String.valueOf(SequenceGeneratorHelper.getNextId(SEQUENCE_TYPE_CRM_HISTORY));
		String aID = String.valueOf(System.currentTimeMillis()).substring(1);//TODO Заменить на генератор.
		SpoHistory spoHistory = new SpoHistory(aID, "spoExpert", spoOpportunity.getId(), "spostep", new Date(System
				.currentTimeMillis()));
		try {
			Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(SpoHistory.class);
			mapper.insert(spoHistory);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ModelException(e, ("Exception caught in SpoHistoryMapper.update " + e));
		}
	}

	/**
	 * @param spoOpportunity
	 * @throws ModelException
	 */
	private void setAccessStatusForSpoOpportunity(SpoOpportunity spoOpportunity) throws ModelException {
		AppService.log(TraceCapable.INFO_LEVEL, "setAccessStatusForSpoOpportunity: beginning...");
		
		//final String _storeString = "UPDATE "
		//	+ "sysdba.FB_SPO_OPPORTUNITY@CRM_LINK  SET SPOACCEPT = ?, SPOACCEPTDATE = ?  WHERE FB_SPO_OPPORTUNITYID = ?";
		
		//final String _storeString = "UPDATE "
		//	+ "sysdba.FB_SPO_OPPORTUNITY  SET SPOACCEPT = ?, SPOACCEPTDATE = ?  WHERE FB_SPO_OPPORTUNITYID = ?";
		
		/*Connection conn = null;
		PreparedStatement stmn = null;
		try {
			InitialContext ctx = new InitialContext();
		    DataSource ds = (DataSource)ctx.lookup("jdbc/LOANS");
		    conn = ds.getConnection();
		    
		    AppService.log(TraceCapable.INFO_LEVEL, "setAccessStatusForSpoOpportunity: get connection autocommit: " + conn.getAutoCommit());
		    
		    stmn = conn.prepareStatement(_storeString);	
		    stmn.setObject(1, "1");
		    stmn.setObject(2, new Date(System.currentTimeMillis()));
		    stmn.setObject(3, spoOpportunity.getId());
		    
		    AppService.log(TraceCapable.INFO_LEVEL, "setAccessStatusForSpoOpportunity: spoOpportunity id = " + spoOpportunity.getId());
		    
		    stmn.executeUpdate();
		    //conn.commit();
		    AppService.log(TraceCapable.INFO_LEVEL, "setAccessStatusForSpoOpportunity: update query");
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "setAccessStatusForSpoOpportunity: error");
			e.printStackTrace();
		} finally {
			try {
				if (stmn != null)
					stmn.close();
				if (conn != null) 
					conn.close();
			} catch (Exception e) {
				
			}
		}*/
		
		
		spoOpportunity.setSpoAccept(SpoOpportunity.SPO_ACCEPT_OK);
		spoOpportunity.setSpoAcceptDate(new Date(System.currentTimeMillis()));
		SpoOpportunityMapper mapper = null;
		try {
			mapper = (SpoOpportunityMapper) MapperFactory.getSystemMapperFactory().getMapper(SpoOpportunity.class);
			mapper.update(spoOpportunity);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "setAccessStatusForSpoOpportunity: error " + e.getMessage());
			e.printStackTrace();
			throw new ModelException(e, ("Exception caught in SpoOpportunityMapper.update " + e));
		}
		
		AppService.log(TraceCapable.INFO_LEVEL, "setAccessStatusForSpoOpportunity: success");
	}

	/**
	 * @throws ModelException
	 */
	private SpoOpportunity getNextSpoOpportunity() throws ModelException {
		ArrayList list = null;
		SpoOpportunityMapper mapper = null;
		SpoOpportunity retValue = null;
		try {
			mapper = (SpoOpportunityMapper) MapperFactory.getSystemMapperFactory().getMapper(SpoOpportunity.class);
			list = mapper.findByFilter(SpoOpportunity.SPO_ACCEPT_OK, SpoOpportunity.SPO_SEND_OK, "spoSendDate");
		} catch (Exception e) {
			e.printStackTrace();
			throw new ModelException(e, ("Exception caught in SpoOpportunityMapper.findByFilter " + e));
		}
		AppService.log(TraceCapable.INFO_LEVEL, "getNextSpoOpportunity: listSpoOpportunity.size() =" + list.size());
		if (list != null && list.size() > 0) {
			retValue = (SpoOpportunity) list.get(0);
			AppService.log(TraceCapable.INFO_LEVEL, "getNextSpoOpportunity: listSpoOpportunity[0] =" + retValue);
		}
		return retValue;
	}

}
