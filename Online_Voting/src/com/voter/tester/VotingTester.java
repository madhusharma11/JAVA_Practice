package com.voter.tester;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

import com.voter.dao.VoterDaoImpl;
import com.voter.entities.Voter;

public class VotingTester {

	public static void main(String[] args) {
		
try(Scanner sc=new Scanner(System.in))
{
	VoterDaoImpl voterDao=new VoterDaoImpl();
	boolean exit=false;
	while(!exit)
	{
		System.out.println("\n");
		System.out.println("1: Register Voter2: Login:\n3: Get Id\n");
		
		switch(sc.nextInt())
		{
		case 1:
			// id  | first_name | last_name | email             | password | dob        | status | role
			System.out.println("Enter first name, last name, email,password,dob status and role");
			System.out.println(voterDao.registerVoter(sc.next(), sc.next(), sc.next(), sc.next(), Date.valueOf(sc.next()), sc.nextInt(), sc.next()));
			break;
		case 2:
			System.out.println("Enter Email and Password to Login:");
			Voter voter =voterDao.logIn(sc.next(),sc.next());
			System.out.println(voter);
			break;
		case 3:
			System.out.println("Enter email and password:");
			System.out.println(voterDao.getId("Id:"+sc.next(),sc.next()));
			break;
			
		case 0:
			exit=true;
			 voterDao.cleanUp();
			 break;
		}
	}
	
	
} catch (SQLException e) {
	e.printStackTrace();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
