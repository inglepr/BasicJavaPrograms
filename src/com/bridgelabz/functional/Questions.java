package com.bridgelabz.functional;

public class Questions {
	
	//private static final String StdIn = null;
public static int Search( int hi,int lo)
	{ 
		if((hi-lo)==1)//higth minu lower is equal to one return lower
		return lo;
		int mid=lo+(hi-lo)/2;
		System.out.println(mid);
		
		//if(StdIn.readBoolean())
			return Search(lo,mid);
	}
		//return Search(mid,hi);
		
	
	public static void main(String[] args) {
	int k=Integer.parseInt(args[0]);
	int n=(int)Math.pow(2, k);
	System.out.printf("Thinking of integer between"+ 0,n-1);
	int secret=Search(0,n);
	System.out.println(secret);
	}

}
