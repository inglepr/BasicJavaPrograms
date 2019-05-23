
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

public static void insertionSortMethodString(String[] arr, int size) 
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
	public static void bubbleSortIntMethod(int[] arr, int number) 
		// TODO Auto-generated method stub
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
public static void bubbleSortForString(String str[])
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

//===============================VendingMachin==========================================================//
public static void countCurrency(int amount) 
{ 
    int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 }; 
    int[] noteCounter = new int[9]; 
   
    // count notes using Greedy approach 
    for (int i = 0; i < 9; i++) { 
    	
        if (amount >= notes[i]) { 
            noteCounter[i] = amount / notes[i]; 
            amount = amount - noteCounter[i] * notes[i]; 
        } 
    } 
   
    // Print notes 
    System.out.println("Currency Count ->"); 
    for (int i = 0; i < 9; i++) { 
        if (noteCounter[i] != 0) { 
            System.out.println(notes[i] + " : "
                + noteCounter[i]); 
        } 
    } 
} 
  
    


//=============================temperaturConversion================

	public static double fahrenheittoCelsius(double f)
	{	
	return  (f-32)*5/9;
	}


public static double  celsiustoFahrenheit(double c)
{	
return  (c*9/5)+32;
}


//=================================monthlyPayments===============================
public static double monthlypay(double p,double y,double r)
{
	double n=12*y;
	double r0=r/(12*100);
	double payment=p*r0/(1-(Math.pow((1+r0),(-n))));
	return payment;
}

//=====================DayOfWeak===================================================
public static int getDate(int d0,int m0,int y0){
	y0=y0-(14-m0)/12;
	int x=y0+y0/4-y0/100+y0/400;
	int m=m0+12*((14-m0)/12)-2;
	d0=(d0+x+(31*m)/12)% 7;
	return d0;
}

//===============================Square root ==============================================================

	public static double square(double c) {
		double t=c;
		double epsilon=1e-15;
			while(Math.abs(t-c/t)>epsilon*t) {
				t=((c/t+t)/2);
			}
			return t;
	}

public static int[] stringToIntArray(String bin) {
	// TODO Auto-generated method stub
	return null;
}
//========================================DecimalToBinary==================================================
public static void decToBinary(int n) 
{ 
    

	 //array to store binary number 
	    int[] binaryNum = new int[32]; 

	    // counter for binary array 
	    int i = 0; 
	    while (n > 0)  
	    { 
	        // storing remainder in binary array 
	        binaryNum[i] = n % 2; 
	        n = n / 2; 
	        i++; 
	    } 
 
	    // printing binary array in reverse order 
	    for (int j = i - 1; j >= 0; j--) 
	        System.out.print(binaryNum[j]); 
}

 public static void stringToIntArray(int bin) {
	// TODO Auto-generated method stub
}
//========================Swapping nibbles==========================================================
  public static int swapNibbles(int x) 
 { 
     return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
 } 
  //===========================Primepallindrome=======================================================
  /*
   *  Function helping prime() to check if prime is pallindrome and print it
   */
   
  /*public static void primePallindrome() {
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}if (b && isPallindrome(j))
				System.out.print(j + " ");
			}}
  
}*/
//==========================file read string==================================

	public static String[] fileReadString(String path) throws Exception{
		FileReader file=new FileReader(path);
		BufferedReader br=new BufferedReader(file);
		String line;
		while(( line=br.readLine())!=null) {
			String word[]=line.split(",");
			return word;
		}
		br.close();
		return null;
	}
	
	
//============================file read integer==================================
	
	public static int[] fileReadInteger(String path) throws Exception{
		FileReader file=new FileReader(path);
		BufferedReader br=new BufferedReader(file);
		String line;
		while(( line=br.readLine())!=null) {
			String word[]=line.split(",");
			int size=word.length;
			int arr[]=new int[size];
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=Integer.parseInt(word[i]);
			}
			return arr;
		}
		br.close();
		return null;
	}
	//==============================Print integer element===============================================
	public static void printIntArray(int[] arr) {
		System.out.println("The sorted array is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		
		}
		
	}

	public static void printStringArray(String[] str) {
		// TODO Auto-generated method stub
		
	}}

