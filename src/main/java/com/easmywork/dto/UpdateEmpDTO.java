package com.easmywork.dto;

import com.easemywork.pojos.Gender;

import lombok.Data;

@Data
public class UpdateEmpDTO {

	private String first_name;
	private String last_name;
	private Integer experience;
	private Gender gender;
	private Long phone_no;
	private Long aadhar_no;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Integer getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}
	public Long getAadhar_no() {
		return aadhar_no;
	}
	public void setAadhar_no(Long aadhar_no) {
		this.aadhar_no = aadhar_no;
	}
	
	
	
}
