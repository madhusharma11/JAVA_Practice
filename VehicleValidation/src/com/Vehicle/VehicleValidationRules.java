package com.Vehicle;

public class VehicleValidationRules {

	public static final double MIN_VALUE,MAX_VALUE;

	static {
		MIN_VALUE=0;
		MAX_VALUE=20;
	}
	public static void validationPollution(Vehicle vehicle)throws InvalidPollutionLevelException
	{
		if(vehicle.getPollutionLevel()<MIN_VALUE||vehicle.getPollutionLevel()>MAX_VALUE)
		{
			throw new InvalidPollutionLevelException("Pollution level is high or exceed range.");
		}
		System.out.println("You are allowed to continue your riding or driving.");
	}
	
	
	
	

	public static Color validateColor(String color)throws InvalidVehicleColorException
	{
	
	Color clr=Color.valueOf(color.toUpperCase());
	if(clr==null)
	throw new InvalidVehicleColorException("This Color not available.");
    return clr;
	}
	
	


	public static void validateChasisNo(Vehicle[] arr,String chasisNo)throws InvalidChasisNumber
	{
		if(VehicleUtility.cnt==0)
			return;
		else
		{
			for(int i=0;i<VehicleUtility.cnt;i++)
			{
				if(arr[i].getChasisNo().equals(chasisNo))
					throw new InvalidChasisNumber("Chasis number exists plz enter another number.");
			}
		}
	}

	
}






