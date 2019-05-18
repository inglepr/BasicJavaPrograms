package com.bridgelabz.functional;

import com.bridgelabz.util.Utility;

public class BubbleSortForInteger {

	public static void main(String[] args) {
		System.out.println("enter the size of array");
	int size=Utility.getInteger();
	int arr[]=new int[size];
	System.out.println("enter the element for bubble sorting");
	for(int i=1;i<arr.length;i++)
	{
	arr[i]=Utility.getInteger();
	//System.out.println("enter the elemet for bubble sorting");
	}
	Utility.bubbleSortIntMethod(arr);
	Utility.prinArrayInt(arr);
	}
}
