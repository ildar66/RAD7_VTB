package com.vtb.mapping;

import java.util.ArrayList;

import com.vtb.domain.VtbObject;
import com.vtb.exception.DuplicateKeyException;
import com.vtb.exception.MappingException;
import com.vtb.exception.NoSuchObjectException;
/**
 * Mapping API implemented by data source access mechanisms that access specific
 * data sources, such as JDBC or EJB, and "maps" results to objects. This interface specifies
 * a set of persistent operations in order to retrieve and store Objects to and
 * from specific data sources.
 */
public interface Mapper {
	/**
	 * Delete a TsObject from its store
	 */
	public void remove(VtbObject anObject) throws NoSuchObjectException, MappingException;
	
	/**
	 * Insert a new VtbObject into the store
	 */
	public void insert(VtbObject anObject) throws DuplicateKeyException, MappingException;
	
	/**
	 * Return a ArrayList of all VtbObjects (use carefully in practice!)
	 * We use this extensively in our example, but in fact more "wise" enumerators
	 * That would directly query the datasource (e.g. through EJB finders)
	 *
	 * @return ArrayList
	 */
	public ArrayList findAll() throws MappingException;
	
	/**
	 * Retrieve a single object matching this object.
	 *
	 * @return VtbObject
	 */
	public VtbObject findByPrimaryKey(VtbObject anObject) throws NoSuchObjectException, MappingException;
	
	/**
	 * Update this object (e.g. change its state in the store)
	 *
	 */
	public void update(VtbObject anObject) throws NoSuchObjectException, MappingException;
}