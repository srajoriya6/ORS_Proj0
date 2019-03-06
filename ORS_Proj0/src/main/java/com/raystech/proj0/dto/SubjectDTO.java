package com.raystech.proj0.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

/**
 * Subject DTO class
 * 
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */
@Entity
@Table(name="SUBJECT")
public class SubjectDTO extends BaseDTO{
	
	
	  /**
	  * Name of Subject
	  */
	  @Column(name = "SUBJECT", length = 50)
	  private String subjectName;
	  
	  /**
	   * Description of subject
	   */
	  @Column(name = "DESCRIPTION", length = 50)
	  private String description;
	  
	  

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return id+"";
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return subjectName;
	}


}
