package test;

import entities.Invoice;

public class InvoiceTester {
     public static void main(String[] args) {
    	 double totalBill=0.0;
    	 Invoice I1=new Invoice();
    	 I1.acceptData();
    	 Invoice I2=new Invoice();
    	 I2.acceptData();
    	 System.out.println("PartNo "+"PartName "+"Quantity "+"Price");
    	 I1.displayData();
    	 I2.displayData();
    	 totalBill+=I1.totalPrice();
    	 totalBill+=I2.totalPrice();
    	 System.out.println("Total Bill : "+totalBill);
    	 
//    	 Invoice Inv[]=new Invoice[5];
//    	 
//    	 for(int i=0; i<Inv.length; i++) {
//    		 Inv[i].acceptData();
//    	 }
//    	 
//    	 for(int i=0; i<Inv.length; i++) {
//    		 Inv[i].displayData();
//    	 }
     }
}
