package com.bridgelabz.structural;

public class Dqueue<T> {
	static int total=100,rear=-1,front=-1;
	static String[] input=new String[total];
	
	public boolean isempty() {
		if(front==-1 && rear==-1) {
			return true;
			}
		return false;
		}
	public boolean isFull() {
		if(rear==input.length) {
			return true;
		}
		return false;
	}
	/*
	 * Purpose to add element in front end of queue
	 */
	public T addFront(String temp) {
		if(isFull()) {
			System.out.println("No space to add");
		}
		else {
			if(isempty()) {
				front++;
				input[front]=temp;
				rear++;
			}
			else {
				for(int i=rear+1;i>=front;i--) {
					input[i+1]=input[i];
				}
				input[front]=temp;
				rear++;
			}
		}
		return null;
	}
	/*
	 * Purpose to add element in rear end queue
	 */
	public T addrear(String temp) {
		if(isFull()) {
			System.out.println("Dequeue is full");
		}
		else {
			if(isempty()) {
				rear++;
				input[rear]=temp;
			
				front++;
			}
			
		}		return null;
	}
	/*
	 * Purpose to remove element from rear end
	 */
	public String removerear() {
		if(isFull()) {
			return "Dequeue is  not empty";
		}
		else {
			String rearElement=input[rear];
			rear--;
			if(front>rear) {
				front=-1;
				rear=-1;
			}
			return rearElement;
		}
	}
	/*
	 * Purpose to remove element from front end
	 */
	public String removefront() {
		if(isFull()) {
			return "Dequeue is empty";
		}
		else {
			String frontElement=input[front];
			front--;
			if(front>rear) {
				front=-1;
				rear=-1;
			}
			
			return frontElement;
		}
	}
	/*
	 * Purpose to display element
	 */
	public void display() {
		if(isFull()) {
			System.out.println("Dequeue is empty");
		}}
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}}