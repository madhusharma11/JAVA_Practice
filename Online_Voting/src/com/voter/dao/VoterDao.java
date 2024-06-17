package com.voter.dao;

import java.sql.Date;
import java.sql.SQLException;

import com.voter.entities.Voter;

import custom.excepton.UserException;


public interface VoterDao {
	//public boolean validateVoter1(int id) throws VoterException,SQLException;

	



	


	boolean registerVoter(String fname, String lname, String email, String password, Date date, int status, String role)
			throws UserException, SQLException;



	public int getId(String email,String password) throws UserException,SQLException;



	boolean validateVoter(String email) throws UserException, SQLException;






	Voter logIn(String email, String password) throws UserException, SQLException;



//	boolean validateVoter( int id) throws VoterException, SQLException;
}
