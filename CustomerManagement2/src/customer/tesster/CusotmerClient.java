package customer.tesster;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.CustomerManagement.Customer;

import static com.customer.util.CustomerUtility.*;
import static com.validate.customer.CustomerValidationRules.*;
import CustomerException.Customer_Exceptions;

@SuppressWarnings("unused")
public class CusotmerClient {
	public static void main(String[] args)
	{
		try(Scanner in=new Scanner(System.in))
		{

			boolean exit=false;
			List<Customer> arrCustomer=new ArrayList<>();

			while(!exit)
			{
				System.out.println("1: Sign up\t2: display Customer Details \t:3: Log In\t 4change password."
						+"\t0: Exit");		
				int choice=in.nextInt();
				try {
					switch(choice)
					{
					case 1:
						//String fname, String lname, String gmail, String pwd, LocalDate dateOfBirth,
						//ServicePlan value,double registrationAmount
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

						acceptDetailOfCustomer(arrCustomer, fname,lname,  email,  pwd,  dob,plan,amount);

						break;
					case 2://display
						displayCustomerDetails(arrCustomer);
						break;

					case 3://login
						System.out.println("email: ");
						String eml=in.next();
						System.out.println(" password: ");
						String Pswrd=in.next();
						login(arrCustomer, eml, Pswrd);
						break;
					case 4://update password
						System.out.println("Enter email: ");
						String emal=in.next();
						System.out.println("Enter Old password: ");
						String oldPass=in.next();
						System.out.println("Enter newPass: ");
						String newPass=in.next();
						changePassword(arrCustomer,emal,oldPass,newPass);
						break;
					case 5:
						System.out.println("Enter email: ");
						String emll=in.next();
						removeAccount(arrCustomer,emll);
						break;
					
					case 0:
						exit=false;
						break;
					}
				}catch (Exception e)
				{
					in.nextLine();
					System.out.println(e);	
				}
			}		
		}
	}
}


