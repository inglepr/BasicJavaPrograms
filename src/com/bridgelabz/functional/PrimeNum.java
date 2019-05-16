package com.bridgelabz.functional;

import com.bridgelabz.util.Utility;

public class PrimeNum {

	public static void main(String[] args) {

				System.out.print("Enter number:-");
			int n = Utility.getInteger();
			if(Utility.primeFactors(n))
				{
					System.out.println("number is prime");
				}
					else {
						System.out.println("number is not prime");
					
					
				}
			
			}
			

		
	}
	


