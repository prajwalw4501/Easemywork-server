package com.easemywork.pojos;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
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
@MappedSuperclass
public class BaseEntity {
	@Column(nullable = false)
	private String first_name;
	@Column(nullable = false)
	private String last_name;
	@CreationTimestamp
	@Column
	private LocalDate created_date;
	@UpdateTimestamp
	@Column
	private LocalDate updated_date;
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
	public LocalDate getCreated_date() {
		return created_date;
	}
	public void setCreated_date(LocalDate created_date) {
		this.created_date = created_date;
	}
	public LocalDate getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(LocalDate updated_date) {
		this.updated_date = updated_date;
	}
	
	

}
