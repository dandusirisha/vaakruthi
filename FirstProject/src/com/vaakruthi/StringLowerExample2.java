package com.vaakruthi;
import java.util.Locale;  
public class StringLowerExample2 {  
    public static void main(String[] args) {  
      String s = "JAVATPOINT HELLO stRIng";    
      String eng = s.toLowerCase(Locale.ENGLISH);  
      System.out.println(eng);  
      String turkish = s.toLowerCase(Locale.forLanguageTag("tr")); // It shows i without dot  
      System.out.println(turkish);  
    }  
}  


