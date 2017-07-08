package com.vtb.ejb;

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
import com.vtb.domain.ProcessType;
import com.vtb.domain.Role;
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
import com.vtb.mapping.AddressMapper;
import com.vtb.mapping.DepartmentMapper;
import com.vtb.mapping.GovernMapper;
import com.vtb.mapping.MQSchedulerSheetMapper;
import com.vtb.mapping.ManagerMapper;
import com.vtb.mapping.Mapper;
import com.vtb.mapping.MapperFactory;
import com.vtb.mapping.OkvedMapper;
import com.vtb.mapping.OperatorMapper;
import com.vtb.mapping.OrganizationGroupMapper;
import com.vtb.mapping.OrganizationLinkMapper;
import com.vtb.mapping.OrganizationMapper;
import com.vtb.mapping.OwnershipFormTypeMapper;
import com.vtb.mapping.ProcessTypeMapper;
import com.vtb.mapping.RoleMapper;
import com.vtb.mapping.ShareholderMapper;
import com.vtb.model.SecurityActionProcessor;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;

/**
 * Bean implementation class for Enterprise Bean: SecurityActionProcessorFacade
 */
public class SecurityActionProcessorFacadeBean implements javax.ejb.SessionBean {

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
	 * @see SecurityActionProcessor#findDepartments(String nameDepartment,
	 *      String orderBy)
	 */
	public ArrayList findDepartments(String nameDepartment, String orderBy) throws ModelException {
		ArrayList list = null;
		DepartmentMapper mapper = null;
		try {
			mapper = (DepartmentMapper) MapperFactory.getSystemMapperFactory().getMapper(Department.class);
			list = mapper.findByName(nameDepartment, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Department: Exception caught in SystemMapper findDepartmentsByName " + e);
			try {
				mapper = (DepartmentMapper) MapperFactory.getReserveMapperFactory().getMapper(Department.class);
				list = mapper.findByName(nameDepartment, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findDepartmentsByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findDepartmentByKey(String)
	 */
	public Department findDepartmentByKey(Integer aId) throws NoSuchDepartmentException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Department.class);
			return (Department) mapper.findByPrimaryKey(new Department(aId));
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Department: Exception caught in SystemMapper findDepartmentByKey " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Department.class);
				return (Department) mapper.findByPrimaryKey(new Department(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchDepartmentException)
					throw (NoSuchDepartmentException) nsoe;
				else
					throw new NoSuchDepartmentException(nsoe, ("Exception caught in findDepartmentByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#addDepartment(Department)
	 */
	public void addDepartment(Department newDepartment) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Department.class);
			mapper.insert(newDepartment);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Department: Exception caught in SystemMapper addDepartment " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Department.class);
			mapper.insert(newDepartment);
		}
	}

	/**
	 * @see SecurityActionProcessor#updateDepartment(Department)
	 */
	public void updateDepartment(Department aDepartment) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Department.class);
			mapper.update(aDepartment);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Department: Exception caught in SystemMapper updateDepartment " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Department.class);
			mapper.update(aDepartment);
		}
	}

	/**
	 * @see SecurityActionProcessor#removeDepartment(String)
	 */
	public void removeDepartment(Integer aId) throws NoSuchDepartmentException {
		Mapper mapper = null;
		Department emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Department.class);
			emp = (Department) mapper.findByPrimaryKey(new Department(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Department: Exception caught in SystemMapper removeDepartment " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Department.class);
				emp = (Department) mapper.findByPrimaryKey(new Department(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchDepartmentException)
					throw (NoSuchDepartmentException) nsoe;
				else
					throw new NoSuchDepartmentException(nsoe, ("Exception caught in removeDepartmen" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#findSpoSettingByKey(String)
	 */
	public SPOSettings findSpoSettingByKey(Integer aId) throws NoSuchSpoSettingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(SPOSettings.class);
			return (SPOSettings) mapper.findByPrimaryKey(new SPOSettings(aId));
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for SPOSettings: Exception caught in SystemMapper findSpoSettingByKey " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(SPOSettings.class);
				return (SPOSettings) mapper.findByPrimaryKey(new SPOSettings(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchSpoSettingException)
					throw (NoSuchSpoSettingException) nsoe;
				else
					throw new NoSuchSpoSettingException(nsoe, ("Exception caught in findSpoSettingByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#addSpoSetting(SPOSettings)
	 */
	public void addSpoSetting(SPOSettings newSpoSetting) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(SPOSettings.class);
			mapper.insert(newSpoSetting);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for SPOSettings: Exception caught in SystemMapper addSpoSetting " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(SPOSettings.class);
			mapper.insert(newSpoSetting);
		}
	}

	/**
	 * @see SecurityActionProcessor#updateSpoSetting(SPOSettings)
	 */
	public void updateSpoSetting(SPOSettings aSpoSetting) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(SPOSettings.class);
			mapper.update(aSpoSetting);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for SPOSettings: Exception caught in SystemMapper updateSpoSetting " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(SPOSettings.class);
			mapper.update(aSpoSetting);
		}
	}

	/**
	 * @see SecurityActionProcessor#removeSpoSetting(String)
	 */
	public void removeSpoSetting(Integer aId) throws NoSuchSpoSettingException {
		Mapper mapper = null;
		SPOSettings emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(SPOSettings.class);
			emp = (SPOSettings) mapper.findByPrimaryKey(new SPOSettings(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for SPOSettings: Exception caught in SystemMapper removeSPOSettings " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(SPOSettings.class);
				emp = (SPOSettings) mapper.findByPrimaryKey(new SPOSettings(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchSpoSettingException)
					throw (NoSuchSpoSettingException) nsoe;
				else
					throw new NoSuchSpoSettingException(nsoe, ("Exception caught in removeSpoSetting" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#findOperators(Integer departmentKey, String
	 *      nameOperator, String orderBy)
	 */
	public ArrayList findOperators(Integer departmentKey, String nameOperator, String orderBy) throws ModelException {
		ArrayList list = null;
		OperatorMapper mapper = null;
		try {
			mapper = (OperatorMapper) MapperFactory.getSystemMapperFactory().getMapper(Operator.class);
			list = mapper.findByName(departmentKey, nameOperator, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Operator: Exception caught in SystemMapper findOperatorsByName " + e);
			try {
				mapper = (OperatorMapper) MapperFactory.getReserveMapperFactory().getMapper(Operator.class);
				list = mapper.findByName(departmentKey, nameOperator, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findOperatorsByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findOperatorByKey(Integer)
	 */
	public Operator findOperatorByKey(Integer aId) throws NoSuchOperatorException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Operator.class);
			return (Operator) mapper.findByPrimaryKey(new Operator(aId));
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Operator: Exception caught in SystemMapper findOperatorByKey " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Operator.class);
				return (Operator) mapper.findByPrimaryKey(new Operator(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchOperatorException)
					throw (NoSuchOperatorException) nsoe;
				else
					throw new NoSuchOperatorException(nsoe, ("Exception caught in findOperatorByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#findOperatorByLogin(String)
	 */
	public Operator findOperatorByLogin(String aLogin) throws NoSuchOperatorException {
		OperatorMapper mapper = null;
		try {
			mapper = (OperatorMapper)MapperFactory.getSystemMapperFactory().getMapper(Operator.class);
			return (Operator) mapper.findOperatorByLogin(aLogin);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Operator: Exception caught in SystemMapper findOperatorByKey " + e);
			try {
				mapper = (OperatorMapper)MapperFactory.getReserveMapperFactory().getMapper(Operator.class);
				return (Operator) mapper.findOperatorByLogin(aLogin);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchOperatorException)
					throw (NoSuchOperatorException) nsoe;
				else
					throw new NoSuchOperatorException(nsoe, ("Exception caught in findOperatorByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#addOperator(Operator)
	 */
	public void addOperator(Operator newOperator) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Operator.class);
			mapper.insert(newOperator);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Operator: Exception caught in SystemMapper addOperator " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Operator.class);
			mapper.insert(newOperator);
		}
	}

	/**
	 * @see SecurityActionProcessor#updateOperator(Operator)
	 */
	public void updateOperator(Operator aOperator) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Operator.class);
			mapper.update(aOperator);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Operator: Exception caught in SystemMapper updateOperator " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(Operator.class);
			mapper.update(aOperator);
		}
	}

	/**
	 * @see SecurityActionProcessor#removeOperator(Integer)
	 */
	public void removeOperator(Integer aId) throws NoSuchOperatorException {
		Mapper mapper = null;
		Operator emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Operator.class);
			emp = (Operator) mapper.findByPrimaryKey(new Operator(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Operator: Exception caught in SystemMapper removeOperator " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(Operator.class);
				emp = (Operator) mapper.findByPrimaryKey(new Operator(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchOperatorException)
					throw (NoSuchOperatorException) nsoe;
				else
					throw new NoSuchOperatorException(nsoe, ("Exception caught in removeOperator" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#findOperatorToRoleAccessList(Integer
	 *      operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToRoleAccessList(String operatorKey, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			RoleMapper mapper = (RoleMapper) MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			list = mapper.findOperatorToRoleAccessList(operatorKey, orderBy);
		} catch (Exception e) {
			throw new ModelException(e, ("MappingException caught in findOperatorToRoleAccessList " + e));
		}
		return list;
	}
	
	/**
	 * @see SecurityActionProcessor#findOperatorToRoleAccessList(Integer
	 *      operatorKey, String orderBy)
	 */
	public ArrayList findOperatorToRoleAccessList(String operatorKey, String aProcessID, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			RoleMapper mapper = (RoleMapper) MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			list = mapper.findOperatorToRoleAccessList(operatorKey, aProcessID, orderBy);
		} catch (Exception e) {
			throw new ModelException(e, ("MappingException caught in findOperatorToRoleAccessList " + e));
		}
		return list;
	}	

	/**
	 * @see SecurityActionProcessor#findOperatorToRoleList(Integer operatorKey,
	 *      String orderBy)
	 */
	public ArrayList findOperatorToRoleList(String operatorKey, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			RoleMapper mapper = (RoleMapper) MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			list = mapper.findOperatorToRoleList(operatorKey, orderBy);
		} catch (Exception e) {
			throw new ModelException(e, ("MappingException caught in findOperatorToRoleList " + e));
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#addLinkOperatorToRole(operatorKey, roleKey)
	 */
	public void addLinkOperatorToRole(String operatorKey, String roleKey) throws MappingException {
		RoleMapper mapper = null;
		try {
			mapper = (RoleMapper) MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			mapper.addLinkOperatorToRole(operatorKey, roleKey);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Role: Exception caught in SystemMapper addLinkOperatorToRole " + e);
			mapper = (RoleMapper) MapperFactory.getReserveMapperFactory().getMapper(Role.class);
			mapper.addLinkOperatorToRole(operatorKey, roleKey);
		}
	}

	/**
	 * @see SecurityActionProcessor#deleteLinkOperatorToRole(operatorKey,
	 *      roleKey)
	 */
	public void deleteLinkOperatorToRole(String operatorKey, String roleKey) throws MappingException {
		RoleMapper mapper = null;
		try {
			mapper = (RoleMapper) MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			mapper.deleteLinkOperatorToRole(operatorKey, roleKey);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Role: Exception caught in SystemMapper deleteLinkOperatorToRole " + e);
			mapper = (RoleMapper) MapperFactory.getReserveMapperFactory().getMapper(Role.class);
			mapper.deleteLinkOperatorToRole(operatorKey, roleKey);
		}
	}

	/**
	 * @see SecurityActionProcessor#setStatusLinkOperatorToRole(operatorKey,
	 *      roleKey, String status)
	 */
	public void setStatusLinkOperatorToRole(String operatorKey, String roleKey, String status) throws MappingException {
		RoleMapper mapper = null;
		try {
			mapper = (RoleMapper) MapperFactory.getSystemMapperFactory().getMapper(Role.class);
			mapper.setStatusLinkOperatorToRole(operatorKey, roleKey, status);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for Role: Exception caught in SystemMapper setStatusLinkOperatorToRole " + e);
			mapper = (RoleMapper) MapperFactory.getReserveMapperFactory().getMapper(Role.class);
			mapper.setStatusLinkOperatorToRole(operatorKey, roleKey, status);
		}
	}

	/**
	 * @see SecurityActionProcessor#findMqSchedulerSheetByKey(String)
	 */
	public MQSchedulerSheet findMqSchedulerSheetByKey(Integer aId) throws NoSuchMqSchedulerSheetException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(MQSchedulerSheet.class);
			return (MQSchedulerSheet) mapper.findByPrimaryKey(new MQSchedulerSheet(aId));
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for MQSchedulerSheet: Exception caught in SystemMapper findMqSchedulerSheetByKey " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(MQSchedulerSheet.class);
				return (MQSchedulerSheet) mapper.findByPrimaryKey(new MQSchedulerSheet(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchMqSchedulerSheetException)
					throw (NoSuchMqSchedulerSheetException) nsoe;
				else
					throw new NoSuchMqSchedulerSheetException(nsoe, ("Exception caught in findMqSchedulerSheetByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#addMqSchedulerSheet(MQSchedulerSheet)
	 */
	public void addMqSchedulerSheet(MQSchedulerSheet newMqSchedulerSheet) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(MQSchedulerSheet.class);
			mapper.insert(newMqSchedulerSheet);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for MQSchedulerSheet: Exception caught in SystemMapper addMqSchedulerSheet " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(MQSchedulerSheet.class);
			mapper.insert(newMqSchedulerSheet);
		}
	}

	/**
	 * @see SecurityActionProcessor#updateMqSchedulerSheet(MQSchedulerSheet)
	 */
	public void updateMqSchedulerSheet(MQSchedulerSheet aMqSchedulerSheet) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(MQSchedulerSheet.class);
			mapper.update(aMqSchedulerSheet);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for MQSchedulerSheet: Exception caught in SystemMapper updateMqSchedulerSheet " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(MQSchedulerSheet.class);
			mapper.update(aMqSchedulerSheet);
		}
	}

	/**
	 * @see SecurityActionProcessor#removeMqSchedulerSheet(String)
	 */
	public void removeMqSchedulerSheet(Integer aId) throws NoSuchMqSchedulerSheetException {
		Mapper mapper = null;
		MQSchedulerSheet emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(MQSchedulerSheet.class);
			emp = (MQSchedulerSheet) mapper.findByPrimaryKey(new MQSchedulerSheet(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for MQSchedulerSheet: Exception caught in SystemMapper removeMQSchedulerSheet " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(MQSchedulerSheet.class);
				emp = (MQSchedulerSheet) mapper.findByPrimaryKey(new MQSchedulerSheet(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchMqSchedulerSheetException)
					throw (NoSuchMqSchedulerSheetException) nsoe;
				else
					throw new NoSuchMqSchedulerSheetException(nsoe, ("Exception caught in removeMqSchedulerSheet" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#findMqSchedulerSheetList(Integer
	 *      departmentKey, String searchStr, String orderBy)
	 */
	public ArrayList findMqSchedulerSheetList(Integer departmentKey, String searchStr, String orderBy) throws ModelException {
		ArrayList list = null;
		MQSchedulerSheetMapper mapper = null;
		try {
			mapper = (MQSchedulerSheetMapper) MapperFactory.getSystemMapperFactory().getMapper(MQSchedulerSheet.class);
			list = mapper.findList(departmentKey, searchStr, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for MqSchedulerSheet: Exception caught in SystemMapper findMqSchedulerSheetsByName " + e);
			try {
				mapper = (MQSchedulerSheetMapper) MapperFactory.getReserveMapperFactory().getMapper(MQSchedulerSheet.class);
				list = mapper.findList(departmentKey, searchStr, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findMqSchedulerSheetsByName " + eReserve));
			}
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findOrganizationList(String nameOrganization,
	 *      String orderBy)
	 */
	public ArrayList findOrganizationList(String nameOrganization, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OrganizationMapper mapper = (OrganizationMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			list = mapper.findList(nameOrganization, orderBy);
		} catch (Exception e) {
				throw new ModelException(e, ("MappingException caught in findOrganizationsByName " + e));
		}
		return list;
	}
	
	/**
	 * @see SecurityActionProcessor#findOrganizationListTO(String nameOrganization,
	 *      String orderBy)
	 */
	public ArrayList findOrganizationListTO(String nameOrganization, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OrganizationMapper mapper = (OrganizationMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			list = mapper.findListTO(nameOrganization, orderBy);
		} catch (Exception e) {
				throw new ModelException(e, ("MappingException caught in findOrganizationsByName " + e));
		}
		return list;
	}	

	/**
	 * @see SecurityActionProcessor#findOrganizationByKey(String)
	 */
	public Organization findOrganizationByKey(Integer aId) throws NoSuchOrganizationException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			return (Organization) mapper.findByPrimaryKey(new Organization(aId));
		} catch (Exception e) {
			if (e instanceof NoSuchOrganizationException)
				throw (NoSuchOrganizationException) e;
			else
				throw new NoSuchOrganizationException(e, ("Exception caught in findOrganizationByKey:" + e.getMessage()));
		}
	}
	
	/**
	 * @see SecurityActionProcessor#findOrganizationByCrmKey(Integer)
	 */
	public Organization findOrganizationByCrmKey(String aIdCrm) throws NoSuchOrganizationException {
		OrganizationMapper mapper = null;
		try {
			mapper = (OrganizationMapper)MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			return (Organization) mapper.findByCrmKey(new Organization(null, aIdCrm, null));
		} catch (Exception e) {
			if (e instanceof NoSuchOrganizationException)
				throw (NoSuchOrganizationException) e;
			else
				throw new NoSuchOrganizationException(e, ("Exception caught in findOrganizationByKey:" + e.getMessage()));
		}
	}	

	/**
	 * @see SecurityActionProcessor#addOrganization(Organization)
	 */
	public void addOrganization(Organization newOrganization) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
		mapper.insert(newOrganization);
	}

	/**
	 * @see SecurityActionProcessor#updateOrganization(Organization)
	 */
	public void updateOrganization(Organization aOrganization) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
		mapper.update(aOrganization);
	}
	
	/**
	 * @see SecurityActionProcessor#updateOrganizationCRM(Organization)
	 */
	public void updateOrganizationCRM(Organization aOrganization) throws MappingException {
		OrganizationMapper mapper = (OrganizationMapper)MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
		mapper.updateCRM(aOrganization);
	}	

	/**
	 * @see SecurityActionProcessor#removeOrganization(String)
	 */
	public void removeOrganization(Integer aId) throws NoSuchOrganizationException {
		try{
			Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			Organization vo = (Organization) mapper.findByPrimaryKey(new Organization(aId));
			mapper.remove(vo);
		} catch (Exception e) {
			if (e instanceof NoSuchOrganizationException)
				throw (NoSuchOrganizationException) e;
			else
				throw new NoSuchOrganizationException(e, ("Exception caught in removeDepartmen" + e.getMessage()));
		}
	}
	
	/**
	 * @see SecurityActionProcessor#findOwnershipFormTypeList(String nameOwnershipFormType,
	 *      String orderBy)
	 */
	public ArrayList findOwnershipFormTypeList(String nameOwnershipFormType, String orderBy) throws ModelException {
		ArrayList list = null;
		OwnershipFormTypeMapper mapper = null;
		try {
			mapper = (OwnershipFormTypeMapper) MapperFactory.getSystemMapperFactory().getMapper(OwnershipFormType.class);
			list = mapper.findByName(nameOwnershipFormType, orderBy);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for OwnershipFormType: Exception caught in SystemMapper findOwnershipFormTypesByName " + e);
			try {
				mapper = (OwnershipFormTypeMapper) MapperFactory.getReserveMapperFactory().getMapper(OwnershipFormType.class);
				list = mapper.findByName(nameOwnershipFormType, orderBy);
			} catch (MappingException eReserve) {
				throw new ModelException(eReserve, ("MappingException caught in findOwnershipFormTypesByName " + eReserve));
			}
		}
		return list;
	}
	
	/**
	 * @see SecurityActionProcessor#findOwnershipFormTypeByKey(String)
	 */
	public OwnershipFormType findOwnershipFormTypeByKey(Integer aId) throws NoSuchOwnershipFormTypeException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(OwnershipFormType.class);
			return (OwnershipFormType) mapper.findByPrimaryKey(new OwnershipFormType(aId));
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for OwnershipFormType: Exception caught in SystemMapper findOwnershipFormTypeByKey " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(OwnershipFormType.class);
				return (OwnershipFormType) mapper.findByPrimaryKey(new OwnershipFormType(aId));
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchOwnershipFormTypeException)
					throw (NoSuchOwnershipFormTypeException) nsoe;
				else
					throw new NoSuchOwnershipFormTypeException(nsoe, ("Exception caught in findOwnershipFormTypeByKey:" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#addOwnershipFormType(OwnershipFormType)
	 */
	public void addOwnershipFormType(OwnershipFormType newOwnershipFormType) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(OwnershipFormType.class);
			mapper.insert(newOwnershipFormType);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for OwnershipFormType: Exception caught in SystemMapper addOwnershipFormType " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(OwnershipFormType.class);
			mapper.insert(newOwnershipFormType);
		}
	}

	/**
	 * @see SecurityActionProcessor#updateOwnershipFormType(OwnershipFormType)
	 */
	public void updateOwnershipFormType(OwnershipFormType aOwnershipFormType) throws MappingException {
		Mapper mapper = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(OwnershipFormType.class);
			mapper.update(aOwnershipFormType);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for OwnershipFormType: Exception caught in SystemMapper updateOwnershipFormType " + e);
			mapper = MapperFactory.getReserveMapperFactory().getMapper(OwnershipFormType.class);
			mapper.update(aOwnershipFormType);
		}
	}

	/**
	 * @see SecurityActionProcessor#removeOwnershipFormType(String)
	 */
	public void removeOwnershipFormType(Integer aId) throws NoSuchOwnershipFormTypeException {
		Mapper mapper = null;
		OwnershipFormType emp = null;
		try {
			mapper = MapperFactory.getSystemMapperFactory().getMapper(OwnershipFormType.class);
			emp = (OwnershipFormType) mapper.findByPrimaryKey(new OwnershipFormType(aId));
			mapper.remove(emp);
		} catch (Exception e) {
			AppService.log(TraceCapable.INFO_LEVEL, "Include ReserveMapper for OwnershipFormType: Exception caught in SystemMapper removeOwnershipFormType " + e);
			try {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(OwnershipFormType.class);
				emp = (OwnershipFormType) mapper.findByPrimaryKey(new OwnershipFormType(aId));
				mapper.remove(emp);
			} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchOwnershipFormTypeException)
					throw (NoSuchOwnershipFormTypeException) nsoe;
				else
					throw new NoSuchOwnershipFormTypeException(nsoe, ("Exception caught in removeDepartmen" + nsoe.getMessage()));
			}
		}
	}

	/**
	 * @see SecurityActionProcessor#findOrganizationGroupList(String nameOrganizationGroup,
	 *      String orderBy)
	 */
	public ArrayList findOrganizationGroupList(String nameOrganizationGroup, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OrganizationGroupMapper  mapper = (OrganizationGroupMapper) MapperFactory.getSystemMapperFactory().getMapper(OrganizationGroup.class);
			list = mapper.findList(nameOrganizationGroup, orderBy);
		} catch (MappingException eReserve) {
			throw new ModelException(eReserve, ("MappingException caught in findOrganizationGroupsByName " + eReserve));
		}
		return list;
	}
	
	/**
	 * @see SecurityActionProcessor#findOrganizationGroupList(String nameOrganizationGroup,
	 *      String orderBy)
	 */
	public ArrayList findOrganizationGroupListTO(String nameOrganizationGroup, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OrganizationGroupMapper  mapper = (OrganizationGroupMapper) MapperFactory.getSystemMapperFactory().getMapper(OrganizationGroup.class);
			list = mapper.findListTO(nameOrganizationGroup, orderBy);
		} catch (MappingException eReserve) {
			throw new ModelException(eReserve, ("MappingException caught in findOrganizationGroupsByName " + eReserve));
		}
		return list;
	}	
	
	/**
	 * @see SecurityActionProcessor#findGroupListByOrganization(Integer organizationID,
	 *      String orderBy)
	 */
	public ArrayList findGroupListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OrganizationGroupMapper  mapper = (OrganizationGroupMapper) MapperFactory.getSystemMapperFactory().getMapper(OrganizationGroup.class);
			list = mapper.findListByOrganization(organizationID, orderBy);
		} catch (MappingException eReserve) {
			throw new ModelException(eReserve, ("MappingException caught in findOrganizationGroupsByName " + eReserve));
		}
		return list;
	}
	
	/**
	 * @see SecurityActionProcessor#findGroupListTO_ByOrganization(Integer organizationID,
	 *      String orderBy)
	 */
	public ArrayList findGroupListTO_ByOrganization(Integer organizationID, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OrganizationGroupMapper  mapper = (OrganizationGroupMapper) MapperFactory.getSystemMapperFactory().getMapper(OrganizationGroup.class);
			list = mapper.findListTO_ByOrganization(organizationID, orderBy);
		} catch (MappingException eReserve) {
			throw new ModelException(eReserve, ("MappingException caught in findOrganizationGroupsByName " + eReserve));
		}
		return list;
	}
	
	/**
	 * @see SecurityActionProcessor#findGroupListTO_ByOrganization(String orgCrmID,
	 *      String orderBy)
	 */
	public ArrayList findGroupListTO_ByOrganizationCRM(String orgCrmID, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OrganizationGroupMapper  mapper = (OrganizationGroupMapper) MapperFactory.getSystemMapperFactory().getMapper(OrganizationGroup.class);
			list = mapper.findListTO_ByOrganizationCRM(orgCrmID, orderBy);
		} catch (MappingException eReserve) {
			throw new ModelException(eReserve, ("MappingException caught in findOrganizationGroupsByName " + eReserve));
		}
		return list;
	}	
	
	/**
	 * @see SecurityActionProcessor#findOkvedListByOrganization(Integer organizationID,
	 *      String orderBy)
	 */
	public ArrayList findOkvedListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OkvedMapper  mapper = (OkvedMapper) MapperFactory.getSystemMapperFactory().getMapper(Okved.class);
			list = mapper.findListByOrganization(organizationID, orderBy);
		} catch (MappingException eReserve) {
			throw new ModelException(eReserve, ("MappingException caught in findOrganizationOkvedsByName " + eReserve));
		}
		return list;
	}		

	/**
	 * @see SecurityActionProcessor#findOrganizationGroupByKey(String)
	 */
	public OrganizationGroup findOrganizationGroupByKey(Integer aId) throws NoSuchOrganizationGroupException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(OrganizationGroup.class);
		try {
			return (OrganizationGroup) mapper.findByPrimaryKey(new OrganizationGroup(aId));
		} catch (Exception e) {
			if (e instanceof NoSuchOrganizationGroupException)
				throw (NoSuchOrganizationGroupException) e;
			else
				throw new NoSuchOrganizationGroupException(e, ("Exception caught in findOrganizationGroupByKey:" + e.getMessage()));
		}
	}
	
	/**
	 * @see SecurityActionProcessor#findOrganizationGroupByCrmKey(String)
	 */
	public OrganizationGroup findOrganizationGroupByCrmKey(String aCrmKey) throws NoSuchOrganizationGroupException {
		OrganizationGroupMapper mapper = (OrganizationGroupMapper)MapperFactory.getSystemMapperFactory().getMapper(OrganizationGroup.class);
		try {
			return (OrganizationGroup) mapper.findByCrmKey(new OrganizationGroup(null, aCrmKey, null));
		} catch (Exception e) {
			if (e instanceof NoSuchOrganizationGroupException)
				throw (NoSuchOrganizationGroupException) e;
			else
				throw new NoSuchOrganizationGroupException(e, ("Exception caught in findOrganizationGroupByCrmKey:" + e.getMessage()));
		}
	}	

	/**
	 * @see SecurityActionProcessor#addOrganizationGroup(OrganizationGroup)
	 */
	public void addOrganizationGroup(OrganizationGroup newOrganizationGroup) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(OrganizationGroup.class);
		mapper.insert(newOrganizationGroup);
	}

	/**
	 * @see SecurityActionProcessor#updateOrganizationGroup(OrganizationGroup)
	 */
	public void updateOrganizationGroup(OrganizationGroup aOrganizationGroup) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(OrganizationGroup.class);
		mapper.update(aOrganizationGroup);
	}

	/**
	 * @see SecurityActionProcessor#removeOrganizationGroup(String)
	 */
	public void removeOrganizationGroup(Integer aId) throws NoSuchOrganizationGroupException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(OrganizationGroup.class);
		try {
			OrganizationGroup vo = (OrganizationGroup) mapper.findByPrimaryKey(new OrganizationGroup(aId));
			mapper.remove(vo);
		} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchOrganizationGroupException)
					throw (NoSuchOrganizationGroupException) nsoe;
				else
					throw new NoSuchOrganizationGroupException(nsoe, ("Exception caught in removeOrganizationGroup" + nsoe.getMessage()));
		}
	}
	
	/**
	 * @see SecurityActionProcessor#findOrganizationListByGroup(Integer groupID,
	 *      String orderBy)
	 */
	public ArrayList findOrganizationListByGroup(Integer groupID, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OrganizationMapper  mapper = (OrganizationMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			list = mapper.findListByGroup(groupID, orderBy);
		} catch (MappingException eReserve) {
			throw new ModelException(eReserve, ("MappingException caught in findOrganizationGroupsByName " + eReserve));
		}
		return list;
	}
	
	/**
	 * @see SecurityActionProcessor#findOrganizationListTO_ByGroup(Integer groupID,
	 *      String orderBy)
	 */
	public ArrayList findOrganizationListTO_ByGroup(Integer groupID, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OrganizationMapper  mapper = (OrganizationMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			list = mapper.findListTO_ByGroup(groupID, orderBy);
		} catch (MappingException eReserve) {
			throw new ModelException(eReserve, ("MappingException caught in findOrganizationListTO_ByGroup " + eReserve));
		}
		return list;
	}
	
	/**
	 * @see SecurityActionProcessor#findOrganizationListTO_ByGroupCRM(String groupCrmID,
	 *      String orderBy)
	 */
	public ArrayList findOrganizationListTO_ByGroupCRM(String groupCrmID, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OrganizationMapper  mapper = (OrganizationMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			list = mapper.findListTO_ByGroupCRM(groupCrmID, orderBy);
		} catch (MappingException eReserve) {
			throw new ModelException(eReserve, ("MappingException caught in findOrganizationListTO_ByGroup " + eReserve));
		}
		return list;
	}	
	
	/**
	 * @see SecurityActionProcessor#addLinkGroupToOrganization(groupKey, organizationKey)
	 */
	public void addLinkGroupToOrganization(String groupKey, String organizationKey) throws MappingException {
			OrganizationLinkMapper mapper = (OrganizationLinkMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			mapper.addLinkGroupToOrganization(groupKey, organizationKey);
	}

	/**
	 * @see SecurityActionProcessor#addLinkGroupToOrganizationCRM(groupKey, organizationCrmKey)
	 */
	public void addLinkGroupToOrganizationCRM(String groupKey, String organizationCrmKey) throws MappingException {
			OrganizationLinkMapper mapper = (OrganizationLinkMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			mapper.addLinkGroupToOrganizationCRM(groupKey, organizationCrmKey);
	}
	
	/**
	 * @see SecurityActionProcessor#addLinkGroupCrmToOrganization(groupCrmKey, organizationKey)
	 */
	public void addLinkGroupCrmToOrganization(String groupCrmKey, String organizationKey) throws MappingException {
			OrganizationLinkMapper mapper = (OrganizationLinkMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			mapper.addLinkGroupCrmToOrganization(groupCrmKey, organizationKey);
	}

	/**
	 * @see SecurityActionProcessor#addLinkGroupCrmToOrganizationCRM(groupCrmKey, organizationCrmKey)
	 */
	public void addLinkGroupCrmToOrganizationCRM(String groupCrmKey, String organizationCrmKey) throws MappingException {
			OrganizationLinkMapper mapper = (OrganizationLinkMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			mapper.addLinkGroupCrmToOrganizationCRM(groupCrmKey, organizationCrmKey);
	}	
	
	/**
	 * @see SecurityActionProcessor#deleteLinkGroupToOrganization(groupKey,
	 *      organizationKey)
	 */
	public void deleteLinkGroupToOrganization(String groupKey, String organizationKey) throws MappingException {
			OrganizationLinkMapper mapper = (OrganizationLinkMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			mapper.deleteLinkGroupToOrganization(groupKey, organizationKey);
	}
	
	/**
	 * @see SecurityActionProcessor#deleteLinkGroupToOrganizationCRM(groupKey,
	 *      organizationCrmKey)
	 */
	public void deleteLinkGroupToOrganizationCRM(String groupKey, String organizationCrmKey) throws MappingException {
			OrganizationLinkMapper mapper = (OrganizationLinkMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			mapper.deleteLinkGroupToOrganizationCRM(groupKey, organizationCrmKey);
	}
	
	/**
	 * @see SecurityActionProcessor#deleteLinkGroupCrmToOrganization(groupCrmKey,
	 *      organizationKey)
	 */
	public void deleteLinkGroupCrmToOrganization(String groupCrmKey, String organizationKey) throws MappingException {
			OrganizationLinkMapper mapper = (OrganizationLinkMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			mapper.deleteLinkGroupCrmToOrganization(groupCrmKey, organizationKey);
	}
	
	/**
	 * @see SecurityActionProcessor#deleteLinkGroupToOrganizationCRM(groupCrmKey,
	 *      organizationCrmKey)
	 */
	public void deleteLinkGroupCrmToOrganizationCRM(String groupCrmKey, String organizationCrmKey) throws MappingException {
			OrganizationLinkMapper mapper = (OrganizationLinkMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			mapper.deleteLinkGroupCrmToOrganizationCRM(groupCrmKey, organizationCrmKey);
	}		
	
	/**
	 * @see SecurityActionProcessor#addLinkOkvedToOrganization(okvedKey, organizationKey)
	 */
	public void addLinkOkvedToOrganization(String okvedKey, String organizationKey) throws MappingException {
			OrganizationLinkMapper mapper = (OrganizationLinkMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			mapper.addLinkOkvedToOrganization(okvedKey, organizationKey);
	}
	
	/**
	 * @see SecurityActionProcessor#addLinkOkvedCrmToOrganization(okvedCrmKey, organizationKey)
	 */
	public void addLinkOkvedCrmToOrganization(String okvedCrmKey, String organizationKey) throws MappingException {
			OrganizationLinkMapper mapper = (OrganizationLinkMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			mapper.addLinkOkvedCrmToOrganization(okvedCrmKey, organizationKey);
	}	

	/**
	 * @see SecurityActionProcessor#deleteLinkOkvedToOrganization(okvedKey,
	 *      organizationKey)
	 */
	public void deleteLinkOkvedToOrganization(String okvedKey, String organizationKey) throws MappingException {
			OrganizationLinkMapper mapper = (OrganizationLinkMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			mapper.deleteLinkOkvedToOrganization(okvedKey, organizationKey);
	}	

	/**
	 * @see SecurityActionProcessor#deleteLinkOkvedCrmToOrganization(okvedCrmKey,
	 *      organizationKey)
	 */
	public void deleteLinkOkvedCrmToOrganization(String okvedCrmKey, String organizationKey) throws MappingException {
			OrganizationLinkMapper mapper = (OrganizationLinkMapper) MapperFactory.getSystemMapperFactory().getMapper(Organization.class);
			mapper.deleteLinkOkvedCrmToOrganization(okvedCrmKey, organizationKey);
	}
	
	/**
	 * @see SecurityActionProcessor#findAddressListByOrganization(Integer organizationID,
	 *      String orderBy)
	 */
	public ArrayList findAddressListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			AddressMapper mapper = (AddressMapper) MapperFactory.getSystemMapperFactory().getMapper(Address.class);
			list = mapper.findListByOrganization(organizationID, orderBy);
		} catch (Exception e) {
			throw new ModelException(e, ("MappingException caught in findAddresssByName " + e));
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findAddressByKey(String)
	 */
	public Address findAddressByKey(Integer aId) throws NoSuchAddressException {
		try {
			Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Address.class);
			return (Address) mapper.findByPrimaryKey(new Address(aId));
		} catch (Exception e) {
				if (e instanceof NoSuchAddressException)
					throw (NoSuchAddressException) e;
				else
					throw new NoSuchAddressException(e, ("Exception caught in findAddressByKey:" + e.getMessage()));
		}
	}

	/**
	 * @see SecurityActionProcessor#addAddress(Address)
	 */
	public void addAddress(Address newAddress) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Address.class);
		mapper.insert(newAddress);
	}

	/**
	 * @see SecurityActionProcessor#updateAddress(Address)
	 */
	public void updateAddress(Address aAddress) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Address.class);
		mapper.update(aAddress);
	}

	/**
	 * @see SecurityActionProcessor#removeAddress(String)
	 */
	public void removeAddress(Integer aId) throws NoSuchAddressException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Address.class);;
		try {
			Address vo = (Address) mapper.findByPrimaryKey(new Address(aId));
			mapper.remove(vo);
		} catch (Exception e) {
			if (e instanceof NoSuchAddressException)
				throw (NoSuchAddressException) e;
			else
				throw new NoSuchAddressException(e, ("Exception caught in removeDepartmen" + e.getMessage()));
		}
	}
	
	/**
	 * @see SecurityActionProcessor#findProcessTypeList(String nameProcessType,
	 *      String orderBy)
	 */
	public ArrayList findProcessTypeList(String nameProcessType, String orderBy) throws ModelException {
		ArrayList list = null;
		ProcessTypeMapper mapper = null;
		try {
			mapper = (ProcessTypeMapper) MapperFactory.getSystemMapperFactory().getMapper(ProcessType.class);
			list = mapper.findByName(nameProcessType, orderBy);
		} catch (Exception e) {
				throw new ModelException(e, ("MappingException caught in findProcessTypesByName " + e));
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findGovernListByOrganization(Integer organizationID,
	 *      String orderBy)
	 */
	public ArrayList findGovernListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			GovernMapper mapper = (GovernMapper) MapperFactory.getSystemMapperFactory().getMapper(Govern.class);
			list = mapper.findListByOrganization(organizationID, orderBy);
		} catch (Exception e) {
			throw new ModelException(e, ("MappingException caught in findGovernsByName " + e));
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findGovernByKey(String)
	 */
	public Govern findGovernByKey(Integer aId) throws NoSuchGovernException {
		try {
			Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Govern.class);
			return (Govern) mapper.findByPrimaryKey(new Govern(aId));
		} catch (Exception e) {
				if (e instanceof NoSuchGovernException)
					throw (NoSuchGovernException) e;
				else
					throw new NoSuchGovernException(e, ("Exception caught in findGovernByKey:" + e.getMessage()));
		}
	}

	/**
	 * @see SecurityActionProcessor#addGovern(Govern)
	 */
	public void addGovern(Govern newGovern) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Govern.class);
		mapper.insert(newGovern);
	}

	/**
	 * @see SecurityActionProcessor#updateGovern(Govern)
	 */
	public void updateGovern(Govern aGovern) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Govern.class);
		mapper.update(aGovern);
	}

	/**
	 * @see SecurityActionProcessor#removeGovern(String)
	 */
	public void removeGovern(Integer aId) throws NoSuchGovernException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Govern.class);;
		try {
			Govern vo = (Govern) mapper.findByPrimaryKey(new Govern(aId));
			mapper.remove(vo);
		} catch (Exception e) {
			if (e instanceof NoSuchGovernException)
				throw (NoSuchGovernException) e;
			else
				throw new NoSuchGovernException(e, ("Exception caught in removeDepartmen" + e.getMessage()));
		}
	}
	
	/**
	 * @see SecurityActionProcessor#findShareholderListByOrganization(Integer organizationID,
	 *      String orderBy)
	 */
	public ArrayList findShareholderListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			ShareholderMapper mapper = (ShareholderMapper) MapperFactory.getSystemMapperFactory().getMapper(Shareholder.class);
			list = mapper.findListByOrganization(organizationID, orderBy);
		} catch (Exception e) {
			throw new ModelException(e, ("MappingException caught in findShareholdersByName " + e));
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findShareholderByKey(String)
	 */
	public Shareholder findShareholderByKey(Integer aId) throws NoSuchShareholderException {
		try {
			Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Shareholder.class);
			return (Shareholder) mapper.findByPrimaryKey(new Shareholder(new Long(aId)));
		} catch (Exception e) {
				if (e instanceof NoSuchShareholderException)
					throw (NoSuchShareholderException) e;
				else
					throw new NoSuchShareholderException(e, ("Exception caught in findShareholderByKey:" + e.getMessage()));
		}
	}

	/**
	 * @see SecurityActionProcessor#addShareholder(Shareholder)
	 */
	public void addShareholder(Shareholder newShareholder) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Shareholder.class);
		mapper.insert(newShareholder);
	}

	/**
	 * @see SecurityActionProcessor#updateShareholder(Shareholder)
	 */
	public void updateShareholder(Shareholder aShareholder) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Shareholder.class);
		mapper.update(aShareholder);
	}

	/**
	 * @see SecurityActionProcessor#removeShareholder(String)
	 */
	public void removeShareholder(Integer aId) throws NoSuchShareholderException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Shareholder.class);;
		try {
			Shareholder vo = (Shareholder) mapper.findByPrimaryKey(new Shareholder(new Long(aId)));
			mapper.remove(vo);
		} catch (Exception e) {
			if (e instanceof NoSuchShareholderException)
				throw (NoSuchShareholderException) e;
			else
				throw new NoSuchShareholderException(e, ("Exception caught in removeDepartmen" + e.getMessage()));
		}
	}	
	
	/**
	 * @see SecurityActionProcessor#findManagerListByOrganization(Integer organizationID,
	 *      String orderBy)
	 */
	public ArrayList findManagerListByOrganization(Integer organizationID, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			ManagerMapper mapper = (ManagerMapper) MapperFactory.getSystemMapperFactory().getMapper(Manager.class);
			list = mapper.findListByOrganization(organizationID, orderBy);
		} catch (Exception e) {
			throw new ModelException(e, ("MappingException caught in findManagersByName " + e));
		}
		return list;
	}

	/**
	 * @see SecurityActionProcessor#findManagerByKey(String)
	 */
	public Manager findManagerByKey(Integer aId) throws NoSuchManagerException {
		try {
			Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Manager.class);
			return (Manager) mapper.findByPrimaryKey(new Manager(aId));
		} catch (Exception e) {
				if (e instanceof NoSuchManagerException)
					throw (NoSuchManagerException) e;
				else
					throw new NoSuchManagerException(e, ("Exception caught in findManagerByKey:" + e.getMessage()));
		}
	}

	/**
	 * @see SecurityActionProcessor#addManager(Manager)
	 */
	public void addManager(Manager newManager) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Manager.class);
		mapper.insert(newManager);
	}

	/**
	 * @see SecurityActionProcessor#updateManager(Manager)
	 */
	public void updateManager(Manager aManager) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Manager.class);
		mapper.update(aManager);
	}

	/**
	 * @see SecurityActionProcessor#removeManager(String)
	 */
	public void removeManager(Integer aId) throws NoSuchManagerException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Manager.class);;
		try {
			Manager vo = (Manager) mapper.findByPrimaryKey(new Manager(aId));
			mapper.remove(vo);
		} catch (Exception e) {
			if (e instanceof NoSuchManagerException)
				throw (NoSuchManagerException) e;
			else
				throw new NoSuchManagerException(e, ("Exception caught in removeDepartmen" + e.getMessage()));
		}
	}

	/**
	 * @see SecurityActionProcessor#findOkvedList(String nameOkved,
	 *      String orderBy)
	 */
	public ArrayList findOkvedList(String nameOkved, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OkvedMapper  mapper = (OkvedMapper) MapperFactory.getSystemMapperFactory().getMapper(Okved.class);
			list = mapper.findList(nameOkved, orderBy);
		} catch (MappingException eReserve) {
			throw new ModelException(eReserve, ("MappingException caught in findOkvedsByName " + eReserve));
		}
		return list;
	}
	
	/**
	 * @see SecurityActionProcessor#findOkvedListTO(String nameOkved,
	 *      String orderBy)
	 */
	public ArrayList findOkvedListTO(String nameOkved, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OkvedMapper  mapper = (OkvedMapper) MapperFactory.getSystemMapperFactory().getMapper(Okved.class);
			list = mapper.findListTO(nameOkved, orderBy);
		} catch (MappingException eReserve) {
			throw new ModelException(eReserve, ("MappingException caught in findOkvedsByName " + eReserve));
		}
		return list;
	}
	
	/**
	 * @see SecurityActionProcessor#findOkvedListTO_ByOrganization(Integer organizationID,
	 *      String orderBy)
	 */
	public ArrayList findOkvedListTO_ByOrganization(Integer organizationID, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OkvedMapper  mapper = (OkvedMapper) MapperFactory.getSystemMapperFactory().getMapper(Okved.class);
			list = mapper.findListTO_ByOrganization(organizationID, orderBy);
		} catch (MappingException eReserve) {
			throw new ModelException(eReserve, ("MappingException caught in findOkvedsByName " + eReserve));
		}
		return list;
	}	

	/**
	 * @see SecurityActionProcessor#findOkvedByKey(String)
	 */
	public Okved findOkvedByKey(Integer aId) throws NoSuchOkvedException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Okved.class);
		try {
			return (Okved) mapper.findByPrimaryKey(new Okved(aId));
		} catch (Exception e) {
			if (e instanceof NoSuchOkvedException)
				throw (NoSuchOkvedException) e;
			else
				throw new NoSuchOkvedException(e, ("Exception caught in findOkvedByKey:" + e.getMessage()));
		}
	}

	/**
	 * @see SecurityActionProcessor#addOkved(Okved)
	 */
	public void addOkved(Okved newOkved) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Okved.class);
		mapper.insert(newOkved);
	}

	/**
	 * @see SecurityActionProcessor#updateOkved(Okved)
	 */
	public void updateOkved(Okved aOkved) throws MappingException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Okved.class);
		mapper.update(aOkved);
	}

	/**
	 * @see SecurityActionProcessor#removeOkved(String)
	 */
	public void removeOkved(Integer aId) throws NoSuchOkvedException {
		Mapper mapper = MapperFactory.getSystemMapperFactory().getMapper(Okved.class);
		try {
			Okved vo = (Okved) mapper.findByPrimaryKey(new Okved(aId));
			mapper.remove(vo);
		} catch (Exception nsoe) {
				if (nsoe instanceof NoSuchOkvedException)
					throw (NoSuchOkvedException) nsoe;
				else
					throw new NoSuchOkvedException(nsoe, ("Exception caught in removeOkved" + nsoe.getMessage()));
		}
	}

	/**
	 * @see SecurityActionProcessor#findOkvedHierarchyList(Integer parentID,
	 *      String orderBy)
	 */
	public ArrayList findOkvedHierarchyList(Integer parentID, String orderBy) throws ModelException {
		ArrayList list = null;
		try {
			OkvedMapper  mapper = (OkvedMapper) MapperFactory.getSystemMapperFactory().getMapper(Okved.class);
			list = mapper.findHierarchyList(parentID, orderBy);
		} catch (MappingException eReserve) {
			throw new ModelException(eReserve, ("MappingException caught in findOkvedsByName " + eReserve));
		}
		return list;
	}
}
