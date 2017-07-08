package com.vtb.model.web;

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
import com.vtb.ejb.SecurityActionProcessorFacadeLocal;
import com.vtb.ejb.SecurityActionProcessorFacadeLocalHome;
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
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;
import com.vtb.util.EJBClientHelper;

public class SecurityActionProcessorImpl implements SecurityActionProcessor {

	/**
	 * Access (create) an instance of the SecurityActionProcessorFacade
	 * 
	 * @returns a new Security session facade bean
	 */
	protected SecurityActionProcessorFacadeLocal getSecurityFacade() {
		try {
			return ((SecurityActionProcessorFacadeLocalHome) EJBClientHelper
					.getLocalHome("SecurityActionProcessorLocal")).create();
		} catch (Exception e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught " + e);
			return null;
		}
	}

	public void addOrganization(Organization newOrganizations) throws MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addOrganization(newOrganizations);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addOrganizations:" + e);
			}
		}

	}

	public Organization findOrganizationByKey(Integer id) throws NoSuchOrganizationException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOrganizationByKey(id);
			else
				throw new NoSuchOrganizationException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public Organization findOrganizationByCrmKey(String idCRM) throws NoSuchOrganizationException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOrganizationByCrmKey(idCRM);
			else
				throw new NoSuchOrganizationException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOrganizationList(String searchStr, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOrganizationList(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOrganizationListTO(String searchStr, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOrganizationListTO(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeOrganization(Integer aId) throws NoSuchOrganizationException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeOrganization(aId);
			else
				throw new NoSuchOrganizationException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateOrganization(Organization aOrganizations) throws NoSuchOrganizationException, MappingException,
			ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateOrganization(aOrganizations);
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

	public void updateOrganizationCRM(Organization aOrganization) throws NoSuchOrganizationException, MappingException,
			ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateOrganizationCRM(aOrganization);
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

	public Operator findOperatorByLogin(String aLogin) throws NoSuchOperatorException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOperatorByLogin(aLogin);
			else
				throw new NoSuchOperatorException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findMqSchedulerSheetList(Integer departmentKey, String searchStr, String orderBy)
			throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findMqSchedulerSheetList(departmentKey, searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void addMqSchedulerSheet(MQSchedulerSheet newMqSchedulerSheet) throws MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addMqSchedulerSheet(newMqSchedulerSheet);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addMqSchedulerSheet:" + e);
			}
		}
	}

	public MQSchedulerSheet findMqSchedulerSheetByKey(Integer id) throws NoSuchMqSchedulerSheetException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findMqSchedulerSheetByKey(id);
			else
				throw new NoSuchMqSchedulerSheetException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeMqSchedulerSheet(Integer aId) throws NoSuchMqSchedulerSheetException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeMqSchedulerSheet(aId);
			else
				throw new NoSuchMqSchedulerSheetException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateMqSchedulerSheet(MQSchedulerSheet aMqSchedulerSheet) throws NoSuchMqSchedulerSheetException,
			MappingException, ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateMqSchedulerSheet(aMqSchedulerSheet);
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
		/**
		 * SecurityActionProcessorFacadeLocal modelFacade = null; try {
		 * modelFacade = getSecurityFacade(); if (modelFacade != null)
		 * modelFacade.clearInMemoryCaches(); } finally { try {
		 * modelFacade.remove(); } catch (Exception e) {
		 * AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e); } }
		 */
	}

	public void setStatusLinkOperatorToRole(String operatorKey, String roleKey, String status) throws ModelException,
			MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.setStatusLinkOperatorToRole(operatorKey, roleKey, status);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void addLinkOperatorToRole(String operatorKey, String roleKey) throws ModelException, MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addLinkOperatorToRole(operatorKey, roleKey);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void deleteLinkOperatorToRole(String operatorKey, String roleKey) throws ModelException, MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.deleteLinkOperatorToRole(operatorKey, roleKey);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOperatorToRoleAccessList(String operatorKey, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOperatorToRoleAccessList(operatorKey, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOperatorToRoleAccessList(String operatorKey, String aProcessID, String orderBy)
			throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOperatorToRoleAccessList(operatorKey, aProcessID, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOperatorToRoleList(String operatorKey, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOperatorToRoleList(operatorKey, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void addOperator(Operator newOperator) throws MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addOperator(newOperator);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addOperator:" + e);
			}
		}
	}

	public Operator findOperatorByKey(Integer id) throws NoSuchOperatorException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOperatorByKey(id);
			else
				throw new NoSuchOperatorException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOperators(Integer departmentKey, String searchStr, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOperators(departmentKey, searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeOperator(Integer aId) throws NoSuchOperatorException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeOperator(aId);
			else
				throw new NoSuchOperatorException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateOperator(Operator aOperator) throws NoSuchOperatorException, MappingException, ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateOperator(aOperator);
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

	public void removeSpoSetting(Integer aId) throws NoSuchSpoSettingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeSpoSetting(aId);
			else
				throw new NoSuchSpoSettingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void addSpoSetting(SPOSettings newSpoSetting) throws MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addSpoSetting(newSpoSetting);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addSpoSetting:" + e);
			}
		}

	}

	public SPOSettings findSpoSettingByKey(Integer id) throws NoSuchSpoSettingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findSpoSettingByKey(id);
			else
				throw new NoSuchSpoSettingException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void updateSpoSetting(SPOSettings aSpoSetting) throws NoSuchSpoSettingException, MappingException,
			ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateSpoSetting(aSpoSetting);
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

	public void addDepartment(Department newDepartments) throws MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addDepartment(newDepartments);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addDepartments:" + e);
			}
		}

	}

	public ArrayList findDepartments(String searchStr, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findDepartments(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public Department findDepartmentByKey(Integer id) throws NoSuchDepartmentException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findDepartmentByKey(id);
			else
				throw new NoSuchDepartmentException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeDepartment(Integer aId) throws NoSuchDepartmentException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeDepartment(aId);
			else
				throw new NoSuchDepartmentException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateDepartment(Department aDepartments) throws NoSuchDepartmentException, MappingException,
			ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateDepartment(aDepartments);
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

	public ArrayList findOwnershipFormTypeList(String searchStr, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOwnershipFormTypeList(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void addOwnershipFormType(OwnershipFormType newOwnershipFormType) throws MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addOwnershipFormType(newOwnershipFormType);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addOwnershipFormTypes:" + e);
			}
		}

	}

	public OwnershipFormType findOwnershipFormTypeByKey(Integer id) throws NoSuchOwnershipFormTypeException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOwnershipFormTypeByKey(id);
			else
				throw new NoSuchOwnershipFormTypeException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeOwnershipFormType(Integer aId) throws NoSuchOwnershipFormTypeException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeOwnershipFormType(aId);
			else
				throw new NoSuchOwnershipFormTypeException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateOwnershipFormType(OwnershipFormType aOwnershipFormType) throws NoSuchOwnershipFormTypeException,
			MappingException, ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateOwnershipFormType(aOwnershipFormType);
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

	public void addOrganizationGroup(OrganizationGroup newOrganizationGroup) throws MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addOrganizationGroup(newOrganizationGroup);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addOrganizationGroups:" + e);
			}
		}

	}

	public OrganizationGroup findOrganizationGroupByKey(Integer id) throws NoSuchOrganizationGroupException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOrganizationGroupByKey(id);
			else
				throw new NoSuchOrganizationGroupException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOrganizationGroupList(String searchStr, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOrganizationGroupList(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOrganizationGroupListTO(String searchStr, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOrganizationGroupListTO(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findGroupListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findGroupListByOrganization(organizationID, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeOrganizationGroup(Integer aId) throws NoSuchOrganizationGroupException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeOrganizationGroup(aId);
			else
				throw new NoSuchOrganizationGroupException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateOrganizationGroup(OrganizationGroup aOrganizationGroup) throws NoSuchOrganizationGroupException,
			MappingException, ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateOrganizationGroup(aOrganizationGroup);
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

	public void addLinkGroupToOrganization(String groupKey, String organizationKey) throws ModelException,
			MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addLinkGroupToOrganization(groupKey, organizationKey);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void addLinkGroupToOrganizationCRM(String groupKey, String organizationCrmKey) throws ModelException,
			MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addLinkGroupToOrganizationCRM(groupKey, organizationCrmKey);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void deleteLinkGroupToOrganization(String groupKey, String organizationKey) throws ModelException,
			MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.deleteLinkGroupToOrganization(groupKey, organizationKey);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void deleteLinkGroupToOrganizationCRM(String groupKey, String organizationCrmKey) throws ModelException,
			MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.deleteLinkGroupToOrganizationCRM(groupKey, organizationCrmKey);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOrganizationListByGroup(Integer groupID, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOrganizationListByGroup(groupID, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void addAddress(Address newAddress) throws MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addAddress(newAddress);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addAddresss:" + e);
			}
		}

	}

	public Address findAddressByKey(Integer aId) throws NoSuchAddressException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findAddressByKey(aId);
			else
				throw new NoSuchAddressException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findAddressListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findAddressListByOrganization(organizationID, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeAddress(Integer aId) throws NoSuchAddressException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeAddress(aId);
			else
				throw new NoSuchAddressException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateAddress(Address aAddresss) throws NoSuchAddressException, MappingException, ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateAddress(aAddresss);
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

	public ArrayList findProcessTypeList(String searchStr, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findProcessTypeList(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void addGovern(Govern newGovern) throws MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addGovern(newGovern);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addGoverns:" + e);
			}
		}
	}

	public Govern findGovernByKey(Integer aId) throws NoSuchGovernException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findGovernByKey(aId);
			else
				throw new NoSuchGovernException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findGovernListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findGovernListByOrganization(organizationID, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeGovern(Integer aId) throws NoSuchGovernException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeGovern(aId);
			else
				throw new NoSuchGovernException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateGovern(Govern aGovern) throws NoSuchGovernException, MappingException, ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateGovern(aGovern);
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

	public void addShareholder(Shareholder newShareholder) throws MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addShareholder(newShareholder);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addShareholders:" + e);
			}
		}
	}

	public Shareholder findShareholderByKey(Integer aId) throws NoSuchShareholderException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findShareholderByKey(aId);
			else
				throw new NoSuchShareholderException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findShareholderListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findShareholderListByOrganization(organizationID, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeShareholder(Integer aId) throws NoSuchShareholderException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeShareholder(aId);
			else
				throw new NoSuchShareholderException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateShareholder(Shareholder aShareholder) throws NoSuchShareholderException, MappingException,
			ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateShareholder(aShareholder);
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

	public void addManager(Manager newManager) throws MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addManager(newManager);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addManagers:" + e);
			}
		}
	}

	public Manager findManagerByKey(Integer aId) throws NoSuchManagerException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findManagerByKey(aId);
			else
				throw new NoSuchManagerException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findManagerListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findManagerListByOrganization(organizationID, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeManager(Integer aId) throws NoSuchManagerException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeManager(aId);
			else
				throw new NoSuchManagerException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateManager(Manager aManager) throws NoSuchManagerException, MappingException, ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateManager(aManager);
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

	public void addOkved(Okved newOkved) throws MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addOkved(newOkved);
			else
				throw new MappingException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in addOkveds:" + e);
			}
		}
	}

	public Okved findOkvedByKey(Integer aId) throws NoSuchOkvedException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOkvedByKey(aId);
			else
				throw new NoSuchOkvedException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOkvedList(String searchStr, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOkvedList(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOkvedListTO(String searchStr, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOkvedListTO(searchStr, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void removeOkved(Integer aId) throws NoSuchOkvedException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.removeOkved(aId);
			else
				throw new NoSuchOkvedException("No Facade found");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception is " + e);
			}
		}
	}

	public void updateOkved(Okved aOkved) throws NoSuchOkvedException, MappingException, ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.updateOkved(aOkved);
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

	public ArrayList findOkvedHierarchyList(Integer parentID, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOkvedHierarchyList(parentID, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void addLinkOkvedToOrganization(String okvedKey, String organizationKey) throws ModelException,
			MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addLinkOkvedToOrganization(okvedKey, organizationKey);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}
	
	public void addLinkOkvedCrmToOrganization(String okvedCrmKey, String organizationKey) throws ModelException,
			MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addLinkOkvedCrmToOrganization(okvedCrmKey, organizationKey);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
}	

	public void deleteLinkOkvedToOrganization(String okvedKey, String organizationKey) throws ModelException,
			MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.deleteLinkOkvedToOrganization(okvedKey, organizationKey);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}
	
	public void deleteLinkOkvedCrmToOrganization(String okvedCrmKey, String organizationKey) throws ModelException,
			MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.deleteLinkOkvedCrmToOrganization(okvedCrmKey, organizationKey);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
}	

	public ArrayList findOkvedListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOkvedListByOrganization(organizationID, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOrganizationListTO_ByGroup(Integer groupID, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOrganizationListTO_ByGroup(groupID, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void addLinkGroupCrmToOrganization(String groupCrmKey, String organizationKey) throws ModelException, MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addLinkGroupCrmToOrganization(groupCrmKey, organizationKey);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void addLinkGroupCrmToOrganizationCRM(String groupCrmKey, String organizationCrmKey) throws ModelException, MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.addLinkGroupCrmToOrganizationCRM(groupCrmKey, organizationCrmKey);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void deleteLinkGroupCrmToOrganization(String groupCrmKey, String organizationKey) throws ModelException, MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.deleteLinkGroupCrmToOrganization(groupCrmKey, organizationKey);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public void deleteLinkGroupCrmToOrganizationCRM(String groupCrmKey, String organizationCrmKey) throws ModelException, MappingException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				modelFacade.deleteLinkGroupCrmToOrganizationCRM(groupCrmKey, organizationCrmKey);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public OrganizationGroup findOrganizationGroupByCrmKey(String aId) throws NoSuchOrganizationGroupException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOrganizationGroupByCrmKey(aId);
			else
				throw new NoSuchOrganizationGroupException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOrganizationListTO_ByGroupCRM(String groupCrmID, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOrganizationListTO_ByGroupCRM(groupCrmID, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findGroupListTO_ByOrganization(Integer organizationID, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findGroupListTO_ByOrganization(organizationID, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findGroupListTO_ByOrganizationCRM(String orgCrmID, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findGroupListTO_ByOrganizationCRM(orgCrmID, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}

	public ArrayList findOkvedListTO_ByOrganization(Integer organizationID, String orderBy) throws ModelException {
		SecurityActionProcessorFacadeLocal modelFacade = null;
		try {
			modelFacade = getSecurityFacade();
			if (modelFacade != null)
				return modelFacade.findOkvedListTO_ByOrganization(organizationID, orderBy);
			else
				throw new ModelException("Could not create Facade");
		} finally {
			try {
				modelFacade.remove();
			} catch (Exception e) {
				AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught trying to remove facade" + e);
			}
		}
	}
	
}
