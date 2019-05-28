package com.bridgelabz.functional;

import com.bridgelabz.structural.Queue;
import com.bridgelabz.util.Utility;

public class PrimeAnagramQueue {


		public static void main(String[] args) {
			System.out.println("printing PRIME+ ANAGRAM+ BY USING QUEUE");
			Queue<Integer> q1=new Queue<Integer>(0);
			int range=1000;
			int [] arr=Utility.primeAnagram(range);
			for(int i=0;i<arr.length;i++) {
				q1.enqueue(arr[i]);
			}
			q1.display();
		}


	}


