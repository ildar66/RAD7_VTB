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
 * Local interface for Enterprise Bean: SecurityActionProcessorFacade
 */
public interface SecurityActionProcessorFacadeLocal
	extends
		javax.ejb.EJBLocalObject {

	/**
	 * @param nameDepartment
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findDepartments(String nameDepartment, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchDepartmentException
	 */
	public Department findDepartmentByKey(Integer aId) throws NoSuchDepartmentException;

	/**
	 * @param newDepartment
	 * @throws MappingException
	 */
	public void addDepartment(Department newDepartment) throws MappingException;

	/**
	 * @param aDepartment
	 * @throws MappingException
	 */
	public void updateDepartment(Department aDepartment) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchDepartmentException
	 */
	public void removeDepartment(Integer aId) throws NoSuchDepartmentException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchSpoSettingException
	 */
	public SPOSettings findSpoSettingByKey(Integer aId) throws NoSuchSpoSettingException;

	/**
	 * @param newSpoSetting
	 * @throws MappingException
	 */
	public void addSpoSetting(SPOSettings newSpoSetting) throws MappingException;

	/**
	 * @param aSpoSetting
	 * @throws MappingException
	 */
	public void updateSpoSetting(SPOSettings aSpoSetting) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchSpoSettingException
	 */
	public void removeSpoSetting(Integer aId) throws NoSuchSpoSettingException;

	/**
	 * @param departmentKey
	 * @param nameOperator
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOperators(Integer departmentKey, String nameOperator, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchOperatorException
	 */
	public Operator findOperatorByKey(Integer aId) throws NoSuchOperatorException;

	/**
	 * @param newOperator
	 * @throws MappingException
	 */
	public void addOperator(Operator newOperator) throws MappingException;

	/**
	 * @param aOperator
	 * @throws MappingException
	 */
	public void updateOperator(Operator aOperator) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchOperatorException
	 */
	public void removeOperator(Integer aId) throws NoSuchOperatorException;

	/**
	 * @param operatorKey
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOperatorToRoleAccessList(String operatorKey, String orderBy) throws ModelException;

	/**
	 * @param operatorKey
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOperatorToRoleList(String operatorKey, String orderBy) throws ModelException;

	/**
	 * @param operatorKey
	 * @param roleKey
	 * @throws MappingException
	 */
	public void addLinkOperatorToRole(String operatorKey, String roleKey) throws MappingException;

	/**
	 * @param operatorKey
	 * @param roleKey
	 * @throws MappingException
	 */
	public void deleteLinkOperatorToRole(String operatorKey, String roleKey) throws MappingException;

	/**
	 * @param operatorKey
	 * @param roleKey
	 * @param status
	 * @throws MappingException
	 */
	public void setStatusLinkOperatorToRole(String operatorKey, String roleKey, String status) throws MappingException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchMqSchedulerSheetException
	 */
	public MQSchedulerSheet findMqSchedulerSheetByKey(Integer aId) throws NoSuchMqSchedulerSheetException;

	/**
	 * @param newMqSchedulerSheet
	 * @throws MappingException
	 */
	public void addMqSchedulerSheet(MQSchedulerSheet newMqSchedulerSheet) throws MappingException;

	/**
	 * @param aMqSchedulerSheet
	 * @throws MappingException
	 */
	public void updateMqSchedulerSheet(MQSchedulerSheet aMqSchedulerSheet) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchMqSchedulerSheetException
	 */
	public void removeMqSchedulerSheet(Integer aId) throws NoSuchMqSchedulerSheetException;

	/**
	 * @param departmentKey
	 * @param searchStr
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findMqSchedulerSheetList(Integer departmentKey, String searchStr, String orderBy) throws ModelException;

	/**
	 * @param aLogin
	 * @return
	 * @throws NoSuchOperatorException
	 */
	public Operator findOperatorByLogin(String aLogin) throws NoSuchOperatorException;

	/**
	 * @param nameOrganization
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOrganizationList(String nameOrganization, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchOrganizationException
	 */
	public Organization findOrganizationByKey(Integer aId) throws NoSuchOrganizationException;

	/**
	 * @param newOrganization
	 * @throws MappingException
	 */
	public void addOrganization(Organization newOrganization) throws MappingException;

	/**
	 * @param aOrganization
	 * @throws MappingException
	 */
	public void updateOrganization(Organization aOrganization) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchOrganizationException
	 */
	public void removeOrganization(Integer aId) throws NoSuchOrganizationException;

	/**
	 * @param nameOwnershipFormType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOwnershipFormTypeList(String nameOwnershipFormType, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchOwnershipFormTypeException
	 */
	public OwnershipFormType findOwnershipFormTypeByKey(Integer aId) throws NoSuchOwnershipFormTypeException;

	/**
	 * @param newOwnershipFormType
	 * @throws MappingException
	 */
	public void addOwnershipFormType(OwnershipFormType newOwnershipFormType) throws MappingException;

	/**
	 * @param aOwnershipFormType
	 * @throws MappingException
	 */
	public void updateOwnershipFormType(OwnershipFormType aOwnershipFormType) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchOwnershipFormTypeException
	 */
	public void removeOwnershipFormType(Integer aId) throws NoSuchOwnershipFormTypeException;

	/**
	 * @param nameOrganizationGroup
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOrganizationGroupList(String nameOrganizationGroup, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchOrganizationGroupException
	 */
	public OrganizationGroup findOrganizationGroupByKey(Integer aId) throws NoSuchOrganizationGroupException;

	/**
	 * @param newOrganizationGroup
	 * @throws MappingException
	 */
	public void addOrganizationGroup(OrganizationGroup newOrganizationGroup) throws MappingException;

	/**
	 * @param aOrganizationGroup
	 * @throws MappingException
	 */
	public void updateOrganizationGroup(OrganizationGroup aOrganizationGroup) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchOrganizationGroupException
	 */
	public void removeOrganizationGroup(Integer aId) throws NoSuchOrganizationGroupException;

	/**
	 * @param groupID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOrganizationListByGroup(Integer groupID, String orderBy) throws ModelException;

	/**
	 * @param groupKey
	 * @param organizationKey
	 * @throws MappingException
	 */
	public void addLinkGroupToOrganization(String groupKey, String organizationKey) throws MappingException;

	/**
	 * @param groupKey
	 * @param organizationKey
	 * @throws MappingException
	 */
	public void deleteLinkGroupToOrganization(String groupKey, String organizationKey) throws MappingException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findAddressListByOrganization(Integer organizationID, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchAddressException
	 */
	public Address findAddressByKey(Integer aId) throws NoSuchAddressException;

	/**
	 * @param newAddress
	 * @throws MappingException
	 */
	public void addAddress(Address newAddress) throws MappingException;

	/**
	 * @param aAddress
	 * @throws MappingException
	 */
	public void updateAddress(Address aAddress) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchAddressException
	 */
	public void removeAddress(Integer aId) throws NoSuchAddressException;

	/**
	 * @param nameProcessType
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findProcessTypeList(String nameProcessType, String orderBy) throws ModelException;

	/**
	 * @param operatorKey
	 * @param aProcessID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOperatorToRoleAccessList(String operatorKey, String aProcessID, String orderBy) throws ModelException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findGroupListByOrganization(Integer organizationID, String orderBy) throws ModelException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findGovernListByOrganization(Integer organizationID, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchGovernException
	 */
	public Govern findGovernByKey(Integer aId) throws NoSuchGovernException;

	/**
	 * @param newGovern
	 * @throws MappingException
	 */
	public void addGovern(Govern newGovern) throws MappingException;

	/**
	 * @param aGovern
	 * @throws MappingException
	 */
	public void updateGovern(Govern aGovern) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchGovernException
	 */
	public void removeGovern(Integer aId) throws NoSuchGovernException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findShareholderListByOrganization(Integer organizationID, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchShareholderException
	 */
	public Shareholder findShareholderByKey(Integer aId) throws NoSuchShareholderException;

	/**
	 * @param newShareholder
	 * @throws MappingException
	 */
	public void addShareholder(Shareholder newShareholder) throws MappingException;

	/**
	 * @param aShareholder
	 * @throws MappingException
	 */
	public void updateShareholder(Shareholder aShareholder) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchShareholderException
	 */
	public void removeShareholder(Integer aId) throws NoSuchShareholderException;

	/**
	 * @param nameOrganization
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOrganizationListTO(String nameOrganization, String orderBy) throws ModelException;

	/**
	 * @param nameOrganizationGroup
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOrganizationGroupListTO(String nameOrganizationGroup, String orderBy) throws ModelException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findManagerListByOrganization(Integer organizationID, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchManagerException
	 */
	public Manager findManagerByKey(Integer aId) throws NoSuchManagerException;

	/**
	 * @param newManager
	 * @throws MappingException
	 */
	public void addManager(Manager newManager) throws MappingException;

	/**
	 * @param aManager
	 * @throws MappingException
	 */
	public void updateManager(Manager aManager) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchManagerException
	 */
	public void removeManager(Integer aId) throws NoSuchManagerException;

	/**
	 * @param nameOkved
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOkvedList(String nameOkved, String orderBy) throws ModelException;

	/**
	 * @param aId
	 * @return
	 * @throws NoSuchOkvedException
	 */
	public Okved findOkvedByKey(Integer aId) throws NoSuchOkvedException;

	/**
	 * @param newOkved
	 * @throws MappingException
	 */
	public void addOkved(Okved newOkved) throws MappingException;

	/**
	 * @param aOkved
	 * @throws MappingException
	 */
	public void updateOkved(Okved aOkved) throws MappingException;

	/**
	 * @param aId
	 * @throws NoSuchOkvedException
	 */
	public void removeOkved(Integer aId) throws NoSuchOkvedException;

	/**
	 * @param parentID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOkvedHierarchyList(Integer parentID, String orderBy) throws ModelException;

	/**
	 * @param okvedKey
	 * @param organizationKey
	 * @throws MappingException
	 */
	public void deleteLinkOkvedToOrganization(String okvedKey, String organizationKey) throws MappingException;

	/**
	 * @param okvedKey
	 * @param organizationKey
	 * @throws MappingException
	 */
	public void addLinkOkvedToOrganization(String okvedKey, String organizationKey) throws MappingException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOkvedListByOrganization(Integer organizationID, String orderBy) throws ModelException;

	/**
	 * @param aIdCrm
	 * @return
	 * @throws NoSuchOrganizationException
	 */
	public Organization findOrganizationByCrmKey(String aIdCrm) throws NoSuchOrganizationException;

	/**
	 * @param nameOkved
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOkvedListTO(String nameOkved, String orderBy) throws ModelException;

	/**
	 * @param aOrganization
	 * @throws MappingException
	 */
	public void updateOrganizationCRM(Organization aOrganization) throws MappingException;

	/**
	 * @param groupID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOrganizationListTO_ByGroup(Integer groupID, String orderBy) throws ModelException;

	/**
	 * @param groupKey
	 * @param organizationCrmKey
	 * @throws MappingException
	 */
	public void addLinkGroupToOrganizationCRM(String groupKey, String organizationCrmKey) throws MappingException;

	/**
	 * @param groupKey
	 * @param organizationCrmKey
	 * @throws MappingException
	 */
	public void deleteLinkGroupToOrganizationCRM(String groupKey, String organizationCrmKey) throws MappingException;

	/**
	 * @param groupCrmKey
	 * @param organizationKey
	 * @throws MappingException
	 */
	public void addLinkGroupCrmToOrganization(String groupCrmKey, String organizationKey) throws MappingException;

	/**
	 * @param groupCrmKey
	 * @param organizationCrmKey
	 * @throws MappingException
	 */
	public void addLinkGroupCrmToOrganizationCRM(String groupCrmKey, String organizationCrmKey) throws MappingException;

	/**
	 * @param groupCrmKey
	 * @param organizationKey
	 * @throws MappingException
	 */
	public void deleteLinkGroupCrmToOrganization(String groupCrmKey, String organizationKey) throws MappingException;

	/**
	 * @param groupCrmKey
	 * @param organizationCrmKey
	 * @throws MappingException
	 */
	public void deleteLinkGroupCrmToOrganizationCRM(String groupCrmKey, String organizationCrmKey) throws MappingException;

	/**
	 * @param groupCrmID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOrganizationListTO_ByGroupCRM(String groupCrmID, String orderBy) throws ModelException;

	/**
	 * @param aCrmKey
	 * @return
	 * @throws NoSuchOrganizationGroupException
	 */
	public OrganizationGroup findOrganizationGroupByCrmKey(String aCrmKey) throws NoSuchOrganizationGroupException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findGroupListTO_ByOrganization(Integer organizationID, String orderBy) throws ModelException;

	/**
	 * @param orgCrmID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findGroupListTO_ByOrganizationCRM(String orgCrmID, String orderBy) throws ModelException;

	/**
	 * @param organizationID
	 * @param orderBy
	 * @return
	 * @throws ModelException
	 */
	public ArrayList findOkvedListTO_ByOrganization(Integer organizationID, String orderBy) throws ModelException;

	/**
	 * @param okvedCrmKey
	 * @param organizationKey
	 * @throws MappingException
	 */
	public void addLinkOkvedCrmToOrganization(String okvedCrmKey, String organizationKey) throws MappingException;

	/**
	 * @param okvedCrmKey
	 * @param organizationKey
	 * @throws MappingException
	 */
	public void deleteLinkOkvedCrmToOrganization(String okvedCrmKey, String organizationKey) throws MappingException;
}
