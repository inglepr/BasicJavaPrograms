package com.bridgelabz.structural;

import com.bridgelabz.util.Utility;

public class Calender {
	public static int dayOfWeek(int d, int m, int y) {
			String [] days= {"Sunday","Monday","Tuesday","Wendsday","Thusday","Friday","Saturday"};
			int y1=y-(14-m)/12;
			int x1=(y1+y1/4)-(y1/100)+y1/400;
			int m1=m+12*((14-m)/12)-2;
			int d1=(d+x1+31*(m1/12))%7;
			return d1;	
		}
		public void printCalendar(int month,int year){
			String[] Months ={"January","February","March","April","May","June","July","August",
								"September","October","November","December"};
			int[] noOfDays= {0,31,28,31,30,31,30,31,31,30,31,30,31};
			
			int result=dayOfWeek(1,month,year);
			System.out.println("\n"+"   "+Months[month-1]+"  "+year);
			//finding leap year
			if(month==2 && isLeapYearForCalender(year)){
				noOfDays[2]=29;
			}
			System.out.println("S  M  T  W  T  F  S  ");
			for(int i=0;i<result;i++){
				System.out.print("   ");
			}
			for(int i=1;i<=noOfDays[month];i++){
				if(i<=9){
					System.out.print(i+"  ");
				}
				else if(i>9){
					System.out.print(i+" ");
				}
				if((result+i)%7==0){
					System.out.println();
				}
			}
		}
		public static boolean isLeapYearForCalender(int year){
				if(year%4==0 || year%400==0 && year%100!=0){
					return true;
				}
				else{
					return false;
				}
			}	
		public static void main(String[] args) {
			System.out.println("Enter Month ");
			int month=Utility.getInteger();
			System.out.println("Enter Year ");
			int year=Utility.getInteger();
			Calender  c=new Calender();
			c.printCalendar(month, year);
		}		

	}


