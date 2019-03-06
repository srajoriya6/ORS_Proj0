package com.raystech.proj0.dao;

import java.util.List;

import javax.security.auth.Subject;

//import org.bouncycastle.asn1.isismtt.x509.Restriction;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raystech.proj0.dto.StudentDTO;
import com.raystech.proj0.dto.SubjectDTO;



/**
 * Hibernate implementation of Subject DAO.
 * 
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */
@Repository(value="subjectDao")
public class SubjectDAOHiblmpl implements SubjectDAOInt {
	@Autowired
	private SessionFactory sessionFactory=null;

	@Override
	  public long add(SubjectDTO dto) {
		System.out.println("subjectDAOhibernate implement");
        Session session = sessionFactory.getCurrentSession();
        session.save(dto);
        return dto.getId();
    }

	@Override
	public long update(SubjectDTO dto) {
        Session session = sessionFactory.getCurrentSession();
        session.update(dto);
        return dto.getId();
    }

	@Override
	public void delete(long id) {
        SubjectDTO dto = findByPK(id);
        Session session = sessionFactory.getCurrentSession();
        session.delete(dto);

    }
	
	public SubjectDTO findByPK(long id) {
		Session session=sessionFactory.getCurrentSession();
		SubjectDTO dto=(SubjectDTO) session.get(SubjectDTO.class, id);
		return dto;
	}

    
	public List search(SubjectDTO dto, int pageNo, int pageSize) {
		List list=null;
		Session session=sessionFactory.getCurrentSession();
		Criteria criteria=session.createCriteria(SubjectDTO.class);
		if (dto != null) {
         if (dto.getId() > 0) {
             criteria.add(Restrictions.eq("id", dto.getId()));
         }
         if (dto.getSubjectName() != null && dto.getSubjectName().length() > 0) {
             criteria.add(Restrictions.like("subjectName", dto.getSubjectName() + "%"));
         }
		}
         // if page size is greater than zero the apply pagination
         if (pageSize > 0) {
             criteria.setFirstResult(((pageNo - 1) * pageSize));
             criteria.setMaxResults(pageSize);
             System.out.println(pageSize+"............................");
         }
		
 		list = criteria.list();

 		return list;

         
	}
	@Override
	public List search(SubjectDTO dto) {
		// TODO Auto-generated method stub
		return search(dto, 0, 0);
	}

	@Override
	public SubjectDTO findBySubject(String subject) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
