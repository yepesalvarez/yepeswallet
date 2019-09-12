package com.yepes.luis.wallet.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter @Setter @NoArgsConstructor
public class Asset extends AbstractEntity {
	
	@NotNull
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "ACQUIREMENT_DATE")
	private Date acquirementDate;
	
	@NotNull
	@Column(name = "CURRENCY")
	private String currency;
	
	@Column(name = "INITIAL_VALUE")
	private BigDecimal initialValue;
	
	@Column(name = "CURRENT_VALUE")
	private BigDecimal currentValue;
	
	@Column(name = "INTEREST_RATE_EA")
	private Double interestRateEA;
	
	@OneToMany(mappedBy = "origin")
	private List<Movement> movements;
	
	public void addMovement(Movement movement) {
		movements.add(movement);
	}
	
	public void removeMovement(Movement movement) {
		movements.remove(movement);
	}
	
}
