package com.day4_Assignment;

public class Teacher {
	private int teacherid;
	private String name;
	private Designation designation;
	Teacher(int teacherid,String name,Designation designation)
	{
		this.teacherid=teacherid;
		this.name=name;
		this.designation=designation;
	}
	
	@Override
	public String toString()
	{
		return "TeacherId= "+this.teacherid+
				" Teacher name= "+this.name+
				" Designation= "+this.designation;
		
	}
	
}

