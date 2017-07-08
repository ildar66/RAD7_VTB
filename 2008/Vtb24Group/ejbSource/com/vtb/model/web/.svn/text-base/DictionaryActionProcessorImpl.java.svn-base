/*
 * Created on 18.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.vtb.model.web;

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
import com.vtb.ejb.DictionaryActionProcessorFacadeLocal;
import com.vtb.ejb.DictionaryActionProcessorFacadeLocalHome;
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
import com.vtb.model.DictionaryActionProcessor;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;
import com.vtb.util.EJBClientHelper;

/**
 * @author IShafigullin
 * 
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class DictionaryActionProcessorImpl implements DictionaryActionProcessor {

	public void addDocumentGroup(DocumentGroup newDocumentGroup) throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.addDocumentGroup(newDocumentGroup);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addDocumentGroup:" + e);
			}
		}

	}

	public DocumentGroup findDocumentGroupByKey(Integer id) throws NoSuchDocumentGroupException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findDocumentGroupByKey(id);
			else
				throw new NoSuchDocumentGroupException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findDocumentGroupList(String searchStr, String orderBy) throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findDocumentGroupList(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeDocumentGroup(Integer aId) throws NoSuchDocumentGroupException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removeDocumentGroup(aId);
			else
				throw new NoSuchDocumentGroupException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateDocumentGroup(DocumentGroup aDocumentGroup) throws NoSuchDocumentGroupException, MappingException, ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.updateDocumentGroup(aDocumentGroup);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void clearInMemoryCaches() {
/*		
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.clearInMemoryCaches();
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
*/		
}

	public void addAuthorizedBody(AuthorizedBody newAuthorizedBody) throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.addAuthorizedBody(newAuthorizedBody);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addAuthorizedBody:" + e);
			}
		}

	}

	public ArrayList findAuthorizedBodies(String searchStr, String orderBy) throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findAuthorizedBodies(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public AuthorizedBody findAuthorizedBodyByKey(Integer id) throws NoSuchAuthorizedBodyException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findAuthorizedBodyByKey(id);
			else
				throw new NoSuchAuthorizedBodyException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeAuthorizedBody(Integer aId) throws NoSuchAuthorizedBodyException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removeAuthorizedBody(aId);
			else
				throw new NoSuchAuthorizedBodyException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateAuthorizedBody(AuthorizedBody aAuthorizedBody) throws NoSuchAuthorizedBodyException, MappingException, ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.updateAuthorizedBody(aAuthorizedBody);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void addPunitiveMeasure(PunitiveMeasure newPunitiveMeasure) throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.addPunitiveMeasure(newPunitiveMeasure);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addPunitiveMeasure:" + e);
			}
		}

	}

	public PunitiveMeasure findPunitiveMeasureByKey(Integer id) throws NoSuchPunitiveMeasureException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findPunitiveMeasureByKey(id);
			else
				throw new NoSuchPunitiveMeasureException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findPunitiveMeasures(String searchStr, String orderBy) throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findPunitiveMeasures(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removePunitiveMeasure(Integer aId) throws NoSuchPunitiveMeasureException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removePunitiveMeasure(aId);
			else
				throw new NoSuchPunitiveMeasureException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updatePunitiveMeasure(PunitiveMeasure aPunitiveMeasure) throws NoSuchPunitiveMeasureException, MappingException, ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.updatePunitiveMeasure(aPunitiveMeasure);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void addBaseRate(BaseRate newBaseRate) throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.addBaseRate(newBaseRate);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addPatternPaidPercent:" + e);
			}
		}
	}

	public BaseRate findBaseRateByKey(Integer id)
			throws NoSuchBaseRateException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findBaseRateByKey(id);
			else
				throw new NoSuchBaseRateException(
						"Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findBaseRates(String searchStr, String orderBy)
			throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findBaseRates(searchStr,
						orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeBaseRate(Integer aId) throws NoSuchBaseRateException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removeBaseRate(aId);
			else
				throw new NoSuchBaseRateException(
						"No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateBaseRate(BaseRate aBaseRate)
			throws NoSuchBaseRateException, MappingException, ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade
						.updateBaseRate(aBaseRate);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void addPatternPaidPercentType(
			PatternPaidPercentType newPatternPaidPercentType)
			throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade
						.addPatternPaidPercentType(newPatternPaidPercentType);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addPatternPaidPercent:" + e);
			}
		}
	}

	public PatternPaidPercentType findPatternPaidPercentTypeByKey(Integer id)
			throws NoSuchPatternPaidPercentTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findPatternPaidPercentTypeByKey(id);
			else
				throw new NoSuchPatternPaidPercentTypeException(
						"Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findPatternPaidPercentTypes(String searchStr,
			String orderBy) throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findPatternPaidPercentTypes(searchStr,
						orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removePatternPaidPercentType(Integer aId)
			throws NoSuchPatternPaidPercentTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removePatternPaidPercentType(aId);
			else
				throw new NoSuchPatternPaidPercentTypeException(
						"No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updatePatternPaidPercentType(
			PatternPaidPercentType aPatternPaidPercentType)
			throws NoSuchPatternPaidPercentTypeException, MappingException,
			ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade
						.updatePatternPaidPercentType(aPatternPaidPercentType);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void addRegion(Region newRegion) throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.addRegion(newRegion);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addRegion:" + e);
			}
		}
	}

	public Region findRegionByKey(Integer id) throws NoSuchRegionException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findRegionByKey(id);
			else
				throw new NoSuchRegionException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findRegions(String searchStr, String orderBy)
			throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findRegions(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeRegion(Integer aId) throws NoSuchRegionException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removeRegion(aId);
			else
				throw new NoSuchRegionException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateRegion(Region aRegion) throws NoSuchRegionException,
			MappingException, ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.updateRegion(aRegion);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void addIndustry(Industry newIndustry) throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.addIndustry(newIndustry);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addIndustry:" + e);
			}
		}
	}

	public ArrayList findIndustries(String searchStr, String orderBy)
			throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findIndustries(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public Industry findIndustryByKey(Integer id)
			throws NoSuchIndustryException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findIndustryByKey(id);
			else
				throw new NoSuchIndustryException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeIndustry(Integer aId) throws NoSuchIndustryException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removeIndustry(aId);
			else
				throw new NoSuchIndustryException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateIndustry(Industry aIndustry)
			throws NoSuchIndustryException, MappingException, ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.updateIndustry(aIndustry);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void addOpportunityType(OpportunityType newOpportunityType)
			throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.addOpportunityType(newOpportunityType);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addOpportunityType:" + e);
			}
		}
	}

	public OpportunityType findOpportunityTypeByKey(Integer id)
			throws NoSuchOpportunityTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findOpportunityTypeByKey(id);
			else
				throw new NoSuchOpportunityTypeException(
						"Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOpportunityTypes(String searchStr, String orderBy)
			throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findOpportunityTypes(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeOpportunityType(Integer aId)
			throws NoSuchOpportunityTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removeOpportunityType(aId);
			else
				throw new NoSuchOpportunityTypeException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateOpportunityType(OpportunityType aOpportunityType)
			throws NoSuchOpportunityTypeException, MappingException,
			ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.updateOpportunityType(aOpportunityType);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void addTargetType(TargetType newTargetType) throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.addTargetType(newTargetType);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addTargetType:" + e);
			}
		}

	}

	public TargetType findTargetTypeByKey(Integer id)
			throws NoSuchTargetTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findTargetTypeByKey(id);
			else
				throw new NoSuchTargetTypeException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findTargetTypes(String searchStr, String orderBy)
			throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findTargetTypes(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeTargetType(Integer aId) throws NoSuchTargetTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removeTargetType(aId);
			else
				throw new NoSuchTargetTypeException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateTargetType(TargetType aTargetType)
			throws NoSuchTargetTypeException, MappingException, ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.updateTargetType(aTargetType);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void addLimitType(LimitType newLimitType) throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.addLimitType(newLimitType);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addLimitType:" + e);
			}
		}

	}

	public LimitType findLimitTypeByKey(Integer id)
			throws NoSuchLimitTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findLimitTypeByKey(id);
			else
				throw new NoSuchLimitTypeException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findLimitTypes(String searchStr, String orderBy)
			throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findLimitTypes(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeLimitType(Integer aId) throws NoSuchLimitTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removeLimitType(aId);
			else
				throw new NoSuchLimitTypeException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateLimitType(LimitType aLimitType)
			throws NoSuchLimitTypeException, MappingException, ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.updateLimitType(aLimitType);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void addDocumentsType(DocumentsType newDocumentsType)
			throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.addDocumentsType(newDocumentsType);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addDocumentsType:" + e);
			}
		}

	}

	public DocumentsType findDocumentsTypeByKey(Integer id)
			throws NoSuchDocumentsTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findDocumentsTypeByKey(id);
			else
				throw new NoSuchDocumentsTypeException(
						"Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findDocumentsTypes(String searchStr, String orderBy)
			throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findDocumentsTypes(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeDocumentsType(Integer aId)
			throws NoSuchDocumentsTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removeDocumentsType(aId);
			else
				throw new NoSuchDocumentsTypeException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateDocumentsType(DocumentsType aDocumentsType)
			throws NoSuchDocumentsTypeException, MappingException,
			ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.updateDocumentsType(aDocumentsType);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void addContractorType(ContractorType newContractorType)
			throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.addContractorType(newContractorType);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addContractorType:" + e);
			}
		}

	}

	public ContractorType findContractorTypeByKey(Integer id)
			throws NoSuchContractorTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findContractorTypeByKey(id);
			else
				throw new NoSuchContractorTypeException(
						"Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findContractorTypes(String searchStr, String orderBy)
			throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findContractorTypes(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeContractorType(Integer aId)
			throws NoSuchContractorTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removeContractorType(aId);
			else
				throw new NoSuchContractorTypeException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateContractorType(ContractorType aContractorType)
			throws NoSuchContractorTypeException, MappingException,
			ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.updateContractorType(aContractorType);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public ArrayList findCommissionTypes(String searchStr, String orderBy)
			throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findCommissionTypes(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void addCommissionType(CommissionType newCommissionType)
			throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.addCommissionType(newCommissionType);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addCommissionType:" + e);
			}
		}

	}

	public CommissionType findCommissionTypeByKey(Integer id)
			throws NoSuchCommissionTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findCommissionTypeByKey(id);
			else
				throw new NoSuchCommissionTypeException(
						"Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeCommissionType(Integer aId)
			throws NoSuchCommissionTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removeCommissionType(aId);
			else
				throw new NoSuchCommissionTypeException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateCommissionType(CommissionType aCommissionType)
			throws NoSuchCommissionTypeException, MappingException,
			ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.updateCommissionType(aCommissionType);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public RatingType findRatingTypeByKey(Integer id)
			throws NoSuchRatingTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findRatingTypeByKey(id);
			else
				throw new NoSuchRatingTypeException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findRatingTypes(String searchStr, String orderBy)
			throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findRatingTypes(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void addRatingType(RatingType newRatingType) throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.addRatingType(newRatingType);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addRatingType:" + e);
			}
		}

	}

	public void removeRatingType(Integer aId) throws NoSuchRatingTypeException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removeRatingType(aId);
			else
				throw new NoSuchRatingTypeException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateRatingType(RatingType aRatingType)
			throws NoSuchRatingTypeException, MappingException, ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.updateRatingType(aRatingType);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}
	

	public void addStopFactor(StopFactor newStopFactor) throws MappingException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.addStopFactor(newStopFactor);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught in addStopFactor:" + e);
			}
		}

	}

	public ArrayList findListStopFactor(String searchStr, String orderBy) throws ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findListStopFactor(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public StopFactor findStopFactorByKey(String id) throws NoSuchStopFactorException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				return modelFacade.findStopFactorByKey(id);
			else
				throw new NoSuchStopFactorException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL,
						"Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeStopFactor(String aId) throws NoSuchStopFactorException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.removeStopFactor(aId);
			else
				throw new NoSuchStopFactorException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateStopFactor(StopFactor aStopFactor) throws NoSuchStopFactorException, MappingException, ModelException {
		DictionaryActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getDictionaryFacade();
			if (modelFacade != null)
				modelFacade.updateStopFactor(aStopFactor);
			else
				throw new MappingException("No Facade Found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}	

	/**
	 * Access (create) an instance of the DictionaryActionProcessorFacade
	 * 
	 * @returns a new Dictionary session facade bean
	 */
	protected DictionaryActionProcessorFacadeLocal getDictionaryFacade() {
		try {
			return ((DictionaryActionProcessorFacadeLocalHome) EJBClientHelper
					.getLocalHome("DictionaryActionProcessorLocal")).create();
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught " + e);
			return null;
		}
	}

}
