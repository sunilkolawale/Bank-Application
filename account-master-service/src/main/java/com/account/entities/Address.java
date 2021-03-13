package com.account.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ADDRESS")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADDRESS_ID")
	private Long addressId;
	@Column(name = "STREET")
	private String street;
	@Column(name = "CITY_NAME")
	private String cityName;
	@Column(name = "STATE_NAME")
	private String stateName;
	@Column(name = "COUNTRY_NAME")
	private String countryName;
	@Column(name = "ZIP_CODE")
	private Integer zipCode;
}
