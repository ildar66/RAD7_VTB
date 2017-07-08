package com.vtb.ejb;

import java.util.ArrayList;

import com.vtb.domain.CommissionType;
import com.vtb.domain.ContractorType;
import com.vtb.domain.DocumentsType;
import com.vtb.domain.LimitType;
import com.vtb.domain.RatingType;
import com.vtb.domain.TargetType;
import com.vtb.exception.MappingException;
import com.vtb.exception.ModelException;
import com.vtb.exception.NoSuchCommissionTypeException;
import com.vtb.exception.NoSuchContractorTypeException;
import com.vtb.exception.NoSuchDocumentsTypeException;
import com.vtb.exception.NoSuchLimitTypeException;
import com.vtb.exception.NoSuchRatingTypeException;
import com.vtb.exception.NoSuchTargetTypeException;
import com.vtb.exception.NoSuchOpportunityTypeException;
import com.vtb.domain.OpportunityType;
import com.vtb.exception.NoSuchIndustryException;
import com.vtb.domain.Industry;
import com.vtb.domain.Region;
import com.vtb.exception.NoSuchRegionException;
import com.vtb.domain.PatternPaidPercentType;
import com.vtb.exception.NoSuchPatternPaidPercentTypeException;
import com.vtb.domain.BaseRate;
import com.vtb.exception.NoSuchBaseRateException;
import com.vtb.exception.NoSuchPunitiveMeasureException;
import com.vtb.domain.PunitiveMeasure;
import com.vtb.domain.AuthorizedBody;
import com.vtb.exception.NoSuchAuthorizedBodyException;
import com.vtb.exception.NoSuchDocumentGroupException;
import com.vtb.domain.DocumentGroup;
import com.vtb.domain.StopFactor;
import com.vtb.exception.NoSuchStopFactorException;

/**
 * Local interface for Enterprise Bean: DictionaryActionProcessorFacade
 */
public interface DictionaryActionProcessorFacadeLocal
	extends
		javax.ejb.EJBLocalObject {

	/**
	 * @param nameRatingType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findRatingTypes(String nameRatingType, String orderBy) throws ModelException;

	/**
	 * @param nameCommissionType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findCommissionTypes(String nameCommissionType, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchRatingTypeException
	 */
	public RatingType findRatingTypeByKey(Integer aId) throws NoSuchRatingTypeException;

	/**
	 * @param newRatingType
	 * @throws MappingException
	 */
	public void addRatingType(RatingType newRatingType) throws MappingException;

	/**
	 * @param aRatingType
	 * @throws MappingException
	 */
	public void updateRatingType(RatingType aRatingType) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchRatingTypeException
	 */
	public void removeRatingType(Integer aId) throws NoSuchRatingTypeException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchCommissionTypeException
	 */
	public CommissionType findCommissionTypeByKey(Integer aId) throws NoSuchCommissionTypeException;

	/**
	 * @param newCommissionType
	 * @throws MappingException
	 */
	public void addCommissionType(CommissionType newCommissionType) throws MappingException;

	/**
	 * @param aCommissionType
	 * @throws MappingException
	 */
	public void updateCommissionType(CommissionType aCommissionType) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchCommissionTypeException
	 */
	public void removeCommissionType(Integer aId) throws NoSuchCommissionTypeException;

	/**
	 * @param nameContractorType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findContractorTypes(String nameContractorType, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchContractorTypeException
	 */
	public ContractorType findContractorTypeByKey(Integer aId) throws NoSuchContractorTypeException;

	/**
	 * @param newContractorType
	 * @throws MappingException
	 */
	public void addContractorType(ContractorType newContractorType) throws MappingException;

	/**
	 * @param aContractorType
	 * @throws MappingException
	 */
	public void updateContractorType(ContractorType aContractorType) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchContractorTypeException
	 */
	public void removeContractorType(Integer aId) throws NoSuchContractorTypeException;

	/**
	 * @param nameDocumentsType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findDocumentsTypes(String nameDocumentsType, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchDocumentsTypeException
	 */
	public DocumentsType findDocumentsTypeByKey(Integer aId) throws NoSuchDocumentsTypeException;

	/**
	 * @param newDocumentsType
	 * @throws MappingException
	 */
	public void addDocumentsType(DocumentsType newDocumentsType) throws MappingException;

	/**
	 * @param aDocumentsType
	 * @throws MappingException
	 */
	public void updateDocumentsType(DocumentsType aDocumentsType) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchDocumentsTypeException
	 */
	public void removeDocumentsType(Integer aId) throws NoSuchDocumentsTypeException;

	/**
	 * @param nameLimitType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findLimitTypes(String nameLimitType, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchLimitTypeException
	 */
	public LimitType findLimitTypeByKey(Integer aId) throws NoSuchLimitTypeException;

	/**
	 * @param newLimitType
	 * @throws MappingException
	 */
	public void addLimitType(LimitType newLimitType) throws MappingException;

	/**
	 * @param aLimitType
	 * @throws MappingException
	 */
	public void updateLimitType(LimitType aLimitType) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchLimitTypeException
	 */
	public void removeLimitType(Integer aId) throws NoSuchLimitTypeException;

	/**
	 * @param nameTargetType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findTargetTypes(String nameTargetType, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchTargetTypeException
	 */
	public TargetType findTargetTypeByKey(Integer aId) throws NoSuchTargetTypeException;

	/**
	 * @param newTargetType
	 * @throws MappingException
	 */
	public void addTargetType(TargetType newTargetType) throws MappingException;

	/**
	 * @param aTargetType
	 * @throws MappingException
	 */
	public void updateTargetType(TargetType aTargetType) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchTargetTypeException
	 */
	public void removeTargetType(Integer aId) throws NoSuchTargetTypeException;

	/**
	 * @param nameOpportunityType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOpportunityTypes(String nameOpportunityType, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchOpportunityTypeException
	 */
	public OpportunityType findOpportunityTypeByKey(Integer aId) throws NoSuchOpportunityTypeException;

	/**
	 * @param newOpportunityType
	 * @throws MappingException
	 */
	public void addOpportunityType(OpportunityType newOpportunityType) throws MappingException;

	/**
	 * @param aOpportunityType
	 * @throws MappingException
	 */
	public void updateOpportunityType(OpportunityType aOpportunityType) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchOpportunityTypeException
	 */
	public void removeOpportunityType(Integer aId) throws NoSuchOpportunityTypeException;

	/**
	 * @param nameIndustry
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findIndustries(String nameIndustry, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchIndustryException
	 */
	public Industry findIndustryByKey(Integer aId) throws NoSuchIndustryException;

	/**
	 * @param newIndustry
	 * @throws MappingException
	 */
	public void addIndustry(Industry newIndustry) throws MappingException;

	/**
	 * @param aIndustry
	 * @throws MappingException
	 */
	public void updateIndustry(Industry aIndustry) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchIndustryException
	 */
	public void removeIndustry(Integer aId) throws NoSuchIndustryException;

	/**
	 * @param nameRegion
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findRegions(String nameRegion, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchRegionException
	 */
	public Region findRegionByKey(Integer aId) throws NoSuchRegionException;

	/**
	 * @param newRegion
	 * @throws MappingException
	 */
	public void addRegion(Region newRegion) throws MappingException;

	/**
	 * @param aRegion
	 * @throws MappingException
	 */
	public void updateRegion(Region aRegion) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchRegionException
	 */
	public void removeRegion(Integer aId) throws NoSuchRegionException;

	/**
	 * @param namePatternPaidPercentType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findPatternPaidPercentTypes(String namePatternPaidPercentType, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchPatternPaidPercentTypeException
	 */
	public PatternPaidPercentType findPatternPaidPercentTypeByKey(Integer aId) throws NoSuchPatternPaidPercentTypeException;

	/**
	 * @param newPatternPaidPercentType
	 * @throws MappingException
	 */
	public void addPatternPaidPercentType(PatternPaidPercentType newPatternPaidPercentType) throws MappingException;

	/**
	 * @param aPatternPaidPercentType
	 * @throws MappingException
	 */
	public void updatePatternPaidPercentType(PatternPaidPercentType aPatternPaidPercentType) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchPatternPaidPercentTypeException
	 */
	public void removePatternPaidPercentType(Integer aId) throws NoSuchPatternPaidPercentTypeException;

	/**
	 * @param nameBaseRate
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findBaseRates(String nameBaseRate, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchBaseRateException
	 */
	public BaseRate findBaseRateByKey(Integer aId) throws NoSuchBaseRateException;

	/**
	 * @param newBaseRate
	 * @throws MappingException
	 */
	public void addBaseRate(BaseRate newBaseRate) throws MappingException;

	/**
	 * @param aBaseRate
	 * @throws MappingException
	 */
	public void updateBaseRate(BaseRate aBaseRate) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchBaseRateException
	 */
	public void removeBaseRate(Integer aId) throws NoSuchBaseRateException;

	/**
	 * @param namePunitiveMeasure
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findPunitiveMeasures(String namePunitiveMeasure, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchPunitiveMeasureException
	 */
	public PunitiveMeasure findPunitiveMeasureByKey(Integer aId) throws NoSuchPunitiveMeasureException;

	/**
	 * @param newPunitiveMeasure
	 * @throws MappingException
	 */
	public void addPunitiveMeasure(PunitiveMeasure newPunitiveMeasure) throws MappingException;

	/**
	 * @param aPunitiveMeasure
	 * @throws MappingException
	 */
	public void updatePunitiveMeasure(PunitiveMeasure aPunitiveMeasure) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchPunitiveMeasureException
	 */
	public void removePunitiveMeasure(Integer aId) throws NoSuchPunitiveMeasureException;

	/**
	 * @param nameAuthorizedBody
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findAuthorizedBodies(String nameAuthorizedBody, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchAuthorizedBodyException
	 */
	public AuthorizedBody findAuthorizedBodyByKey(Integer aId) throws NoSuchAuthorizedBodyException;

	/**
	 * @param newAuthorizedBody
	 * @throws MappingException
	 */
	public void addAuthorizedBody(AuthorizedBody newAuthorizedBody) throws MappingException;

	/**
	 * @param aAuthorizedBody
	 * @throws MappingException
	 */
	public void updateAuthorizedBody(AuthorizedBody aAuthorizedBody) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchAuthorizedBodyException
	 */
	public void removeAuthorizedBody(Integer aId) throws NoSuchAuthorizedBodyException;

	/**
	 * @param nameDocumentGroup
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findDocumentGroupList(String nameDocumentGroup, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchDocumentGroupException
	 */
	public DocumentGroup findDocumentGroupByKey(Integer aId) throws NoSuchDocumentGroupException;

	/**
	 * @param newDocumentGroup
	 * @throws MappingException
	 */
	public void addDocumentGroup(DocumentGroup newDocumentGroup) throws MappingException;

	/**
	 * @param aDocumentGroup
	 * @throws MappingException
	 */
	public void updateDocumentGroup(DocumentGroup aDocumentGroup) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchDocumentGroupException
	 */
	public void removeDocumentGroup(Integer aId) throws NoSuchDocumentGroupException;

	/**
	 * @param nameStopFactor
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findListStopFactor(String nameStopFactor, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchStopFactorException
	 */
	public StopFactor findStopFactorByKey(String aId) throws NoSuchStopFactorException;

	/**
	 * @param newStopFactor
	 * @throws MappingException
	 */
	public void addStopFactor(StopFactor newStopFactor) throws MappingException;

	/**
	 * @param aStopFactor
	 * @throws MappingException
	 */
	public void updateStopFactor(StopFactor aStopFactor) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchStopFactorException
	 */
	public void removeStopFactor(String aId) throws NoSuchStopFactorException;

	
}
