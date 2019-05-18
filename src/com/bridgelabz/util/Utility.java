package com.bridgelabz.util;
import com.bridgelabz.util.Utility;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	 
public static Scanner sc=new Scanner(System.in);


	//======================  To get Integer using scanner class  =============================================
		
		public static int getInteger() {
			return sc.nextInt();
		}
		
	//======================To get double using scanner class =================================================
		
		public static double getDouble() {
			return sc.nextDouble();	
		}
			
	//=======================To get string using scanner class ================================================

		public static String getString() {
			return sc.nextLine();	
		}
		
	//===========================to get boolean value using scanner class ===================================
		
		public static boolean getBoolean() {
			return sc.nextBoolean();
			
		}
		
	//===============================PrimeNumber=================================================================
		public static void primeFactors(int n) {
			for(int i=2;i<=n;i++){
				while(n%i==0) {
					System.out.println(i+"");
					n=n/i;
		}
	    }
		}
		
	//===============================LeapYear============================//

		public static boolean isleapYear(int year) {
			if(year%4==0 && year%100!=0){
				return true;
			}	 
			if(year%400==0) {
				return true;
			}
			return false;
		
	}
	//==========================Anagram====================================

		public static boolean isAnagram(String s1,String s2) {
			char[] str1=s1.toCharArray();
			char[] str2=s2.toCharArray();
			int n1=str1.length;
			int n2=str2.length;
			
			if(n1!=n2) {
				return false;
			}			
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			for(int i=0;i<n1;i++){
				if(str1[i]!=str2[i]) { 
					return false;
				}	
			}
			return true;
		}
		
		//===================PallindromeNumber==================
		
		public static void ispallindrome(int num) {
			int rem,reverseNum=0;
			int origNum=num;
				while(num>0){
					rem=num%10;
					reverseNum=reverseNum*10+rem;
					num=num/10;
				}
			if(origNum==reverseNum) {
				System.out.println("Prime and pallindrime:-  "+reverseNum);
			}
		
	//===========================FlipCoin===============================
    if (Math.random() < 0.5){
		System.out.println("Heads");
		}
	else{
		System.out.println("Tails");}
		}
	//===========================HarmonicNumber==========================

		public static void findHarmonic(int num) {
		double res=0.0;
		while(num!=0) {
			res=res+(double)1/num;
			num--;
			System.out.println(res+" ");
		}
		System.out.println("Output of harmonic series are :"+res);
	}

//==================================Number========================================
public static void findTriplets(int arr[],int n)
{
	boolean found=true; 
	for(int i=0;i<n-2;i++)
		{
		for(int j=i+1;j<n-1;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(arr[i]+arr[j]+arr[k]==0)
				{
					
					found=true;
					System.out.println(arr[1]);
					System.out.println("");
					System.out.println(arr[j]);
					System.out.println("");
					System.out.println(arr[k]);
				}
				
			}
			
		}}
	if(found==false) {
		System.out.println("sum is not zero");
	}
		
		}

//==================== Binary search for integer =================================================
public static int binarySearchMethod(int arr[],int search) {
	int start=0;
	int end=arr.length-1;
	
	while(start<=end) {
	int mid=(start+end)/2;
		if(arr[mid]==search) {
			return mid;
		}
		else if(arr[mid]<search) {
			start=mid+1;
		}
		else{
			end=mid-1;
		}
	}
return -1;
}

//=========================Binary search for String==================================================
public static int binarySearchMethodString(String str[],String search) {
	int start=0;
	int end=str.length-1;
	  while(start<=end){
		   int mid=(start+end)/2;
		   int result=search.compareTo(str[mid]);
		   	  if(result==0){
		   		  return mid;
		       }
		   	  else if(result>0){
		   		  start=mid+1;
		   	  }
		   	  else{
		   		  end=mid-1;
		   	  }		   
	   }
return 1;
}

//==========================Insertion sort for integer ========================================	

public static void insertionSortMethodInt( int arr[])
{
    int N = arr.length;
    int i, j, temp;
    for (i = 1; i< N; i++) 
    {
        j = i;
        temp = arr[i];    
        while (j > 0 && temp < arr[j-1])
        {
            arr[j] = arr[j-1];
            j = j-1;
        }
        arr[j] = temp;            
    }        
}   

	

//==========================Insertion sort for string  ====================================================

public static void insertionSortMethodString( String arr[] )
{
    int N = arr.length-1;
    int i, j; 
    for (i = 1; i< N; i++) 
    {
        j = i;
      String temp = arr[i];    
        while (j >= 0 && arr[j-1].compareToIgnoreCase(temp)> 0) 
        {
            arr[j] = arr[j-1];
            j = j-1;
        }
        arr[j] = temp;            
    }        
}   
	public static void prinArrayInt(int arr[])
	{
		System.out.println("The sorted array is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

	public static void prinArrayInt(String[] arr) {
		System.out.println("The sorted array is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		
		}}
	//============================BubbleSortForInteger=============================
	public static void bubbleSortIntMethod(int arr[])
	{
		//int i,j;
		int temp=arr[1];
		int n=arr.length;
		for(int i=1;i<n-1;i++)
		{
			for(int j=i+1;j<n-i-1;j++)
			{
			if(arr[j]>arr[j+1])
			
				
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			  
			
			}}
}

	//======================Bubble Sort for String========================
public static void buubleSortForString(String str[])
{
	int n=str.length;
	
	for(int i=1;i<n-1;i++)
	{
		String temp=str[i];
		for(int j=i+1;j<n-i-1;j++)
		{
			if(str[j].compareTo(str[j+1])>0)
				temp=str[j];
			str[j]=str[j+1];
			str[j+1]=temp;
			
		}}}
		
		


//==========================converts the Fahrenheit temperature into Celsius temperature==============//
public static double celsius(double f)
{	
return  (f-32)*5/9;
}


	
}


