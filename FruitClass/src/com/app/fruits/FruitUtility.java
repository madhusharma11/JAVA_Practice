package com.app.fruits;

import java.util.Scanner;

public class FruitUtility {
	static int cnt = 0;


	//Add fruits into basket
	public static void addFruitIntoBasket(FruitBasket[] arr) throws Exception {
		//		if(arr.length<=cnt)
		//			throw new Exception("Bucket Full!");
		Scanner in = new Scanner(System.in);
		System.out.println("1. Mango, 2. Orange, 3. Apple");
		System.out.println("Enter choice: ");
		int choice = in.nextInt();
		System.out.println("Enter fruit name:");
		String fname = in.next();
		System.out.println("Enter fruit color:");
		String fcolor = in.next();
		System.out.println("Enter Fruit Weight:");
		float fweight = in.nextFloat();

		switch(choice) {
		case 1:
			arr[cnt] = new Mango(fname, fcolor, fweight);
			++cnt;
			break;
		case 2:
			arr[cnt] = new Orange(fname, fcolor, fweight);
			++cnt;
			break;
		case 3:
			arr[cnt] = new Apple(fname, fcolor, fweight);
			++cnt;
		}
	}
	//display name of all fruits which are in basket
	public static void displayNameOfAllFruits(FruitBasket[] arr) {
		for(int i = 0; i < cnt; ++i) {
			System.out.println(arr[i].getFname());
		}
	}


	//display all fruits which are present in basket
	public static void displayDetails(FruitBasket[] arr) {
		for(int i = 0; i < cnt; ++i) {
			System.out.println(arr[i]);
		}
	}

	
	// DISPLAY ONLY FRESH FRUITS FROM BASKET
	public static void displayOnlyFreshFruit(FruitBasket[] arr) {
		for(int i=0;i<cnt;i++)
		{
			if(arr[i].getFreshness()==true)
			{
				System.out.println(arr[i]);
				System.out.println(arr[i].taste());
			}
		}
	}


	//	display how many fruits are available in the basket
	//	public static int countOfFruits()
	//	{
	//		return cnt;
	//	}

	//Mark fresh and stale on fruits
	public static void markFruitStale(FruitBasket[] arr,int index)throws Exception
	{
		if(index>=cnt)
			throw new Exception ("invalid index");
		arr[index].setFreshness(false);
	}

	//Mark all sour fruits stale
	public static void markAllSourFruitStale(FruitBasket[] arr )
	{
		for(int i=0;i<cnt;i++)
		{
			if((arr[i].taste()).equals("sour") ) {
				arr[i].setFreshness(false);
			}
		}
	}



	//calling specific functionality
	public static String callSpecificFunctionality(FruitBasket[] arr,int index)throws Exception
	{
		if(index>=cnt)
			throw new Exception ("invalid index");

		if(arr[index] instanceof Mango)
			return ((Mango)arr[index]).pulp();
		else if(arr[index] instanceof Apple)
			return ((Apple)arr[index]).jam();
		else if(arr[index] instanceof Orange)
			return ((Orange)arr[index]).juice();
		else
			throw new Exception ("object not matchedd");
	}
}


