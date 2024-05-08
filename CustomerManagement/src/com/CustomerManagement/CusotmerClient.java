package com.CustomerManagement;
import java.util.Scanner;


import com.CustomerManagement.CustomerUtility.*;

public class CusotmerClient {
	public static void main(String[] args)
	{


		Scanner in=new Scanner(System.in);

		boolean flag=true;
		System.out.println("Enter Size: ");
		int size=in.nextInt();
		Customer[] arrCustomer=new Customer[size];

		while(flag)
		{
			try {
				System.out.println("1: Sign up\t2: display Customer Details \t3: change password.\t"
						+ "0: Exit");
						
				int choice=in.nextInt();
				switch(choice)
				{
				case 1:
					if(CustomerUtility.cnt>arrCustomer.length-1)
						throw new Customer_Exceptions("Bucket List Full.");

					CustomerUtility.acceptDetailOfCustomer(arrCustomer);
					break;
				case 2:
					CustomerUtility.displayCustomerDetails(arrCustomer);
					break;
				case 3:
					System.out.println("Enter email: ");
					String email=in.next();
					System.out.println("Enter Old password: ");
					String oldPass=in.next();
					System.out.println("Enter newPass: ");
					String newPass=in.next();
					CustomerValidation.changePassword(arrCustomer,email,oldPass,newPass);
					break;
				case 0:
					flag=false;
					break;
				}
			}catch (Exception e)
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

		}
	}
}


