package com.bridgelabz.functional;

import com.bridgelabz.util.Utility;

public class BubbleSortForString {

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		int size=Utility.getInteger();
	String str[]=new String [size];
	System.out.println("enter the array element");
	for(int i=1;i<str.length;i++)
	{
		str[i]=Utility.getString();
		
	}
	Utility.bubbleSortForString(str);
	Utility.prinArrayInt(str);

	}

}
