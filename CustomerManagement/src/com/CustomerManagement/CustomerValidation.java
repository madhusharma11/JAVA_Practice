package com.CustomerManagement;

import java.time.LocalDate;

import com.CollectionMNGMT.Customer;

//VALIDATE FOR DATE OF BIRTH
public class CustomerValidation {
	public static LocalDate parseDOB(String date)
	{
		return LocalDate.parse(date);
	}

	//VALIDATE FOR ENUM VALUES
	public static  ServicePlan parseAndValidateType(String plan)
	{
		ServicePlan service=ServicePlan.valueOf(plan.toUpperCase());
		return service;
	}


	//VALIDATE FOR DUPLICATE EMAIL
	public static String validatGmail (Customer[] arrCustomer,String email)throws duplicateEmail
	{
		for(Customer c:arrCustomer)
		{
			if(c!=null && c.getEmail().equals(email))
				throw new duplicateEmail("This Email is already used.");
		}
		return email;
	}


	//Update password

	public static void changePassword(Customer[] arrCustomer,String email,String oldPass,String newPass)throws UserNotRegistered
	{
		boolean flag=false;
		for(Customer c:arrCustomer)
		{
			if((c!=null && c.getEmail().equals(email))&&(c.getPassword().equals(oldPass))) 
			{
				c.setPassword(newPass);
				System.out.println("New password successfully set.");
				flag=true;
				break;
			}
		}
		if(flag==false) 
			throw new UserNotRegistered("Email or Old password are incorrect.");
	}
}
