package com.bridgelabz.structural;

import com.bridgelabz.util.Utility;

public class BinaryTree {

	
		static int fact(int num) {
			int fact=1;
			for(int i=1;i<=num;i++) {
				fact=fact*i;
			}
			return fact;
		}
		
		public static void main(String[] args) {
			System.out.println("Enter  number: ");
			int num=Utility.getInteger();
			int num1=fact(2*num);
			int num2=fact(num+1)*fact(num);
			int value=num1/num2;
			System.out.println(value+" trees can be created using "+num+" nodes");
		}	
	}


