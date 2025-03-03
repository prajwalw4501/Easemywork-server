package com.easemywork.pojos;

import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table
public class Ratings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rev_id;
	@Column
	private Integer score;
	@Column
	private String comments;
	@UpdateTimestamp
	private LocalDate rev_date;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private Users user;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id")
	private Employees employees;
	public Long getRev_id() {
		return rev_id;
	}
	public void setRev_id(Long rev_id) {
		this.rev_id = rev_id;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public LocalDate getRev_date() {
		return rev_date;
	}
	public void setRev_date(LocalDate rev_date) {
		this.rev_date = rev_date;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Employees getEmployees() {
		return employees;
	}
	public void setEmployees(Employees employees) {
		this.employees = employees;
	}
	
	

}
