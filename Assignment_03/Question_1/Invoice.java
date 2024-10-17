package entities;

import java.util.Scanner;

public class Invoice {
     private String partNo;
     private String partName;
     private int quantity;
     private double price;
      
      public Invoice() {
    	  partNo="";
    	  partName="";
    	  quantity=0;
    	  price=0.0;
      }
	public Invoice(String partNo, String partName, int quantity, double price) {
		this.partNo = partNo;
		this.partName = partName;
		this.quantity = quantity;
		this.price = price;
	}


	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter part number : ");
		setPartNo(sc.next());
		System.out.println("Enter part name : ");
		setPartName(sc.next());
		System.out.println("Enter Quantity : ");
		quantity=sc.nextInt();
		if(quantity<0) {
			setPrice(0);
		}else {
			setQuantity(quantity);
		}
		System.out.println("Enter price");
		price=sc.nextDouble();
		if(price<0) {
			setPrice(0);
		}else {
			setPrice(price);
		}
		 
		 
	}
	
	public void displayData() {
		System.out.println(getPartNo()+"\t"+getPartName()+"\t"+getQuantity()+"\t"+getPrice());
//		System.out.print(partNo);
//		System.out.print(partName+" ");
//		System.out.print(quantity+" ");
//		System.out.print(price*quantity+" ");
		System.out.println();
	}
	
	public double totalPrice() {
		double amt;
		amt=getPrice()*getQuantity();
		return amt;
	}
      
}
