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
@Table(name = "BANK_ACCOUNT")
@Getter @Setter @NoArgsConstructor
public class BankAccount extends AbstractEntity {
	
	@NotNull
	@Column(name = "NAME")
	private String name;
	
	@NotNull
	@Column(name = "CURRENCY")
	private String currency;
	
	@Column(name = "CURRENT_BALANCE")
	private BigDecimal currentBalance;
	
}
