package com.BankAcc;

import java.util.Scanner;

public class accountOp {
		
	public static BankAccount[] arr =null;
	public static void addNewAccount()
	{
		System.out.println("Enter array size = ");
		Scanner in =new Scanner(System.in);
		int size=in.nextInt();
		arr=new BankAccount[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter account details:");
			System.out.println("Enter account Id:");
			int accounid=in.nextInt();
			System.out.println("Enter Account holder name=");
			String name=in.next();
			System.out.println("Enter Balance= ");
			double balance=in.nextDouble();
			arr[i]=new BankAccount(accounid,name,balance);
		}

	}
	
	
	
	public static void depositMoneyByAccountId(int acountId,double amount)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].accountId==acountId)
				arr[i].deposit(amount);	
		}
	}

	public static void withdrawMoneyByAccountId(int acountId,double amount) throws Exception 
	{
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i].accountId==acountId)&&(arr[i].balance>=amount))
				arr[i].withdraw(amount);	
		}
	}

	public static void displayAllAccountDetails()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].toString();
		}
	}

}
