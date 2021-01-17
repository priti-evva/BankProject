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
        	System.out.println("Balance Remaining="+bank.withdrawAmount(102, 1000));
        }catch(InvalidAccountNumberException iae) {
         	System.out.println("Invalid account Number ");
        }
        catch(InsufficientBalanceException ie)
        {
        	System.out.println("Insufficient Balance in an account ");
        }
        try {
        	System.out.println("Tolat Balance="+bank.amountDeposit(103, 5000));
        }catch(InvalidAccountNumberException iane) {
        	System.out.println("Invalid account Number ");
        }
        try {
        	System.out.println(bank.fundTransfer(101, 102, 500));
        }catch(InvalidAccountNumberException iae) {
         	System.out.println("Invalid account Number ");
        }
        catch(InsufficientBalanceException ie)
        {
        	System.out.println("Insufficient Balance in an account ");
        }
	}
}










