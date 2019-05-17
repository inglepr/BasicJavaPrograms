package com.bridgelabz.functional;
public class StopWatch
{
	private final long start;
	public StopWatch()
	{
		start=System.currentTimeMillis();
	}
	public  double ElapedTime()
	{
		long now=System.currentTimeMillis();
		return (now-start)/100.0;
	}

	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		StopWatch time=new StopWatch();
		double sum=0.0;
		for(int i=0;i<=n;i++)
		{
			sum+=Math.sqrt(i);
		}
		//double sum=0.0;
		for(int i=0;i<=n;i++)
		{
			sum+=Math.pow(i, 0.5);
			 
	}
		double time1=time.ElapedTime();
		System.out.println(time1);	
	}
}









