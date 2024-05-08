package com.customer.util;
import java.time.LocalDate;
import java.util.*;

import CustomerManagement.Customer;
import CustomerManagement.ServicePlan;
import com.sort.by.specific.condition.CustomerComparetor;
import static  com.customer.util.CustomerValidationRules.*;
import CustomerException.Customer_Exceptions;

public class CustomerUtility {


	//accept and sign up
	@SuppressWarnings("resource")
	public static void acceptDetailOfCustomer(Map<String,Customer> arrCustomer,String fname, String lname, String email, String pwd, String dateOfBirth,
			String value,double registrationAmount)throws Exception
	{	arrCustomer.put(email,CustomerValidationRules.validateCustomer( arrCustomer,fname, lname, email, pwd,dateOfBirth, value,registrationAmount));

	}


	//DISPLAY
	public static void displayCustomerDetails(Map<String,Customer> arrCustomer)
	{
		for(Customer c:arrCustomer.values())
		{ 
			System.out.println(c);
		}
	}
	//LOG IN
	public static void login(Map<String,Customer> customerMap,String email,String password)throws Customer_Exceptions
	{		if(customerMap.containsKey(email))
	{
		Customer customer=customerMap.get(email);
		if(customer.getPassword().equals(password)) {
			System.out.println("Successfully Log In!!!");
			System.out.println(customer);
		}
		else
			throw new Customer_Exceptions("Password does'nt match!!!!");
	}
	else
		throw new Customer_Exceptions("Invalid Credentials!!!!");
	}


	//UPDATE PASSWORD
	public static void changePassword(Map<String,Customer> customerMap,String email,String oldPass,String newPass) throws Customer_Exceptions//throws Customer_Exceptions
	{
		CustomerValidationRules.validatPassword(newPass);

		if(customerMap.containsKey(email))
		{System.out.println("1");
		Customer customer=customerMap.get(email);
		if(customer.getPassword().equals(oldPass))
		{
			customer.setPassword(newPass);
			System.out.println("Password is set!!!");
		}
		else
			throw new Customer_Exceptions("Old password is incorrect.");
		}

		else
			throw new Customer_Exceptions("Email  are incorrect.");
	}




	//Remove all customer details from specified plan born after specified date.
	//i/p : plan n date
	public static void removeAllCustomerDetailsFromSpecifiedPlanDate(Map<String,Customer> customerMap,String plan,String date) throws Customer_Exceptions
	{

		LocalDate dob=parseDOB(date);
		ServicePlan service=ServicePlan.valueOf(plan.toUpperCase());
		Set<String> keyset= customerMap.keySet();
		for(String key:keyset)
		{
			Customer customer=customerMap.get(key);
			if((customer.getDob().equals(date))&&(customer.getPlans().equals(service)))
			{
				customerMap.remove(key); 
			}
		}

	}


	//DELETE ACCOUNT
	public static void removeAccount(Map<String,Customer> customerMap,String email)throws Customer_Exceptions
	{
		if(customerMap.containsKey(email))
		{
			customerMap.remove(email);

		}
		else
			throw new Customer_Exceptions("Customer doen't exit!!!");
	}
	//SORT AS PER EMAIL 
	public static void sortCustomerListByEmail(Map<String,Customer> customerMap)
	{

		Set<String> keyset =  customerMap.keySet();

		List<String> keylist  =  new ArrayList<String>(keyset);

		Collections.sort(keylist,Comparator.reverseOrder());

		for(String email:keylist) {
			Customer customer = customerMap.get(email);
			System.out.println(customer );
		}
	}

}
