package com.bridgelabz.functional;

import com.bridgelabz.util.Utility;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("enter the element in array");
		int size=Utility.getInteger();
		String[] str=new  String[size];
		System.out.println("enter the String array for binary search");
		for(int i=0;i<str.length;i++)
		{
			
			str[i]=Utility.getString();
		}
	System.out.println("enter the element for search");
	String ele=Utility.binarySearchMethod(str,size);
	Utility.binarySearchMethod(str, size);
		
	}}