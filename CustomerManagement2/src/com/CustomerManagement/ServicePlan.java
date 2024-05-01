package com.CustomerManagement;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);

	private double plan;

	ServicePlan(double plan) {  //Constructor
		this.plan = plan;
	}
	@Override
	public String toString() {
		return name() + " " + this.plan;
	}

	public double getPlan() {
		return this.plan;
	}


}
