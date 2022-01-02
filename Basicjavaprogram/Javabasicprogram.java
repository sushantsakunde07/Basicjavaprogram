package Basicjavaprogram;
import java.util.*;
public class Javabasicprogram {
public static void main(String[] args) {
	    int dividend = 0, divisor = 0;
	    Scanner scan1= new Scanner(System.in);
	    System.out.println("Enter dividend");
	    dividend=scan1.nextInt();
	    scan1.close();
	    Scanner scan2= new Scanner(System.in);
	    System.out.println("Enter divisor");
	    divisor=scan2.nextInt();
	    scan2.close();
	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;
	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
}
}
