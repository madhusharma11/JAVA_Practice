package CustomerManagement;
import java.time.LocalDate;



public class Customer implements Comparable<Customer>{
	private int customerId;
	private static int count;
	private String firstName, lastName, email, password;
	private double registrationAmount=0;
	private LocalDate dob;
	private ServicePlan plans;
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public ServicePlan getPlans() {
		return plans;
	}
	public void setPlans(ServicePlan plans) {
		this.plans = plans;
	}


	static {
		count = 1000;
	}

	public Customer(String fname, String lname, String gmail, String pwd, LocalDate dateOfBirth,
			ServicePlan value,double registrationAmount) {
		 //super();
		this.customerId=count++;
		this.firstName = fname;
		this.lastName = lname;
		this.email = gmail;
		this.password =  pwd;
		this.dob = dateOfBirth;
		this.plans = value;
		this.registrationAmount=registrationAmount;
	}
	//to wrap primary key
	public Customer(String email)
	{   
		this.email=email;
	}


	@Override
	public String toString() {
		return "Customer ID : " + customerId + "\tFirst Name : " + firstName + "\tLast Name : " + lastName + "\tEmail : "
				+ email + "\tPassword : " + password + "\tRegistration Amount : " + registrationAmount + "\tDOB : " + dob
				+ "\tPlans : " + plans+"\tregistrationAmount: "+registrationAmount;
	}
	
	
	@Override
	public boolean equals(Object o) {
		System.out.println("in customer's equals");
		if (o instanceof Customer) {
			Customer c=(Customer)o;
			return this.email.equals(c.email);
		}
		return false;
	}

	@Override
	public  int compareTo(Customer anotherCustomer)
	{
		return this.getEmail().compareTo(anotherCustomer.getEmail());
	}
	
	public String getPassword() {
		return password;
	}
	
	
	
	
//	public String hashCode() 
//	{
//		return this.email;
//	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}



	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Customer.count = count;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getRegistrationAmount() {
		return registrationAmount;
	}
	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}
	
}
