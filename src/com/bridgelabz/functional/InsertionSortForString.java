package com.bridgelabz.functional;

import com.bridgelabz.util.Utility;

public class InsertionSortForString {

	public static void main(String[] args) {
		System.out.println("enter the size of String array");
		int size=Utility.getInteger();
		String []arr=new String[size];
		System.out.println("enter the String array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Utility.getString();
			
			//System.out.println("enter the element for sort");
		}
		Utility.insertionSortMethodString(arr);
		Utility.prinArrayInt(arr);
	}
	}

