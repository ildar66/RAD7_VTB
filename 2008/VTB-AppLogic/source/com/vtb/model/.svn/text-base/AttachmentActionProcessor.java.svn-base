package com.vtb.model;

import java.util.ArrayList;

import com.vtb.domain.Attachment;
import com.vtb.domain.AttachmentFile;
import com.vtb.domain.FileRequest;
import com.vtb.domain.SPOSettings;
import com.vtb.exception.MappingException;

/**
 * Interface predestine for:
 * 	- working with file (without BLOB data);
 * 	- working with request on file;   
 * @author Michel Tormozov
 */
public interface AttachmentActionProcessor {
	
	
	/**
	 * add file (attribute) to DB storage
	 * @param file - file that add to storage
	 * @return Attachemnt object with the UNID value 
	 */
	public Attachment addAttachment(Attachment file)  throws MappingException;
	
	/**
	 * update file (attribute) in DB storage
	 * @param file - file that updated in storage
	 * @return Attachemnt object with the UNID value 
	 */
	public Attachment updateAttachment(Attachment file)  throws MappingException;
	
	/**
	 * remove file from DB storage
	 * @param file - file that removed form storage (need contain only PK)
	 * @return Attachemnt object with the UNID value 
	 */
	public boolean removeAttachment(Attachment domainObjectWithKeyValues)  throws MappingException;
	
	/**
	 * mark file as accepted
	 * @param file - file that marked as accepted
	 * @return Attachemnt object with the UNID value 
	 */
	public boolean acceptAttachment(Attachment domainObjectWithKeyValues)  throws MappingException;
	
	/**
	 * find file in DB storage by PK
	 * @param file - file that found (only PK needed) 
	 * @return Attachemnt object 
	 */
	public Attachment findAttachemntByPK(Attachment domainObjectWithKeyValues)  throws MappingException;
	
	/**
	 * find file in DB storage by ID OWNER (object that owns the file ) 
	 * @param id_owner - ID of APPLICATION or ID of CONTRACTOR (it depends from parameter ID_TYPE)
	 * @param id_type - ID_OWNER type (APPLICATION/CONTRACTOR)
	 * @return List of Attachemnt objects
	 */
	public ArrayList findAttachemntByOwnerAndType(long id_owner, int owner_type)  throws MappingException;
	
	/**
	 * add request to download file on other department
	 * @param id_owner - ID of APPLICATION or ID of CONTRACTOR (it depends from parameter ID_TYPE)
	 * @return 
	 */
	public FileRequest addRequest(FileRequest request) throws MappingException;
	
	/**
	 * remove request to download file on other department
	 * @param request - ID of APPLICATION or ID of CONTRACTOR (it depends from parameter ID_TYPE)
	 * @return  
	 */
	public boolean removeRequest(FileRequest request) throws MappingException;
	
	/**
	 * this function return List of requests that can be executed at that moment
	 */
	public ArrayList<FileRequest> findNotCompletedRequest() throws MappingException;
	
	/**
	 * this function return List of requests that can be executed at that moment
	 */
	public FileRequest findNotCompletedRequestByUnidAndDep(String unid, long id_department) throws MappingException;
	
	/**
	 * mark request as completed (file was sent to department that requested file)
	 */
	public void completeRequest(FileRequest request) throws MappingException;	
		

	public SPOSettings addSpoSettings(SPOSettings settings) throws MappingException;
	public boolean removeSpoSettings(SPOSettings domainObjectWithKeyValues) throws MappingException;
	public SPOSettings updateSpoSettings(SPOSettings settings) throws MappingException;
	public SPOSettings findSpoSettings(long id_department) throws MappingException;
	public SPOSettings findSettingsForWAS() throws MappingException;
	
	/**
	 * This method put file (that requested from some department)to an appropriate queue  
	 * @param request - request on file that need to be put to queue 
	 * @throws MappingException
	 */
	public void putRequestedFileToMQ(FileRequest request) throws MappingException;

	/**
	 * This method get file (that received from some department)to DB table  
	 * @throws MappingException
	 */
	public boolean getReceivedFileToDB() throws MappingException;
	
	/**
	 * This method update file data for the attached file  
	 * @param file - request on file that need to be put to queue 
	 * @throws MappingException
	 */
	public AttachmentFile updateAttachmentData(AttachmentFile file) throws MappingException;
	
	/**
	 * Find attachment data by UNID  
	 * @param file - attachment object with unid 
	 * @throws MappingException
	 */
	public AttachmentFile findAttachmentDataByPK(AttachmentFile file) throws MappingException;
	
}
