package com.yepes.luis.wallet.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "INCOME")
@Getter @Setter @NoArgsConstructor
public class Income extends AbstractEntity {
	
	@NotNull
	@Column(name = "NAME")
	private String name;
	
	@NotNull
	@Column(name = "AMOUNT")
	private BigDecimal amount;

	@Column(name = "CURRENCY")
	private String currency;
	
	@Column(name = "PERIODICITY")
	private String periodicity;
	
}
