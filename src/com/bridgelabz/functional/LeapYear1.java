package com.bridgelabz.functional;

import com.bridgelabz.util.Utility;

public class LeapYear1 {
	public static void main(String[] args) {
		System.out.println("enter year");
		int year=Utility.getInteger();
		if (Utility.isleapYear(year)) 
			System.out.println(year + " is a leap year");
		 else
			System.out.println(year + " is not a leap year");
		
	}

		}



