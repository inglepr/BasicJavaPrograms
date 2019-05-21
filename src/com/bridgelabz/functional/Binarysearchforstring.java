package com.bridgelabz.functional;
import java.util.Arrays;

import com.bridgelabz.util.Utility;
public class Binarysearchforstring {

	public static void main(String[] args) {
	
			System.out.println("Enter size of array ");
			int num=Utility.getInteger();
			String[] str=new String[num+1];
			
			System.out.println("Enter "+num+" String elements");
			for(int i=0;i<str.length;i++)
			{
			 str[i]=Utility.getString();
			}
			Arrays.sort(str);
			
			//long starTime=System.nanoTime();
			System.out.println("Enter String to search");
			String search=Utility.getString();
			int key= Utility.binarySearchMethodString(str,search);
			if(key==-1)
			{
				System.out.println("Element not found ");
			}
			else 
			{
				System.out.println("Element are "+search+ " found at "+key);
			}
			//long endTime=System.nanoTime();
			//double elapsedTime=(endTime-starTime)/1000.0;
			//System.out.println("Elapsed time is "+elapsedTime);
		}

	
	}

	
