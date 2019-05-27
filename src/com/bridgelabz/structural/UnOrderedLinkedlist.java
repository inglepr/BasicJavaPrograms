package com.bridgelabz.structural;

import com.bridgelabz.util.Utility;

import com.bridgelabz.structural.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class UnOrderedLinkedlist 
{
		public static void main(String[] args) throws Exception{
			String path=("/home/admin1/eclipse-workspace/DataStructureProgram/src/like.txt");
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
				list.delete(find);
				System.out.println("Remove the word from file");
				//list.delete(find);
				list.display();
				list.writeOnFile();
				System.out.println("word is removed from file");
			}
			else 
			{
				System.out.println("word is not found in the file");
				System.out.println("adding word to file");
				System.out.println("");
				list.add(find);
				list.display();
				//list.writeOnFile();
			}
		}
	}