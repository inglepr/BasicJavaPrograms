package com.bridgelabz.structural;
import com.bridgelabz.structural.LinkedList;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Hashing {
	static LinkedList  slot[]=new LinkedList[11];
		
	public static void main(String[] args) throws IOException  {
		
		BufferedReader br=new BufferedReader(new FileReader("/home/admin1/Desktop"));
		
			for(int i=0;i<slot.length;i++){
				slot[i]=new LinkedList();
			}
			int arr[]=new int[10];
			int num = 0;
			int j=0;
			String str=br.readLine();
			//System.out.println(str);
			String strArray[]=str.split(",");
				int num1=Hash(strArray[j]);
				slot[num1].add(strArray[j]);
			
	      //  System.out.println();
			for(int i=0;i<11;i++){
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
		public static  int Hash(String str)
	{
			return Integer.parseInt(str)%slot.length;
		
	
	}

}
