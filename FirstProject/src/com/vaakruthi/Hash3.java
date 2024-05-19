package com.vaakruthi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
public class Hash3 
{
	public static void main(String[] args) throws IOException
	{
    Hashtable<String,Integer> ht = new Hashtable<>();

	ht.put("Ajay",50);
	ht.put("siri",68);
	ht.put("ramesh",12);
	ht.put("prudhvi",89);
	System.out.println("the players names:");
	Enumeration e = ht.keys();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter players name:");
		String name = br.readLine();
		name = name.trim();
		
		Integer score = ht.get(name);
		
		if(score!=null)
		{
			//convert score from Integer Object to int value
			int sc = score.intValue();
			System.out.println(name+" Scored:"+sc);
		}
		else
		{
			System.out.println("Player Not Found.");
		}
		
	}
		
	
	
	
}

