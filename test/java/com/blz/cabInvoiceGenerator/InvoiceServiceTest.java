package com.blz.cabInvoiceGenerator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {

	InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

	@Test
	public void givenDistanceAndTime() {
		double distance = 5;
		double time = 10;
		double actual = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(60, actual, 0.0);
	}

	@Test
	public void givenDistanceAndTimeShouldReturnMinimumFare() {
		double distance = 0.2;
		double time = 1;
		double actual = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5, actual, 0.0);
	}
	
	@Test
	public void givenMultipleRidesReturnAggregateTotalFare() {
		Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
		double totalFare = invoiceGenerator.calculateFare(rides);
		Assert.assertEquals(30, totalFare, 0.0);
	}

}
