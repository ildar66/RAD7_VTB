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
 * Remote interface for Enterprise Bean: DictionaryActionProcessorFacade
 */
public interface DictionaryActionProcessorFacade extends javax.ejb.EJBObject {

	/**
	 * @param nameRatingType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findRatingTypes(String nameRatingType, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param nameCommissionType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findCommissionTypes(String nameCommissionType, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchRatingTypeException
	 * @throws java.rmi.RemoteException
	 */
	public RatingType findRatingTypeByKey(Integer aId) throws NoSuchRatingTypeException, java.rmi.RemoteException;

	/**
	 * @param newRatingType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addRatingType(RatingType newRatingType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aRatingType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateRatingType(RatingType aRatingType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchRatingTypeException
	 * @throws java.rmi.RemoteException
	 */
	public void removeRatingType(Integer aId) throws NoSuchRatingTypeException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchCommissionTypeException
	 * @throws java.rmi.RemoteException
	 */
	public CommissionType findCommissionTypeByKey(Integer aId) throws NoSuchCommissionTypeException, java.rmi.RemoteException;

	/**
	 * @param newCommissionType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addCommissionType(CommissionType newCommissionType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aCommissionType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateCommissionType(CommissionType aCommissionType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchCommissionTypeException
	 * @throws java.rmi.RemoteException
	 */
	public void removeCommissionType(Integer aId) throws NoSuchCommissionTypeException, java.rmi.RemoteException;

	/**
	 * @param nameContractorType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findContractorTypes(String nameContractorType, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchContractorTypeException
	 * @throws java.rmi.RemoteException
	 */
	public ContractorType findContractorTypeByKey(Integer aId) throws NoSuchContractorTypeException, java.rmi.RemoteException;

	/**
	 * @param newContractorType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addContractorType(ContractorType newContractorType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aContractorType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateContractorType(ContractorType aContractorType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchContractorTypeException
	 * @throws java.rmi.RemoteException
	 */
	public void removeContractorType(Integer aId) throws NoSuchContractorTypeException, java.rmi.RemoteException;

	/**
	 * @param nameDocumentsType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findDocumentsTypes(String nameDocumentsType, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchDocumentsTypeException
	 * @throws java.rmi.RemoteException
	 */
	public DocumentsType findDocumentsTypeByKey(Integer aId) throws NoSuchDocumentsTypeException, java.rmi.RemoteException;

	/**
	 * @param newDocumentsType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addDocumentsType(DocumentsType newDocumentsType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aDocumentsType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateDocumentsType(DocumentsType aDocumentsType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchDocumentsTypeException
	 * @throws java.rmi.RemoteException
	 */
	public void removeDocumentsType(Integer aId) throws NoSuchDocumentsTypeException, java.rmi.RemoteException;

	/**
	 * @param nameLimitType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findLimitTypes(String nameLimitType, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchLimitTypeException
	 * @throws java.rmi.RemoteException
	 */
	public LimitType findLimitTypeByKey(Integer aId) throws NoSuchLimitTypeException, java.rmi.RemoteException;

	/**
	 * @param newLimitType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addLimitType(LimitType newLimitType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aLimitType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateLimitType(LimitType aLimitType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchLimitTypeException
	 * @throws java.rmi.RemoteException
	 */
	public void removeLimitType(Integer aId) throws NoSuchLimitTypeException, java.rmi.RemoteException;

	/**
	 * @param nameTargetType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findTargetTypes(String nameTargetType, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchTargetTypeException
	 * @throws java.rmi.RemoteException
	 */
	public TargetType findTargetTypeByKey(Integer aId) throws NoSuchTargetTypeException, java.rmi.RemoteException;

	/**
	 * @param newTargetType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addTargetType(TargetType newTargetType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aTargetType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateTargetType(TargetType aTargetType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchTargetTypeException
	 * @throws java.rmi.RemoteException
	 */
	public void removeTargetType(Integer aId) throws NoSuchTargetTypeException, java.rmi.RemoteException;

	/**
	 * @param nameOpportunityType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOpportunityTypes(String nameOpportunityType, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchOpportunityTypeException
	 * @throws java.rmi.RemoteException
	 */
	public OpportunityType findOpportunityTypeByKey(Integer aId) throws NoSuchOpportunityTypeException, java.rmi.RemoteException;

	/**
	 * @param newOpportunityType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addOpportunityType(OpportunityType newOpportunityType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aOpportunityType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateOpportunityType(OpportunityType aOpportunityType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchOpportunityTypeException
	 * @throws java.rmi.RemoteException
	 */
	public void removeOpportunityType(Integer aId) throws NoSuchOpportunityTypeException, java.rmi.RemoteException;

	/**
	 * @param nameIndustry
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findIndustries(String nameIndustry, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchIndustryException
	 * @throws java.rmi.RemoteException
	 */
	public Industry findIndustryByKey(Integer aId) throws NoSuchIndustryException, java.rmi.RemoteException;

	/**
	 * @param newIndustry
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addIndustry(Industry newIndustry) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aIndustry
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateIndustry(Industry aIndustry) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchIndustryException
	 * @throws java.rmi.RemoteException
	 */
	public void removeIndustry(Integer aId) throws NoSuchIndustryException, java.rmi.RemoteException;

	/**
	 * @param nameRegion
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findRegions(String nameRegion, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchRegionException
	 * @throws java.rmi.RemoteException
	 */
	public Region findRegionByKey(Integer aId) throws NoSuchRegionException, java.rmi.RemoteException;

	/**
	 * @param newRegion
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addRegion(Region newRegion) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aRegion
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateRegion(Region aRegion) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchRegionException
	 * @throws java.rmi.RemoteException
	 */
	public void removeRegion(Integer aId) throws NoSuchRegionException, java.rmi.RemoteException;

	/**
	 * @param namePatternPaidPercentType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findPatternPaidPercentTypes(String namePatternPaidPercentType, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchPatternPaidPercentTypeException
	 * @throws java.rmi.RemoteException
	 */
	public PatternPaidPercentType findPatternPaidPercentTypeByKey(Integer aId) throws NoSuchPatternPaidPercentTypeException, java.rmi.RemoteException;

	/**
	 * @param newPatternPaidPercentType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addPatternPaidPercentType(PatternPaidPercentType newPatternPaidPercentType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aPatternPaidPercentType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updatePatternPaidPercentType(PatternPaidPercentType aPatternPaidPercentType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchPatternPaidPercentTypeException
	 * @throws java.rmi.RemoteException
	 */
	public void removePatternPaidPercentType(Integer aId) throws NoSuchPatternPaidPercentTypeException, java.rmi.RemoteException;

	/**
	 * @param nameBaseRate
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findBaseRates(String nameBaseRate, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchBaseRateException
	 * @throws java.rmi.RemoteException
	 */
	public BaseRate findBaseRateByKey(Integer aId) throws NoSuchBaseRateException, java.rmi.RemoteException;

	/**
	 * @param newBaseRate
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addBaseRate(BaseRate newBaseRate) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aBaseRate
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateBaseRate(BaseRate aBaseRate) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchBaseRateException
	 * @throws java.rmi.RemoteException
	 */
	public void removeBaseRate(Integer aId) throws NoSuchBaseRateException, java.rmi.RemoteException;

	/**
	 * @param namePunitiveMeasure
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findPunitiveMeasures(String namePunitiveMeasure, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchPunitiveMeasureException
	 * @throws java.rmi.RemoteException
	 */
	public PunitiveMeasure findPunitiveMeasureByKey(Integer aId) throws NoSuchPunitiveMeasureException, java.rmi.RemoteException;

	/**
	 * @param newPunitiveMeasure
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addPunitiveMeasure(PunitiveMeasure newPunitiveMeasure) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aPunitiveMeasure
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updatePunitiveMeasure(PunitiveMeasure aPunitiveMeasure) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchPunitiveMeasureException
	 * @throws java.rmi.RemoteException
	 */
	public void removePunitiveMeasure(Integer aId) throws NoSuchPunitiveMeasureException, java.rmi.RemoteException;

	/**
	 * @param nameAuthorizedBody
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findAuthorizedBodies(String nameAuthorizedBody, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchAuthorizedBodyException
	 * @throws java.rmi.RemoteException
	 */
	public AuthorizedBody findAuthorizedBodyByKey(Integer aId) throws NoSuchAuthorizedBodyException, java.rmi.RemoteException;

	/**
	 * @param newAuthorizedBody
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addAuthorizedBody(AuthorizedBody newAuthorizedBody) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aAuthorizedBody
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateAuthorizedBody(AuthorizedBody aAuthorizedBody) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchAuthorizedBodyException
	 * @throws java.rmi.RemoteException
	 */
	public void removeAuthorizedBody(Integer aId) throws NoSuchAuthorizedBodyException, java.rmi.RemoteException;

	/**
	 * @param nameDocumentGroup
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findDocumentGroupList(String nameDocumentGroup, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchDocumentGroupException
	 * @throws java.rmi.RemoteException
	 */
	public DocumentGroup findDocumentGroupByKey(Integer aId) throws NoSuchDocumentGroupException, java.rmi.RemoteException;

	/**
	 * @param newDocumentGroup
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addDocumentGroup(DocumentGroup newDocumentGroup) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aDocumentGroup
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateDocumentGroup(DocumentGroup aDocumentGroup) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchDocumentGroupException
	 * @throws java.rmi.RemoteException
	 */
	public void removeDocumentGroup(Integer aId) throws NoSuchDocumentGroupException, java.rmi.RemoteException;

	/**
	 * @param nameStopFactor
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findListStopFactor(String nameStopFactor, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchStopFactorException
	 * @throws java.rmi.RemoteException
	 */
	public StopFactor findStopFactorByKey(String aId) throws NoSuchStopFactorException, java.rmi.RemoteException;

	/**
	 * @param newStopFactor
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addStopFactor(StopFactor newStopFactor) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aStopFactor
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateStopFactor(StopFactor aStopFactor) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchStopFactorException
	 * @throws java.rmi.RemoteException
	 */
	public void removeStopFactor(String aId) throws NoSuchStopFactorException, java.rmi.RemoteException;
}
