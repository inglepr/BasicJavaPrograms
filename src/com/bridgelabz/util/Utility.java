package com.bridgelabz.util;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

 import com.bridgelabz.functional;

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
	public static void  ispallindrome(int num) {
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
	}

//=================================FlipCoin========================
if (Math.random() < 0.5){
	System.out.println("Heads");
	}
else{
	System.out.println("Tails");
	}}
