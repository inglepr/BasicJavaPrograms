package com.bridgelabz.functional;

import com.bridgelabz.util.Utility;

public class CelsiustoFahrenheit {

	public static void main(String[] args) {
		System.out.println("enter the Celsius temperatur=");
		   double c =Utility.getDouble();
		
		   //Utility.celsiustoFahrenheit(c);
		System.out.println("Celsiustofahrenheit="+  Utility.celsiustoFahrenheit(c));
	}

}
