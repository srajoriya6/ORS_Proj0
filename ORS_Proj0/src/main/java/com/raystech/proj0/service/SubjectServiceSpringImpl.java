package com.raystech.proj0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.raystech.proj0.dao.SubjectDAOInt;
import com.raystech.proj0.dto.SubjectDTO;


/**
 * Session facade of Student Service. It is transactional, apply delcarative
 * transactions with help of Spring AOP.
 * 
 * If unchecked exception is propagated from a method then transaction is rolled
 * back.
 * 
 * Default propogation value is Propagation.REQUIRED and readOnly = false
 * 
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */
@Service(value ="subjectService")
public class SubjectServiceSpringImpl implements SubjectServiceInt{
	
	
	
	@Autowired
	private SubjectDAOInt dao;
	 
	public void setDao(SubjectDAOInt dao) {
        this.dao = dao;
    }

	
	
	 @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	    public long add(SubjectDTO dto) {
	        return dao.add(dto);
	    }

	 @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	    public long update(SubjectDTO dto) {
	        return dao.update(dto);
	    }

	 @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	    public void delete(long id) {
	        dao.delete(id);
	   }

	 @Transactional(readOnly = true)
	    public SubjectDTO findByPK(long pk) {
	        return dao.findByPK(pk);
	    }

	 @Transactional(readOnly = true)
	    public List<SubjectDTO> search(SubjectDTO dto, int pageNo, int pageSize) {
		 System.out.println("serviceeeeeeeeeeeeee"+dto);
	        return dao.search(dto, pageNo, pageSize);
	    }

	  @Transactional(readOnly = true)
	    public List<SubjectDTO> search(SubjectDTO dto) {
	        return dao.search(dto, 0, 10);
	    }

	  @Transactional(readOnly = true)
	  public SubjectDTO findBySubject(String subject) {
		// TODO Auto-generated method stub
		return null;
	}

}
