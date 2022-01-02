package Basicjavaprogram;
import java.util.*;
public class Javabasicprogram {
	public static void main(String[] args)
	{
	int N=0,number=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Nth number");
    N=scan.nextInt();
	scan.close();
	if (0 <= N && N < 31) {
	for (int i=0; i<N;i++) {
		number=(int)Math.pow(2,i);
		System.out.println(" "+number);	
	}}
	else {
		  System.out.println("Enter number less than 31 and greater than minus 1");
	}
}
}
