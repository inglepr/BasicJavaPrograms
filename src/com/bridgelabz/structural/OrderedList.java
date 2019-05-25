package com.bridgelabz.structural;

import com.bridgelabz.util.Utility;

public class OrderedList {

	public static void main(String[] args)throws Exception
	{
	String path="/home/admin1/eclipse-workspace/DataStructureProgram/src/Like.txt";
LinkedList <Integer> list=new LinkedList<Integer>();
String word[]=Utility.fileReadString(path);
for(int i=0;i<word.length;i++)
{
	list.add(word[i]);
	}

	}

}
