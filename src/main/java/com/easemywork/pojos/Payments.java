package com.easemywork.pojos;

import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Payments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pay_id;
	@Column
	private Double advance_amnt;
	@Column
	private Double final_amnt;
	@UpdateTimestamp
	private LocalDate pay_date;
	
	private String payment_id;

	public Long getPay_id() {
		return pay_id;
	}

	public void setPay_id(Long pay_id) {
		this.pay_id = pay_id;
	}

	public Double getAdvance_amnt() {
		return advance_amnt;
	}

	public void setAdvance_amnt(Double advance_amnt) {
		this.advance_amnt = advance_amnt;
	}

	public Double getFinal_amnt() {
		return final_amnt;
	}

	public void setFinal_amnt(Double final_amnt) {
		this.final_amnt = final_amnt;
	}

	public LocalDate getPay_date() {
		return pay_date;
	}

	public void setPay_date(LocalDate pay_date) {
		this.pay_date = pay_date;
	}

	public String getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(String payment_id) {
		this.payment_id = payment_id;
	}
	
	

}
