
import java.util.Scanner;
public class Assign_02_2 {
	
   public static int main() {
	   System.out.println("Menu: ");
	   System.out.println("1.Dosa\n2.Samosa\n3.Idli\n4.Vadapav\n5.udidwada\n6.Poha\n7.Misalpav\n8.Mataki\n9.Tea\n10.GenerateBill");
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt(); 
	   return n;  
   }
   public static void main(String[] args) {
	   
	   String orders[]=new String[10];
	   Scanner sc=new Scanner(System.in);
	   int choice=0;
	   int totalOrder=0;
	   int i=0;
	   while((choice=main())!=0) {
		   int q;
		   switch(choice) {
		   case 1: System.out.println("Enter Quantity : ");
		           q=sc.nextInt();
			       totalOrder+=q*30;
			       orders[i]="Dosa";
			       i++;
		   break;
		   case 2: System.out.println("Enter Quantity : ");
	               q=sc.nextInt();
			       totalOrder+=q*15; 
			       orders[i]="Samosa";
			       i++;
		   break;
		   case 3: System.out.println("Enter Quantity : ");
	               q=sc.nextInt();
			       totalOrder+=q*25; 
			       orders[i]="Idli";
			       i++;
		   break;
		   case 4:System.out.println("Enter Quantity : ");
	              q=sc.nextInt();
			      totalOrder+=q*12; 
			      orders[i]="Vadapav";
			      i++;
		   break;
		   case 5: System.out.println("Enter Quantity : ");
	               q=sc.nextInt();
			       totalOrder+=q*25;
			       orders[i]="Udidwada";
			       i++;
		   break;
		   case 6:System.out.println("Enter Quantity : ");
	              q=sc.nextInt();
			      totalOrder+=q*20; 
			      orders[i]="Poha";
			      i++;
		   break;
		   case 7: System.out.println("Enter Quantity : ");
	               q=sc.nextInt();
			      totalOrder+=q*35;
			      orders[i]="Misalpav";
			      i++;
		   break;
		   case 8: System.out.println("Enter Quantity : ");
	               q=sc.nextInt();
			       totalOrder+=q*15; 
			       orders[i]="Mataki";
			       i++;
		   break;
		   case 9: System.out.println("Enter Quantity : ");
	               q=sc.nextInt();
			       totalOrder+=q*12; 
			       orders[i]="Tea";
			       i++;
		   break;
		   case 10: System.out.print("orders => "+"[");
			   for(int k=0; k<orders.length;k++) {
			   if(orders[k]!=null){
				   System.out.print(orders[k] + " ");
			   }
		     }
			   System.out.print("]");
		       System.out.println();
			   System.out.println("Total order is : "+ totalOrder);
		       System.out.println("Thank you for visiting us!");
		       System.exit(choice);
		   }   
	   }
	   
   }
}
