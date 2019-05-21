package com.bridgelabz.functional;
import com.bridgelabz.util.Utility;
public class ReplaceString {

	public static void main(String[] args) {
	String str1,str2,str3,str4;
	System.out.println("enter the String");
	str1=Utility.getString();
	
	System.out.println("entet you string is"+str1);
	
	System.out.println("enter the String you want to replace");
	str2=Utility.getString();
	
	System.out.println("enter the new String");
	str3=Utility.getString();
	str4=str1.replace(str2, str3);
	System.out.println("new String="+str4);

	}

}
