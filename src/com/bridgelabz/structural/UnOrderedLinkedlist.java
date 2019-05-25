package com.bridgelabz.structural;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.bridgelabz.util.Utility;

public class UnOrderedLinkedlist {
	public static void main(String[] args) throws Exception{
		String path=("/home/admin1/eclipse-workspace/DataStructureProgram/src/Like.txt");
		System.out.println();
		LinkedList<String> list=new LinkedList<String>();
		
		String word[]=Utility.fileReadString(path);
		for(int i=0;i<word.length;i++) {
			list.add(word[i]);
		}
		list.display();
		
		System.out.println("Enter word to search");
		String find=Utility.getString();
		list.display();
		if(list.search(find)) 
		{
			System.out.println("word is found in the file");
			//System.out.println("Remove the word from file");
			list.delete(find);
			list.display();
			list.writeOnFile();
			System.out.println("word is removed from file");
		}
		else 
		{
			System.out.println("word is not found in the file");
			System.out.println("adding word to file");
			list.add(find);
			list.display();
//			list.writeOnFile();
		}
	}

}

