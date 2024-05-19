package com.vaakruthi;
import java.io.*;
import java.util.*;
public class vectormethod 
{
	public static void main(String[] args) {
		int i;
		Vector<Integer> v=new Vector<Integer>();
	int a [] = {10,20,11,30};
	for( i=0;i<=a.length-1;i++)
	{
		v.add(a[i]);
		
		System.out.println(a[i]);
	}
	
	System.out.println("Remove Element :"+v.remove(3));
		
	
	for( i=0;i<v.size();i++)
	{
		System.out.println("final array :"+v.get(i)+"");
		
	}
	System.out.println("The Object that is replaced is:"+v.set(1, 10));
	System.out.println("print the vector: "+v);
	
     v.insertElementAt(0, 1);
     System.out.println("element inserted in index 0" +v);
     System.out.println("The capacity is: " + v.capacity());
     System.out.println("Does the vector contains ? "
             + v.contains(22));
     System.out.println("enter the element to find index :"+v.indexOf(10));
     System.out.println("enter trhe element to find last index : "+v.lastIndexOf(30));
        
           }
           }
        
 






	


