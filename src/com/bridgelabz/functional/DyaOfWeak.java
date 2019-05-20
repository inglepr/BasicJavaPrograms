package com.bridgelabz.functional;

import com.bridgelabz.util.Utility;

public class DyaOfWeak {
	

	

	public static void main(String args[])
	{ 
		System.out.println("number of day ");
	
	/*int d0=Utility.getInteger();
	int m0=Utility.getInteger();
	int y0=Utility.getInteger();
		 int day = Utility.getDate(d0,m0,y0); 
		    System.out.print(day); */
	int d0=Integer.parseInt(args[0]);
	int m0=Integer.parseInt(args[1]);
	int y0=Integer.parseInt(args[2]);
	int day=Utility.getDate(d0, m0, y0);
	System.out.println(day);
		}} 
	

	

