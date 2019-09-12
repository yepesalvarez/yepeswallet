package com.yepes.luis.wallet.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "INCOME")
@Getter @Setter @NoArgsConstructor
public class Income extends Movement {
	
}
