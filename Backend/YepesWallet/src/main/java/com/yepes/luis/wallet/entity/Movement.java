package com.yepes.luis.wallet.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MOVEMENT")
@Getter @Setter @NoArgsConstructor
@EqualsAndHashCode
public class Movement extends AbstractEntity {
	
	@NotNull
	@Column(name = "DATE")
	private Date date;
	
	@NotNull
	@Column(name = "NAME")
	private String name;

	@NotNull
	@Column(name = "CURRENCY")
	private String currency;
	
	@NotNull
	@Column(name = "AMOUNT")
	private BigDecimal amount;
	
	@Column(name = "PERIODICITY")
	private String periodicity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORIGIN_ASSET_ID")
	private Asset origin;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DESTINATION_ASSET_ID")
	private Asset destination;
	
}
