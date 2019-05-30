package com.bridgelabz.structural;
public class Demo{
static class Stack
{ 
    int top=-1; 
    char items[] = new char[100]; //array
int leng=items.length;
    void push(char data)  
    { 
        if (top == 99)  
        { 
            System.out.println("Stack full"); 
        }  
        else 
        { 
            items[++top] = data; 
        } 
    } 

    char pop()  
    { 
        if (top == -1)  
        { 
            System.out.println("Underflow error"); 
            return '\0'; 
        }  
        else 
        { 
            char element = items[top]; 
            top--; 
            return element; 
        } 
    } 

    boolean isEmpty()  
    { 
        return (top == -1) ? true : false; 
    } 
}}
  
/* Returns true if character1 and character2 
   are matching left and right Parenthesis */
