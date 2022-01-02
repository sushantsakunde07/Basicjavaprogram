package Basicjavaprogram;
import java.util.*;
public class Javabasicprogram {
public static void main(String[] args) {
	int number1, number2, number3;
    System.out.println("Enter three integers");
    Scanner in = new Scanner(System.in);
    number1 = in.nextInt();
    number2 = in.nextInt();
    number3 = in.nextInt();
    in.close();
    if (number1 > number2 && number1 > number3)
      System.out.println("First number is the largest.");
    else if (number2 > number1 && number2 > number3)
      System.out.println("Second number is the largest.");
    else if (number3 > number1 && number3 > number2)
      System.out.println("Third number is the largest.");
    else
      System.out.println("The numbers are not distinct.");	    
}
}