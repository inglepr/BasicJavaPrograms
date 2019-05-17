package com.bridgelabz.functional;
/*
 * Compilation :javac EquDistance.java
 * Execution :java EquDistanc
 * 
 * Print the distance from (x,y)to the origin ,where x and y are integer.
 * 
 * % java Distance 2 3
 * distance from(2,3)  05275463989
 *
 */
public class EquDistance {

	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		double dist=Math.sqrt(x*x+y*y);
		System.out.println("distance from "+dist);
	}

}
