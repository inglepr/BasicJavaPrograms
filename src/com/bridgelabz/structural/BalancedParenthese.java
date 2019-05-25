package com.bridgelabz.structural;
import com.bridgelabz.structural.Stack;
import com.bridgelabz.util.Utility;

public class BalancedParenthese {

	
			public static void main(String[] args) 
			{
				//Utility u=new Utility();
				System.out.println("Enter max size: ");
				int n=Utility.getInteger();
			

				/* Creating Stack */
				Stack stack = new Stack();
				System.out.println();
				System.out.println("Parenthesis Matching");
				System.out.println();
				 

				/* Accepting expression */
				System.out.println("Enter expression: ");
				String exp = Utility.getString();        
				int len = exp.length();
				System.out.println("Matches and Mismatches: ");

				for (int i = 0; i < len; i++)
				{    
				char ch = exp.charAt(i);

					if (ch == '(')
					{
					stack.push(i);
					}
						else if (ch == ')')
						{
							try
							{
							long p = (stack.pop() + 1);
							System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
							}
							catch(Exception e)
							{
							System.out.println("')' at index "+(i+1)+" is unmatched");
							}
						}            
					}
				while (!stack.isEmpty() )
				{
				System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
				}                          
		    }
		 

	}


