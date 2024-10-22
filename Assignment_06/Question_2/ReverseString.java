package reversingstring;

import java.util.Scanner;

public class ReverseString {
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter string input : ");
    	   String input=sc.next();
    	   String reverse="";
    	   int n=input.length();
    	   for(int i=0; i<n; i++) {
    		    reverse+=input.charAt(n-1-i);
    	   }
    	   System.out.println("Reversed String input : "+reverse);
       }
}
