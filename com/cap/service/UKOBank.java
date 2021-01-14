package com.cap.service;

import java.util.LinkedList;
//import java.util.Scanner;

import com.cap.beans.Account;
import com.cap.exceptions.InsufficientBalanceException;
import com.cap.exceptions.InsufficientOpeningAmountException;
import com.cap.exceptions.InvalidAccountNumberException;

public  class UKOBank implements Bank {
	LinkedList<Account> accounts=new LinkedList<>();

	public String createAccount1(int accountNumber,int amount)throws InsufficientOpeningAmountException
	{
		//Account account=new Account(accountNumber,amount);
		// account.setAccountNumber(accountNumber);
		//account.setAmount(amount);
		if(amount>=500) {
			Account account=new Account(accountNumber,amount);
			accounts.add(account);
			{
				return "Account is sucessfully created";
			}
		}
		else 
		{
			throw new InsufficientOpeningAmountException();
		}



	}


	public Account searchAccount(int accountNumber) throws InvalidAccountNumberException  
	{
		for(Account account : accounts)
		{
			if(account.getAccountNumber()==accountNumber)
			{
				return account;
			}
		}

		throw new InvalidAccountNumberException();



	}

	public int withdrawAmount1(int accountNumber,int amount)throws InvalidAccountNumberException,InsufficientBalanceException
	{
		Account account=searchAccount(accountNumber);

		if((account.getAmount()-amount)>=0)
		{
			account.setAmount(account.getAmount()-amount);
			return account.getAmount();
		}

		throw new InsufficientBalanceException();

	}
	public int amountDeposite(int accountNumber,int amount) throws InvalidAccountNumberException  {

		Account account=searchAccount(accountNumber);
		if((account.getAmount()+amount)>=0)
		{
			account.setAmount(account.getAmount()+amount);
			return account.getAmount();
		}else 
		{
			//return amount;

			throw new  InvalidAccountNumberException();

		}
	}



	public int fundTransfer(int accountNumber,int accountNumber2 ,int amount) throws InvalidAccountNumberException,InsufficientBalanceException {
		Account account=searchAccount(accountNumber);
		Account account1=searchAccount(accountNumber2);
		if((account.getAmount()-amount)>=0) {
			account.setAmount(account.getAmount()-amount);
			account1.setAmount(account1.getAmount()+amount);
			return account1.getAmount();
			}
		else
		{
			throw new  InvalidAccountNumberException();
		}




	}


	@Override
	public int withdrawAmount(int accountNumber, int amount)
			throws InvalidAccountNumberException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		return 0;
	}


	












}
