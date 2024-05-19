package com.vaakruthi;
import java.util.*;


public class Hashingmethod {
public static void main(String[] args)
{
	HashMap<String,String> hm= new HashMap<String,String>();
	
	hm.put("ravinder","A");
	hm.put("siri","B");
	TreeMap<String, String> treemap = new TreeMap<>();
	    treemap.put("A", "Apple");
	    treemap.put("B", "Ball");
	    treemap.put("C", "Cat");
	    System.out.println("TreeMap: " + treemap);
	
	System.out.println("HashMap: "  + hm);
 String n= hm.get("A");
    System.out.println("String at index A: " + n);
    System.out.println("Keys: " + hm.keySet());
    System.out.println("Key/Value mappings: " + hm.entrySet());
    hm.putAll(treemap);
    System.out.println("Updated HashMap: " + hm);
    if(hm.containsKey("siri")) {
        System.out.println("siri name is present in the Hashmap.");
  }
}
}

  



