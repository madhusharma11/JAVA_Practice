package com.CustomerManagement;

import java.time.LocalDate;

public class Customer {
	private int cutomerId;
	private static int count;
	private String firstName, lastName, email, password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plans;
	static {
		count = 10000;
	}

	public Customer(String fname, String lname, String gmail, String pwd, double amount, LocalDate dateOfBirth,
			ServicePlan value) {
		 super();
		this.cutomerId = count++;
		this.firstName = fname;
		this.lastName = lname;
		this.email = gmail;
		this.password =  pwd;
		this.registrationAmount = amount;
		this.dob = dateOfBirth;
		this.plans = value;
	}


	@Override
	public String toString() {
		return "Customer ID : " + cutomerId + ", First Name : " + firstName + ", Last Name : " + lastName + ", Email : "
				+ email + ", Password : " + password + ", Registration Amount : " + registrationAmount + ", DOB : " + dob
				+ ", Plans : " + plans;
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
	
	
	@Override
	public boolean equals(Object obj) {
		if(o instanceof Customer)
			
		return super.equals(obj);
	}
	
	
}
