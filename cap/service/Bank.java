package com.cap.service;

import com.cap.beans.Account;
import com.cap.exceptions.InsufficientBalanceException;
import com.cap.exceptions.InsufficientOpeningAmountException;
import com.cap.exceptions.InvalidAccountNumberException;

public interface Bank {
	 String  createAccount1(int accountNumber,int amount) throws InsufficientOpeningAmountException;
	 Account searchAccount(int accountNumber) throws InvalidAccountNumberException;
	 int withdrawAmount(int accountNumber,int amount) throws InvalidAccountNumberException,InsufficientBalanceException;
	 int amountDeposit(int accountNumber,int amount)throws InvalidAccountNumberException;
	 String fundTransfer(int accouontNumber,int accountnumber1,int amount)throws InvalidAccountNumberException,InsufficientBalanceException;

}
