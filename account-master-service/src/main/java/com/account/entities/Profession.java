package com.account.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.account.utility.ProfessionType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PROFESSION")
public class Profession implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PROFESSION_ID")
	private Long professionId;
	@Column(name = "PROFESSION_NAME")
	private String professionName;
	@Enumerated(EnumType.STRING)
	@Column(name = "PROFESSION_TYPE")
	private ProfessionType professionType;

}
