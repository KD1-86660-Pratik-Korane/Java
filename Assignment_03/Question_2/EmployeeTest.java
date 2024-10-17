package test;

import entities.Employee;

public class EmployeeTest {
       public static void main(String[] args) {
    	   Employee e1=new Employee();
    	   e1.acceptData();
    	   Employee e2=new Employee();
    	   e2.acceptData();
    	   System.out.println("FirstName"+"\t"+"LastName"+"\t"+"Salary"+"\t"+"AnnualSalary"+"\t"+"raisedSalary");
    	   e1.displayData();
    	   e2.displayData();	   
       }
   }
