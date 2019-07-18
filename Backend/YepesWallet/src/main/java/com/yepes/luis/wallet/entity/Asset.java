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
@Table(name = "ASSET")
@Getter @Setter @NoArgsConstructor
public class Asset extends AbstractEntity {
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "ACQUIREMENT_DATE")
	private Date acquirementDate;
	
	@Column(name = "INITIAL_INDIVIDUAL_VALUE")
	private BigDecimal initialValue;
	
	@Column(name = "CURRENT_INDIVIDUAL_VALUE")
	private BigDecimal currentValue;
	
	@Column(name = "QUANTITY")
	private Double quantity;
	
}
