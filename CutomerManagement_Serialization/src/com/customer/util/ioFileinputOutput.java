package com.customer.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import CustomerManagement.Customer;

public interface ioFileinputOutput {
	
	static void writeData(Map<String,Customer> map,String fileName) throws  IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			out.writeObject(map);
		}
		
	}
	
	@SuppressWarnings("unchecked")
	static Map<String,Customer> readData(String filename) throws IOException,ClassNotFoundException
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename)))
		{
		return (Map<String, Customer>) in.readObject();
		}
		
	}

}
