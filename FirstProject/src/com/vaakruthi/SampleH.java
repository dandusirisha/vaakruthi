package com.vaakruthi;

import java.util.*;
import java.io.*;
public class SampleH {
	
	public static void main(String[] args) throws IOException
	{
 HashMap<String, Long> hm = new HashMap<String, Long>();
	String name,str;
	Long phno;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true)
	{
		System.out.println("1. Enter Phone entries");
		System.out.println("2. Lookup in the book");
		System.out.println("3. Display names in the book");
		System.out.println("4. Exit");
		
		System.out.println("Your choice");
		int n = Integer.parseInt(br.readLine());
		
		switch(n)
		{
			case 1: System.out.println("Enter Name:");
					name = br.readLine();
					System.out.println("Enter Phno:");
					str = br.readLine();
					phno = new Long(str);
					hm.put(name,phno);//stores name and phno into the HashMap.
					break;
			case 2: System.out.println("Enter Name:");
					name = br.readLine();
					name = name.trim();
					phno = hm.get(name);// pass name and get phno
					System.out.println("Phno :"+phno);
					break;
			case 3: Set<String> set = new HashSet<String>();
					set = hm.keySet();
					System.out.println(set);
					break;
					
			case 4: return;
			
		}
		
	}
	
}
}




 
 

