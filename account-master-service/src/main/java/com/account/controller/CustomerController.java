package com.account.controller;

import static com.account.constants.Constant.ACCOUNT;
import static com.account.constants.Constant.ALL_CROSS_ORIGIN;
import static com.account.constants.Constant.API_DESCRIPTION;
import static com.account.constants.Constant.API_VALUE;
import static com.account.constants.Constant.APPLICATION_JSON;
import static com.account.constants.Constant.BASE_URL;
import static com.account.constants.Constant.CREATE_ACCOUNT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.dto.response.AccountCreationResponse;
import com.account.entities.Customer;
import com.account.repository.CustomerRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = API_VALUE, tags = API_DESCRIPTION)
@RequestMapping(BASE_URL + ACCOUNT)
@CrossOrigin(ALL_CROSS_ORIGIN)
@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping(value = CREATE_ACCOUNT, produces = APPLICATION_JSON)
	@ApiOperation(value = "Create customer Account", response = AccountCreationResponse.class, produces = APPLICATION_JSON)
	public ResponseEntity<AccountCreationResponse> createCustomerAccount(@RequestBody Customer customer) {
		AccountCreationResponse accountCreationResponse=new AccountCreationResponse();
		accountCreationResponse.setResponseMessage("Customer account is created");
		accountCreationResponse.setCustomer(customerRepository.save(customer));
		return new ResponseEntity<>(accountCreationResponse,HttpStatus.OK);
	}

}
