package com.bridgelabz.structural;

import com.bridgelabz.util.Utility;

public class PrimeAnagramStack {

	public static void main(String[] args) {
		System.out.println("printing PRIME+ ANAGRAM+ BY USING STACK");
		int range=1000;
		int []arr=Utility.primeAnagram(range);
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<arr.length;i++) {
			st.push(arr[i]);
		}
		st.display();
		System.out.println("Reverse PRIME+ANAGRAM :");
		while(st.isempty()!=true) {
			System.out.print(st.pop()+"  ");
		}
	}

}
