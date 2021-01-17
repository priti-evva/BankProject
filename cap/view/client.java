package com.cap.view;
import com.cap.exceptions.InsufficientBalanceException;
import com.cap.exceptions.InsufficientOpeningAmountException;
import com.cap.exceptions.InvalidAccountNumberException;
import com.cap.service.BankRunnable;
import com.cap.service.UKOBank;

public class client {

	public static void main(String[] args) throws InsufficientOpeningAmountException,InvalidAccountNumberException, InsufficientBalanceException  {
		UKOBank bank=new UKOBank();
		try
		{
			System.out.println(bank.createAccount1(101, 4000));
			System.out.println(bank.createAccount1(102, 2000));
			System.out.println(bank.createAccount1(103, 500));

		}catch(InsufficientOpeningAmountException i) {

			System.out.println("Insufficient Balance for Opening an account ");

		}
        BankRunnable bankRunner = new BankRunnable(bank);
		
		Thread childThread1=new Thread(bankRunner,"first");
		childThread1.start();
		
		Thread childThread2=new Thread(bankRunner,"second");
		childThread2.start();
		
	}
}










