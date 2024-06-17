package com.voter.entities;

import java.sql.Date;
//| id  | first_name | last_name | email             | password | dob        | status | role
public class Voter {
	// | id  | first_name | last_name | email             | password | dob        | status | role
	private int voterId;
	private String first_name;
	private String last_name;
	private String email;
	private String password; //foreign key
	private Date dob;
	private boolean status;
	private String role;
	public Voter(int voterId, String first_name, String last_name, String email, String password, Date dob,
			boolean status, String role) {
		super();
		this.voterId = voterId;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", password=" + password + ", dob=" + dob + ", status=" + status + ", role=" + role + "]";
	}
	
	
	
	


	
	


	
}
