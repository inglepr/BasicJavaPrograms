package com.bridgelabz.functional;

import java.util.Arrays;

import com.bridgelabz.util.Utility;

public class BubbleSortForInteger {

	public static void main(String[] args) {

			System.out.println("Enter size of array ");
				
			int number=Utility.getInteger();
			int[] arr=new int [number];	        
			
			System.out.println("Enter "+number +" elements");
				for(int i=0;i<arr.length;i++)
					{
						arr[i]=Utility.getInteger();
					}
				Arrays.sort(arr);
	       System.out.println("After sorting ");	
			Utility.bubbleSortIntMethod(arr,number);
			Utility.printIntArray(arr);
			

		}
	}