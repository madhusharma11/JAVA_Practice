
package com.app.sellOnlinePen;

import java.time.LocalDate;

public class Pen {
	private static int id=100;
	private String brand;
	private String inkColor;
	private String color;
	private String material;
	private int quantity;
	private LocalDate updatedDate;
	private double price;
	
	
	
	public Pen(String brand, String inkColor, String color, String material, int quantity, 
			double price) {
		super();
		++id;
		this.brand = brand;
		this.inkColor = inkColor;
		this.color = color;
		this.material = material;
		this.quantity = quantity;
		this.updatedDate=LocalDate.now();
		this.price = price;
	}



	public Pen(String penColor, String inkColor2, String brandName, String material2) {
	this.color=penColor;
	this.inkColor=inkColor2;
	this.brand=brandName;
	this.material=material2;
	}



	public static int getId() {
		return id;
	}



	public static void setId(int id) {
		Pen.id = id;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getInkColor() {
		return inkColor;
	}



	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getMaterial() {
		return material;
	}



	public void setMaterial(String material) {
		this.material = material;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public LocalDate getUpdatedDate() {
		return updatedDate;
	}



	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Pen [id: "+id+",brand=" + brand + ", inkColor=" + inkColor + ", color=" + color + ", material=" + material
				+ ", quantity=" + quantity + ", updatedDate=" + updatedDate + ", price=" + price + "]";
	}



	
	
	
	

}
