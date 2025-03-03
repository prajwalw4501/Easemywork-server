package com.easemywork.pojos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "employees")
public class Employees extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long emp_id;
	@Column(nullable = false, unique = true)
	private Long aadhar_no;
	@Column(nullable = false, unique = true)
	private Long phone_no;

	@Enumerated(EnumType.STRING)
	@Column
	private Gender gender;
	@Column(nullable = false)
	private Integer experience;
	@Lob
	private byte[] image;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "loc_id")
	private Location location;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "service_id")
	private Services services;
//	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//	@JoinColumn(name = "book_id")
//	private Bookings bookings;
//
//	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//	@JoinColumn(name = "rev_id")
//	private Ratings ratings;
	public Long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
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
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Services getServices() {
		return services;
	}
	public void setServices(Services services) {
		this.services = services;
	}
	
	

}
