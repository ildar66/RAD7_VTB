/*
 * Created on 30.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.vtb.model.test;

import junit.framework.TestCase;

import com.vtb.domain.Department;
import com.vtb.domain.Operator;
import com.vtb.domain.Organization;
import com.vtb.domain.OwnershipFormType;
import com.vtb.exception.MappingException;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.SecurityActionProcessor;
import com.vtb.util.ApplProperties;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class SecurityActionProcessorTests extends TestCase {
	/**
	 * Constructor for NriActionProcessorTests.
	 * @param arg0
	 */
	public SecurityActionProcessorTests(String arg0) {
		super(arg0);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		if (ApplProperties.getCurrentMapperName().equals("EJB")) {
			//deleteAllRows();
		}
		if (ApplProperties.getCurrentMapperName().equals("MEMORY")) {
			deleteAllCache();
		}
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		if (ApplProperties.getCurrentMapperName().equals("EJB")) {
			//deleteAllRows();
		}
		if (ApplProperties.getCurrentMapperName().equals("MEMORY")) {
			deleteAllCache();
		}
	}

	/**
	 * Method deleteAllCache.
	 */
	private void deleteAllCache() {
		SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
		processor.clearInMemoryCaches();
	}

	/**
	 * test for "ѕользователи дл€ филиала"
	 *
	 */
	public void testAddFindDeleteOperator() {

		// test adding, finding and removing a Operator from the model
		SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");

		try {
			Integer key = new Integer("-1");
			String login = new String("loginTest");;
			Integer departmentID = new Integer(1);//id филиала
			
			Operator purple = new Operator(key);
			purple.setLogin(login);
			purple.setDepartmentID(departmentID);
			//purple.setFieldRA(key);
			//purple.setFieldRE(key);
			
			processor.addOperator(purple);

			Operator clone = processor.findOperatorByKey(key);
			assertEquals("Login don't Match for Operator", purple.getLogin(), clone.getLogin());

			processor.removeOperator(key);

			try {
				processor.findOperatorByKey(key);
				fail("Should have raised NoSuchOperatorException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}

		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}

	}

	/**
	 * test for "поиск ѕользовател€ дл€ филиала по логину"
	 *
	 */
	public void testFindOperatorByLogin() {

		// test adding, finding and removing a Operator from the model
		SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");

		try {
			Integer key = new Integer("-1");
			String aLogin = new String("loginTest");;
			Integer departmentID = new Integer(1);
			
			Operator purple = new Operator(key);
			purple.setLogin(aLogin);
			purple.setDepartmentID(departmentID);//id филиала
			//purple.setFieldRA(key);
			//purple.setFieldRE(key);
			
			processor.addOperator(purple);

			Operator clone = processor.findOperatorByLogin(aLogin);
			assertEquals("Login don't Match for Operator", purple.getLogin(), clone.getLogin());

			processor.removeOperator(key);

			try {
				processor.findOperatorByLogin(aLogin);
				fail("Should have raised NoSuchOperatorException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}

		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}

	}

	/**
	 * test for "организаций"
	 *
	 */
	public void testAddFindDeleteOrganization() {
	
		// test adding, finding and removing a Operator from the model
		SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("name");
			String fullName = new String("fullName");
			
			Organization purple = new Organization(key);
			purple.setAccount_fullname(fullName);
			purple.setAccount_name(name);
			purple.setId_industry(new Long(5));
			purple.setId_region(new Long(5));
			purple.setId_opf(new Long(5));

			
			processor.addOrganization(purple);
	
			Organization clone = processor.findOrganizationByKey(key);
			assertEquals("Name don't Match for Organization", purple.getAccount_name(), clone.getAccount_name());
	
			processor.removeOrganization(key);
	
			try {
				processor.findOrganizationByKey(key);
				fail("Should have raised NoSuchOrganizationException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	
	}

	/**
	 * test for "филиалов"
	 *
	 */
	public void testAddFindDeleteDepartment() {
	
		// test adding, finding and removing a Department from the model
		SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("DepartmentName");;
			
			Department purple = new Department(key);
			purple.setFullName(name);
			purple.setShortName(name);
			
			processor.addDepartment(purple);
	
			Department clone = processor.findDepartmentByKey(key);
			assertEquals("FullName don't Match for Department", purple.getFullName(), clone.getFullName());
			assertEquals("ShortName don't Match for Department", purple.getShortName(), clone.getShortName());
	
			processor.removeDepartment(key);
	
			try {
				processor.findDepartmentByKey(key);
				fail("Should have raised NoSuchDepartmentException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	
	}

	/**
	 * test for "ќрганизационно-правовые формы "
	 *
	 */
	public void testAddFindDeleteOwnershipFormType() {
	
		// test adding, finding and removing a OwnershipFormType from the model
		SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("OwnershipFormTypeName");;
			
			OwnershipFormType purple = new OwnershipFormType(key);
			purple.setName(name);
			purple.setCode(key);
			
			processor.addOwnershipFormType(purple);
	
			OwnershipFormType clone = processor.findOwnershipFormTypeByKey(key);
			assertEquals("FullName don't Match for OwnershipFormType", purple.getName(), clone.getName());
	
			processor.removeOwnershipFormType(key);
	
			try {
				processor.findOwnershipFormTypeByKey(key);
				fail("Should have raised NoSuchOwnershipFormTypeException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	
	}
}
