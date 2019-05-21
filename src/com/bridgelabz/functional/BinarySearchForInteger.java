package com.bridgelabz.functional;
import com.bridgelabz.util.Utility;
import java.util.Arrays;

public class BinarySearchForInteger {

	
public static void main(String[] args) {

				
					System.out.println("Enter size:- ");
					int size=Utility.getInteger();
					
					int arr[]=new int[size];
					System.out.println("Enter array elements :-");
						for(int i=0;i<arr.length;i++)
						{
							arr[i]=Utility.getInteger();
						}
					Arrays.sort(arr);
						
					//long startTime=System.nanoTime();
					System.out.println("Enter element to search");
					int search=Utility.getInteger();
					int key=Utility.binarySearchMethod(arr,search);
					if(key==-1) 
					{
						System.out.println("Element not found ");
					}
					else 
					{
						System.out.println("Element are "+search+ " found at "+key);
					}
					//long endTime=System.nanoTime();
					//double elapsedTime=(endTime-startTime)/1000.0;
					//System.out.println("Elapsed time is "+elapsedTime);
				}

}
