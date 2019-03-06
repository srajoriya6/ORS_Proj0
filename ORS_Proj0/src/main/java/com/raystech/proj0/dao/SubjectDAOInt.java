package com.raystech.proj0.dao;

import java.util.List;

import com.raystech.proj0.dto.StudentDTO;
import com.raystech.proj0.dto.SubjectDTO;
/**
 * 
 * College DAO interface.
 * 
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */
public interface SubjectDAOInt {
	/**
     * Add a Subject
     * 
     * @param dto
     * @throws ApplicationException
     * @throws DuplicateRecordException
     *             : throws when Subject already exists
     */
    public long add(SubjectDTO dto);

    /**
     * Update a Subject
     * 
     * @param dto
     * @return 
     * @throws ApplicationException
     * @throws DuplicateRecordException
     *             : if updated user record is already exist
     */
    public long update(SubjectDTO dto);

    /**
     * Delete a Subject
     * 
     * @param dto
     * @throws ApplicationException
     */
    public void delete(long id);

    /**
     * Find Subject by Name
     * 
     * @param name
     *            : get parameter
     * @return dto
     * @throws ApplicationException
     */
   
    public SubjectDTO findByPK(long pk);

    /**
     * Search Subject with pagination
     * 
     * @return list : List of Subject
     * @param dto
     *            : Search Parameters
     * @param pageNo
     *            : Current Page No.
     * @param pageSize
     *            : Size of Page
     * @throws ApplicationException
     */
    public List search(SubjectDTO dto, int pageNo, int pageSize);

    /**
     * Search Subject
     * 
     * @return list : List of Subject
     * @param dto
     *            : Search Parameters
     * @throws ApplicationException
     */
    public List search(SubjectDTO dto);

    /**
     * Gets List of Subject
     * 
     * @return list : List of Subject
     * @throws DatabaseException
     */
    public SubjectDTO findBySubject(String subject);



}
