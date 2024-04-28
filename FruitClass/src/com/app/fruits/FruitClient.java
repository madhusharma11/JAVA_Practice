package com.app.fruits;

import java.util.Scanner;

public class FruitClient {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter no of Fruits you want to purchase = ");
		int size = in.nextInt();
		FruitBasket[] arr = new FruitBasket[size];


		//while(count <= size) {
		int choice = 0;
		do {
			try {
				System.out.println("1: Add Fruits, 2: Display name of Fruits in the Basket,"
						           + " 3: only show Fresh fruit's info,4: mark Fruit as stale,"
						           + "5: mark all sour fruits as stale, 6: call specific functionality,"
						           + " 0: Exit");


				System.out.println("Enter choice: ");
				
			    choice = in.nextInt();
			    
				switch(choice) {
				case 1:
					FruitUtility.addFruitIntoBasket(arr);
					break;
				case 2:
					FruitUtility.displayNameOfAllFruits(arr);
					break;
				case 3:
					FruitUtility.displayOnlyFreshFruit(arr);
					break;
				case 4:
					System.out.println("Enter index number = ");
					int index=in.nextInt();
					FruitUtility.markFruitStale(arr, index);
					break;
				case 5:
					FruitUtility.markAllSourFruitStale(arr);
				case 6:
					System.out.println("Enter index number = ");
					int indx=in.nextInt();
					FruitUtility.callSpecificFunctionality(arr,indx);
					break;
				default:
					System.out.println("invalid choice.");
				}
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Bucket Full Occured"+ e.getMessage());
				
			}catch(Exception e)
			{
				System.out.println("Error occured"+e.getMessage());
			}

		}while(choice!=0);
	}}
