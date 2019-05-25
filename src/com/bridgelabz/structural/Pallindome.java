package com.bridgelabz.structural;
import com.bridgelabz.structural.Dqueue;
import com.bridgelabz.util.Utility;

public class Pallindome {
public static void main(String[] args) {
					Dqueue<String>queue=new Dqueue<String>();
					
					System.out.println("Enter string to check for pallindrome: ");
					String input=Utility.getString();
					char[] arr=input.toCharArray();//converting string to char
					for(int i=0;i<arr.length;i++) {
						queue.addrear(Character.toString(arr[i]));
					}
					String reverse="";
					int length=queue.size();
					for(int i=0;i<length;i++) {
						reverse=reverse+queue.removerear();
					}
					if(input.compareTo(reverse)==0) {//comparing string
						System.out.println("String is pallindrome");
					}
					else {
						System.out.println("String is not pallindrome");
					}
			


	}

}
