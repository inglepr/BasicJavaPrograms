package com.bridgelabz.functional;
//import java.util.Scanner;

import com.bridgelabz.util.Utility;
public class InsertionSortForInteger {

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		int size =Utility.getInteger();
		int arr[]=new int[size+1];
		System.out.println("enter the int  Array for insertion sorting");
		
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=Utility.getInteger();
		}	
			//System.out.println("enter the element for search");
			//int search=Utility.getInteger();
			Utility.insertionSortMethodInt(arr);
			Utility.prinArrayInt(arr);
			
		
		
	}

}
