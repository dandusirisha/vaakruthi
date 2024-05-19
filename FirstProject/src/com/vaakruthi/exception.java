package com.vaakruthi;
import java.util.Scanner;
public class exception {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the x value");
		int x=sc.nextInt();
	try {
	
	int k=44/x;
	System.out.println( "print the k value:"+k);
	}
	catch(ArithmeticException ae) {
		System.out.println("exception handling");
	}
	
	}
} 


