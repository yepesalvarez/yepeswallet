package com.yepes.luis.wallet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ICON")
@Getter @Setter @NoArgsConstructor
public class Icon extends AbstractEntity {

	@NotNull
	@Column(name = "NAME", unique = true)
	private String name;
	
	@NotNull
	@Column(name = "URL_PATH")
	private String urlPath;
	
	@Column(name = "FILE_TYPE")
	private String fileType;
	
}
