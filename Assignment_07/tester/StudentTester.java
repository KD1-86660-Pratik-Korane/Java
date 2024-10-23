package tester;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import comparators.CityComparator;
import comparators.MarksComparator;
import comparators.NameComparator;
import entities.Student;

public class StudentTester {
	   
	   public static void display(Student[] arr) {
		   for(Student s: arr) {
			   System.out.println(s.toString());
		   }
	   }
	
	   public static int menu(Scanner sc) {
		   System.out.println("0. Exit");
		   System.out.println("1. sorted ont their city (asc)");
		   System.out.println("3. sorted on their marks (desc)");
		   System.out.println("4. sorted on their name (asc)");
		   System.out.println("5. sorted on the rollno");
		   int choice;
		   System.out.println();
		   System.out.println("Enter your choice : ");
		   choice=sc.nextInt();
		   
		   return choice;
	   }
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
    	   int choice;
    	   
    	   Student[] arr=new Student[5];
    	   arr[0]=new Student(5,"Kiran","Kolkata",78);
    	   arr[1]=new Student(1,"Indrajeet","Ichalkaranji",80);
    	   arr[2]=new Student(4,"Tejas","Jaipur",70);
    	   arr[3]=new Student(3,"Rahul","Mumbai",65);
    	   arr[4]=new Student(2,"Suraj","Pune",90);
    	   
    	   
    	   while((choice=menu(sc))!=0) {
    		   switch(choice) {
    		   case 1:
    			      CityComparator citycomparator=new CityComparator();
 			          Arrays.sort(arr,citycomparator);
    			      break;  
    		   case 2:
    			      MarksComparator markscomparator=new MarksComparator();
    			      Arrays.sort(arr,markscomparator);			      
    			      break;
    		   case 3:
    			      NameComparator namecomparator=new NameComparator();
    			      Arrays.sort(arr,namecomparator);   			       
    			      break;
    		   case 4:
    			      Arrays.sort(arr);		          
    			      break;
    		   default:
    			      System.out.println("Wrong choice...");
    		   }
    		   if(choice>=0 && choice<=4) 
    			   display(arr);
    
    	   }
    	   System.out.println("Thank You!");
       }
}
