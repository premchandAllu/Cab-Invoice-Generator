package com.blz.cabInvoiceGenerator;

public class InvoiceGenerator {

	public static int COST_PER_KM = 10;
	public static int COST_PER_TIME = 1;
	public static double MINIMUM_FARE = 5;

	public double calculateFare(double distance, double time) {
		double fare = ((distance * COST_PER_KM) + (time * COST_PER_TIME));
		return Math.max(fare, MINIMUM_FARE);
	}

}
