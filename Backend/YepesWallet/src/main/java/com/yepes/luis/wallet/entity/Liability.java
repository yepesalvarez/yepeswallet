package com.yepes.luis.wallet.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "LIABILITY")
@Getter @Setter @NoArgsConstructor
public class Liability extends AbstractEntity {

	@Column(name = "NAME")
	private String name;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "ACQUIREMENT_DATE")
	private Date acquirementDate;
	
	@Column(name = "CURRENCY")
	private String currency;
	
	@Column(name = "INITIAL_VALUE")
	private BigDecimal initialValue;
	
	@Column(name = "INTEREST_RATE_EA")
	private Double interestRateEA;
	
	@Column(name = "CREDIT_TERM_MONTH")
	private int creditTermMonths;
	
	@Column(name = "FEE_PAYMENT")
	private BigDecimal feePayment;
	
	@Column(name = "CURRENT_VALUE")
	private BigDecimal currentValue;
	
	@Column(name = "FINAL_VALUE")
	private BigDecimal finalValue;

}
