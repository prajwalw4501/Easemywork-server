package com.easemywork.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "location")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long loc_id;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private Integer pincode;
	@Column
	private Double longitude;
	@Column
	private Double latitude;
	@OneToOne(mappedBy = "location",fetch = FetchType.LAZY)
	private Employees employees;
	@OneToOne(mappedBy = "location",fetch = FetchType.LAZY)
	private Users users;
	public Long getLoc_id() {
		return loc_id;
	}
	public void setLoc_id(Long loc_id) {
		this.loc_id = loc_id;
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
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Employees getEmployees() {
		return employees;
	}
	public void setEmployees(Employees employees) {
		this.employees = employees;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	
	

}
