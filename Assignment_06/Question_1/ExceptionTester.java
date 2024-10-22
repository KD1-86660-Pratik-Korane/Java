package p3;

import java.util.Scanner;

import p1.ExceptionLineTooLong;
import p2.InputString;

public class ExceptionTester {
       public static void main(String[] args) {
    	   InputString string=new InputString();
    	   try {
    	         string.checkLength();
    	   }catch(ExceptionLineTooLong e) {
    		   e.printStackTrace();
    	   }
       }
}
