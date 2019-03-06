package com.raystech.proj0.form;

import org.hibernate.validator.constraints.NotEmpty;

import com.raystech.proj0.dto.BaseDTO;
import com.raystech.proj0.dto.SubjectDTO;

/**
 * Contains Subject form elements and their declarative input validations.
 * 
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */
public class SubjectForm extends BaseForm{

	 @NotEmpty
	 private String subjectName;
	 
	 @NotEmpty
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

	/**
     * Populate dto from form
     */
   
    public BaseDTO getDto() {
    	SubjectDTO dto=new SubjectDTO();

    	dto.setSubjectName(subjectName);
    	dto.setDescription(description);

    	return dto;
    }

    /**
     * Populate from from dto
     */
    @Override
    public void populate(BaseDTO bDto) {
    	SubjectDTO dto= (SubjectDTO) bDto;
    	subjectName=dto.getSubjectName();
    	description=dto.getDescription();
  }
	 
}
