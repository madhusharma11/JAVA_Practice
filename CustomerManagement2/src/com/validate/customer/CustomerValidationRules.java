package com.validate.customer;

import static com.validate.customer.CustomerValidationRules.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import com.CustomerManagement.Customer;
import com.CustomerManagement.ServicePlan;


import CustomerException.Customer_Exceptions;



//VALIDATE FOR DATE OF BIRTH
@SuppressWarnings("unused")
public class CustomerValidationRules {
	private static double amnt;

	public static LocalDate parseDOB(String date) 
	{
		return LocalDate.parse(date);

	}

	//VALIDATE FOR ENUM VALUES
	public static  ServicePlan parseAndValidateType(String plan,double amount)throws Customer_Exceptions
	{
		ServicePlan service=ServicePlan.valueOf(plan.toUpperCase());
		if(service.getPlan()==amount)
			return service;
		throw new Customer_Exceptions("amount doesn't match with the chose plan cost");
	}

	//////////////////////////////////////////////////////////////////////////////////////////////
	//check for duplicate email
	public static String checkForDuplicateCustomer(List<Customer> customerList,String email)throws Customer_Exceptions {
		Customer newCustomer =new Customer(email);
		for(Customer c:customerList)
		{
			if(c.equals(newCustomer))
	 			throw new Customer_Exceptions("Duplicate email!!!");

		}
		return email;
		}

	//VALIDATE CUSTOMER'S ALL INPUT
	//String fname, String lname, String gmail, String pwd, LocalDate dateOfBirth,
	//ServicePlan value,double registrationAmount
	public static Customer validateCustomer(List<Customer> arrCustomer,String fname,String lname,String email,String password,String dob,String plan,double amnt) throws Customer_Exceptions
	{
		LocalDate dateOfBirth=parseDOB(dob);
		ServicePlan value=parseAndValidateType(plan,amnt);
		double amount=value.getPlan();
		validatEmailFormat(email);
		validatPassword(password);
		String emal=checkForDuplicateCustomer(arrCustomer,email);

		return new Customer(fname,lname,emal,password,dateOfBirth,value,amount);
	}

	// madhusharma@gmail.com
	public static void validatEmailFormat(String email)throws Customer_Exceptions
	{
		//if(email.contains("@gmail.com")&&(email.endsWith("@gmail.com")))
		if(email.contains("@"))
		{
			String[] arr=email.split("@");
			if(!((arr.length==2)&&(email.endsWith("gmail.com"))))
				throw new Customer_Exceptions("Invalid Email Id Format!!!");
		}
		else
			throw new Customer_Exceptions("Invalid Email Id Format!!!");
	}
	
	
//STRONG PASSWORD0	1abcde@
//	public static void validatPassword(String password)throws Customer_Exceptions
//	{
//		
//		String regex="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})";
//		
//		
//		if(!password.matches(regex)==true)
//		System.out.println("validate password");
//			throw new Customer_Exceptions("Password must contain 5 character::must have atleat one number and one letter!!!");
//		
//	}
	
	public static void validatPassword(String password)throws Customer_Exceptions
	{
		if(!password.matches("(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{5,}$"))
		throw new Customer_Exceptions("Password must contain 5 character::must have atleat one number and one letter!!!");
			
	}
	
	
	public static int parseAndValidateDob(String dob) 
	{
		LocalDate dateOfBirth=parseDOB(dob);		
		Period years=Period.between(dateOfBirth,LocalDate.now());
		
		return years.getYears();
	}
}
