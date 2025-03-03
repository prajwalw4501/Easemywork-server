package com.easemywork.pojos;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class Bookings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long book_id;
	@Column
	private LocalDate start_date;
	@Column
	private LocalDate end_date;
	@Enumerated(EnumType.STRING)
	@Column
	private Status status;
	@Column
	private String order_id;
	@Column
	private Double amount;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "emp_id")
	private Employees employees;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private Users users;
	@OneToOne
	@JoinColumn(name = "pay_id")
	private Payments payments;
	public Long getBook_id() {
		return book_id;
	}
	public void setBook_id(Long book_id) {
		this.book_id = book_id;
	}
	public LocalDate getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	public LocalDate getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
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
	public Payments getPayments() {
		return payments;
	}
	public void setPayments(Payments payments) {
		this.payments = payments;
	}
	
	
	

}
