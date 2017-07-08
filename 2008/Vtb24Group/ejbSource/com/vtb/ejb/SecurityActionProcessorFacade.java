package com.vtb.ejb;

import java.util.ArrayList;
import com.vtb.exception.ModelException;
import com.vtb.domain.Department;
import com.vtb.exception.NoSuchDepartmentException;
import com.vtb.exception.MappingException;
import com.vtb.domain.SPOSettings;
import com.vtb.exception.NoSuchSpoSettingException;
import com.vtb.domain.Operator;
import com.vtb.exception.NoSuchOperatorException;
import com.vtb.domain.MQSchedulerSheet;
import com.vtb.exception.NoSuchMqSchedulerSheetException;
import com.vtb.exception.NoSuchOrganizationException;
import com.vtb.domain.Organization;
import com.vtb.domain.OwnershipFormType;
import com.vtb.exception.NoSuchOwnershipFormTypeException;
import com.vtb.exception.NoSuchOrganizationGroupException;
import com.vtb.domain.OrganizationGroup;
import com.vtb.domain.Address;
import com.vtb.exception.NoSuchAddressException;
import com.vtb.exception.NoSuchGovernException;
import com.vtb.domain.Govern;
import com.vtb.domain.Shareholder;
import com.vtb.exception.NoSuchShareholderException;
import com.vtb.exception.NoSuchManagerException;
import com.vtb.domain.Manager;
import com.vtb.domain.Okved;
import com.vtb.exception.NoSuchOkvedException;

/**
 * Remote interface for Enterprise Bean: SecurityActionProcessorFacade
 */
public interface SecurityActionProcessorFacade extends javax.ejb.EJBObject {

	/**
	 * @param nameDepartment
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findDepartments(String nameDepartment, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchDepartmentException
	 * @throws java.rmi.RemoteException
	 */
	public Department findDepartmentByKey(Integer aId) throws NoSuchDepartmentException, java.rmi.RemoteException;

	/**
	 * @param newDepartment
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addDepartment(Department newDepartment) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aDepartment
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateDepartment(Department aDepartment) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchDepartmentException
	 * @throws java.rmi.RemoteException
	 */
	public void removeDepartment(Integer aId) throws NoSuchDepartmentException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchSpoSettingException
	 * @throws java.rmi.RemoteException
	 */
	public SPOSettings findSpoSettingByKey(Integer aId) throws NoSuchSpoSettingException, java.rmi.RemoteException;

	/**
	 * @param newSpoSetting
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addSpoSetting(SPOSettings newSpoSetting) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aSpoSetting
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateSpoSetting(SPOSettings aSpoSetting) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchSpoSettingException
	 * @throws java.rmi.RemoteException
	 */
	public void removeSpoSetting(Integer aId) throws NoSuchSpoSettingException, java.rmi.RemoteException;

	/**
	 * @param departmentKey
	 * @param nameOperator
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOperators(Integer departmentKey, String nameOperator, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchOperatorException
	 * @throws java.rmi.RemoteException
	 */
	public Operator findOperatorByKey(Integer aId) throws NoSuchOperatorException, java.rmi.RemoteException;

	/**
	 * @param newOperator
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addOperator(Operator newOperator) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aOperator
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateOperator(Operator aOperator) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchOperatorException
	 * @throws java.rmi.RemoteException
	 */
	public void removeOperator(Integer aId) throws NoSuchOperatorException, java.rmi.RemoteException;

	/**
	 * @param operatorKey
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOperatorToRoleAccessList(String operatorKey, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param operatorKey
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOperatorToRoleList(String operatorKey, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param operatorKey
	 * @param roleKey
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addLinkOperatorToRole(String operatorKey, String roleKey) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param operatorKey
	 * @param roleKey
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void deleteLinkOperatorToRole(String operatorKey, String roleKey) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param operatorKey
	 * @param roleKey
	 * @param status
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void setStatusLinkOperatorToRole(String operatorKey, String roleKey, String status) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchMqSchedulerSheetException
	 * @throws java.rmi.RemoteException
	 */
	public MQSchedulerSheet findMqSchedulerSheetByKey(Integer aId) throws NoSuchMqSchedulerSheetException, java.rmi.RemoteException;

	/**
	 * @param newMqSchedulerSheet
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addMqSchedulerSheet(MQSchedulerSheet newMqSchedulerSheet) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aMqSchedulerSheet
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateMqSchedulerSheet(MQSchedulerSheet aMqSchedulerSheet) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchMqSchedulerSheetException
	 * @throws java.rmi.RemoteException
	 */
	public void removeMqSchedulerSheet(Integer aId) throws NoSuchMqSchedulerSheetException, java.rmi.RemoteException;

	/**
	 * @param departmentKey
	 * @param searchStr
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findMqSchedulerSheetList(Integer departmentKey, String searchStr, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aLogin
	 * @return
	 * @throws NoSuchOperatorException
	 * @throws java.rmi.RemoteException
	 */
	public Operator findOperatorByLogin(String aLogin) throws NoSuchOperatorException, java.rmi.RemoteException;

	/**
	 * @param nameOrganization
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOrganizationList(String nameOrganization, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchOrganizationException
	 * @throws java.rmi.RemoteException
	 */
	public Organization findOrganizationByKey(Integer aId) throws NoSuchOrganizationException, java.rmi.RemoteException;

	/**
	 * @param newOrganization
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addOrganization(Organization newOrganization) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aOrganization
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateOrganization(Organization aOrganization) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchOrganizationException
	 * @throws java.rmi.RemoteException
	 */
	public void removeOrganization(Integer aId) throws NoSuchOrganizationException, java.rmi.RemoteException;

	/**
	 * @param nameOwnershipFormType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOwnershipFormTypeList(String nameOwnershipFormType, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchOwnershipFormTypeException
	 * @throws java.rmi.RemoteException
	 */
	public OwnershipFormType findOwnershipFormTypeByKey(Integer aId) throws NoSuchOwnershipFormTypeException, java.rmi.RemoteException;

	/**
	 * @param newOwnershipFormType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addOwnershipFormType(OwnershipFormType newOwnershipFormType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aOwnershipFormType
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateOwnershipFormType(OwnershipFormType aOwnershipFormType) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchOwnershipFormTypeException
	 * @throws java.rmi.RemoteException
	 */
	public void removeOwnershipFormType(Integer aId) throws NoSuchOwnershipFormTypeException, java.rmi.RemoteException;

	/**
	 * @param nameOrganizationGroup
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOrganizationGroupList(String nameOrganizationGroup, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchOrganizationGroupException
	 * @throws java.rmi.RemoteException
	 */
	public OrganizationGroup findOrganizationGroupByKey(Integer aId) throws NoSuchOrganizationGroupException, java.rmi.RemoteException;

	/**
	 * @param newOrganizationGroup
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addOrganizationGroup(OrganizationGroup newOrganizationGroup) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aOrganizationGroup
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateOrganizationGroup(OrganizationGroup aOrganizationGroup) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchOrganizationGroupException
	 * @throws java.rmi.RemoteException
	 */
	public void removeOrganizationGroup(Integer aId) throws NoSuchOrganizationGroupException, java.rmi.RemoteException;

	/**
	 * @param groupID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOrganizationListByGroup(Integer groupID, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param groupKey
	 * @param organizationKey
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addLinkGroupToOrganization(String groupKey, String organizationKey) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param groupKey
	 * @param organizationKey
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void deleteLinkGroupToOrganization(String groupKey, String organizationKey) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findAddressListByOrganization(Integer organizationID, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchAddressException
	 * @throws java.rmi.RemoteException
	 */
	public Address findAddressByKey(Integer aId) throws NoSuchAddressException, java.rmi.RemoteException;

	/**
	 * @param newAddress
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addAddress(Address newAddress) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aAddress
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateAddress(Address aAddress) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchAddressException
	 * @throws java.rmi.RemoteException
	 */
	public void removeAddress(Integer aId) throws NoSuchAddressException, java.rmi.RemoteException;

	/**
	 * @param nameProcessType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findProcessTypeList(String nameProcessType, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param operatorKey
	 * @param aProcessID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOperatorToRoleAccessList(String operatorKey, String aProcessID, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findGroupListByOrganization(Integer organizationID, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findGovernListByOrganization(Integer organizationID, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchGovernException
	 * @throws java.rmi.RemoteException
	 */
	public Govern findGovernByKey(Integer aId) throws NoSuchGovernException, java.rmi.RemoteException;

	/**
	 * @param newGovern
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addGovern(Govern newGovern) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aGovern
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateGovern(Govern aGovern) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchGovernException
	 * @throws java.rmi.RemoteException
	 */
	public void removeGovern(Integer aId) throws NoSuchGovernException, java.rmi.RemoteException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findShareholderListByOrganization(Integer organizationID, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchShareholderException
	 * @throws java.rmi.RemoteException
	 */
	public Shareholder findShareholderByKey(Integer aId) throws NoSuchShareholderException, java.rmi.RemoteException;

	/**
	 * @param newShareholder
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addShareholder(Shareholder newShareholder) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aShareholder
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateShareholder(Shareholder aShareholder) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchShareholderException
	 * @throws java.rmi.RemoteException
	 */
	public void removeShareholder(Integer aId) throws NoSuchShareholderException, java.rmi.RemoteException;

	/**
	 * @param nameOrganization
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOrganizationListTO(String nameOrganization, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param nameOrganizationGroup
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOrganizationGroupListTO(String nameOrganizationGroup, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findManagerListByOrganization(Integer organizationID, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchManagerException
	 * @throws java.rmi.RemoteException
	 */
	public Manager findManagerByKey(Integer aId) throws NoSuchManagerException, java.rmi.RemoteException;

	/**
	 * @param newManager
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addManager(Manager newManager) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aManager
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateManager(Manager aManager) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchManagerException
	 * @throws java.rmi.RemoteException
	 */
	public void removeManager(Integer aId) throws NoSuchManagerException, java.rmi.RemoteException;

	/**
	 * @param nameOkved
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOkvedList(String nameOkved, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchOkvedException
	 * @throws java.rmi.RemoteException
	 */
	public Okved findOkvedByKey(Integer aId) throws NoSuchOkvedException, java.rmi.RemoteException;

	/**
	 * @param newOkved
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addOkved(Okved newOkved) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aOkved
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateOkved(Okved aOkved) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param aId
	 * @throws NoSuchOkvedException
	 * @throws java.rmi.RemoteException
	 */
	public void removeOkved(Integer aId) throws NoSuchOkvedException, java.rmi.RemoteException;

	/**
	 * @param parentID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOkvedHierarchyList(Integer parentID, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param okvedKey
	 * @param organizationKey
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void deleteLinkOkvedToOrganization(String okvedKey, String organizationKey) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param okvedKey
	 * @param organizationKey
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addLinkOkvedToOrganization(String okvedKey, String organizationKey) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOkvedListByOrganization(Integer organizationID, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aIdCrm
	 * @return
	 * @throws NoSuchOrganizationException
	 * @throws java.rmi.RemoteException
	 */
	public Organization findOrganizationByCrmKey(String aIdCrm) throws NoSuchOrganizationException, java.rmi.RemoteException;

	/**
	 * @param nameOkved
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOkvedListTO(String nameOkved, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aOrganization
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void updateOrganizationCRM(Organization aOrganization) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param groupID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOrganizationListTO_ByGroup(Integer groupID, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param groupKey
	 * @param organizationCrmKey
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addLinkGroupToOrganizationCRM(String groupKey, String organizationCrmKey) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param groupKey
	 * @param organizationCrmKey
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void deleteLinkGroupToOrganizationCRM(String groupKey, String organizationCrmKey) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param groupCrmKey
	 * @param organizationKey
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addLinkGroupCrmToOrganization(String groupCrmKey, String organizationKey) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param groupCrmKey
	 * @param organizationCrmKey
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addLinkGroupCrmToOrganizationCRM(String groupCrmKey, String organizationCrmKey) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param groupCrmKey
	 * @param organizationKey
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void deleteLinkGroupCrmToOrganization(String groupCrmKey, String organizationKey) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param groupCrmKey
	 * @param organizationCrmKey
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void deleteLinkGroupCrmToOrganizationCRM(String groupCrmKey, String organizationCrmKey) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param groupCrmID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOrganizationListTO_ByGroupCRM(String groupCrmID, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param aCrmKey
	 * @return
	 * @throws NoSuchOrganizationGroupException
	 * @throws java.rmi.RemoteException
	 */
	public OrganizationGroup findOrganizationGroupByCrmKey(String aCrmKey) throws NoSuchOrganizationGroupException, java.rmi.RemoteException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findGroupListTO_ByOrganization(Integer organizationID, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param orgCrmID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findGroupListTO_ByOrganizationCRM(String orgCrmID, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 * @throws java.rmi.RemoteException
	 */
	public ArrayList findOkvedListTO_ByOrganization(Integer organizationID, String orderBy) throws ModelException, java.rmi.RemoteException;

	/**
	 * @param okvedCrmKey
	 * @param organizationKey
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void addLinkOkvedCrmToOrganization(String okvedCrmKey, String organizationKey) throws MappingException, java.rmi.RemoteException;

	/**
	 * @param okvedCrmKey
	 * @param organizationKey
	 * @throws MappingException
	 * @throws java.rmi.RemoteException
	 */
	public void deleteLinkOkvedCrmToOrganization(String okvedCrmKey, String organizationKey) throws MappingException, java.rmi.RemoteException;
}
