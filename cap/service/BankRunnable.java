package com.cap.service;

import com.cap.exceptions.InsufficientBalanceException;
import com.cap.exceptions.InvalidAccountNumberException;

public class BankRunnable implements Runnable {
UKOBank bank;
	
	public BankRunnable(UKOBank bank)
	{
		this.bank=bank;
	}
	@Override
	public void run() {
		try
		{
			if(Thread.currentThread().getName().equals("first"))
			{
			System.out.println("Balance = "+bank.withdrawAmount(101, 1000));
			}
			else
			{
				System.out.println("Balance = "+bank.withdrawAmount(101, 1000));
			}
		}catch(InvalidAccountNumberException iae)
		{
			System.out.println("invalid account number");
		}catch(InsufficientBalanceException ibe)
		{
			System.out.println("Insufficient balance");
		}

	}


}
