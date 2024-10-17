package entities;

import java.util.Scanner;

public class Employee {
       String firstName;
       String lastName;
       double salary;
       
      public Employee(){
    	   firstName="";
    	   lastName="";
    	   salary=0.0;
       }
      public Employee(String firstName,String lastName,double salary) {
    	  this.firstName=firstName;
    	  this.lastName=lastName;
    	  this.salary=salary;
      }
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary<0) {
			System.out.println("Please enter valid salary");
		}else {
			this.salary = salary;
		}
		
	}
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter firstname : ");
		setFirstName(sc.next());
		System.out.println("Enter lastname : ");
		setLastName(sc.next());
		System.out.println("Enter salary");
		salary=sc.nextDouble();
		if(salary<0) {
			setSalary(0);
		}else {
			setSalary(salary);
		}
	}
	public void displayData() {
		double sal=getSalary();
		System.out.println(getFirstName()+"\t\t"+getLastName()+"\t\t"+getSalary()+"\t"+getSalary()*12+"\t"+((sal*0.1)+sal));
	}
 
}
