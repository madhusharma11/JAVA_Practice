package com.Vehicle;

import java.time.LocalDate;
import java.util.Date;

@SuppressWarnings("unused")
public class Vehicle {
	protected String chasisNo;
	private Color color;
	protected double price, pollutionLevel;
	protected LocalDate mfg_date, insuranceExpDate;
	
	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPollutionLevel() {
		return pollutionLevel;
	}

	public void setPollutionLevel(double pollutionLevel) {
		this.pollutionLevel = pollutionLevel;
	}

	public LocalDate getMfg_date() {
		return mfg_date;
	}

	public void setMfg_date(LocalDate mfg_date) {
		this.mfg_date = mfg_date;
	}

	public LocalDate getInsuranceExpDate() {
		return insuranceExpDate;
	}

	public void setInsuranceExpDate(LocalDate insuranceExpDate) {
		this.insuranceExpDate = insuranceExpDate;
	}

	
	

	public Vehicle(String chasisNo, double price, double pollutionLevel, LocalDate mfg_date, LocalDate insuranceExpDate,Color color) 
	{
		this.chasisNo = chasisNo;
		this.price = price;
		this.pollutionLevel = pollutionLevel;
		this.mfg_date = mfg_date;
		this.insuranceExpDate = insuranceExpDate;
		this.color = color;
	}

	public String toString() {
		return "chasis no: " + this.chasisNo + " price: " + this.price + " pollution Level: " + this.pollutionLevel
				+ " mfg_date: " + this.mfg_date + " insurance ExpDate: " + this.insuranceExpDate;

	}
}

