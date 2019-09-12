package com.yepes.luis.wallet.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EXPENSE")
@Getter @Setter @NoArgsConstructor
public class Expense extends Movement {
	
}
