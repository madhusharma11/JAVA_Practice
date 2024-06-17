package com.Vehicle;

import java.time.LocalDate;
import java.util.Scanner;

public class VehicleUtility {
	public static int cnt=0;
public static void addNewVehicle(Vehicle[] arrVehicle) throws Exception {
	try
	{
		Scanner in=new Scanner(System.in);
		if(cnt>arrVehicle.length)
			throw new ArrayIndexOutOfBoundsException("Array limit exceed.");
		
	System.out.println("Enter vehicle chasis number: ");
	String chasisno=in.next();
	VehicleValidationRules.validateChasisNo(arrVehicle,chasisno);
	
	System.out.println("Enter vehicle Price: ");
	double price=in.nextDouble();
	
	System.out.println("Enter vehicle manufacture : ");
	String mfg=in.next();
	
	
	System.out.println("Enter vehicle insurance ExpDate : ");
	String insuranceExp=in.next();

	System.out.println("Enter vehicle  Pollution Level: ");
	double pollutionLevel=in.nextDouble();
	
	System.out.println("Enter vehicle color: ");
	String colors=in.next();
	
	Color color=VehicleValidationRules.validateColor(colors);

	//String chasisNo, double price, double pollutionLevel, Date mfg_date, Date insuranceExpDate,Color color) 

	arrVehicle[cnt]=new Vehicle(chasisno,price,pollutionLevel, LocalDate.parse(mfg),LocalDate.parse(insuranceExp),color);
	cnt++;
	
	}catch (Exception e)
	{
		e.printStackTrace();
	}
	}

public static void drive(float km,Vehicle[] vehicle) throws InvalidPollutionLevelException
{
	for(int i=0;i<cnt;i++)
	{
		double pollLeve = (vehicle[i]).getPollutionLevel();
		pollLeve=pollLeve+km/100;
		vehicle[i].setPollutionLevel(pollLeve);
		VehicleValidationRules.validationPollution(vehicle[i]);
	}
}

public static void display(Vehicle[] arrVehicle)
{
	for(int i=0;i<cnt;i++)
	{
		System.out.println(arrVehicle[i].toString());
	}
}

}

	

