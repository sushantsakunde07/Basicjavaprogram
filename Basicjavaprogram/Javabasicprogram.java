package Basicjavaprogram;
import java.util.*;
public class Javabasicprogram {
	public static void main(String[] args)
	{
	int year=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Year");
    year=scan.nextInt();
	scan.close();
	if(year%4==0 && year%100!=0 || year%400==0)
	  System.out.println("It is Leap year");
	else
	  System.out.println("It is Not a leap year");
}
}