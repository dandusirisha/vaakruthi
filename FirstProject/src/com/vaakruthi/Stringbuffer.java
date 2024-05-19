package com.vaakruthi;

public class Stringbuffer {

public static void main(String[] args) {

StringBuilder sb = new StringBuilder("Hello");

sb.append(" World");
System.out.println(sb.toString());

sb.insert(5, ",");
System.out.println(sb.toString());


sb.replace(5, 6, " ");
System.out.println(sb.toString());


sb.delete(5, 6);
System.out.println(sb.toString());

}

}


