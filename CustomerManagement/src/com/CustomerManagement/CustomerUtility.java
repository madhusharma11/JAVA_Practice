package com.CustomerManagement;

import java.time.LocalDate;
import java.util.Scanner;

import com.CollectionMNGMT.Customer;

import static com.CustomerManagement.CustomerValidation.*;


public class CustomerUtility {



	protected static int cnt=0;

	//accept and sign up
	@SuppressWarnings("resource")
	public static void acceptDetailOfCustomer(Customer[] arrCustomer)throws Exception
	{
		try {
			Scanner in =new Scanner(System.in);
			System.out.print("Enter first name: ");
			String fname=in.next();
			System.out.print("Enter last name: ");
			String lname=in.next();
			System.out.print("Enter DOB: ");
			String dob=in.next();
			System.out.print("Enter Email: ");
			//String email=in.next();
			String email=validatGmail(arrCustomer,in.next());
			//validatGmail(email);
			System.out.print("Enter Password: ");
			String pwd=in.next();
			System.out.print("Enter Plan:(SILVER, GOLD, DIAMOND, PLATINUM): ");
			String plan=in.next();
			arrCustomer[cnt++]=validateCustomer( fname, lname, dob, email, pwd, plan);	
		}catch(Exception e) {
			throw e;
		}
	}


	//validate
	public static Customer validateCustomer(String fname,String lname,String dob,String email,String pwd,String plan)
	{
		LocalDate dateOfBirth=parseDOB(dob);
		ServicePlan value=parseAndValidateType(plan);
		double amount=value.getPlan();

		System.out.println("Plan amount: "+amount);
		return new Customer(fname,lname,email,pwd,amount,dateOfBirth, value);
	}


	//display
	public static void displayCustomerDetails(Customer[] arrCustomer)
	{
		for(Customer c:arrCustomer)
		{ 
			if(c!=null)
				System.out.println(c);

		}
	}





	//////////////////////////////////////
	//	public static double getPlanAmount1(String plan)
	//	{
	//		ServicePlan service=ServicePlan.valueOf(plan.toUpperCase());
	//		return service.getPlan();
	//	}

}
