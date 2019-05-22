package com.bridgelabz.functional;
import com.bridgelabz.util.Utility;

public class VendingMachine{
	public static void main(String args[])
	{
		System.out.print("Enter the Amount:");
	int	amount =Utility.getInteger();
	vendermachine(amount);
	
	}	//Utility.calculate(amount);
		
	
	public static void vendermachine(int amount)
	{
		int notes=0;
		int[] mony= {2000,1000,500,50,10,5,2,1};
		for(int i=0;i<mony.length-1;i++)
		{
			if(amount>=mony[i])
				
			{
				/*notes=notes+amount/mony[i];
		        amount=amount%mony[i];
					System.out.println(mony[i] +"  "+ amount/mony[i]);*/
				notes=amount/mony[i];
				int total=amount%mony[i];
				amount=total;
				System.out.println(mony[i] +"  "+notes);
				
				}
			}
		//System.out.println(notes);
		
	}
}
	
	

