package com.cap.view;
import com.cap.exceptions.InsufficientBalanceException;
import com.cap.exceptions.InsufficientOpeningAmountException;
import com.cap.exceptions.InvalidAccountNumberException;
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
		try
		{

			System.out.println("Balance via withdraw = "+bank.withdrawAmount1(102, 500));

		}
		catch(InvalidAccountNumberException e)
		{
			System.out.println("Invalid account number ");

		}
		catch(InsufficientBalanceException e3) {
			System.out.println("Insufficient Balance ");
		}
		try
		{

			System.out.println("Balance after deposite an amount = "+bank.amountDeposit(103,4000));
		}catch(InvalidAccountNumberException e1)
		{
			System.out.println("Invalid account ");
		}
		try
		{

			System.out.println(bank.fundTransfer(101,102,500));
		}catch(InsufficientBalanceException e2)
		{
			System.out.println("Insufficient Balance ");
		}
		catch(InvalidAccountNumberException e1)
		{
			System.out.println("Invalid account ");
		}

	}
}










