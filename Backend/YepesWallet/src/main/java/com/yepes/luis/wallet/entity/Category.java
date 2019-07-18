package com.yepes.luis.wallet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "INCOME_CATEGORY")
@Getter @Setter @NoArgsConstructor
public class Category {
	
	@Column(name = "NAME")
	private String NAME;

}
