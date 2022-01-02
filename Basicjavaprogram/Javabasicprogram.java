package Basicjavaprogram;
import java.util.*;
public class Javabasicprogram {
	public static void main(String arg[])
	{
	double a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	a=sc.nextDouble();
	sc.close();
	double h=harmonicnumber(a);
	System.out.println("Harmonic value = "+h);
	}
    static double harmonicnumber(double n) 
    {
	double sum=0;
	for(double  i=1;i<=n;i++)
	{
	sum=sum+(1/i);
	}
	return sum;
}
}

