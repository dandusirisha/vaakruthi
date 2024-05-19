package com.vaakruthi;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args)
	{
		ArrayList<String> name= new ArrayList<>();

		name.add("siri");
		name.add("akash");
		name.add("prudhvi");
		name.add("siri");
		Set<String> s =new HashSet<>();
		 for(String n:name)
		 {
			 if(s.addAll(name)==false)
			 {
			    System.out.println(name);	 
			 }
		 }
	}
}
					 
