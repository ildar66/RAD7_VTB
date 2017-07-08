package com.vtb.model;

import java.util.ArrayList;

import com.vtb.domain.Address;
import com.vtb.domain.Department;
import com.vtb.domain.Govern;
import com.vtb.domain.MQSchedulerSheet;
import com.vtb.domain.Manager;
import com.vtb.domain.Okved;
import com.vtb.domain.Operator;
import com.vtb.domain.Organization;
import com.vtb.domain.OrganizationGroup;
import com.vtb.domain.OwnershipFormType;
import com.vtb.domain.SPOSettings;
import com.vtb.domain.Shareholder;
import com.vtb.exception.MappingException;
import com.vtb.exception.ModelException;
import com.vtb.exception.NoSuchAddressException;
import com.vtb.exception.NoSuchDepartmentException;
import com.vtb.exception.NoSuchGovernException;
import com.vtb.exception.NoSuchManagerException;
import com.vtb.exception.NoSuchMqSchedulerSheetException;
import com.vtb.exception.NoSuchOkvedException;
import com.vtb.exception.NoSuchOperatorException;
import com.vtb.exception.NoSuchOrganizationException;
import com.vtb.exception.NoSuchOrganizationGroupException;
import com.vtb.exception.NoSuchOwnershipFormTypeException;
import com.vtb.exception.NoSuchShareholderException;
import com.vtb.exception.NoSuchSpoSettingException;

/**
 * @author IShafigullin
 *
 * Application Model interface for Security manipulation services.
 */

public interface SecurityActionProcessor {

	/**
	 * Locate all Departmentss like by name.
	 * 
	 * @returns a List of all Departmentss like by name
	 */
	public ArrayList findDepartments(String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate Departments by is Id.
	 * @returns the requested Departments
	 * @param aId the Integer identifying the Departments to be returned.
	 */
	public Department findDepartmentByKey(Integer id) throws NoSuchDepartmentException;

	/** 
	 * Delete a Departments from system
	 * @param aId the id of the Departments to be removed.
	 */
	public void removeDepartment(Integer aId) throws NoSuchDepartmentException;

	/**
	 * Insert a new Departments into the NRI system
	 * @param newDepartments the Departments to be added.
	 */
	public void addDepartment(Department newDepartments) throws MappingException;

	/**
	 * Update a persistent Departments to the system.
	 * @param Department to update to the persistent store.
	 * @return the updated Departments 
	 */
	public void updateDepartment(Department aDepartments) throws NoSuchDepartmentException, MappingException, ModelException;

	/**
	 * Locate SpoSetting by is Id.
	 * @returns the requested SpoSetting
	 * @param aId the Integer identifying the SpoSetting to be returned.
	 */
	public SPOSettings findSpoSettingByKey(Integer id) throws NoSuchSpoSettingException;

	/** 
	 * Delete a SpoSetting from system
	 * @param aId the id of the SpoSetting to be removed.
	 */
	public void removeSpoSetting(Integer aId) throws NoSuchSpoSettingException;

	/**
	 * Insert a new SPOSettings into the NRI system
	 * @param newSpoSettings the SpoSettings to be added.
	 */
	public void addSpoSetting(SPOSettings newSpoSetting) throws MappingException;

	/**
	 * Update a persistent SpoSettings to the system.
	 * @param SpoSetting to update to the persistent store.
	 * @return the updated SpoSettings 
	 */
	public void updateSpoSetting(SPOSettings aSpoSetting) throws NoSuchSpoSettingException, MappingException, ModelException;

	/**
	 * Locate all Operators like by name.
	 * 
	 * @returns a List of all Operators by departmentKey and like name
	 */
	public ArrayList findOperators(Integer departmentKey, String searchStr, String orderBy) throws ModelException;

	/**
	 * Locate all Operators like by name.
	 * 
	 * @returns a List of all MqScheduler by departmentKey and searchStr
	 */
	public ArrayList findMqSchedulerSheetList(Integer departmentKey, String searchStr, String orderBy) throws ModelException;
	
	/**
	 * Locate Operator by is Id.
	 * @returns the requested Operator
	 * @param aId the Integer identifying the Operator to be returned.
	 */
	public Operator findOperatorByKey(Integer id) throws NoSuchOperatorException;

	/**
	 * Locate Operator by is Login.
	 * @returns the requested Operator
	 * @param aLogin the String identifying the Operator to be returned.
	 */
	public Operator findOperatorByLogin(String aLogin) throws NoSuchOperatorException;
	
	/** 
	 * Delete a Operator from system
	 * @param aId the id of the Operator to be removed.
	 */
	public void removeOperator(Integer aId) throws NoSuchOperatorException;

	/**
	 * Insert a new Operator into the NRI system
	 * @param newOperator the Operator to be added.
	 */
	public void addOperator(Operator newOperator) throws MappingException;

	/**
	 * Update a persistent Operator to the system.
	 * @param Operator to update to the persistent store.
	 * @return the updated Operator 
	 */
	public void updateOperator(Operator aOperator) throws NoSuchOperatorException, MappingException, ModelException;

	/**
	 * Locate all RoleList by operatorKey.
	 * @returns a List of all RoleList by operatorKey.
	 */
	public ArrayList findOperatorToRoleList(String operatorKey, String orderBy) throws ModelException;

	/**
	 * Locate access RoleList by operatorKey.
	 * @returns access RoleList by operatorKey.
	 */
	public ArrayList findOperatorToRoleAccessList(String operatorKey, String orderBy) throws ModelException;

	/**
	 * Locate access RoleList by operatorKey and processID.
	 * @returns access RoleList by operatorKey.
	 */
	public ArrayList findOperatorToRoleAccessList(String operatorKey, String aProcessID, String orderBy) throws ModelException;
	
	/**
	 * Delete Link Operator to Role.
	 */
	public void deleteLinkOperatorToRole(String operatorKey, String roleKey) throws ModelException, MappingException;

	/**
	 * Add Link Operator to Role.
	 */
	public void addLinkOperatorToRole(String operatorKey, String roleKey) throws ModelException, MappingException;
	
	/**
	 * set status Link Operator to Role.
	 */
	public void setStatusLinkOperatorToRole(String operatorKey, String roleKey, String status) throws ModelException, MappingException;

	/**
	 * This is a testing method designed to allow you to clear the caches for the
	 * In-Memory Simulated Data Access Objects when neecessary.
	 */
	public void clearInMemoryCaches();
	
	/**
	 * Locate MqSchedulerSheet by is Id.
	 * @returns the requested MqSchedulerSheet
	 * @param aId the Integer identifying the MqSchedulerSheet to be returned.
	 */
	public MQSchedulerSheet findMqSchedulerSheetByKey(Integer id) throws NoSuchMqSchedulerSheetException;

	/** 
	 * Delete a MqSchedulerSheet from system
	 * @param aId the id of the MqSchedulerSheet to be removed.
	 */
	public void removeMqSchedulerSheet(Integer aId) throws NoSuchMqSchedulerSheetException;

	/**
	 * Insert a new MQSchedulerSheet into the NRI system
	 * @param newMqSchedulerSheets the MqSchedulerSheets to be added.
	 */
	public void addMqSchedulerSheet(MQSchedulerSheet newMqSchedulerSheet) throws MappingException;

	/**
	 * Update a persistent MqSchedulerSheets to the system.
	 * @param MqSchedulerSheet to update to the persistent store.
	 * @return the updated MqSchedulerSheets 
	 */
	public void updateMqSchedulerSheet(MQSchedulerSheet aMqSchedulerSheet) throws NoSuchMqSchedulerSheetException, MappingException, ModelException;
	
	/**
	 * Locate all Organizationss like by name.
	 * 
	 * @returns a List of all Organizations like by name
	 */
	public ArrayList findOrganizationList(String searchStr, String orderBy) throws ModelException;
	
	/**
	 * Locate all Organizations TO like by name for integration with CRM .
	 * 
	 * @returns a List of all Organizations TO like by name
	 */
	public ArrayList findOrganizationListTO(String searchStr, String orderBy) throws ModelException;
	
	
	/**
	 * Locate all Organizations by groupID.
	 * 
	 * @returns a List of all Organizations by groupID
	 */
	public ArrayList findOrganizationListByGroup(Integer groupID, String orderBy) throws ModelException;
	
	/**
	 * Locate all Organizations TO by groupID.
	 * 
	 * @returns a List of all Organizations TO by groupID
	 */
	public ArrayList findOrganizationListTO_ByGroup(Integer groupID, String orderBy) throws ModelException;
	
	/**
	 * Locate all Organizations TO by groupCrmID.
	 * 
	 * @returns a List of all Organizations TO by groupCrmID
	 */
	public ArrayList findOrganizationListTO_ByGroupCRM(String groupCrmID, String orderBy) throws ModelException;	

	/**
	 * Locate Organizations by is Id.
	 * @returns the requested Organizations
	 * @param aId the Integer identifying the Organizations to be returned.
	 */
	public Organization findOrganizationByKey(Integer id) throws NoSuchOrganizationException;
	
	/**
	 * Locate Organizations by is Id CRM.
	 * @returns the requested Organizations
	 * @param idCRM the String identifying the Organization to be returned.
	 */
	public Organization findOrganizationByCrmKey(String idCRM) throws NoSuchOrganizationException;	

	/** 
	 * Delete a Organizations from system
	 * @param aId the id of the Organizations to be removed.
	 */
	public void removeOrganization(Integer aId) throws NoSuchOrganizationException;

	/**
	 * Insert a new Organizations into the NRI system
	 * @param newOrganizations the Organizations to be added.
	 */
	public void addOrganization(Organization newOrganizations) throws MappingException;

	/**
	 * Update a persistent Organizations to the system.
	 * @param Organization to update to the persistent store.
	 * @return the updated Organizations 
	 */
	public void updateOrganization(Organization aOrganizations) throws NoSuchOrganizationException, MappingException, ModelException;

	/**
	 * Update a persistent OrganizationCRM to the system CRM.
	 * @param Organization to update to the persistent store.
	 */
	public void updateOrganizationCRM(Organization aOrganizations) throws NoSuchOrganizationException, MappingException, ModelException;

	/**
	 * Locate all OwnershipFormType List like by name.
	 * 
	 * @returns a List of all OwnershipFormType like by searchStr
	 */
	public ArrayList findOwnershipFormTypeList(String searchStr, String orderBy) throws ModelException;
	

	/**
	 * Locate OwnershipFormTypes by is Id.
	 * @returns the requested OwnershipFormTypes
	 * @param aId the Integer identifying the OwnershipFormTypes to be returned.
	 */
	public OwnershipFormType findOwnershipFormTypeByKey(Integer id) throws NoSuchOwnershipFormTypeException;

	/** 
	 * Delete a OwnershipFormTypes from system
	 * @param aId the id of the OwnershipFormTypes to be removed.
	 */
	public void removeOwnershipFormType(Integer aId) throws NoSuchOwnershipFormTypeException;

	/**
	 * Insert a new OwnershipFormTypes into the NRI system
	 * @param newOwnershipFormTypes the OwnershipFormTypes to be added.
	 */
	public void addOwnershipFormType(OwnershipFormType newOwnershipFormTypes) throws MappingException;

	/**
	 * Update a persistent OwnershipFormTypes to the system.
	 * @param OwnershipFormType to update to the persistent store.
	 * @return the updated OwnershipFormTypes 
	 */
	public void updateOwnershipFormType(OwnershipFormType aOwnershipFormTypes) throws NoSuchOwnershipFormTypeException, MappingException, ModelException;

	/**
	 * Locate all OrganizationGroupss like by name.
	 * 
	 * @returns a List of all OrganizationGroups like by name
	 */
	public ArrayList findOrganizationGroupList(String searchStr, String orderBy) throws ModelException;
	
	/**
	 * Locate all OrganizationGroups TO like by name.
	 * 
	 * @returns a List of all OrganizationGroups TO like by name
	 */
	public ArrayList findOrganizationGroupListTO(String searchStr, String orderBy) throws ModelException;	

	/**
	 * Locate OrganizationGroups by is Id.
	 * @returns the requested OrganizationGroups
	 * @param aId the Integer identifying the OrganizationGroups to be returned.
	 */
	public OrganizationGroup findOrganizationGroupByKey(Integer id) throws NoSuchOrganizationGroupException;

	/**
	 * Locate OrganizationGroups CRM by ID.
	 * @returns the requested OrganizationGroups CRM
	 * @param aId the String identifying the OrganizationGroups CRM to be returned.
	 */
	public OrganizationGroup findOrganizationGroupByCrmKey(String aId) throws NoSuchOrganizationGroupException;
	
	/** 
	 * Delete a OrganizationGroups from system
	 * @param aId the id of the OrganizationGroups to be removed.
	 */
	public void removeOrganizationGroup(Integer aId) throws NoSuchOrganizationGroupException;

	/**
	 * Insert a new OrganizationGroups into the NRI system
	 * @param newOrganizationGroups the OrganizationGroups to be added.
	 */
	public void addOrganizationGroup(OrganizationGroup newOrganizationGroups) throws MappingException;

	/**
	 * Update a persistent OrganizationGroups to the system.
	 * @param OrganizationGroup to update to the persistent store.
	 * @return the updated OrganizationGroups 
	 */
	public void updateOrganizationGroup(OrganizationGroup aOrganizationGroups) throws NoSuchOrganizationGroupException, MappingException, ModelException;
	
	/**
	 * Delete Link Organization to Group.
	 */
	public void deleteLinkGroupToOrganization(String groupKey, String organizationKey) throws ModelException, MappingException;
	
	/**
	 * Delete Link Organization CRM to Group.
	 */
	public void deleteLinkGroupToOrganizationCRM(String groupKey, String organizationCrmKey) throws ModelException, MappingException;	

	/**
	 * Add Link Organization to Group.
	 */
	public void addLinkGroupToOrganization(String groupKey, String organizationKey) throws ModelException, MappingException;
	
	/**
	 * Add Link Organization CRM to Group.
	 */
	public void addLinkGroupToOrganizationCRM(String groupKey, String organizationCrmKey) throws ModelException, MappingException;
	
	/**
	 * Delete Link Organization to Group CRM.
	 */
	public void deleteLinkGroupCrmToOrganization(String groupCrmKey, String organizationKey) throws ModelException, MappingException;
	
	/**
	 * Delete Link Organization CRM to Group CRM.
	 */
	public void deleteLinkGroupCrmToOrganizationCRM(String groupCrmKey, String organizationCrmKey) throws ModelException, MappingException;	

	/**
	 * Add Link Organization to Group CRM.
	 */
	public void addLinkGroupCrmToOrganization(String groupCrmKey, String organizationKey) throws ModelException, MappingException;
	
	/**
	 * Add Link Organization CRM to Group CRM.
	 */
	public void addLinkGroupCrmToOrganizationCRM(String groupCrmKey, String organizationCrmKey) throws ModelException, MappingException;	

	/**
	 * Delete Link Organization to Okved.
	 */
	public void deleteLinkOkvedToOrganization(String okvedKey, String organizationKey) throws ModelException, MappingException;
	
	/**
	 * Delete Link Organization to Okved from CRM.
	 */
	public void deleteLinkOkvedCrmToOrganization(String okvedCrmKey, String organizationKey) throws ModelException, MappingException;	

	/**
	 * Add Link Organization to Okved.
	 */
	public void addLinkOkvedToOrganization(String okvedKey, String organizationKey) throws ModelException, MappingException;
	
	/**
	 * Add Link Organization to Okved from CRM.
	 */
	public void addLinkOkvedCrmToOrganization(String okvedCrmKey, String organizationKey) throws ModelException, MappingException;
	
	
	/**
	 * Locate all Address by key Organization.
	 * 
	 * @returns a List of all Address by Organization key.
	 */
	public ArrayList findAddressListByOrganization(Integer organizationID, String orderBy)  throws ModelException;
	
	/**
	 * Locate Address by is Id.
	 * @returns the requested Address
	 * @param aId the Integer identifying the Address to be returned.
	 */
	public Address findAddressByKey(Integer aId) throws NoSuchAddressException;

	/** 
	 * Delete a Addresss from system
	 * @param aId the id of the Addresss to be removed.
	 */
	public void removeAddress(Integer aId) throws NoSuchAddressException;

	/**
	 * Insert a new Addresss into the NRI system
	 * @param newAddresss the Addresss to be added.
	 */
	public void addAddress(Address newAddresss) throws MappingException;

	/**
	 * Update a persistent Addresss to the system.
	 * @param Address to update to the persistent store.
	 * @return the updated Addresss 
	 */
	public void updateAddress(Address aAddresss) throws NoSuchAddressException, MappingException, ModelException;
	
	/**
	 * Locate all ProcessType List like by searchStr.
	 * 
	 * @returns a List of all ProcessType like by searchStr
	 */
	public ArrayList findProcessTypeList(String searchStr, String orderBy) throws ModelException;
	
	/**
	 * Locate all Groups by organizationID.
	 * 
	 * @returns a List of all Groups by organizationID
	 */
	public ArrayList findGroupListByOrganization(Integer organizationID, String orderBy) throws ModelException;

	/**
	 * Locate all Groups TO by organizationID.
	 * 
	 * @returns a List of all Groups TO by organizationID
	 */
	public ArrayList findGroupListTO_ByOrganization(Integer organizationID, String orderBy) throws ModelException;

	/**
	 * Locate all Groups TO by organizationID.
	 * 
	 * @returns a List of all Groups TO by orgCrmID
	 */
	public ArrayList findGroupListTO_ByOrganizationCRM(String orgCrmID, String orderBy) throws ModelException;	
	
	/**
	 * Locate all Okveds by organizationID.
	 * 
	 * @returns a List of all Okveds by organizationID
	 */
	public ArrayList findOkvedListByOrganization(Integer organizationID, String orderBy) throws ModelException;
	
	/**
	 * Locate all Govern by key Organization.
	 * 
	 * @returns a List of all Governs by Organization key.
	 */
	public ArrayList findGovernListByOrganization(Integer organizationID, String orderBy)  throws ModelException;
	
	/**
	 * Locate Govern by is Id.
	 * @returns the requested Govern
	 * @param aId the Integer identifying the Govern to be returned.
	 */
	public Govern findGovernByKey(Integer aId) throws NoSuchGovernException;

	/** 
	 * Delete a Governs from system
	 * @param aId the id of the Governs to be removed.
	 */
	public void removeGovern(Integer aId) throws NoSuchGovernException;

	/**
	 * Insert a new Governs into the NRI system
	 * @param newGoverns the Governs to be added.
	 */
	public void addGovern(Govern newGovern) throws MappingException;

	/**
	 * Update a persistent Governs to the system.
	 * @param Govern to update to the persistent store.
	 * @return the updated Governs 
	 */
	public void updateGovern(Govern aGovern) throws NoSuchGovernException, MappingException, ModelException;
	
	/**
	 * Locate all Shareholder by key Organization.
	 * 
	 * @returns a List of all Shareholders by Organization key.
	 */
	public ArrayList findShareholderListByOrganization(Integer organizationID, String orderBy)  throws ModelException;
	
	/**
	 * Locate Shareholder by is Id.
	 * @returns the requested Shareholder
	 * @param aId the Integer identifying the Shareholder to be returned.
	 */
	public Shareholder findShareholderByKey(Integer aId) throws NoSuchShareholderException;

	/** 
	 * Delete a Shareholders from system
	 * @param aId the id of the Shareholders to be removed.
	 */
	public void removeShareholder(Integer aId) throws NoSuchShareholderException;

	/**
	 * Insert a new Shareholders into the NRI system
	 * @param newShareholders the Shareholders to be added.
	 */
	public void addShareholder(Shareholder newShareholder) throws MappingException;

	/**
	 * Update a persistent Shareholders to the system.
	 * @param Shareholder to update to the persistent store.
	 * @return the updated Shareholders 
	 */
	public void updateShareholder(Shareholder aShareholder) throws NoSuchShareholderException, MappingException, ModelException;
	
	/**
	 * Locate all Manager by key Organization.
	 * 
	 * @returns a List of all Managers by Organization key.
	 */
	public ArrayList findManagerListByOrganization(Integer organizationID, String orderBy)  throws ModelException;
	
	/**
	 * Locate Manager by is Id.
	 * @returns the requested Manager
	 * @param aId the Integer identifying the Manager to be returned.
	 */
	public Manager findManagerByKey(Integer aId) throws NoSuchManagerException;

	/** 
	 * Delete a Managers from system
	 * @param aId the id of the Managers to be removed.
	 */
	public void removeManager(Integer aId) throws NoSuchManagerException;

	/**
	 * Insert a new Managers into the NRI system
	 * @param newManagers the Managers to be added.
	 */
	public void addManager(Manager newManager) throws MappingException;

	/**
	 * Update a persistent Managers to the system.
	 * @param Manager to update to the persistent store.
	 * @return the updated Managers 
	 */
	public void updateManager(Manager aManager) throws NoSuchManagerException, MappingException, ModelException;	
	
	/**
	 * Locate all Okveds like by name.
	 * 
	 * @returns a List of all Okveds like by name
	 */
	public ArrayList findOkvedList(String searchStr, String orderBy) throws ModelException;
	
	/**
	 * Locate all Okveds like by name for integration with CRM.
	 * 
	 * @returns a List of all Okveds like by name
	 */
	public ArrayList findOkvedListTO(String searchStr, String orderBy) throws ModelException;
	
	/**
	 * Locate all Okveds by Organization.
	 * 
	 * @returns a List of all Okveds by Organization ID.
	 */
	public ArrayList findOkvedListTO_ByOrganization(Integer organizationID, String orderBy) throws ModelException;
	
	/**
	 * Locate Okveds by is Id.
	 * @returns the requested Okveds
	 * @param aId the Integer identifying the Okveds to be returned.
	 */
	public Okved findOkvedByKey(Integer id) throws NoSuchOkvedException;

	/** 
	 * Delete a Okveds from system
	 * @param aId the id of the Okveds to be removed.
	 */
	public void removeOkved(Integer aId) throws NoSuchOkvedException;

	/**
	 * Insert a new Okveds into the NRI system
	 * @param newOkveds the Okveds to be added.
	 */
	public void addOkved(Okved newOkveds) throws MappingException;

	/**
	 * Update a persistent Okveds to the system.
	 * @param Okved to update to the persistent store.
	 * @return the updated Okveds 
	 */
	public void updateOkved(Okved aOkveds) throws NoSuchOkvedException, MappingException, ModelException;
		
	/**
	 * Locate all Okveds like by parentID.
	 * 
	 * @returns a List of all Okveds like by parentID
	 */
	public ArrayList findOkvedHierarchyList(Integer parentID, String orderBy) throws ModelException;	
}
