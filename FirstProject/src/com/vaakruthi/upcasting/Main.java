package com.vaakruthi.upcasting;
class A{
	public void m1() {
		System.out.println("Method 1...");
	}
}
class B extends A{
	public void m2() {
		System.out.println("Method 2....");
	}
}
public class Main {
	public static void main(String[] args) {
		A a1  = (A)new B();
		A a2  = (A) new B();
		
		B b1 = (B)a1;
		b1.m1();
		b1.m2();
		a1.m1();
		a2.m1();
		
	}
}
