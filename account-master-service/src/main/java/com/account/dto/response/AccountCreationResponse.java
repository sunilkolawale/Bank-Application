package com.account.dto.response;

import com.account.entities.Customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountCreationResponse {

	private String responseMessage;
	private Customer customer;
}
