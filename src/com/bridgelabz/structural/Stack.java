package com.bridgelabz.structural;

//import com.bridgelabz.structural.LinkedList.Node;
public class Stack<T>
{
Node Top;
public class Node
{
	T data;   
	Node next;

}
/*
 * add element
 */
public void  push(T ch) {
	Node node=new Node();
	node.data=ch;
	node.next=Top;
	Top=node;
	}
/*
 * peek element
 */
 public void peek() {
	 if(Top==null) {
		 System.out.println("stack is empty");}
	 else {
		 Node n=Top;
		 while(n.next!=null) {
			 System.out.println(n.data);
			}
		 n=n.next;
	 }
	 /*
	  * check stack is empty or not
	  */
	}
 public boolean isempty() {
	 if(Top==null)
		 return false;
	 else 
		 return true;
	}
 /*
  *delete data from stack 
  */
 public void pop()
 {
	 if(Top==null) {
		System.out.println("");
		System.exit(0);
		}
	Top= Top.next;
		 }
	}