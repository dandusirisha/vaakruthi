package com.vaakruthi;

import java.util.Scanner;

public class Finally {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the x value");
		int x= sc.nextInt();
	
	
		try
		{
			int y=440/x;
			System.out.println(y);
					
					
		}
		catch(ArithmeticException ae)
		{
			System.out.println("exception occur");
			
		}
		finally {
			System.out.println("i am in finally block");
		}
	}
	

}
