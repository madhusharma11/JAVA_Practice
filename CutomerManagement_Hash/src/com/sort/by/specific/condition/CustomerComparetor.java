package com.sort.by.specific.condition;

import java.util.Comparator;

import CustomerManagement.Customer;

// Display customer details sorted as per the dob n last name  : 
//using custom ordering , using anonymous inner class.
public class CustomerComparetor implements Comparator<Customer>{

	//ascending order by dob and last name

	public int compare(Customer c1,Customer c2)
	{
		int value= c1.getDob().compareTo(c2.getDob());
		if(value==0)
		{	
			if(c1.getLastName().equals(c2.getLastName()))
				return 0;
			return c1.getLastName().compareTo(c2.getLastName());

		}
		return value;
	}
}


//System.out.println("in compare : bal");
//if (a1.getBalance() < a2.getBalance())
//	return -1;
//if (a1.getBalance() == a2.getBalance())
//	return 0;
//return 1;






