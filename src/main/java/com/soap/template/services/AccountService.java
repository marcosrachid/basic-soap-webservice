package com.soap.template.services;

import com.soap.template.webservices.Account;

public interface AccountService {
	public Account getAccountDetails(String accountNumber);
}