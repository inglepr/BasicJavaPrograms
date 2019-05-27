package com.bridgelabz.structural;

/*
 * @Priya ingle
 * @ Purpose to implement linked list
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LinkedList<T>{
		Node head;
		
	public class Node<T>{
		T data;
		Node next;
	}
	/*
	 * Purpose to add element to list 
	 */
	public void add(T data) {
		Node node=new Node();
		node.data=data;
			if(head==null) {
				head=node;
			}
			else {
			Node n=head;
				while(n.next!=null) {
					n=n.next;
				}
			n.next=node;
			}
	}
	/*
	 * Purpose to display element from list
	 */
	public void display(){
		Node n=head;
			while(n.next!=null) {
				n=n.next;
				System.out.println(n.data+"");
			
			}
			System.out.println(n.data);	
	}
	/*
	 * Purpose to search element from list
	 */
	public boolean search(T word){
		 Node n=head;
			while(n.next!=null) {
				if(n.data.equals(word)) {
					return true;
				}
				if(n.next==null){
					n.data.equals(word);
					return true;
				}
				n=n.next;
			}
			return false;
	}
	/*
	 * Purpose to delete element from list
	 */
	public void delete(T ele) {
		Node n=head;
		Node n1=head;
			if(n.data.equals(ele)) {
				head=head.next;
			}
			while(n!=null){
				if(n.data.equals(ele)) {
					n1.next=n.next;
				}
				n1=n;
				n=n.next;
			}
	}
	/*
	 * Purpose to delete first  element from the list
	 */
	public T deleteFirst() {
		Object item;
		Node n=head;
		head=n.next;
		item=n.data;
		return (T) item;	
	}
	/*
	 * Purpose to delete last  element from the list
	 */
	public T deleteatLast() {
		if(head==null) {
			return null;
		}
		else {
		Node n=head;
		Node prev=head;
		while(n.next!=null) {
			prev=n;
			n=n.next;
			}
		T data=(T)n.data;
		prev.next=null;
		return data;
		}
	}
	/*
	 * Purpose to check list is empty or not
	 */
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}
	
	public T last(T data) {
		Node n=new Node();
		n.data=data;
		if(head==null) {
			head=n;
			n.next=null;
			return data;
		}
		else {
			n.next=null;
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=n;
		}
		return data;
	}
	public void writeOnFile() {
		String first="";
		Node temp=head;
		while(temp!=null) {
			first=first.trim()+""+temp.data.toString().trim();
			temp=temp.next;
		}
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("/home/user/eclipse-workspace/BridgelabzProgram/src/List.txt"))){
			bw.write(first);
			bw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
		
}