package com.bridgelabz.functional;
/*
 * @ Priya ingle
 * @ program to find the LeapYear.
 */
import com.bridgelabz.util.Utility;

public class LeapYear1 {
	public static void main(String[] args) {
		System.out.print("Enter year:-");
		int year=Utility.getInteger();
		if(Utility.isleapYear(year)) {
			System.out.println("Leap year:"+year);
		}
		else {
			System.out.println("It is not a leap year: "+year);
		}
	}

}
