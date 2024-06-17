package customer.tesster;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.List;
import java.util.Scanner;

import com.customer.util.ioFileinputOutput;
import com.sort.by.specific.condition.CustomerComparetor;

import static com.customer.util.CustomerUtility.*;
import CustomerException.Customer_Exceptions;
import CustomerManagement.Customer;

@SuppressWarnings("unused")
public class CusotmerClient {
	public static void main(String[] args)
	{
		try(Scanner in=new Scanner(System.in))
		{

			boolean exit=true;
			
			Map<String,Customer> customerMap =new HashMap<String,Customer>(); 

			while(exit)
			{
				System.out.println("\n"
						+ "1: Sign up\t2: display Customer Details \t:3: Log In\t 4:change password.\n"
						+"5: Remove account\t6: Sorting elements by Email\n"
						+ "7: Remove all customer details from specified plan born after specified date.\t"
						+ "8: sorting by dob and last name.\n9: for save these operation in file\t10: Restore file \n0: Exit");		

				int choice=in.nextInt();
				try {
					switch(choice)
					{
					case 1:
						//String fname, String lname, String gmail, String pwd, LocalDate dateOfBirth,
						//ServicePlan value,double registrationAmount
						/*
						System.out.print("Enter first name: ");
						String fname=in.next();
						System.out.print("Enter last name: ");
						String lname=in.next();
						System.out.print("Enter Email: ");
						String email=in.next();
						System.out.print("Enter Password: ");
						String pwd=in.next();
						System.out.print("Enter DOB: ");
						String dob=in.next();
						System.out.print("Enter Plan:(SILVER, GOLD, DIAMOND, PLATINUM): ");
						String plan=in.next();
						System.out.println("Enter amount: ");
						double amount=in.nextDouble();
						acceptDetailOfCustomer(customerList, fname,lname,  email,  pwd,  dob,plan,amount);
						 */

						//					SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);
						acceptDetailOfCustomer(customerMap,"a1","sonaz1","aass2@gmail.com","abcdAe1","2000-12-12","silver",1000);
						acceptDetailOfCustomer(customerMap,"a2","mona2","cv1@gmail.com","aAaaa2","2001-12-12","gold",2000);
						acceptDetailOfCustomer(customerMap,"a3","madhu3","bcd1@gmail.com","a3123","2000-12-12","silver",1000);
						acceptDetailOfCustomer(customerMap,"a4","munnuz4","adf4@gmail.com","a4123","2002-05-12","diamond",5000);
						acceptDetailOfCustomer(customerMap,"a5","devz5","sdghf3@gmail.com","a5123","2000-12-12","platinum",10000);
						acceptDetailOfCustomer(customerMap,"a6","anjaliz6","shjas7@gmail.com","a6123","2000-12-12","silver",1000);
						break;


					case 2://display
						displayCustomerDetails(customerMap);
						break;

					case 3://login
						System.out.println("email: ");
						String eml=in.next();
						System.out.println(" password: ");
						String Pswrd=in.next();
						login(customerMap, eml, Pswrd);
						break;
					case 4://update password
						System.out.println("Enter email: ");
						String emal=in.next();
						System.out.println("Enter Old password: ");
						String oldPass=in.next();
						System.out.println("Enter newPass: ");
						String newPass=in.next();
						changePassword(customerMap,emal,oldPass,newPass);
						break;
					case 5:
						System.out.println("Enter email: ");
						String emll=in.next();
						removeAccount(customerMap,emll);
						break;
					case 6:
						sortCustomerListByEmail(customerMap);
						break;
					case 7:
						System.out.println("Enter service plan & date::");
						String plan2=in.next();
						String date=in.next();
						
						removeAllCustomerDetailsFromSpecifiedPlanDate(customerMap,plan2,date);
						break;
					case 8:
						//sorting by dob and last name.
						//Collections.sort(customerMap, new CustomerComparetor());
						break;
					case 9:
						System.out.println("Enter filename:: ");
						String filename=in.next();
						ioFileinputOutput.writeData(customerMap, filename);
						break;
					case 10:
						System.out.println("Enter filename:: ");
						String filenam=in.next();
						
						Map<String,Customer> map2=(ioFileinputOutput.readData(filenam));
						map2.values().
						forEach(s->System.out.println(s));
						break;
					case 0:
						exit=false;
						break;
					}
				}catch (Exception e)
				{
					in.nextLine();
					System.out.println(e);
					e.printStackTrace();
				}
				
			}		
		}
	}
}


