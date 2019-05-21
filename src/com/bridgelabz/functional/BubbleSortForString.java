package com.bridgelabz.functional;

import com.bridgelabz.util.Utility;

public class BubbleSortForString {

	public static void main(String[] args) {
System.out.println("Enter size of array ");
	int num=Utility.getInteger();
	String[] str=new String[num+1];
	
	System.out.println("Enter "+num+" String elements");
		for(int i=0;i<str.length;i++)
			{
				str[i]=Utility.getString();
			}
		
	//long starTime=System.nanoTime();
	System.out.println("After sorting");
	Utility.bubbleSortForString(str);
	Utility.printStringArray(str);
	//long endTime=System.nanoTime();
	//double elapsedTime=(endTime-starTime)/1000.0;
	//System.out.println("Elapsed time is "+elapsedTime);	
}
}