package com.BankAcc;



public class BankAccount {
protected int accountId;
protected String accountHolder;
protected double balance;
protected static int count=0;
public BankAccount(int accountId,String accountHolder,double balance)
{
	this.accountId=accountId;
	this.accountHolder=accountHolder;
	this.balance=balance;
	count++;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void deposit(double amount)
{
	this.balance+=amount;
}
public void withdraw(double amount)throws Exception
{
	if(this.balance>=amount)
	this.balance-=amount;
	else
		throw new Exception("Low balance");
}
@Override
public String toString()
{
	return "accountId= "+this.accountId+
			"AccountHolder= "+this.accountHolder+
			"Balance= "+this.balance+"\nCount= "+this.count;
}

}


