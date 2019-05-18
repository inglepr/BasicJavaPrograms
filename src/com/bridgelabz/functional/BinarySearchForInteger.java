package com.bridgelabz.functional;

import com.bridgelabz.util.Utility;

public class BinarySearchForInteger {

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		int size =Utility.getInteger();
		int arr[]=new int[size];
		System.out.println("enter the int  Array for Binary search");
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=Utility.getInteger();
			
			System.out.println("enter the element for search");
			int search=Utility.getInteger();
			Utility.binarySearchMethod(arr, search);
			
		}
		
	}

}
