package com.yepes.luis.wallet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USER")
@Getter @Setter @NoArgsConstructor
public class User extends AbstractEntity {
	
	@Column(name = "PASSW")
	private String passw;
	
	@Column(name = "PIN")
	private int pin;
	
	@Column(name = "USERNAME", unique = true)
	private String username;
	
	@Email
	@Column(name = "EMAIL", unique = true)
	private String email;
	
}
