package com.cap.service;

import java.util.LinkedList;
//import java.util.Scanner;

import com.cap.beans.Account;
import com.cap.exceptions.InsufficientBalanceException;
import com.cap.exceptions.InsufficientOpeningAmountException;
import com.cap.exceptions.InvalidAccountNumberException;

public   class UKOBank implements Bank {
	private	LinkedList<Account> accounts=new LinkedList<>();

	public String createAccount1(int accountNumber,int amount)throws InsufficientOpeningAmountException
	{
		if(amount>=500) {
			Account account=new Account(accountNumber,amount);
			accounts.add(account);

			return "Account is sucessfully created";
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
	public  int withdrawAmount(int accountNumber,int amount)throws InvalidAccountNumberException,InsufficientBalanceException
	{
		Account account=searchAccount(accountNumber);
		
		{
			if(account.getAmount()-amount>=0)
			{
				
				account.setAmount(account.getAmount()-amount);
			   return account.getAmount();
		}

		throw new InsufficientBalanceException();
			}
		}
	public int amountDeposit(int accountNumber,int amount) throws InvalidAccountNumberException  {

		Account account=searchAccount(accountNumber);

		account.setAmount(account.getAmount()+amount);
		return account.getAmount();

	}
	public String fundTransfer(int accountNumber,int accountNumber2 ,int amount) throws InvalidAccountNumberException,InsufficientBalanceException {
		Account account=searchAccount(accountNumber);
		Account account1=searchAccount(accountNumber2);
		int[] amounttransfer=new int[2];
		if((account.getAmount()-amount)>=0) {
			account.setAmount(account.getAmount()-amount);
			amounttransfer[0]=account.getAmount();
			account1.setAmount(account1.getAmount()+amount);
			amounttransfer[1]=account1.getAmount();

			return" Balance amount after transfer= "+amounttransfer[0]+" "+"Amount received after transfer= "+ amounttransfer[1] ;
		}

		else
		{
			throw new  InvalidAccountNumberException();
		}
	}




























}
