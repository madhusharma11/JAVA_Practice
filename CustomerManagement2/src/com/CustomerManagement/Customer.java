package com.CustomerManagement;

import java.time.LocalDate;



@SuppressWarnings("unused")
public class Customer {
	private int customerId;
	private static int count;
	private String firstName, lastName, email, password;
	private double registrationAmount=0;
	private LocalDate dob;
	private ServicePlan plans;
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
		return "Customer ID : " + customerId + ", First Name : " + firstName + ", Last Name : " + lastName + ", Email : "
				+ email + ", Password : " + password + ", Registration Amount : " + registrationAmount + ", DOB : " + dob
				+ ", Plans : " + plans+", registrationAmount: "+registrationAmount;
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


	
	public String getPassword() {
		return password;
	}


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
	
}
