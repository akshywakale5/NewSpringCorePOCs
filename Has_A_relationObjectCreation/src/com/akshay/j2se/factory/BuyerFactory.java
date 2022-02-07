package com.akshay.j2se.factory;

public class BuyerFactory {

	public static OldBuyer getInstance() {
		return new OldBuyer();
	}
}
