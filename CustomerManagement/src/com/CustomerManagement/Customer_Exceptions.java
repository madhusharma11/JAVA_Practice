package com.CustomerManagement;

@SuppressWarnings("serial")
public class Customer_Exceptions extends Exception {
	public Customer_Exceptions(String Message)
	{
		super(Message);
	}

}

 @SuppressWarnings("serial")
class duplicateEmail extends Exception{
	public  duplicateEmail(String Message)
	{
		super(Message);
	}
}
 
 @SuppressWarnings("serial")
 class UserNotRegistered extends Exception{
	 public  UserNotRegistered(String Message)
		{
			super(Message);
		}
 }
