package dayOneEmployeecom.Employee;

import java.util.Scanner;

public class EmployeeClient extends Employee{
	public EmployeeClient(String name, int age, String gmail) {
		super(name, age, gmail);
	}

	public static void main(String[] args)
	{
		try(Scanner in=new Scanner(System.in))
		{
			System.out.println("Enter name: ");
			String name=in.next();

			System.out.println("Enter age: ");
			int age=in.nextInt();

			System.out.println("Enter Gmail: ");
			String gmail=in.next();

			EmployeeValidation.empValidate(name, age, gmail);
		}catch(Exception e)
		{
			System.out.println("AgeException occured.");
		}
	}
}
