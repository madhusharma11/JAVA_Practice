package com.BankAcc;

import java.util.Scanner;

public class client_BankAccount  {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount[] arr=new BankAccount[10]; //
+
		boolean exit=false;
		Scanner obj=new Scanner(System.in);
		while(true) {
			System.out.println("Choose an option:");
			System.out.println("1. Add Account");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Display All Accounts");
			System.out.println("5. Exit");
			int choice=obj.nextInt();
			switch(choice)
			{
			case 1:
				accountOp.addNewAccount();
				break;
			case 2:
			{
				int accountid=obj.nextInt();
				double amnt=obj.nextDouble();
				accountOp.depositMoneyByAccountId(accountid,amnt);
				break;
			}
			case 3:
				int accountid=obj.nextInt();
				double amnt=obj.nextDouble();
				try {
					accountOp.withdrawMoneyByAccountId(accountid, amnt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				accountOp.displayAllAccountDetails();
				break;
			}
		}

	}}
