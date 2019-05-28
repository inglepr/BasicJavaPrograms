package com.bridgelabz.structural;

import com.bridgelabz.util.Utility;

public class PrimeAnagram1 {

	public static void main(String[] args) {
			
				System.out.println("to stored the prime anagram in 2d Array");
				int[][] arr=new int[13][13];
				int primeAnagram[]=Utility.primeAnagram(1000);
				int k=0, f=0;
				System.out.println(arr.length);
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr.length;j++) {
						arr[i][j]=primeAnagram[k];
						k++;
						if(k==158) {
						f = 1;
							break;
						}
					}
					if(f==1)
						break;
				}
				
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr.length;j++) {
						if(arr[i][j]!=0)
						System.out.print(arr[i][j]+"\t");
					}
					System.out.println();
				}

	}

}
