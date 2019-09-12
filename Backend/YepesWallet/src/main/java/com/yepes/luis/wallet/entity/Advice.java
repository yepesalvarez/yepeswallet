package com.yepes.luis.wallet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ADVICE")
@Getter @Setter @NoArgsConstructor
public class Advice extends AbstractEntity {
	
	@NotNull
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "SOURCE")
	private String source;
	
	@NotNull
	@Column(name = "AUTHOR")
	private String author;
	
	@Column(name = "READ")
	private boolean read;
	

}
