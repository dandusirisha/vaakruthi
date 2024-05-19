package com.vaakruthi;
import java.util.*;
public class hash {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	HashSet<String> set=new HashSet<String>();
	HashSet<Integer> id =new HashSet<Integer>();
	System.out.println("enter the name");
	String name= sc.next();
	System.out.println("enter the id");
	int i=sc.nextInt();
	System.out.println(name);
	System.out.println(i);
	set.add("siri");
	id.add(100);
	Iterator<String> itr=set.iterator();  
	while(itr.hasNext()){  
		System.out.print(itr.next()+" "); 
		Iterator<Integer> itr1 = id.iterator();  
		while(itr1.hasNext()){  		
			System.out.print(itr1.next()+" ");  
		}
}
}
}
