package com.bridgelabz.structural;
import java.util.Arrays;
import com.bridgelabz.structural.LinkedList;

import com.bridgelabz.util.Utility;


public class OrderedList<T> {

	public static void main(String[] args)throws Exception
	{
	String path=("/home/admin1/eclipse-workspace/DataStructureProgram/src/like.txt");
LinkedList <Integer> list=new LinkedList<Integer>();
String data[]=Utility.fileReadString(path);
int n[]=Utility.fileReadInteger(path);
System.out.println("enter list  of number");
//sorting array
for(int i=0;i<n.length-1;i++) {
	list.add(n[i]);
	Arrays.sort(n);
	list.display();
}


int find=Utility.getInteger();
System.out.println("enter the number to find");
list.display();
	
	if(list.search(find))
	{
		System.out.println("number is find the list");
		System.out.println("remove the number");
		list.delete(find);
		list.display();
		list.writeOnFile();
	}
	else {
		System.out.println("number is not found in list");
		System.out.println("add number in the list");
		list.add(find);
		list.display();
		list.writeOnFile();
	}
	}}

	


