package com.vaakruthi.threads;

import com.vaakruthi.mains;

public class Reservebirths {
	public static void main(String[] args) {
		Reservebirts t1=new Reservebirts(1);
		
		Thread s =new Thread(t1);
		Thread s3 =new Thread(t1);
		
		s.setName("First person");
		s3.setName("second person");
		s.start();
		s3.start();
	}

}
