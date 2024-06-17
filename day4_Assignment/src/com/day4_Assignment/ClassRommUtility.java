package com.day4_Assignment;
import java.util.Scanner;
public class ClassRommUtility {
	public static void acceptClassRoomDetails(Classroom[] arr)
	{
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter class room id=");
			int roomId=obj.nextInt();
			System.out.println("Enter class room name=");
			String className=obj.next();
			System.out.println("Enter teacher id=");
			int teacherId=obj.nextInt();
			System.out.println("Enter Teacher name=");
			String teacherName=obj.next();
			System.out.println("Enter 1. Professor 2. Assistent Professor");
			System.out.println("Enter teacher Designation=");
			int designation=obj.nextInt();
			Designation desig=null;
			switch(designation)
			{
			case 1:
				desig=Designation.Professor;
				break;
			case 2:
				desig=Designation.AssistentProfessor;
				break;
			}
			
			arr[i] = new Classroom(roomId,className,new Teacher(teacherId,teacherName,desig));	
		}
	}
	public static void displayClassRoomDetails (Classroom[] arr) {
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
		
	}

}
