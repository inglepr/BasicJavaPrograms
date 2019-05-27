package com.bridgelabz.structural;
import com.bridgelabz.structural.Queue;
import com.bridgelabz.util.Utility;
import java.util.Scanner;
public class BankQueue {



	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		BankQueue bank=new BankQueue();
		String s="";
		int num;
		System.out.println("Bank details");
			System.out.println("1 Add person name");
			System.out.println("2 Add or Wthdraw your amount");
			System.out.println("3 Total amount in bank");
			num=sc.nextInt();
		switch(num) {
		case 1:
			Scanner sc1=new  Scanner(System.in);
			System.out.println("Enter customer name ");
			s=sc1.next();
			String item=Utility.getString();
			BankQueue.enqueue(item);
		
		case 2:
			Scanner sc2=new  Scanner(System.in);
			System.out.println("Account holder name "+Queue.peek());
			System.out.println("Enter 1 to add and 2 to withdraw ");
			int m=sc2.nextInt();
			Queue.transaction(m);
			Queue.dequeue();
			System.out.println("Account holder name "+Queue.peek());
		
		case 3:
			System.out.println("size "+Queue.count);
			Queue.display();
		}
		while(num>0 && num<3) 
			sc.close();//for closing the scanner	
	}

	private static void enqueue(String s) {
		

		
	}
}