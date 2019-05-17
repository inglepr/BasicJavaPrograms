package com.bridgelabz.functional;
/*
 * @Priya Ingle
 * @
 */
public class CouponCollector {

	public static void main(String[] args) {
	  int n=Integer.parseInt(args[0]);// number of card type
	  boolean[] iscollected=new boolean[n];//if(iscollected(i))=true if card i has been collected
	  int count=0;    //total collected card
	  int distinct=0;//number of distinct card
	  while(distinct<n)
	  {
        int value=(int)(Math.random()*n);//print the random card 1 to n-1
		  count++;  //we collect one more card
		if(!iscollected[value]){
			distinct++;
			iscollected[value]=true;
			System.out.println(count);
		}
		  
		  
	  }
	  
		    }
		

	}


