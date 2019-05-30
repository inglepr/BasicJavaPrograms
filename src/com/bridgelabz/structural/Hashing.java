package com.bridgelabz.structural;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.structural.LinkedList;
import com.bridgelabz.util.Utility;
public class Hashing {
	static LinkedList  slot[]=new LinkedList[11];
	public static void main(String[] args) throws IOException  {
		BufferedReader br=new BufferedReader(new FileReader("/home/admin1/eclipse-workspace/hash.txt"));
		
		for(int i=0;i<slot.length;i++)
{
			slot[i]=new LinkedList();
		}
		int arr[]=new int[10];
		int num = 0;
		int j=0;
		String str=br.readLine();
		System.out.println(str);
		String strArray[]=str.split(",");
		for(int i=0;i<strArray.length;i++)
{
			int num1=Hash(strArray[i]);
			slot[num1].insert(strArray[i]);
			
		}
		//System.out.println(" number "+num);
		System.out.println();
		for(int i=0;i<11;i++)
{
			System.out.print(i+"==>");
			slot[i].display();
		}
		
		//Scanner scanner=new Scanner(System.in);
		//System.out.println("Enter Key :");
		//int number1=scanner.nextInt();
		
		/*String string=String.valueOf(number1);	
		int num2=Hash(string);
		boolean value=slot[num].search(slot[num].head, num);
		if(value==true)
		{
			System.out.println("Element found "+value);
		}
		System.out.println("Hello");
	}*/
	}
	public static  int Hash(String str){
		return Integer.parseInt(str)%slot.length;
	}	
}	