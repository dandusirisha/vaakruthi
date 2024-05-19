package com.vaakruthi;
import java.util.ArrayList;
import java.util.List;

public class index {
	public static void main(String[] args)
	{
		List<String> s =new ArrayList<>();
		s.add("siri");
		s.add("akash");
		s.add("pooja");
		System.out.println(s);
		 int index=s.indexOf("siri");
		 s.remove("akash");
		 System.out.println(" remove elements"+s);
		 
		 System.out.println(" the frist occurence of 1 is at index :"+index);

		}

}
