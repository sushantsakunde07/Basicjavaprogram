package Basicjavaprogram;
import java.util.*;
public class Javabasicprogram {
public static void main(String[] args) {
	    int number;
	    System.out.println("Enter a number to check if it's odd or even");
	    Scanner scan = new Scanner(System.in);
	    number = scan.nextInt();
	    scan.close();
	    if (number % 2 == 0)
	      System.out.println("The number is even.");
	    else
	      System.out.println("The number is odd.");
}
}
