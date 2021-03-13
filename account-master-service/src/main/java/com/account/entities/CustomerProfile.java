package com.account.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.account.utility.Gender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_PROFILE")
public class CustomerProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PROFILE_ID")
	private Long profileId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL_ID")
	private String email;

	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;

	@Enumerated(EnumType.STRING)
	@Column(name = "GENDER")
	private Gender gender;

	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "DOB")
	private LocalDate dateOfBirth;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "PROFILE_ID")
	private Set<Profession> profession;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "address_id")
	private Address address;

}
