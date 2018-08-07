package com.cg.spring.PaymentWalletSpring.service;

import java.util.List;

import com.cg.spring.PaymentWalletSpring.dto.Customer;
import com.cg.spring.PaymentWalletSpring.exception.InsufficientBalanceException;

public interface PaymentWalletService {
	public void createAccount(Customer customer);

	public double showBalance(String number);

	public void deposit(String number, Double amount);

	public void withdraw(String number, Double amount) throws InsufficientBalanceException;

	public void fundTransfer(String number1, String number2, Double amount) throws InsufficientBalanceException;

	public String printTransaction(String number);

	public List<Customer> getAllCustomers();
}
