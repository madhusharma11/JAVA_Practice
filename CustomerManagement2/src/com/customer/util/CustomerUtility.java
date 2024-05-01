package com.customer.util;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.CustomerManagement.Customer;
import com.CustomerManagement.ServicePlan;

import CustomerException.Customer_Exceptions;

import static com.validate.customer.CustomerValidationRules.*;

public class CustomerUtility {


	//accept and sign up
	@SuppressWarnings("resource")
	public static void acceptDetailOfCustomer(List<Customer> arrCustomer,String fname, String lname, String email, String pwd, String dateOfBirth,
			String value,double registrationAmount)throws Exception
	{	arrCustomer.add(validateCustomer( arrCustomer,fname, lname, email, pwd,dateOfBirth, value,registrationAmount));

	}


	//display
	public static void displayCustomerDetails(List<Customer> arrCustomer)
	{
		for(Customer c:arrCustomer)
		{ 
			System.out.println(c);
		}
	}
	
	public static void login(List<Customer> arrCustomer,String email,String password)throws Customer_Exceptions
	{
		Customer newCustomer=new Customer(email);
		int index=arrCustomer.indexOf(newCustomer);
		Customer c = arrCustomer.get(index);
		if(c.getPassword().equals(password))
			System.out.println("Successfully Log In!!!");
		else
			throw new Customer_Exceptions("Invalid Credentials!!!!");
	}
	

	//Update password

	public static void changePassword(List<Customer> arrCustomer,String email,String oldPass,String newPass) throws Customer_Exceptions//throws Customer_Exceptions
	{
		validatPassword(newPass);
		Customer newCustomer=new Customer(email); 
		int index=arrCustomer.indexOf(newCustomer); 
		Customer c=arrCustomer.get(index);
		if(c.getPassword().equals(oldPass))
			c.setPassword(newPass);
		
	
		
		/*
		  Customer arr[] = new Customer [2]; // List ls = new ArrayLs();
		  		Customer  c = arr[2];		 // Customer  c = ls.get(2);
		 */
		
		
//		for(Customer c:arrCustomer)
//		{
//			if((c.getEmail().equals(email))&&(c.getPassword().equals(oldPass)))
//			{
//				c.setPassword(newPass);
//				System.out.println("New password successfully set.");
//				flag=true;
//				break;
//			}
//		}
//		if(flag==false) 
//			throw new Customer_Exceptions("Email or Old password are incorrect.");
	}

	
	//DELETE ACCOUNT
	public static void removeAccount(List<Customer> arrCustomer,String email)throws Customer_Exceptions
	{
		Customer newCustomer=new Customer(email); 
		int index=arrCustomer.indexOf(newCustomer); 
		Customer c=arrCustomer.get(index);
		if(index==-1)
			throw new Customer_Exceptions("Customer doen't exit!!!");
		arrCustomer.remove(index);
	}


}
