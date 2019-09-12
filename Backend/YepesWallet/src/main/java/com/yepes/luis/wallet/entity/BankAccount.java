package com.yepes.luis.wallet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "BANK_ACCOUNT")
@Getter @Setter @NoArgsConstructor
public class BankAccount extends Asset {
	
	@Column(name = "SHARED")
	private boolean shared;
	
	@Column(name = "CODE", unique = true)
	private String code;
	
}
