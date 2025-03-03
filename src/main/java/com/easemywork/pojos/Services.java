package com.easemywork.pojos;

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
import jakarta.persistence.OneToMany;
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
@Table(name = "services")
public class Services {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long service_id;
	@Enumerated(EnumType.STRING)
	@Column
	private Type type;
	@Column
	private Double amount;
//	@OneToMany
//	@JoinColumn(name = "emp_id")
//	private Employees employees;
	public Long getService_id() {
		return service_id;
	}
	public void setService_id(Long service_id) {
		this.service_id = service_id;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	

}
