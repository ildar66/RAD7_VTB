package com.vtb.model.ejb;

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
import com.vtb.model.SecurityActionProcessor;

public class SecurityActionProcessorImpl implements SecurityActionProcessor {

	public void addLinkOkvedCrmToOrganization(String okvedCrmKey, String organizationKey) throws ModelException, MappingException {
		// TODO Auto-generated method stub
		
	}

	public void deleteLinkOkvedCrmToOrganization(String okvedCrmKey, String organizationKey) throws ModelException, MappingException {
		// TODO Auto-generated method stub
		
	}

	public ArrayList findOkvedListTO_ByOrganization(Integer organizationID, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findGroupListTO_ByOrganizationCRM(String orgCrmID, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findGroupListTO_ByOrganization(Integer organizationID, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void addLinkGroupCrmToOrganization(String groupCrmKey, String organizationKey) throws ModelException, MappingException {
		// TODO Auto-generated method stub
		
	}

	public void addLinkGroupCrmToOrganizationCRM(String groupCrmKey, String organizationCrmKey) throws ModelException, MappingException {
		// TODO Auto-generated method stub
		
	}

	public void deleteLinkGroupCrmToOrganization(String groupCrmKey, String organizationKey) throws ModelException, MappingException {
		// TODO Auto-generated method stub
		
	}

	public void deleteLinkGroupCrmToOrganizationCRM(String groupCrmKey, String organizationCrmKey) throws ModelException, MappingException {
		// TODO Auto-generated method stub
		
	}

	public OrganizationGroup findOrganizationGroupByCrmKey(String aId) throws NoSuchOrganizationGroupException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findOrganizationListTO_ByGroupCRM(String groupCrmID, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void addLinkGroupToOrganizationCRM(String groupKey, String organizationCrmKey) throws ModelException, MappingException {
		// TODO Auto-generated method stub
		
	}

	public void deleteLinkGroupToOrganizationCRM(String groupKey, String organizationCrmKey) throws ModelException, MappingException {
		// TODO Auto-generated method stub
		
	}

	public ArrayList findOrganizationListTO_ByGroup(Integer groupID, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateOrganizationCRM(Organization aOrganizations) throws NoSuchOrganizationException, MappingException, ModelException {
		// TODO Auto-generated method stub
		
	}

	public ArrayList findOkvedListTO(String searchStr, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findOkvedHierarchyList(Integer parentID, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void addOkved(Okved newOkveds) throws MappingException {
		// TODO Auto-generated method stub
		
	}

	public void addLinkOkvedToOrganization(String okvedKey, String organizationKey) throws ModelException, MappingException {
		// TODO Auto-generated method stub
		
	}

	public void deleteLinkOkvedToOrganization(String okvedKey, String organizationKey) throws ModelException, MappingException {
		// TODO Auto-generated method stub
		
	}

	public ArrayList findOkvedListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public Okved findOkvedByKey(Integer id) throws NoSuchOkvedException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findOkvedList(String searchStr, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeOkved(Integer aId) throws NoSuchOkvedException {
		// TODO Auto-generated method stub
		
	}

	public void updateOkved(Okved aOkveds) throws NoSuchOkvedException, MappingException, ModelException {
		// TODO Auto-generated method stub
		
	}

	public void addManager(Manager newManager) throws MappingException {
		// TODO Auto-generated method stub
		
	}

	public Manager findManagerByKey(Integer aId) throws NoSuchManagerException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findManagerListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeManager(Integer aId) throws NoSuchManagerException {
		// TODO Auto-generated method stub
		
	}

	public void updateManager(Manager aManager) throws NoSuchManagerException, MappingException, ModelException {
		// TODO Auto-generated method stub
		
	}

	public ArrayList findOrganizationListTO(String searchStr, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void addShareholder(Shareholder newShareholder) throws MappingException {
		// TODO Auto-generated method stub
		
	}

	public Shareholder findShareholderByKey(Integer aId) throws NoSuchShareholderException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findShareholderListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeShareholder(Integer aId) throws NoSuchShareholderException {
		// TODO Auto-generated method stub
		
	}

	public void updateShareholder(Shareholder aShareholder) throws NoSuchShareholderException, MappingException, ModelException {
		// TODO Auto-generated method stub
		
	}

	public void addGovern(Govern newGovern) throws MappingException {
		// TODO Auto-generated method stub
		
	}

	public Govern findGovernByKey(Integer aId) throws NoSuchGovernException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findGovernListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeGovern(Integer aId) throws NoSuchGovernException {
		// TODO Auto-generated method stub
		
	}

	public void updateGovern(Govern aGovern) throws NoSuchGovernException, MappingException, ModelException {
		// TODO Auto-generated method stub
		
	}

	public ArrayList findGroupListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findOperatorToRoleAccessList(String operatorKey, String aProcessID, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findProcessTypeList(String searchStr, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void addAddress(Address newAddresss) throws MappingException {
		// TODO Auto-generated method stub
		
	}

	public Address findAddressByKey(Integer aId) throws NoSuchAddressException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findAddressListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeAddress(Integer aId) throws NoSuchAddressException {
		// TODO Auto-generated method stub
		
	}

	public void updateAddress(Address aAddresss) throws NoSuchAddressException, MappingException, ModelException {
		// TODO Auto-generated method stub
		
	}

	public void addLinkGroupToOrganization(String groupKey, String organizationKey) throws ModelException, MappingException {
		// TODO Auto-generated method stub
		
	}

	public void deleteLinkGroupToOrganization(String groupKey, String organizationKey) throws ModelException, MappingException {
		// TODO Auto-generated method stub
		
	}

	public ArrayList findOrganizationListByGroup(Integer groupID, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void addOrganizationGroup(OrganizationGroup newOrganizationGroups) throws MappingException {
		// TODO Auto-generated method stub
		
	}

	public OrganizationGroup findOrganizationGroupByKey(Integer id) throws NoSuchOrganizationGroupException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findOrganizationGroupList(String searchStr, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeOrganizationGroup(Integer aId) throws NoSuchOrganizationGroupException {
		// TODO Auto-generated method stub
		
	}

	public void updateOrganizationGroup(OrganizationGroup aOrganizationGroups) throws NoSuchOrganizationGroupException, MappingException, ModelException {
		// TODO Auto-generated method stub
		
	}

	public void addOwnershipFormType(OwnershipFormType newOwnershipFormTypes) throws MappingException {
		// TODO Auto-generated method stub
		
	}

	public OwnershipFormType findOwnershipFormTypeByKey(Integer id) throws NoSuchOwnershipFormTypeException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeOwnershipFormType(Integer aId) throws NoSuchOwnershipFormTypeException {
		// TODO Auto-generated method stub
		
	}

	public void updateOwnershipFormType(OwnershipFormType aOwnershipFormTypes) throws NoSuchOwnershipFormTypeException, MappingException, ModelException {
		// TODO Auto-generated method stub
		
	}

	public ArrayList findOwnershipFormTypeList(String searchStr, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void addOrganization(Organization newOrganizations) throws MappingException {
		// TODO Auto-generated method stub
		
	}

	public Organization findOrganizationByKey(Integer id) throws NoSuchOrganizationException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findOrganizationList(String searchStr, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeOrganization(Integer aId) throws NoSuchOrganizationException {
		// TODO Auto-generated method stub
		
	}

	public void updateOrganization(Organization aOrganizations) throws NoSuchOrganizationException, MappingException, ModelException {
		// TODO Auto-generated method stub
		
	}

	public Operator findOperatorByLogin(String aLogin) throws NoSuchOperatorException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findMqSchedulerSheetList(Integer departmentKey, String searchStr, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public void addMqSchedulerSheet(MQSchedulerSheet newMqSchedulerSheet) throws MappingException {
		// TODO Auto-generated method stub
		
	}

	public MQSchedulerSheet findMqSchedulerSheetByKey(Integer id) throws NoSuchMqSchedulerSheetException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeMqSchedulerSheet(Integer aId) throws NoSuchMqSchedulerSheetException {
		// TODO Auto-generated method stub
		
	}

	public void updateMqSchedulerSheet(MQSchedulerSheet aMqSchedulerSheet) throws NoSuchMqSchedulerSheetException, MappingException, ModelException {
		// TODO Auto-generated method stub
		
	}

	public void clearInMemoryCaches() {
		// TODO Auto-generated method stub
		
	}

	public void setStatusLinkOperatorToRole(String operatorKey, String roleKey, String status) throws ModelException, MappingException {
		// TODO Auto-generated method stub
		
	}

	public void addDepartment(Department newDepartments)
			throws MappingException {
		// TODO Auto-generated method stub

	}

	public void addLinkOperatorToRole(String operatorKey, String roleKey)
			throws ModelException, MappingException {
		// TODO Auto-generated method stub

	}

	public void addOperator(Operator newOperator) throws MappingException {
		// TODO Auto-generated method stub

	}

	public void addSpoSetting(SPOSettings newSpoSetting)
			throws MappingException {
		// TODO Auto-generated method stub

	}

	public void deleteLinkOperatorToRole(String operatorKey, String roleKey)
			throws ModelException, MappingException {
		// TODO Auto-generated method stub

	}

	public Department findDepartmentByKey(Integer id)
			throws NoSuchDepartmentException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findDepartments(String searchStr, String orderBy)
			throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public Operator findOperatorByKey(Integer id) throws NoSuchOperatorException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findOperatorToRoleAccessList(String operatorKey,
			String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findOperatorToRoleList(String operatorKey, String orderBy)
			throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList findOperators(Integer departmentKey, String searchStr,
			String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public SPOSettings findSpoSettingByKey(Integer id)
			throws NoSuchSpoSettingException {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeDepartment(Integer aId) throws NoSuchDepartmentException {
		// TODO Auto-generated method stub

	}

	public void removeOperator(Integer aId) throws NoSuchOperatorException {
		// TODO Auto-generated method stub

	}

	public void removeSpoSetting(Integer aId) throws NoSuchSpoSettingException {
		// TODO Auto-generated method stub

	}

	public void updateDepartment(Department aDepartments)
			throws NoSuchDepartmentException, MappingException, ModelException {
		// TODO Auto-generated method stub

	}

	public void updateOperator(Operator aOperator)
			throws NoSuchOperatorException, MappingException, ModelException {
		// TODO Auto-generated method stub

	}

	public void updateSpoSetting(SPOSettings aSpoSetting)
			throws NoSuchSpoSettingException, MappingException, ModelException {
		// TODO Auto-generated method stub

	}

	public ArrayList findOrganizationGroupListTO(String searchStr, String orderBy) throws ModelException {
		// TODO Auto-generated method stub
		return null;
	}

	public Organization findOrganizationByCrmKey(String idCRM) throws NoSuchOrganizationException {
		// TODO Auto-generated method stub
		return null;
	}

}
