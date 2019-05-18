package com.bridgelabz.functional;

import com.bridgelabz.util.Utility;

public class BinarySearchForString {

	public static void main(String[] args) {
	System.out.println("enter the size of array");
	int size=Utility.getInteger();
	String []str=new String[size];
	System.out.println("enter the String Array for Binary search");
	for(int i=0;i<str.length;i++)
	{
		
		str[i]=Utility.getString();
	}
	System.out.println("enter the element for search");
	String search=Utility.getString();
	//String arr[]=Utility.binarySearchMethod(str,size);
	Utility.binarySearchMethodString(str,search);
	
			
			}

}
