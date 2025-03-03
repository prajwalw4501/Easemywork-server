package com.easmywork.dto;

import com.easemywork.pojos.Gender;
import com.easemywork.pojos.Type;

import lombok.Data;

@Data
public class InsertEmployeeDTO {
	private String first_name;
	private String last_name;
	private Long aadhar_no;
	private Long phone_no;
	private Gender gender;
	private Integer experience;
	private String city;
	private String state;
	private Integer pincode;
	private Type type;
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
	public Long getAadhar_no() {
		return aadhar_no;
	}
	public void setAadhar_no(Long aadhar_no) {
		this.aadhar_no = aadhar_no;
	}
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Integer getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	

}
