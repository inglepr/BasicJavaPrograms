package com.bridgelabz.functional;

import com.bridgelabz.util.Utility;

public class GuessingNum {

	public static void number(int first,int last)
	{
		int mid=(first+last)/2;
		while(first<last)
		{
			
			System.out.println("enter you num between"+first+"and"+mid+"[y/n]");
			char choice=Utility.getString().charAt(0);
			if(choice=='y'||choice=='y')
					 {
				number(first,mid);
				 }
			else if(choice=='n'||choice=='n')
			{
				number(mid+1,last);
				break;
				
			}
			else {
				System.out.println("number found at last index");
			}
		}
		
	}
	public static void main(String[] args) {
	int first=Integer.parseInt(args[0]);
	int last=Integer.parseInt(args[1]);
	GuessingNum.number(first, last);
	
	}

}
