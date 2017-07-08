package com.vtb.model;

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

/**
 * @author IShaffigulin
 *
 * Application Model interface for Dictionary manipulation services.
 */
public interface DictionaryActionProcessor {
	/**
	 * Locate all RatingTypes like by name.
	 * 
	 * @returns a List of all RatingTypes like by name
	 */
	public ArrayList findRatingTypes(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate RatingType by is Id.
	 * @returns the requested RatingType
	 * @param aId the Integer identifying the RatingType to be returned.
	 */
	public RatingType findRatingTypeByKey(Integer id) throws NoSuchRatingTypeException;

	/** 
	 * Delete a RatingType from system
	 * @param aId the id of the RatingType to be removed.
	 */
	public void removeRatingType(Integer aId) throws NoSuchRatingTypeException;

	/**
	 * Insert a new RatingType into the VTB system
	 * @param newRatingType the RatingType to be added.
	 */
	public void addRatingType(RatingType newRatingType) throws MappingException;

	/**
	 * Update a persistent RatingType to the system.
	 * @param RatingType to update to the persistent store.
	 * @return the updated RatingType 
	 */
	public void updateRatingType(RatingType aRatingType) throws NoSuchRatingTypeException, MappingException, ModelException;
	
	/**
	 * Locate all CommissionTypes like by name.
	 * 
	 * @returns a List of all CommissionTypes like by name
	 */
	public ArrayList findCommissionTypes(String searchStr, String orderBy) throws ModelException;
	

	/**
	 * Locate CommissionType by is Id.
	 * @returns the requested CommissionType
	 * @param aId the Integer identifying the CommissionType to be returned.
	 */
	public CommissionType findCommissionTypeByKey(Integer id) throws NoSuchCommissionTypeException;

	/** 
	 * Delete a CommissionType from system
	 * @param aId the id of the CommissionType to be removed.
	 */
	public void removeCommissionType(Integer aId) throws NoSuchCommissionTypeException;

	/**
	 * Insert a new CommissionType into the VTB system
	 * @param newCommissionType the CommissionType to be added.
	 */
	public void addCommissionType(CommissionType newCommissionType) throws MappingException;

	/**
	 * Update a persistent CommissionType to the system.
	 * @param CommissionType to update to the persistent store.
	 * @return the updated CommissionType 
	 */
	public void updateCommissionType(CommissionType aCommissionType) throws NoSuchCommissionTypeException, MappingException, ModelException;
	
	/**
	 * Locate all ContractorTypes like by name.
	 * 
	 * @returns a List of all ContractorTypes like by name
	 */
	public ArrayList findContractorTypes(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate ContractorType by is Id.
	 * @returns the requested ContractorType
	 * @param aId the Integer identifying the ContractorType to be returned.
	 */
	public ContractorType findContractorTypeByKey(Integer id) throws NoSuchContractorTypeException;

	/** 
	 * Delete a ContractorType from system
	 * @param aId the id of the ContractorType to be removed.
	 */
	public void removeContractorType(Integer aId) throws NoSuchContractorTypeException;

	/**
	 * Insert a new ContractorType into the VTB system
	 * @param newContractorType the ContractorType to be added.
	 */
	public void addContractorType(ContractorType newContractorType) throws MappingException;

	/**
	 * Update a persistent ContractorType to the system.
	 * @param ContractorType to update to the persistent store.
	 * @return the updated ContractorType 
	 */
	public void updateContractorType(ContractorType aContractorType) throws NoSuchContractorTypeException, MappingException, ModelException;
		
	/**
	 * Locate all DocumentsTypes like by name.
	 * 
	 * @returns a List of all DocumentsTypes like by name
	 */
	public ArrayList findDocumentsTypes(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate DocumentsType by is Id.
	 * @returns the requested DocumentsType
	 * @param aId the Integer identifying the DocumentsType to be returned.
	 */
	public DocumentsType findDocumentsTypeByKey(Integer id) throws NoSuchDocumentsTypeException;

	/** 
	 * Delete a DocumentsType from system
	 * @param aId the id of the DocumentsType to be removed.
	 */
	public void removeDocumentsType(Integer aId) throws NoSuchDocumentsTypeException;

	/**
	 * Insert a new DocumentsType into the VTB system
	 * @param newDocumentsType the DocumentsType to be added.
	 */
	public void addDocumentsType(DocumentsType newDocumentsType) throws MappingException;

	/**
	 * Update a persistent DocumentsType to the system.
	 * @param DocumentsType to update to the persistent store.
	 * @return the updated DocumentsType 
	 */
	public void updateDocumentsType(DocumentsType aDocumentsType) throws NoSuchDocumentsTypeException, MappingException, ModelException;

	/**
	 * Locate all LimitTypes like by name.
	 * 
	 * @returns a List of all LimitTypes like by name
	 */
	public ArrayList findLimitTypes(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate LimitType by is Id.
	 * @returns the requested LimitType
	 * @param aId the Integer identifying the LimitType to be returned.
	 */
	public LimitType findLimitTypeByKey(Integer id) throws NoSuchLimitTypeException;

	/** 
	 * Delete a LimitType from system
	 * @param aId the id of the LimitType to be removed.
	 */
	public void removeLimitType(Integer aId) throws NoSuchLimitTypeException;

	/**
	 * Insert a new LimitType into the VTB system
	 * @param newLimitType the LimitType to be added.
	 */
	public void addLimitType(LimitType newLimitType) throws MappingException;

	/**
	 * Update a persistent LimitType to the system.
	 * @param LimitType to update to the persistent store.
	 * @return the updated LimitType 
	 */
	public void updateLimitType(LimitType aLimitType) throws NoSuchLimitTypeException, MappingException, ModelException;
	
	/**
	 * Locate all RatingTypes like by name.
	 * 
	 * @returns a List of all TargetTypes like by name
	 */
	public ArrayList findTargetTypes(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate TargetType by is Id.
	 * @returns the requested TargetType
	 * @param aId the Integer identifying the TargetType to be returned.
	 */
	public TargetType findTargetTypeByKey(Integer id) throws NoSuchTargetTypeException;

	/** 
	 * Delete a TargetType from system
	 * @param aId the id of the TargetType to be removed.
	 */
	public void removeTargetType(Integer aId) throws NoSuchTargetTypeException;

	/**
	 * Insert a new TargetType into the VTB system
	 * @param newTargetType the TargetType to be added.
	 */
	public void addTargetType(TargetType newTargetType) throws MappingException;

	/**
	 * Update a persistent TargetType to the system.
	 * @param TargetType to update to the persistent store.
	 * @return the updated TargetType 
	 */
	public void updateTargetType(TargetType aTargetType) throws NoSuchTargetTypeException, MappingException, ModelException;

	/**
	 * Locate all OpportunityTypes like by name.
	 * 
	 * @returns a List of all OpportunityTypes like by name
	 */
	public ArrayList findOpportunityTypes(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate OpportunityType by is Id.
	 * @returns the requested OpportunityType
	 * @param aId the Integer identifying the OpportunityType to be returned.
	 */
	public OpportunityType findOpportunityTypeByKey(Integer id) throws NoSuchOpportunityTypeException;

	/** 
	 * Delete a OpportunityType from system
	 * @param aId the id of the OpportunityType to be removed.
	 */
	public void removeOpportunityType(Integer aId) throws NoSuchOpportunityTypeException;

	/**
	 * Insert a new OpportunityType into the VTB system
	 * @param newOpportunityType the OpportunityType to be added.
	 */
	public void addOpportunityType(OpportunityType newOpportunityType) throws MappingException;

	/**
	 * Update a persistent OpportunityType to the system.
	 * @param OpportunityType to update to the persistent store.
	 * @return the updated OpportunityType 
	 */
	public void updateOpportunityType(OpportunityType aOpportunityType) throws NoSuchOpportunityTypeException, MappingException, ModelException;
	
	/**
	 * Locate all Industry like by name.
	 * 
	 * @returns a List of all Industry like by name
	 */
	public ArrayList findIndustries(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate Industry by is Id.
	 * @returns the requested Industry
	 * @param aId the Integer identifying the Industry to be returned.
	 */
	public Industry findIndustryByKey(Integer id) throws NoSuchIndustryException;

	/** 
	 * Delete a Industry from system
	 * @param aId the id of the Industry to be removed.
	 */
	public void removeIndustry(Integer aId) throws NoSuchIndustryException;

	/**
	 * Insert a new Industry into the VTB system
	 * @param newIndustry the Industry to be added.
	 */
	public void addIndustry(Industry newIndustry) throws MappingException;

	/**
	 * Update a persistent Industry to the system.
	 * @param Industry to update to the persistent store.
	 * @return the updated Industry 
	 */
	public void updateIndustry(Industry aIndustry) throws NoSuchIndustryException, MappingException, ModelException;
	
	/**
	 * Locate all Regions like by name.
	 * 
	 * @returns a List of all Regions like by name
	 */
	public ArrayList findRegions(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate Region by is Id.
	 * @returns the requested Region
	 * @param aId the Integer identifying the Region to be returned.
	 */
	public Region findRegionByKey(Integer id) throws NoSuchRegionException;

	/** 
	 * Delete a Region from system
	 * @param aId the id of the Region to be removed.
	 */
	public void removeRegion(Integer aId) throws NoSuchRegionException;

	/**
	 * Insert a new Region into the VTB system
	 * @param newRegion the Region to be added.
	 */
	public void addRegion(Region newRegion) throws MappingException;

	/**
	 * Update a persistent Region to the system.
	 * @param Region to update to the persistent store.
	 * @return the updated Region 
	 */
	public void updateRegion(Region aRegion) throws NoSuchRegionException, MappingException, ModelException;
	
	/**
	 * Locate all PatternPaidPercentTypes like by name.
	 * 
	 * @returns a List of all PatternPaidPercentTypes like by name
	 */
	public ArrayList findPatternPaidPercentTypes(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate PatternPaidPercentType by is Id.
	 * @returns the requested PatternPaidPercentType
	 * @param aId the Integer identifying the PatternPaidPercentType to be returned.
	 */
	public PatternPaidPercentType findPatternPaidPercentTypeByKey(Integer id) throws NoSuchPatternPaidPercentTypeException;

	/** 
	 * Delete a PatternPaidPercentType from system
	 * @param aId the id of the PatternPaidPercentType to be removed.
	 */
	public void removePatternPaidPercentType(Integer aId) throws NoSuchPatternPaidPercentTypeException;

	/**
	 * Insert a new PatternPaidPercentType into the VTB system
	 * @param newPatternPaidPercentType the PatternPaidPercentType to be added.
	 */
	public void addPatternPaidPercentType(PatternPaidPercentType newPatternPaidPercentType) throws MappingException;

	/**
	 * Update a persistent PatternPaidPercentType to the system.
	 * @param PatternPaidPercentType to update to the persistent store.
	 * @return the updated PatternPaidPercentType 
	 */
	public void updatePatternPaidPercentType(PatternPaidPercentType aPatternPaidPercentType) throws NoSuchPatternPaidPercentTypeException, MappingException, ModelException;

	/**
	 * Locate all BaseRates like by name.
	 * 
	 * @returns a List of all BaseRates like by name
	 */
	public ArrayList findBaseRates(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate BaseRate by is Id.
	 * @returns the requested BaseRate
	 * @param aId the Integer identifying the BaseRate to be returned.
	 */
	public BaseRate findBaseRateByKey(Integer id) throws NoSuchBaseRateException;

	/** 
	 * Delete a BaseRate from system
	 * @param aId the id of the BaseRate to be removed.
	 */
	public void removeBaseRate(Integer aId) throws NoSuchBaseRateException;

	/**
	 * Insert a new BaseRate into the VTB system
	 * @param newBaseRate the BaseRate to be added.
	 */
	public void addBaseRate(BaseRate newBaseRate) throws MappingException;

	/**
	 * Update a persistent BaseRate to the system.
	 * @param BaseRate to update to the persistent store.
	 * @return the updated BaseRate 
	 */
	public void updateBaseRate(BaseRate aBaseRate) throws NoSuchBaseRateException, MappingException, ModelException;

	/**
	 * Locate all PunitiveMeasures like by name.
	 * 
	 * @returns a List of all PunitiveMeasures like by name
	 */
	public ArrayList findPunitiveMeasures(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate PunitiveMeasure by is Id.
	 * @returns the requested PunitiveMeasure
	 * @param aId the Integer identifying the PunitiveMeasure to be returned.
	 */
	public PunitiveMeasure findPunitiveMeasureByKey(Integer id) throws NoSuchPunitiveMeasureException;

	/** 
	 * Delete a PunitiveMeasure from system
	 * @param aId the id of the PunitiveMeasure to be removed.
	 */
	public void removePunitiveMeasure(Integer aId) throws NoSuchPunitiveMeasureException;

	/**
	 * Insert a new PunitiveMeasure into the VTB system
	 * @param newPunitiveMeasure the PunitiveMeasure to be added.
	 */
	public void addPunitiveMeasure(PunitiveMeasure newPunitiveMeasure) throws MappingException;

	/**
	 * Update a persistent PunitiveMeasure to the system.
	 * @param PunitiveMeasure to update to the persistent store.
	 * @return the updated PunitiveMeasure 
	 */
	public void updatePunitiveMeasure(PunitiveMeasure aPunitiveMeasure) throws NoSuchPunitiveMeasureException, MappingException, ModelException;

	/**
	 * Locate all AuthorizedBody like by name.
	 * 
	 * @returns a List of all AuthorizedBody like by name
	 */
	public ArrayList findAuthorizedBodies(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate RatingType by is Id.
	 * @returns the requested AuthorizedBody
	 * @param aId the Integer identifying the AuthorizedBody to be returned.
	 */
	public AuthorizedBody findAuthorizedBodyByKey(Integer id) throws NoSuchAuthorizedBodyException;

	/** 
	 * Delete a AuthorizedBody from system
	 * @param aId the id of the AuthorizedBody to be removed.
	 */
	public void removeAuthorizedBody(Integer aId) throws NoSuchAuthorizedBodyException;

	/**
	 * Insert a new AuthorizedBody into the VTB system
	 * @param newAuthorizedBody the AuthorizedBody to be added.
	 */
	public void addAuthorizedBody(AuthorizedBody newAuthorizedBody) throws MappingException;

	/**
	 * Update a persistent AuthorizedBody to the system.
	 * @param AuthorizedBody to update to the persistent store.
	 * @return the updated AuthorizedBody 
	 */
	public void updateAuthorizedBody(AuthorizedBody aAuthorizedBody) throws NoSuchAuthorizedBodyException, MappingException, ModelException;
	
	/**
	 * This is a testing method designed to allow you to clear the caches for the
	 * In-Memory Simulated Data Access Objects when neecessary.
	 */
	public void clearInMemoryCaches();	

	/**
	 * Locate all DocumentGroups like by name.
	 * 
	 * @returns a List of all DocumentGroups like by name
	 */
	public ArrayList findDocumentGroupList(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate DocumentGroup by is Id.
	 * @returns the requested DocumentGroup
	 * @param aId the Integer identifying the DocumentGroup to be returned.
	 */
	public DocumentGroup findDocumentGroupByKey(Integer id) throws NoSuchDocumentGroupException;

	/** 
	 * Delete a DocumentGroup from system
	 * @param aId the id of the DocumentGroup to be removed.
	 */
	public void removeDocumentGroup(Integer aId) throws NoSuchDocumentGroupException;

	/**
	 * Insert a new DocumentGroup into the VTB system
	 * @param newDocumentGroup the DocumentGroup to be added.
	 */
	public void addDocumentGroup(DocumentGroup newDocumentGroup) throws MappingException;

	/**
	 * Update a persistent DocumentGroup to the system.
	 * @param DocumentGroup to update to the persistent store.
	 * @return the updated DocumentGroup 
	 */
	public void updateDocumentGroup(DocumentGroup aDocumentGroup) throws NoSuchDocumentGroupException, MappingException, ModelException;
	
	/**
	 * Locate all StopFactors like by name.
	 * 
	 * @returns a List of all StopFactors like by name
	 */
	public ArrayList findListStopFactor(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate StopFactor by is Id.
	 * @returns the requested StopFactor
	 * @param aId the Integer identifying the StopFactor to be returned.
	 */
	public StopFactor findStopFactorByKey(String id) throws NoSuchStopFactorException;

	/** 
	 * Delete a StopFactor from system
	 * @param aId the id of the StopFactor to be removed.
	 */
	public void removeStopFactor(String aId) throws NoSuchStopFactorException;

	/**
	 * Insert a new StopFactor into the VTB system
	 * @param newStopFactor the StopFactor to be added.
	 */
	public void addStopFactor(StopFactor newStopFactor) throws MappingException;

	/**
	 * Update a persistent StopFactor to the system.
	 * @param StopFactor to update to the persistent store.
	 * @return the updated StopFactor 
	 */
	public void updateStopFactor(StopFactor aStopFactor) throws NoSuchStopFactorException, MappingException, ModelException;
		
}
