package com.bridgelabz.functional;
import java.util.Scanner;

//import com.bridgelabz.util.Utility;
//import com.sun.java_cup.internal.runtime.Scanner;
public class TicTacToe {
	public static void main(String args[])
	{
		 int row,col;
	
	public static  Scanner scan=new Scanner(System.in);
	 public static char[][] board =new char[3][3];
	 
	 public static char turn='x';
	 
		 for(int i=0;i<3;i++)
			{
				for(int j;j<3;j++)
						board[i][j]='_';
			}
	 
	// PrintBoard();

	 public static void Play()
	 {
		boolean playing=true;
		while(playing)
		{
			System.out.println("please enter row and colum:");
		row=scan.nextInt()-1;
		col=scan.nextInt()-1;
		board[row][col]=trun;
	if(GameOver(row,col)) 
	{
			playing=false;
			System.out.println(trun);
		
		}}}
		 public static void PrintBoard()
	 {
		 for(int i=0;i<3;i++)
		 { 
			 System.out.println();
		 }
				int i;
				for(int j;j<3;j++)
					//board[i][j]='|';
			System.out.println(board[i][j]+"|");
	 }
	 
	 
public static boolean GameOver(int rmove,cmove)
	 
	 {
		if(bourd[0][cmove]==bourd[1][cmove]
				&& bourd[0][cmove]==bourd[2][cmove])
			return true;
	if(bourd[rmove][0]==bourd[rmove][1]
			&&bourd[rmove][0]==bourd[rmove][2])
		return true;
	if(bourd[0][0]==bourd[1][1]
			&&bourd[0][0]==bourd[2][2]&& bourd[1][1]!='_')
		return true;
	if(bourd[0][2]==bourd[1][1]
			&&bourd[0][2]==bourd[2][2]&& bourd[1][1]!='_')
		return true;
	
}
	 }}
	 
	 