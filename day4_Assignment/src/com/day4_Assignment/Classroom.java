package com.day4_Assignment;

public class Classroom {
	private int roomId;
	private String className;
	private Teacher teacher;
	Classroom(int roomId,String className,Teacher teacher)
	{
		this.roomId=roomId;
		this.className=className;
		this.teacher=teacher;
	}
	public String toString()
	{
		return "RoomId= "+this.roomId+
				" Class name= "+this.className+
				teacher.toString();
	}
	

}
