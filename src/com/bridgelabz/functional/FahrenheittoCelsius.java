package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class FahrenheittoCelsius {

	public static void main(String[] args) {
	
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter temp in c or f");
			int tem = s.nextInt();
			char t = s.next().charAt(0);
			s.close();
			if (t != 'f' && t != 'F' && t != 'c' && t != 'C') {
				System.out.println("enter correct input");
				main(args);
				return;
			}
			tem = Utility.temperaturConversion(tem, t);
			System.out.println("coverted temp is " + tem);
		} catch (Exception e) {
			System.out.println("temperature in format 4545 c");
		}

	}

	
	}


