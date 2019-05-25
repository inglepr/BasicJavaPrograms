package com.bridgelabz.structural;

import com.bridgelabz.util.Utility;

public class calendarLinkList {
	public static void main(String[] args) {
		//Object created for storing
		Queue qlist=new Queue(31);
		String months[]= {"January","February","March","April","May","June","July","August",
				          "September","October","November","December",""};
		int[] date= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int month=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		
		//checking year is leap or not
		if(month==2 && Utility.isleapYear(year)) {
			date[month]=29;
		}
		int day=Utility.getDate(month,1,year);
		int arr[][]=new int[6][7];
		int x=1;
		
		for(int i=0;i<6;i++) {
			for(int j=day;j<7;j++) {
				if(x<=date[month]) {
					arr[i][j]=x;
					x++;
				}
			}
			day=0;
		}
		System.out.println(" "+ months[month]+" " +d+" " +year);
		System.out.println(" Sun Mon Tue Wed Thur Fri Sat");
		for(int i=0;i<6;i++) {
			System.out.println();
			for(int j=0;j<7;j++) {
				if(arr[i][j]!=0) {
					System.out.printf("%4d",arr[i][j]);
					qlist.enqueue(arr[i][j]);
				}
				else {
					System.out.println("");
				}
			}
			System.out.println("");
		}
	}
}
