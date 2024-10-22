package p2;

import java.util.Scanner;

import p1.ExceptionLineTooLong;

public class InputString{
       String input;
       Scanner sc=new Scanner(System.in);
      
       public void checkLength() throws ExceptionLineTooLong{
    	   System.out.println("Enter string input :");
    	   input=sc.nextLine();
    	   if(input.length()>80) {
    		   throw new ExceptionLineTooLong("The strings is too long");
    	   }
       }
}
