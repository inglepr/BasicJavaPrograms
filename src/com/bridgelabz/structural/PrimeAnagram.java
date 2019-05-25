package com.bridgelabz.structural;

import com.bridgelabz.functional.Anagram;
import com.bridgelabz.util.Utility;

public class PrimeAnagram {
	public static void main(String[] args) {
		
		PrimeAnagram prime=new PrimeAnagram();
		System.out.println("Enter number :");
		int number=Utility.getInteger();
		int i=0;
		int k=1;
		int m=0;
		int array[]=new int[168];
		array=Anagram.Prime(number);
		int anagram[]=Anagram.Anagram(array);
		int array2[][]=new int[10][20];
		for(int l=0;l<10;l++){
			for(int j=0;j<17;j++){
				if(array.length>m){
				array2[l][j]=anagram[m];
				m++;
				}
			}
		}
		for(int l=0;l<10;l++){
			for(int j=0;j<17;j++){
				if(array2[l][j]!=0)
				System.out.print(array2[l][j]+"  ");
			}
			System.out.println("");
		}
	}
}
