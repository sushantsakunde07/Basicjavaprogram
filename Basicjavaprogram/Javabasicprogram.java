package Basicjavaprogram;
import java.util.*;
public class Javabasicprogram {
public static void main(String[] args) {
	 int Number1, Number2, Temp;
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter First Number");
	 Number1=scan.nextInt();
	 System.out.println("Enter second Number");
	 Number2=scan.nextInt();
	 scan.close();
	 Temp=Number1;
	 Number1=Number2;
	 Number2=Temp;
	 System.out.println("Numbers after swapping "+Number1   +Number2); 
}
}
