package com.yepes.luis.wallet.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "OBJECTIVE")
@Getter @Setter @NoArgsConstructor
public class Objective extends AbstractEntity {
	
	@NotNull
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "HAPPINESS_SCORE")
	private int happinessScore;
	
	@NotNull
	@Column(name = "DEADLINE")
	private Date deadline;
	
	@NotNull
	@Column(name = "ESTIMATED_VALUE")
	private BigDecimal estimatedValue;
	
	@NotNull
	@Column(name = "CURRENCY")
	private String currency;
	
	@Column(name = "INPUT_FREQUENCY_DAYS")
	private int inputFrecuencyDays;
	
	@Column(name = "PERIODIC_INPUT_AMOUNT")
	private BigDecimal periodicInputAmount;
	
	@Column(name = "CHALLENGE_ACCEPTED")
	private boolean challengeAccepted;
	
}
