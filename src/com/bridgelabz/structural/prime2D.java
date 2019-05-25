package com.bridgelabz.structural;

import com.bridgelabz.util.Utility;

public class prime2D
{
	// Function to check a number is prime or not
	public static void main(String[] args) {
		int arr[]=Utility.primeNumber();//prime method in utility class
		int arr1[][]=new int[10][168];
		
		for(int i=0;i<10;i++) {
			System.out.print("");
			for(int j=0;j<168;j++) {
				if(arr[j]>((i)*100) && (arr[j]<((i+1)*100))) 
				{
					arr1[i*j];
			
					arr1[i][j]=arr[j];
					System.out.print(arr1[i][j]+"\t");
				}
			}
			System.out.println("");
		}
	}}