package dayOneEmployeecom.Employee;

public class EmployeeValidation{
	public static final int MIN_AGE=25;
public static void empValidate(String name,int age,String gmail)throws AgeException
{
	if(age<MIN_AGE)
		throw new AgeException("Your Age is less than 25.");
System.out.println("Your age is valid.");
}

	
}
