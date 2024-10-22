package palindromeString;

import java.util.Scanner;

public class Palindrome {
	   
	   public static boolean checkPalindrome(String input) {
		   int n=input.length();
    	   for(int i=0; i<n/2; i++) {
    		   if(input.charAt(i)!=input.charAt(n-1-i)) {
    			   return false;
    		   }
    	   }
    	   return true;
	   }
	   
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
    	   String input;
    	   System.out.println("Enter string Input : ");
    	   input=sc.next();
    	   if(checkPalindrome(input)) {
    		   System.out.println("String is palindrome...");
    	   }else {
    		   System.out.println("String is not palindrome...");
    	   }
    	  
    	 
       }
}
