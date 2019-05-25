package com.bridgelabz.structural;

public class Demo<T> {
	Node head;
	public class Node<T>{
	T data;
	Node next;
 public void  add(T data)
 {
	 Node node=new Node();
	 node.data=data;
	 node.next=null;
 if(head==null)
 {
	 head=node;}
 
	 else { 
		 Node n=head;
		 while(n.next!=null)
		 {
			n=n.next;
		 }n.next=node;
	 } }}
 
	public void show()
	{
		Node n=head;
		while(n.next!=null)
			System.out.println("show the data"+n.data);
	}
	 public boolean search( T word) {
		 Node n=head;
		 while(n.next!=null) {
			 if(n.data.equals(word))
			 {
				 return true;
			 }
			 else{
				 
 while(n.next==null)
			 {
				 n.data.equals(word);
				 return true;
			 }}
		 }
		return false;
		}
	 public  void delete(T ele)
	 {
		 Node n=head;
         Node n1=head;	
         if(n.data.equals(ele))
        	 head.next=head;
        }
public void writeonfile()
{
	String first="";
	Node temp=head;
	while(temp!=null)
	{
		first=first.trim()+""+temp.data.toString().trim();
	}
	}
		} 
	


