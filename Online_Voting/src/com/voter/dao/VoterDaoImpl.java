package com.voter.dao;

import static com.voter.utils.DBVoterUtils.closeConnection;
import static com.voter.utils.DBVoterUtils.openConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.voter.entities.Voter;

import custom.excepton.UserException;


public class VoterDaoImpl implements VoterDao {
	private Connection cn;
	private PreparedStatement pst1, pst2,pst3,pst4.pst5;

	public VoterDaoImpl() throws Exception {
		cn = openConnection();

		pst1 = cn.prepareStatement("select * from users where id=? and role!='admin'");
		pst2 = cn.prepareStatement("select * from users where id=? and password=? and role!='admin'");
		//INSERT INTO table_name (column1, column2, column3, ...)
		//VALUES (value1, value2, value3, ...);
		// first_name | last_name | email             | password | dob        | status | role
		pst3=cn.prepareStatement("insert into users  (first_name,last_name,email,password,dob,status,role) values(?,?,?,?,?,?,?)");
	//get id
		pst4=cn.prepareStatement("select id from users where email=? and password=? and role!='admin'");
	//to vote
		pst5=cn.prepareCall("update users set status=")
	}

//VoterID | Name | Age | Gender | candidateId | dob        | status |
	@Override
	public boolean validateVoter(String email ) throws UserException, SQLException {
		pst1.setString(1, email);
		try (ResultSet rst = pst1.executeQuery()) {
			if (rst.next())
				return true;
			else
				throw new UserException("Invalid email!!!!");
		}
	}

	
	
	@Override
	public Voter logIn(String email,String password) throws UserException,SQLException {
		pst2.setString(1, email);
		pst2.setString(2,password);
		if (validateVoter(email)) {
			try (ResultSet rst = pst1.executeQuery()) {
				// id  | first_name | last_name | email             | password | dob        | status | role
				if (rst.next())
					return new Voter(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5)
							,rst.getDate(6),rst.getBoolean(7),rst.getString(8));
			}

		}

		return null;

	}
	@Override
	public boolean registerVoter(String fname,String lname,String email,String password,Date date,int status,String role)throws UserException, SQLException
	{
		pst3.setString(1,fname);
		pst3.setString(2, lname);
		pst3.setString(3, email);
		pst3.setString(4, password);
		pst3.setDate(5, date);
		pst3.setInt(6, status);
		pst3.setString(7, role);
		int rows=pst3.executeUpdate();
		if(rows==1) {
			System.out.println("Voter Register!!!!");
		return true;}
		else
			System.out.println("Voter NOT Register!!!");
		return false;
		
	}
	@Override
	public int getId(String email,String password) throws  UserException,SQLException

	{
		pst4.setString(1,email);
		pst4.setString(2,password);
		if(validateVoter(email)) {
		try(ResultSet rst=pst4.executeQuery()){
			if(rst.next())
				return (rst.getInt(1));
		     }
		}	else
			throw new UserException("Email is invalid!!!");
		return 0;
		
	}
	

	//////////////////////// CLOSE CONNECTION/////////////////////
	public void cleanUp() throws SQLException {
		System.out.println("user dao cleaned up");
		if (pst1 != null)
			pst1.close();
		closeConnection();
	}

}
