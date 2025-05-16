package com.bean;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class GradeBean {

	@NotBlank(message = "Please Enter FirstName")
	private String firstName;

	@NotNull(message = "Please Enter Maths Marks")
	private Integer maths;
	
	@NotNull(message = "Please Enter Sci Marks")
	private Integer sci;
	
	@NotNull(message = "Please Enter Eng Marks")
	private Integer eng;
	
	private Integer percentate;
	
	private Character grade;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getMaths() {
		return maths;
	}

	public void setMaths(Integer maths) {
		this.maths = maths;
	}

	public Integer getSci() {
		return sci;
	}

	public void setSci(Integer sci) {
		this.sci = sci;
	}

	public Integer getEng() {
		return eng;
	}

	public void setEng(Integer eng) {
		this.eng = eng;
	}

	public Integer getPercentate() {
		return percentate;
	}

	public void setPercentate(Integer percentate) {
		this.percentate = percentate;
	}

	public Character getGrade() {
		return grade;
	}

	public void setGrade(Character grade) {
		this.grade = grade;
	}

}
