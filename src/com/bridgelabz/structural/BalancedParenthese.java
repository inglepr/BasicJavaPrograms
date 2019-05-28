package com.bridgelabz.structural;
import com.bridgelabz.structural.Stack;
import java.util.Scanner;

public class BalancedParenthese{
public static void main(String[] args) 
{
    Scanner scan = new Scanner(System.in);
    /* Creating Stack */
    Stack<Integer> stk = new Stack<Integer>();
    System.out.println("Parenthesis Matching Test\n");
    /* Accepting expression */
    System.out.println("Enter expression");
    String exp = scan.next();        
    int len = exp.length();
    System.out.println("\nMatches and Mismatches:\n");
    for (int i = 0; i < len; i++)
    {    
        char ch = exp.charAt(i);
        if (ch == '(')
            stk.push(i);
        else if (ch == ')')
        {
            try
            {
                int p = stk.pop() + 1;
                System.out.println("')' at index "+(i+1)+" matched with ')' at index "+p);
            }
            catch(Exception e)
            {
                System.out.println("')' at index "+(i+1)+" is unmatched");
            }
        }            
    }
    while (!stk.isempty() )
        System.out.println("'(' at index "+(stk.pop() +1)+" is unmatched");
}
}





