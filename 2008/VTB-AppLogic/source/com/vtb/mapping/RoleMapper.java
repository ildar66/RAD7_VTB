/*
 * Created on 24.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.vtb.mapping;

import java.util.ArrayList;

import com.vtb.domain.Role;
import com.vtb.exception.MappingException;
import com.vtb.exception.NoSuchRoleException;

/**
 * @author IShafigullin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public interface RoleMapper extends Mapper {
	public Role findById(String roleId) throws NoSuchRoleException;
	public ArrayList findByName(String roleName) throws MappingException;
	public ArrayList findByName(String roleName, String orderBy) throws MappingException;
	public ArrayList findOperatorToRoleList(String operatorKey, String orderBy) throws MappingException;
	public ArrayList findOperatorToRoleAccessList(String operatorKey, String orderBy) throws MappingException;
	public ArrayList findOperatorToRoleAccessList(String operatorKey, String aProcessID, String orderBy) throws MappingException;
	public void deleteLinkOperatorToRole(String operatorKey, String roleKey) throws MappingException;
	public void addLinkOperatorToRole(String operatorKey, String roleKey) throws MappingException;
	public void setStatusLinkOperatorToRole(String operatorKey, String roleKey, String status) throws MappingException;
	
}
