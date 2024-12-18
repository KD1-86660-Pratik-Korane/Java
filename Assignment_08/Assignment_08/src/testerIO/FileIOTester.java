package testerIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entities.Project;

public class FileIOTester {
	
	 public static void saveProjects( Set<Project> projectList){
		 try(FileOutputStream fos=new FileOutputStream("projects.db")){
			 try(BufferedOutputStream bos=new BufferedOutputStream(fos)){
				 try(ObjectOutputStream oos=new ObjectOutputStream(bos)){
					 oos.writeObject(projectList);
				 }
			 }
		 }catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	 
	 public static Set<Project> loadProjects() {
		    try(FileInputStream fis=new FileInputStream("projects.db")){
		    	try(BufferedInputStream bis=new BufferedInputStream(fis)){
		    		try(ObjectInputStream ois=new ObjectInputStream(bis)){
		    			Set<Project> projects=(Set<Project>) ois.readObject();
		    			return projects;
		    		} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    	}
		    } catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
	 }
       
	 public static int menu(Scanner sc) {
		 System.out.println("1. Add Following Projects in the Set");
		 System.out.println("2. Input a Project from user and add in Set");
		 System.out.println("3. Display all Projects in Set");
		 System.out.println("4. Delete a Project by Id from Set");
		 System.out.println("5. Copy All Projects from Set to ArrayList");
		 System.out.println("6. Display all Projects from List");
		 System.out.println("7. Sort all Projects in List by cost");
		 System.out.println("8. Find project with Max team size using Collections.max()");
		 System.out.println("9. Count all Projects of Java technology using Stream API");
		 
		 System.out.println("Enter your choice : ");
		 return sc.nextInt();
	 }
	 
	 public static void add(Set<Project> projectList) {
		 projectList.add(new Project(1,"Train Reservation System",5,5000000,"Java"));
		 projectList.add(new Project(2,"Airline Reservation System",3,6000000,".NET"));
		 projectList.add(new Project(4,"Online Grocery Shop",6,3000000,"Java"));
		 projectList.add(new Project(5,"Online Book Shop",2,3000000,".NET"));
		 projectList.add(new Project(3,"Online Jewelry Shop",4,4000000,"Java"));
		 projectList.add(new Project(2,"Bus Reservation System",3,3500000,"JS"));
	 }
	
	 public static void main(String[] args) {
		 
		 Set<Project> projectList=loadProjects();
		 Scanner sc=new Scanner(System.in);
		 int choice;
		 Project p;
		 List<Project> a=null;
		 while((choice=menu(sc))!=0) {
			 switch(choice) {
			 case 1:
				   add(projectList);
				   break;
			 case 2:
				   projectList.add(new Project(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.next()));
				   break;
			 case 3:
				   projectList.forEach(System.out::println);
				   break;
			 case 4:
				   System.out.println("Deleted project : "+projectList.remove(new Project(sc.nextInt())));
	               break;
			 case 5:
				  a=new ArrayList<>();
				  for(Project pc: projectList) {
					  a.add(pc);
				  }
				   break;
			 case 6:
				   a.forEach(System.out::println);
				   break;
			 case 7:
				   a.stream().sorted((c1,c2) ->Double.compare(c2.getProjectCost(), c1.getProjectCost())).forEach(System.out::println);
				   break;
			 case 8:
				    System.out.println("Project name: "+Collections.max(projectList, (c1,c2)->c1.getTeamSize()-c2.getTeamSize()));
				    break;
			 case 9:
				    System.out.println("Java Projects : "+projectList.stream().filter(e->e.getTechnology().equals("Java")).count());
			        
			 }
			 
			 saveProjects(projectList);
		 }
		 
	 }
	
}
