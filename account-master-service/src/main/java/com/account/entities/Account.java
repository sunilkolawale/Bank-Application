package com.account.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.account.utility.AccountStatus;
import com.account.utility.AccountType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ACCOUNTS")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ACCOUNT_NUMBER")
	private Long accountNumber;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ACCOUNT_TYPE")
	private AccountType accountType;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ACCOUNT_STATUS")
	private AccountStatus accountStatus;
}
