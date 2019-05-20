package com.bridgelabz.functional;
import com.bridgelabz.util.Utility;

public class monthlyPayment {

	public static void main(String[] args) {
		System.out.println("principal ,year and rate");
		/*double p=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double r=Double.parseDouble(args[2]);*/
		double p=Utility.getDouble();
		double y=Utility.getDouble();
		double r=Utility.getDouble();
		Utility.monthlypay(p,y,r);
				
	}}