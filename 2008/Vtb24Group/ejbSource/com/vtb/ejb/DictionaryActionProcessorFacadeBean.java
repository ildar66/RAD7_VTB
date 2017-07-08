package com.vtb.ejb;

import java.util.ArrayList;

import com.vtb.domain.AuthorizedBody;
import com.vtb.domain.BaseRate;
import com.vtb.domain.CommissionType;
import com.vtb.domain.ContractorType;
import com.vtb.domain.DocumentGroup;
import com.vtb.domain.DocumentsType;
import com.vtb.domain.Industry;
import com.vtb.domain.LimitType;
import com.vtb.domain.OpportunityType;
import com.vtb.domain.PatternPaidPercentType;
import com.vtb.domain.PunitiveMeasure;
import com.vtb.domain.RatingType;
import com.vtb.domain.Region;
import com.vtb.domain.StopFactor;
import com.vtb.domain.TargetType;
import com.vtb.exception.MappingException;
import com.vtb.exception.ModelException;
import com.vtb.exception.NoSuchAuthorizedBodyException;
import com.vtb.exception.NoSuchBaseRateException;
import com.vtb.exception.NoSuchCommissionTypeException;
import com.vtb.exception.NoSuchContractorTypeException;
import com.vtb.exception.NoSuchDocumentGroupException;
import com.vtb.exception.NoSuchDocumentsTypeException;
import com.vtb.exception.NoSuchIndustryException;
import com.vtb.exception.NoSuchLimitTypeException;
import com.vtb.exception.NoSuchOpportunityTypeException;
import com.vtb.exception.NoSuchPatternPaidPercentTypeException;
import com.vtb.exception.NoSuchPunitiveMeasureException;
import com.vtb.exception.NoSuchRatingTypeException;
import com.vtb.exception.NoSuchRegionException;
import com.vtb.exception.NoSuchStopFactorException;
import com.vtb.exception.NoSuchTargetTypeException;
import com.vtb.mapping.AuthorizedBodyMapper;
import com.vtb.mapping.BaseRateMapper;
import com.vtb.mapping.CommissionTypeMapper;
import com.vtb.mapping.ContractorTypeMapper;
import com.vtb.mapping.DocumentGroupMapper;
import com.vtb.mapping.DocumentsTypeMapper;
import com.vtb.mapping.IndustryMapper;
import com.vtb.mapping.LimitTypeMapper;
import com.vtb.mapping.Mapper;
import com.vtb.mapping.MapperFactory;
import com.vtb.mapping.OpportunityTypeMapper;
import com.vtb.mapping.PatternPaidPercentTypeMapper;
import com.vtb.mapping.PunitiveMeasureMapper;
import com.vtb.mapping.RatingTypeMapper;
import com.vtb.mapping.RegionMapper;
import com.vtb.mapping.StopFactorMapper;
import com.vtb.mapping.TargetTypeMapper;
import com.vtb.model.DictionaryActionProcessor;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;

/**
 * Bean implementation class for Enterprise Bean:
 * DictionaryActionProcessorFacade
 */
public class DictionaryActionProcessorFacadeBean implements
		javax.ejb.SessionBean {

	static final long serialVersionUID = 3206093459760846163L;

	private javax.ejb.SessionContext mySessionCtx;

	/**
	 * getSessionContext
	 */
	public javax.ejb.SessionContext getSessionContext() {
		return mySessionCtx;
	}

	/**
	 * setSessionContext
	 */
	public void setSessionContext(javax.ejb.SessionContext ctx) {
		mySessionCtx = ctx;
	}

	/**
	 * ejbCreate
	 */
	public void ejbCreate() throws javax.ejb.CreateException {
	}

	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}

	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}

	/**
	 * ejbRemove
	 */
	public void ejbRemove() {
	}

	/**
	 * @see DictionaryActionProcessor#findOpportunityTypes(String
	 *      nameOpportunityType, String orderBy)
	 */
	public ArrayList findOpportunityTypes(String nameOpportunityType,
			String orderBy) throws ModelException {
		ArrayList list = null;
		OpportunityTypeMapper mapper = null;
		try {
			mapper = (OpportunityTypeMapper) MapperFactory
					.getSystemMapperFactory().getMapper(OpportunityType.class);
			list = mapper.findByName(nameOpportunityType, orderBy);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for OpportunityType: Exception caught in SystemMapper findOpportunityTypesByName "
									+ e);
			try {
				mapper = (OpportunityTypeMapper) MapperFactory
						.getReserveMapperFactory().getMapper(
								OpportunityType.class);
				list = mapper.findByName(nameOpportunityType, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(
						eReserve,
						("MappingException caught in findOpportunityTypesByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findOpportunityTypeByKey(String)
	 */
	public OpportunityType findOpportunityTypeByKey(Integer aId)
			throws NoSuchOpportunityTypeException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					OpportunityType.class);
			return (OpportunityType) mapper.findByPrimaryKey(new OpportunityType(aId));
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for OpportunityType: Exception caught in SystemMapper findOpportunityTypeByKey "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						OpportunityType.class);
				return (OpportunityType) mapper
						.findByPrimaryKey(new OpportunityType(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchOpportunityTypeException)
					throw (NoSuchOpportunityTypeException) nsoe;
				else
					throw new NoSuchOpportunityTypeException(nsoe,
							("Exception caught in findOpportunityTypeByKey:" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#addOpportunityType(OpportunityType)
	 */
	public void addOpportunityType(OpportunityType newOpportunityType) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					OpportunityType.class);
			mapper.insert(newOpportunityType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for OpportunityType: Exception caught in SystemMapper addOpportunityType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					OpportunityType.class);
			mapper.insert(newOpportunityType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#updateOpportunityType(OpportunityType)
	 */
	public void updateOpportunityType(OpportunityType aOpportunityType)
			throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					OpportunityType.class);
			mapper.update(aOpportunityType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for OpportunityType: Exception caught in SystemMapper updateOpportunityType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					OpportunityType.class);
			mapper.update(aOpportunityType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#removeOpportunityType(String)
	 */
	public void removeOpportunityType(Integer aId) throws NoSuchOpportunityTypeException {
		Mapper mapper = null;
		OpportunityType emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					OpportunityType.class);
			emp = (OpportunityType) mapper.findByPrimaryKey(new OpportunityType(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for OpportunityType: Exception caught in SystemMapper removeOpportunityType "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						OpportunityType.class);
				emp = (OpportunityType) mapper.findByPrimaryKey(new OpportunityType(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchOpportunityTypeException)
					throw (NoSuchOpportunityTypeException) nsoe;
				else
					throw new NoSuchOpportunityTypeException(nsoe,
							("Exception caught in removeOpportunityType" + nsoe
									.getMessage()));
			}
		}
	}
	
	/**
	 * @see DictionaryActionProcessor#findBaseRates(String nameBaseRate,
	 *      String orderBy)
	 */
	public ArrayList findBaseRates(String nameBaseRate, String orderBy)
			throws ModelException {
		ArrayList list = null;
		BaseRateMapper mapper = null;
		try {
			mapper = (BaseRateMapper) MapperFactory.getSystemMapperFactory()
					.getMapper(BaseRate.class);
			list = mapper.findByName(nameBaseRate, orderBy);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for BaseRate: Exception caught in SystemMapper findBaseRatesByName "
									+ e);
			try {
				mapper = (BaseRateMapper) MapperFactory
						.getReserveMapperFactory().getMapper(BaseRate.class);
				list = mapper.findByName(nameBaseRate, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(
						eReserve,
						("MappingException caught in findBaseRatesByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findBaseRateByKey(String)
	 */
	public BaseRate findBaseRateByKey(Integer aId)
			throws NoSuchBaseRateException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					BaseRate.class);
			return (BaseRate) mapper.findByPrimaryKey(new BaseRate(aId));
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for BaseRate: Exception caught in SystemMapper findBaseRateByKey "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						BaseRate.class);
				return (BaseRate) mapper
						.findByPrimaryKey(new BaseRate(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchBaseRateException)
					throw (NoSuchBaseRateException) nsoe;
				else
					throw new NoSuchBaseRateException(nsoe,
							("Exception caught in findBaseRateByKey:" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#addBaseRate(BaseRate)
	 */
	public void addBaseRate(BaseRate newBaseRate) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					BaseRate.class);
			mapper.insert(newBaseRate);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for BaseRate: Exception caught in SystemMapper addBaseRate "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					BaseRate.class);
			mapper.insert(newBaseRate);
		}
	}

	/**
	 * @see DictionaryActionProcessor#updateBaseRate(BaseRate)
	 */
	public void updateBaseRate(BaseRate aBaseRate)
			throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					BaseRate.class);
			mapper.update(aBaseRate);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for BaseRate: Exception caught in SystemMapper updateBaseRate "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					BaseRate.class);
			mapper.update(aBaseRate);
		}
	}

	/**
	 * @see DictionaryActionProcessor#removeBaseRate(String)
	 */
	public void removeBaseRate(Integer aId) throws NoSuchBaseRateException {
		Mapper mapper = null;
		BaseRate emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					BaseRate.class);
			emp = (BaseRate) mapper.findByPrimaryKey(new BaseRate(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for BaseRate: Exception caught in SystemMapper removeBaseRate "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						BaseRate.class);
				emp = (BaseRate) mapper.findByPrimaryKey(new BaseRate(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchBaseRateException)
					throw (NoSuchBaseRateException) nsoe;
				else
					throw new NoSuchBaseRateException(nsoe,
							("Exception caught in removeBaseRate" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#findCommissionTypes(String
	 *      nameCommissionType, String orderBy)
	 */
	public ArrayList findCommissionTypes(String nameCommissionType,
			String orderBy) throws ModelException {
		ArrayList list = null;
		CommissionTypeMapper mapper = null;
		try {
			mapper = (CommissionTypeMapper) MapperFactory
					.getSystemMapperFactory().getMapper(CommissionType.class);
			list = mapper.findByName(nameCommissionType, orderBy);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for CommissionType: Exception caught in SystemMapper findCommissionTypesByName "
									+ e);
			try {
				mapper = (CommissionTypeMapper) MapperFactory
						.getReserveMapperFactory().getMapper(
								CommissionType.class);
				list = mapper.findByName(nameCommissionType, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(
						eReserve,
						("MappingException caught in findCommissionTypesByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findCommissionTypeByKey(String)
	 */
	public CommissionType findCommissionTypeByKey(Integer aId)
			throws NoSuchCommissionTypeException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					CommissionType.class);
			return (CommissionType) mapper.findByPrimaryKey(new CommissionType(aId));
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for CommissionType: Exception caught in SystemMapper findCommissionTypeByKey "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						CommissionType.class);
				return (CommissionType) mapper
						.findByPrimaryKey(new CommissionType(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchCommissionTypeException)
					throw (NoSuchCommissionTypeException) nsoe;
				else
					throw new NoSuchCommissionTypeException(nsoe,
							("Exception caught in findCommissionTypeByKey:" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#addCommissionType(CommissionType)
	 */
	public void addCommissionType(CommissionType newCommissionType) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					CommissionType.class);
			mapper.insert(newCommissionType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for CommissionType: Exception caught in SystemMapper addCommissionType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					CommissionType.class);
			mapper.insert(newCommissionType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#updateCommissionType(CommissionType)
	 */
	public void updateCommissionType(CommissionType aCommissionType)
			throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					CommissionType.class);
			mapper.update(aCommissionType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for CommissionType: Exception caught in SystemMapper updateCommissionType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					CommissionType.class);
			mapper.update(aCommissionType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#removeCommissionType(String)
	 */
	public void removeCommissionType(Integer aId) throws NoSuchCommissionTypeException {
		Mapper mapper = null;
		CommissionType emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					CommissionType.class);
			emp = (CommissionType) mapper.findByPrimaryKey(new CommissionType(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for CommissionType: Exception caught in SystemMapper removeCommissionType "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						CommissionType.class);
				emp = (CommissionType) mapper.findByPrimaryKey(new CommissionType(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchCommissionTypeException)
					throw (NoSuchCommissionTypeException) nsoe;
				else
					throw new NoSuchCommissionTypeException(nsoe,
							("Exception caught in removeCommissionType" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#findContractorTypes(String nameContractorType,
	 *      String orderBy)
	 */
	public ArrayList findContractorTypes(String nameContractorType, String orderBy)
			throws ModelException {
		ArrayList list = null;
		ContractorTypeMapper mapper = null;
		try {
			mapper = (ContractorTypeMapper) MapperFactory.getSystemMapperFactory()
					.getMapper(ContractorType.class);
			list = mapper.findByName(nameContractorType, orderBy);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for ContractorType: Exception caught in SystemMapper findContractorTypesByName "
									+ e);
			try {
				mapper = (ContractorTypeMapper) MapperFactory
						.getReserveMapperFactory().getMapper(ContractorType.class);
				list = mapper.findByName(nameContractorType, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(
						eReserve,
						("MappingException caught in findContractorTypesByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findContractorTypeByKey(String)
	 */
	public ContractorType findContractorTypeByKey(Integer aId)
			throws NoSuchContractorTypeException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					ContractorType.class);
			return (ContractorType) mapper.findByPrimaryKey(new ContractorType(aId));
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for ContractorType: Exception caught in SystemMapper findContractorTypeByKey "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						ContractorType.class);
				return (ContractorType) mapper
						.findByPrimaryKey(new ContractorType(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchContractorTypeException)
					throw (NoSuchContractorTypeException) nsoe;
				else
					throw new NoSuchContractorTypeException(nsoe,
							("Exception caught in findContractorTypeByKey:" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#addContractorType(ContractorType)
	 */
	public void addContractorType(ContractorType newContractorType) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					ContractorType.class);
			mapper.insert(newContractorType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for ContractorType: Exception caught in SystemMapper addContractorType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					ContractorType.class);
			mapper.insert(newContractorType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#updateContractorType(ContractorType)
	 */
	public void updateContractorType(ContractorType aContractorType)
			throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					ContractorType.class);
			mapper.update(aContractorType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for ContractorType: Exception caught in SystemMapper updateContractorType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					ContractorType.class);
			mapper.update(aContractorType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#removeContractorType(String)
	 */
	public void removeContractorType(Integer aId) throws NoSuchContractorTypeException {
		Mapper mapper = null;
		ContractorType emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					ContractorType.class);
			emp = (ContractorType) mapper.findByPrimaryKey(new ContractorType(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for ContractorType: Exception caught in SystemMapper removeContractorType "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						ContractorType.class);
				emp = (ContractorType) mapper.findByPrimaryKey(new ContractorType(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchContractorTypeException)
					throw (NoSuchContractorTypeException) nsoe;
				else
					throw new NoSuchContractorTypeException(nsoe,
							("Exception caught in removeContractorType" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#findDocumentsTypes(String nameDocumentsType,
	 *      String orderBy)
	 */
	public ArrayList findDocumentsTypes(String nameDocumentsType, String orderBy)
			throws ModelException {
		ArrayList list = null;
		DocumentsTypeMapper mapper = null;
		try {
			mapper = (DocumentsTypeMapper) MapperFactory.getSystemMapperFactory()
					.getMapper(DocumentsType.class);
			list = mapper.findByName(nameDocumentsType, orderBy);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for DocumentsType: Exception caught in SystemMapper findDocumentsTypesByName "
									+ e);
			try {
				mapper = (DocumentsTypeMapper) MapperFactory
						.getReserveMapperFactory().getMapper(DocumentsType.class);
				list = mapper.findByName(nameDocumentsType, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(
						eReserve,
						("MappingException caught in findDocumentsTypesByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findDocumentsTypeByKey(String)
	 */
	public DocumentsType findDocumentsTypeByKey(Integer aId)
			throws NoSuchDocumentsTypeException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					DocumentsType.class);
			return (DocumentsType) mapper.findByPrimaryKey(new DocumentsType(aId));
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for DocumentsType: Exception caught in SystemMapper findDocumentsTypeByKey "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						DocumentsType.class);
				return (DocumentsType) mapper
						.findByPrimaryKey(new DocumentsType(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchDocumentsTypeException)
					throw (NoSuchDocumentsTypeException) nsoe;
				else
					throw new NoSuchDocumentsTypeException(nsoe,
							("Exception caught in findDocumentsTypeByKey:" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#addDocumentsType(DocumentsType)
	 */
	public void addDocumentsType(DocumentsType newDocumentsType) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					DocumentsType.class);
			mapper.insert(newDocumentsType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for DocumentsType: Exception caught in SystemMapper addDocumentsType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					DocumentsType.class);
			mapper.insert(newDocumentsType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#updateDocumentsType(DocumentsType)
	 */
	public void updateDocumentsType(DocumentsType aDocumentsType)
			throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					DocumentsType.class);
			mapper.update(aDocumentsType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for DocumentsType: Exception caught in SystemMapper updateDocumentsType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					DocumentsType.class);
			mapper.update(aDocumentsType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#removeDocumentsType(String)
	 */
	public void removeDocumentsType(Integer aId) throws NoSuchDocumentsTypeException {
		Mapper mapper = null;
		DocumentsType emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					DocumentsType.class);
			emp = (DocumentsType) mapper.findByPrimaryKey(new DocumentsType(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for DocumentsType: Exception caught in SystemMapper removeDocumentsType "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						DocumentsType.class);
				emp = (DocumentsType) mapper.findByPrimaryKey(new DocumentsType(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchDocumentsTypeException)
					throw (NoSuchDocumentsTypeException) nsoe;
				else
					throw new NoSuchDocumentsTypeException(nsoe,
							("Exception caught in removeDocumentsType" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#findLimitTypes(String nameLimitType,
	 *      String orderBy)
	 */
	public ArrayList findLimitTypes(String nameLimitType, String orderBy)
			throws ModelException {
		ArrayList list = null;
		LimitTypeMapper mapper = null;
		try {
			mapper = (LimitTypeMapper) MapperFactory.getSystemMapperFactory()
					.getMapper(LimitType.class);
			list = mapper.findByName(nameLimitType, orderBy);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for LimitType: Exception caught in SystemMapper findLimitTypesByName "
									+ e);
			try {
				mapper = (LimitTypeMapper) MapperFactory
						.getReserveMapperFactory().getMapper(LimitType.class);
				list = mapper.findByName(nameLimitType, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(
						eReserve,
						("MappingException caught in findLimitTypesByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findLimitTypeByKey(String)
	 */
	public LimitType findLimitTypeByKey(Integer aId)
			throws NoSuchLimitTypeException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					LimitType.class);
			return (LimitType) mapper.findByPrimaryKey(new LimitType(aId));
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for LimitType: Exception caught in SystemMapper findLimitTypeByKey "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						LimitType.class);
				return (LimitType) mapper
						.findByPrimaryKey(new LimitType(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchLimitTypeException)
					throw (NoSuchLimitTypeException) nsoe;
				else
					throw new NoSuchLimitTypeException(nsoe,
							("Exception caught in findLimitTypeByKey:" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#addLimitType(LimitType)
	 */
	public void addLimitType(LimitType newLimitType) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					LimitType.class);
			mapper.insert(newLimitType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for LimitType: Exception caught in SystemMapper addLimitType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					LimitType.class);
			mapper.insert(newLimitType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#updateLimitType(LimitType)
	 */
	public void updateLimitType(LimitType aLimitType)
			throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					LimitType.class);
			mapper.update(aLimitType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for LimitType: Exception caught in SystemMapper updateLimitType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					LimitType.class);
			mapper.update(aLimitType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#removeLimitType(String)
	 */
	public void removeLimitType(Integer aId) throws NoSuchLimitTypeException {
		Mapper mapper = null;
		LimitType emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					LimitType.class);
			emp = (LimitType) mapper.findByPrimaryKey(new LimitType(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for LimitType: Exception caught in SystemMapper removeLimitType "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						LimitType.class);
				emp = (LimitType) mapper.findByPrimaryKey(new LimitType(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchLimitTypeException)
					throw (NoSuchLimitTypeException) nsoe;
				else
					throw new NoSuchLimitTypeException(nsoe,
							("Exception caught in removeLimitType" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#findTargetTypes(String nameTargetType,
	 *      String orderBy)
	 */
	public ArrayList findTargetTypes(String nameTargetType, String orderBy)
			throws ModelException {
		ArrayList list = null;
		TargetTypeMapper mapper = null;
		try {
			mapper = (TargetTypeMapper) MapperFactory.getSystemMapperFactory()
					.getMapper(TargetType.class);
			list = mapper.findByName(nameTargetType, orderBy);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for TargetType: Exception caught in SystemMapper findTargetTypesByName "
									+ e);
			try {
				mapper = (TargetTypeMapper) MapperFactory
						.getReserveMapperFactory().getMapper(TargetType.class);
				list = mapper.findByName(nameTargetType, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(
						eReserve,
						("MappingException caught in findTargetTypesByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findTargetTypeByKey(String)
	 */
	public TargetType findTargetTypeByKey(Integer aId)
			throws NoSuchTargetTypeException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					TargetType.class);
			return (TargetType) mapper.findByPrimaryKey(new TargetType(aId));
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for TargetType: Exception caught in SystemMapper findTargetTypeByKey "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						TargetType.class);
				return (TargetType) mapper
						.findByPrimaryKey(new TargetType(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchTargetTypeException)
					throw (NoSuchTargetTypeException) nsoe;
				else
					throw new NoSuchTargetTypeException(nsoe,
							("Exception caught in findTargetTypeByKey:" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#addTargetType(TargetType)
	 */
	public void addTargetType(TargetType newTargetType) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					TargetType.class);
			mapper.insert(newTargetType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for TargetType: Exception caught in SystemMapper addTargetType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					TargetType.class);
			mapper.insert(newTargetType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#updateTargetType(TargetType)
	 */
	public void updateTargetType(TargetType aTargetType)
			throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					TargetType.class);
			mapper.update(aTargetType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for TargetType: Exception caught in SystemMapper updateTargetType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					TargetType.class);
			mapper.update(aTargetType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#removeTargetType(String)
	 */
	public void removeTargetType(Integer aId) throws NoSuchTargetTypeException {
		Mapper mapper = null;
		TargetType emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					TargetType.class);
			emp = (TargetType) mapper.findByPrimaryKey(new TargetType(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for TargetType: Exception caught in SystemMapper removeTargetType "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						TargetType.class);
				emp = (TargetType) mapper.findByPrimaryKey(new TargetType(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchTargetTypeException)
					throw (NoSuchTargetTypeException) nsoe;
				else
					throw new NoSuchTargetTypeException(nsoe,
							("Exception caught in removeTargetType" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#findIndustries(String nameIndustry,
	 *      String orderBy)
	 */
	public ArrayList findIndustries(String nameIndustry, String orderBy)
			throws ModelException {
		ArrayList list = null;
		IndustryMapper mapper = null;
		try {
			mapper = (IndustryMapper) MapperFactory.getSystemMapperFactory()
					.getMapper(Industry.class);
			list = mapper.findByName(nameIndustry, orderBy);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for Industry: Exception caught in SystemMapper findIndustriesByName "
									+ e);
			try {
				mapper = (IndustryMapper) MapperFactory
						.getReserveMapperFactory().getMapper(Industry.class);
				list = mapper.findByName(nameIndustry, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(
						eReserve,
						("MappingException caught in findIndustriesByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findIndustryByKey(String)
	 */
	public Industry findIndustryByKey(Integer aId)
			throws NoSuchIndustryException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					Industry.class);
			return (Industry) mapper.findByPrimaryKey(new Industry(aId));
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for Industry: Exception caught in SystemMapper findIndustryByKey "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						Industry.class);
				return (Industry) mapper
						.findByPrimaryKey(new Industry(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchIndustryException)
					throw (NoSuchIndustryException) nsoe;
				else
					throw new NoSuchIndustryException(nsoe,
							("Exception caught in findIndustryByKey:" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#addIndustry(Industry)
	 */
	public void addIndustry(Industry newIndustry) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					Industry.class);
			mapper.insert(newIndustry);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for Industry: Exception caught in SystemMapper addIndustry "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					Industry.class);
			mapper.insert(newIndustry);
		}
	}

	/**
	 * @see DictionaryActionProcessor#updateIndustry(Industry)
	 */
	public void updateIndustry(Industry aIndustry)
			throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					Industry.class);
			mapper.update(aIndustry);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for Industry: Exception caught in SystemMapper updateIndustry "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					Industry.class);
			mapper.update(aIndustry);
		}
	}

	/**
	 * @see DictionaryActionProcessor#removeIndustry(String)
	 */
	public void removeIndustry(Integer aId) throws NoSuchIndustryException {
		Mapper mapper = null;
		Industry emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					Industry.class);
			emp = (Industry) mapper.findByPrimaryKey(new Industry(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for Industry: Exception caught in SystemMapper removeIndustry "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						Industry.class);
				emp = (Industry) mapper.findByPrimaryKey(new Industry(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchIndustryException)
					throw (NoSuchIndustryException) nsoe;
				else
					throw new NoSuchIndustryException(nsoe,
							("Exception caught in removeIndustry" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#findRegions(String nameRegion,
	 *      String orderBy)
	 */
	public ArrayList findRegions(String nameRegion, String orderBy)
			throws ModelException {
		ArrayList list = null;
		RegionMapper mapper = null;
		try {
			mapper = (RegionMapper) MapperFactory.getSystemMapperFactory()
					.getMapper(Region.class);
			list = mapper.findByName(nameRegion, orderBy);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for Region: Exception caught in SystemMapper findIndustriesByName "
									+ e);
			try {
				mapper = (RegionMapper) MapperFactory
						.getReserveMapperFactory().getMapper(Region.class);
				list = mapper.findByName(nameRegion, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(
						eReserve,
						("MappingException caught in findIndustriesByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findRegionByKey(String)
	 */
	public Region findRegionByKey(Integer aId)
			throws NoSuchRegionException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					Region.class);
			return (Region) mapper.findByPrimaryKey(new Region(aId));
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for Region: Exception caught in SystemMapper findRegionByKey "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						Region.class);
				return (Region) mapper
						.findByPrimaryKey(new Region(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchRegionException)
					throw (NoSuchRegionException) nsoe;
				else
					throw new NoSuchRegionException(nsoe,
							("Exception caught in findRegionByKey:" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#addRegion(Region)
	 */
	public void addRegion(Region newRegion) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					Region.class);
			mapper.insert(newRegion);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for Region: Exception caught in SystemMapper addRegion "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					Region.class);
			mapper.insert(newRegion);
		}
	}

	/**
	 * @see DictionaryActionProcessor#updateRegion(Region)
	 */
	public void updateRegion(Region aRegion)
			throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					Region.class);
			mapper.update(aRegion);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for Region: Exception caught in SystemMapper updateRegion "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					Region.class);
			mapper.update(aRegion);
		}
	}

	/**
	 * @see DictionaryActionProcessor#removeRegion(String)
	 */
	public void removeRegion(Integer aId) throws NoSuchRegionException {
		Mapper mapper = null;
		Region emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					Region.class);
			emp = (Region) mapper.findByPrimaryKey(new Region(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for Region: Exception caught in SystemMapper removeRegion "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						Region.class);
				emp = (Region) mapper.findByPrimaryKey(new Region(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchRegionException)
					throw (NoSuchRegionException) nsoe;
				else
					throw new NoSuchRegionException(nsoe,
							("Exception caught in removeRegion" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#findPatternPaidPercentTypes(String namePatternPaidPercentType,
	 *      String orderBy)
	 */
	public ArrayList findPatternPaidPercentTypes(String namePatternPaidPercentType, String orderBy)
			throws ModelException {
		ArrayList list = null;
		PatternPaidPercentTypeMapper mapper = null;
		try {
			mapper = (PatternPaidPercentTypeMapper) MapperFactory.getSystemMapperFactory()
					.getMapper(PatternPaidPercentType.class);
			list = mapper.findByName(namePatternPaidPercentType, orderBy);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for PatternPaidPercentType: Exception caught in SystemMapper findPatternPaidPercentTypesByName "
									+ e);
			try {
				mapper = (PatternPaidPercentTypeMapper) MapperFactory
						.getReserveMapperFactory().getMapper(PatternPaidPercentType.class);
				list = mapper.findByName(namePatternPaidPercentType, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(
						eReserve,
						("MappingException caught in findPatternPaidPercentTypesByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findPatternPaidPercentTypeByKey(String)
	 */
	public PatternPaidPercentType findPatternPaidPercentTypeByKey(Integer aId)
			throws NoSuchPatternPaidPercentTypeException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					PatternPaidPercentType.class);
			return (PatternPaidPercentType) mapper.findByPrimaryKey(new PatternPaidPercentType(aId));
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for PatternPaidPercentType: Exception caught in SystemMapper findPatternPaidPercentTypeByKey "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						PatternPaidPercentType.class);
				return (PatternPaidPercentType) mapper
						.findByPrimaryKey(new PatternPaidPercentType(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchPatternPaidPercentTypeException)
					throw (NoSuchPatternPaidPercentTypeException) nsoe;
				else
					throw new NoSuchPatternPaidPercentTypeException(nsoe,
							("Exception caught in findPatternPaidPercentTypeByKey:" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#addPatternPaidPercentType(PatternPaidPercentType)
	 */
	public void addPatternPaidPercentType(PatternPaidPercentType newPatternPaidPercentType) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					PatternPaidPercentType.class);
			mapper.insert(newPatternPaidPercentType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for PatternPaidPercentType: Exception caught in SystemMapper addPatternPaidPercentType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					PatternPaidPercentType.class);
			mapper.insert(newPatternPaidPercentType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#updatePatternPaidPercentType(PatternPaidPercentType)
	 */
	public void updatePatternPaidPercentType(PatternPaidPercentType aPatternPaidPercentType)
			throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					PatternPaidPercentType.class);
			mapper.update(aPatternPaidPercentType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for PatternPaidPercentType: Exception caught in SystemMapper updatePatternPaidPercentType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					PatternPaidPercentType.class);
			mapper.update(aPatternPaidPercentType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#removePatternPaidPercentType(String)
	 */
	public void removePatternPaidPercentType(Integer aId) throws NoSuchPatternPaidPercentTypeException {
		Mapper mapper = null;
		PatternPaidPercentType emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					PatternPaidPercentType.class);
			emp = (PatternPaidPercentType) mapper.findByPrimaryKey(new PatternPaidPercentType(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for PatternPaidPercentType: Exception caught in SystemMapper removePatternPaidPercentType "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						PatternPaidPercentType.class);
				emp = (PatternPaidPercentType) mapper.findByPrimaryKey(new PatternPaidPercentType(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchPatternPaidPercentTypeException)
					throw (NoSuchPatternPaidPercentTypeException) nsoe;
				else
					throw new NoSuchPatternPaidPercentTypeException(nsoe,
							("Exception caught in removePatternPaidPercentType" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#findRatingTypes(String nameRatingType,
	 *      String orderBy)
	 */
	public ArrayList findRatingTypes(String nameRatingType, String orderBy)
			throws ModelException {
		ArrayList list = null;
		RatingTypeMapper mapper = null;
		try {
			mapper = (RatingTypeMapper) MapperFactory.getSystemMapperFactory()
					.getMapper(RatingType.class);
			list = mapper.findByName(nameRatingType, orderBy);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for RatingType: Exception caught in SystemMapper findRatingTypesByName "
									+ e);
			try {
				mapper = (RatingTypeMapper) MapperFactory
						.getReserveMapperFactory().getMapper(RatingType.class);
				list = mapper.findByName(nameRatingType, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(
						eReserve,
						("MappingException caught in findRatingTypesByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findRatingTypeByKey(String)
	 */
	public RatingType findRatingTypeByKey(Integer aId)
			throws NoSuchRatingTypeException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					RatingType.class);
			return (RatingType) mapper.findByPrimaryKey(new RatingType(aId));
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for RatingType: Exception caught in SystemMapper findRatingTypeByKey "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						RatingType.class);
				return (RatingType) mapper
						.findByPrimaryKey(new RatingType(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchRatingTypeException)
					throw (NoSuchRatingTypeException) nsoe;
				else
					throw new NoSuchRatingTypeException(nsoe,
							("Exception caught in findRatingTypeByKey:" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#addRatingType(RatingType)
	 */
	public void addRatingType(RatingType newRatingType) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					RatingType.class);
			mapper.insert(newRatingType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for RatingType: Exception caught in SystemMapper addRatingType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					RatingType.class);
			mapper.insert(newRatingType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#updateRatingType(RatingType)
	 */
	public void updateRatingType(RatingType aRatingType)
			throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					RatingType.class);
			mapper.update(aRatingType);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for RatingType: Exception caught in SystemMapper updateRatingType "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					RatingType.class);
			mapper.update(aRatingType);
		}
	}

	/**
	 * @see DictionaryActionProcessor#removeRatingType(String)
	 */
	public void removeRatingType(Integer aId) throws NoSuchRatingTypeException {
		Mapper mapper = null;
		RatingType emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					RatingType.class);
			emp = (RatingType) mapper.findByPrimaryKey(new RatingType(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for RatingType: Exception caught in SystemMapper removeRatingType "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						RatingType.class);
				emp = (RatingType) mapper.findByPrimaryKey(new RatingType(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchRatingTypeException)
					throw (NoSuchRatingTypeException) nsoe;
				else
					throw new NoSuchRatingTypeException(nsoe,
							("Exception caught in removeRatingType" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#findPunitiveMeasures(String namePunitiveMeasure,
	 *      String orderBy)
	 */
	public ArrayList findPunitiveMeasures(String namePunitiveMeasure, String orderBy)
			throws ModelException {
		ArrayList list = null;
		PunitiveMeasureMapper mapper = null;
		try {
			mapper = (PunitiveMeasureMapper) MapperFactory.getSystemMapperFactory()
					.getMapper(PunitiveMeasure.class);
			list = mapper.findByName(namePunitiveMeasure, orderBy);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for PunitiveMeasure: Exception caught in SystemMapper findPunitiveMeasuresByName "
									+ e);
			try {
				mapper = (PunitiveMeasureMapper) MapperFactory
						.getReserveMapperFactory().getMapper(PunitiveMeasure.class);
				list = mapper.findByName(namePunitiveMeasure, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(
						eReserve,
						("MappingException caught in findPunitiveMeasuresByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findPunitiveMeasureByKey(String)
	 */
	public PunitiveMeasure findPunitiveMeasureByKey(Integer aId)
			throws NoSuchPunitiveMeasureException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					PunitiveMeasure.class);
			return (PunitiveMeasure) mapper.findByPrimaryKey(new PunitiveMeasure(aId));
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for PunitiveMeasure: Exception caught in SystemMapper findPunitiveMeasureByKey "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						PunitiveMeasure.class);
				return (PunitiveMeasure) mapper
						.findByPrimaryKey(new PunitiveMeasure(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchPunitiveMeasureException)
					throw (NoSuchPunitiveMeasureException) nsoe;
				else
					throw new NoSuchPunitiveMeasureException(nsoe,
							("Exception caught in findPunitiveMeasureByKey:" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#addPunitiveMeasure(PunitiveMeasure)
	 */
	public void addPunitiveMeasure(PunitiveMeasure newPunitiveMeasure) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					PunitiveMeasure.class);
			mapper.insert(newPunitiveMeasure);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for PunitiveMeasure: Exception caught in SystemMapper addPunitiveMeasure "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					PunitiveMeasure.class);
			mapper.insert(newPunitiveMeasure);
		}
	}

	/**
	 * @see DictionaryActionProcessor#updatePunitiveMeasure(PunitiveMeasure)
	 */
	public void updatePunitiveMeasure(PunitiveMeasure aPunitiveMeasure)
			throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					PunitiveMeasure.class);
			mapper.update(aPunitiveMeasure);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for PunitiveMeasure: Exception caught in SystemMapper updatePunitiveMeasure "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					PunitiveMeasure.class);
			mapper.update(aPunitiveMeasure);
		}
	}

	/**
	 * @see DictionaryActionProcessor#removePunitiveMeasure(String)
	 */
	public void removePunitiveMeasure(Integer aId) throws NoSuchPunitiveMeasureException {
		Mapper mapper = null;
		PunitiveMeasure emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					PunitiveMeasure.class);
			emp = (PunitiveMeasure) mapper.findByPrimaryKey(new PunitiveMeasure(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for PunitiveMeasure: Exception caught in SystemMapper removePunitiveMeasure "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						PunitiveMeasure.class);
				emp = (PunitiveMeasure) mapper.findByPrimaryKey(new PunitiveMeasure(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchPunitiveMeasureException)
					throw (NoSuchPunitiveMeasureException) nsoe;
				else
					throw new NoSuchPunitiveMeasureException(nsoe,
							("Exception caught in removePunitiveMeasure" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#findAuthorizedBodys(String nameAuthorizedBody,
	 *      String orderBy)
	 */
	public ArrayList findAuthorizedBodies(String nameAuthorizedBody, String orderBy)
			throws ModelException {
		ArrayList list = null;
		AuthorizedBodyMapper mapper = null;
		try {
			mapper = (AuthorizedBodyMapper) MapperFactory.getSystemMapperFactory()
					.getMapper(AuthorizedBody.class);
			list = mapper.findByName(nameAuthorizedBody, orderBy);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for AuthorizedBody: Exception caught in SystemMapper findAuthorizedBodysByName "
									+ e);
			try {
				mapper = (AuthorizedBodyMapper) MapperFactory
						.getReserveMapperFactory().getMapper(AuthorizedBody.class);
				list = mapper.findByName(nameAuthorizedBody, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(
						eReserve,
						("MappingException caught in findAuthorizedBodysByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findAuthorizedBodyByKey(String)
	 */
	public AuthorizedBody findAuthorizedBodyByKey(Integer aId)
			throws NoSuchAuthorizedBodyException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					AuthorizedBody.class);
			return (AuthorizedBody) mapper.findByPrimaryKey(new AuthorizedBody(aId));
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for AuthorizedBody: Exception caught in SystemMapper findAuthorizedBodyByKey "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						AuthorizedBody.class);
				return (AuthorizedBody) mapper
						.findByPrimaryKey(new AuthorizedBody(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchAuthorizedBodyException)
					throw (NoSuchAuthorizedBodyException) nsoe;
				else
					throw new NoSuchAuthorizedBodyException(nsoe,
							("Exception caught in findAuthorizedBodyByKey:" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#addAuthorizedBody(AuthorizedBody)
	 */
	public void addAuthorizedBody(AuthorizedBody newAuthorizedBody) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					AuthorizedBody.class);
			mapper.insert(newAuthorizedBody);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for AuthorizedBody: Exception caught in SystemMapper addAuthorizedBody "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					AuthorizedBody.class);
			mapper.insert(newAuthorizedBody);
		}
	}

	/**
	 * @see DictionaryActionProcessor#updateAuthorizedBody(AuthorizedBody)
	 */
	public void updateAuthorizedBody(AuthorizedBody aAuthorizedBody)
			throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					AuthorizedBody.class);
			mapper.update(aAuthorizedBody);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for AuthorizedBody: Exception caught in SystemMapper updateAuthorizedBody "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					AuthorizedBody.class);
			mapper.update(aAuthorizedBody);
		}
	}

	/**
	 * @see DictionaryActionProcessor#removeAuthorizedBody(String)
	 */
	public void removeAuthorizedBody(Integer aId) throws NoSuchAuthorizedBodyException {
		Mapper mapper = null;
		AuthorizedBody emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					AuthorizedBody.class);
			emp = (AuthorizedBody) mapper.findByPrimaryKey(new AuthorizedBody(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for AuthorizedBody: Exception caught in SystemMapper removeAuthorizedBody "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						AuthorizedBody.class);
				emp = (AuthorizedBody) mapper.findByPrimaryKey(new AuthorizedBody(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchAuthorizedBodyException)
					throw (NoSuchAuthorizedBodyException) nsoe;
				else
					throw new NoSuchAuthorizedBodyException(nsoe,
							("Exception caught in removeAuthorizedBody" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#findDocumentGroupList(String nameDocumentGroup,
	 *      String orderBy)
	 */
	public ArrayList findDocumentGroupList(String nameDocumentGroup, String orderBy)
			throws ModelException {
		ArrayList list = null;
		DocumentGroupMapper mapper = null;
		try {
			mapper = (DocumentGroupMapper) MapperFactory.getSystemMapperFactory()
					.getMapper(DocumentGroup.class);
			list = mapper.findByName(nameDocumentGroup, orderBy);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for DocumentGroup: Exception caught in SystemMapper findDocumentGroupsByName "
									+ e);
			try {
				mapper = (DocumentGroupMapper) MapperFactory
						.getReserveMapperFactory().getMapper(DocumentGroup.class);
				list = mapper.findByName(nameDocumentGroup, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(
						eReserve,
						("MappingException caught in findDocumentGroupsByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findDocumentGroupByKey(String)
	 */
	public DocumentGroup findDocumentGroupByKey(Integer aId)
			throws NoSuchDocumentGroupException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					DocumentGroup.class);
			return (DocumentGroup) mapper.findByPrimaryKey(new DocumentGroup(aId));
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for DocumentGroup: Exception caught in SystemMapper findDocumentGroupByKey "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						DocumentGroup.class);
				return (DocumentGroup) mapper
						.findByPrimaryKey(new DocumentGroup(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchDocumentGroupException)
					throw (NoSuchDocumentGroupException) nsoe;
				else
					throw new NoSuchDocumentGroupException(nsoe,
							("Exception caught in findDocumentGroupByKey:" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#addDocumentGroup(DocumentGroup)
	 */
	public void addDocumentGroup(DocumentGroup newDocumentGroup) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					DocumentGroup.class);
			mapper.insert(newDocumentGroup);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for DocumentGroup: Exception caught in SystemMapper addDocumentGroup "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					DocumentGroup.class);
			mapper.insert(newDocumentGroup);
		}
	}

	/**
	 * @see DictionaryActionProcessor#updateDocumentGroup(DocumentGroup)
	 */
	public void updateDocumentGroup(DocumentGroup aDocumentGroup)
			throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					DocumentGroup.class);
			mapper.update(aDocumentGroup);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for DocumentGroup: Exception caught in SystemMapper updateDocumentGroup "
									+ e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(
					DocumentGroup.class);
			mapper.update(aDocumentGroup);
		}
	}

	/**
	 * @see DictionaryActionProcessor#removeDocumentGroup(String)
	 */
	public void removeDocumentGroup(Integer aId) throws NoSuchDocumentGroupException {
		Mapper mapper = null;
		DocumentGroup emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(
					DocumentGroup.class);
			emp = (DocumentGroup) mapper.findByPrimaryKey(new DocumentGroup(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService
					.log(
							TraceCapable.INFO_LEVEL,
							"Include ReserveMapper for DocumentGroup: Exception caught in SystemMapper removeDocumentGroup "
									+ e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(
						DocumentGroup.class);
				emp = (DocumentGroup) mapper.findByPrimaryKey(new DocumentGroup(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchDocumentGroupException)
					throw (NoSuchDocumentGroupException) nsoe;
				else
					throw new NoSuchDocumentGroupException(nsoe,
							("Exception caught in removeDocumentGroup" + nsoe
									.getMessage()));
			}
		}
	}

	/**
	 * @see DictionaryActionProcessor#findListStopFactor(String nameStopFactor,
	 *      String orderBy)
	 */
	public ArrayList findListStopFactor(String nameStopFactor, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			StopFactorMapper mapper = (StopFactorMapper) MapperFactory.getSystemMapperFactory()
					.getMapper(StopFactor.class);
			list = mapper.findByName(nameStopFactor, orderBy);
		} catch (Exception e) {
				throw new ModelException(e,	("MappingException caught in findStopFactorsByName " + e));
		}
		return list;
	}

	/**
	 * @see DictionaryActionProcessor#findStopFactorByKey(String)
	 */
	public StopFactor findStopFactorByKey(String aId) throws NoSuchStopFactorException {
		try {
			Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(
					StopFactor.class);
			return (StopFactor) mapper.findByPrimaryKey(new StopFactor(aId));
		} catch (Exception e) {
				if (e instanceof NoSuchStopFactorException)
					throw (NoSuchStopFactorException) e;
				else
					throw new NoSuchStopFactorException(e,
							("Exception caught in findStopFactorByKey:" + e
									.getMessage()));
		}
	}

	/**
	 * @see DictionaryActionProcessor#addStopFactor(StopFactor)
	 */
	public void addStopFactor(StopFactor newStopFactor) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(StopFactor.class);
		mapper.insert(newStopFactor);
	}

	/**
	 * @see DictionaryActionProcessor#updateStopFactor(StopFactor)
	 */
	public void updateStopFactor(StopFactor aStopFactor)
			throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(StopFactor.class);
		mapper.update(aStopFactor);
	}

	/**
	 * @see DictionaryActionProcessor#removeStopFactor(String)
	 */
	public void removeStopFactor(String aId) throws NoSuchStopFactorException {
		try {
			Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(StopFactor.class);
			StopFactor vo = (StopFactor) mapper.findByPrimaryKey(new StopFactor(aId));
			mapper.remove(vo);
		} catch (Exception e) {
				if (e instanceof NoSuchStopFactorException)
					throw (NoSuchStopFactorException) e;
				else
					throw new NoSuchStopFactorException(e,	("Exception caught in removeStopFactor" + e.getMessage()));
		}
	}
	
}
