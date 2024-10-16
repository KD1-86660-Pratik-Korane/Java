import java.util.Scanner;
public class Assign_02_1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Number : ");
    	Integer n=sc.nextInt();
    	System.out.println("Given Number : "+n);
        System.out.println("Binary equivalent : "+ n.toBinaryString(n)); 
        System.out.println("Octal equivalent : "+ n.toOctalString(n));
        System.out.println("Hexadecimal equivalent : "+ n.toHexString(n));
    }
}
