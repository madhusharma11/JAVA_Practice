package com.Vehicle;
import java.util.Scanner;

public class VehicleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exit=false;
		try (Scanner in =new Scanner(System.in)){


			System.out.println("how many vehicle do you want to add.:");
			int size =in.nextInt();
			Vehicle[] arrVehicle =new Vehicle[size];

			while(!exit)
			{
				System.out.println("1: add new Vehicle,2: Drive,0: exit.");
				System.out.println("Enter choice:");
				int choice =0;
				choice = in.nextInt();


				switch(choice)
				{
				case 1:
					VehicleUtility.addNewVehicle(arrVehicle);
					break;
				case 2:
					System.out.println("Enter km: ");
					VehicleUtility.drive(in.nextInt(),arrVehicle);
					break;
				case 0:
					exit=false;
					break;
				}		
			}
		}catch (InvalidChasisNumber e) {
			System.out.println(e.getMessage());
		} catch (InvalidVehicleColorException e) {

			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
}



