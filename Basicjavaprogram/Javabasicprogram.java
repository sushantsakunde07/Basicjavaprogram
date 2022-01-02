package Basicjavaprogram;
import java.util.*;
public class Javabasicprogram {
public static void main(String[] args) {
	int number;
	int hcount=0 ,tcount=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number of times to Flip coin");
	number=scan.nextInt();
	scan.close();
	if (number>0)
	{
    while (hcount+tcount <number)
    	{
	    int coin=(int)(Math.floor(Math.random()*2));
		if (coin ==0)
		{
		System.out.println("Heads");
	     hcount++;
		}
		else{ 
			System.out.println("Tails");
			tcount++;
		    }
	    }
	}
	   else{
		   System.out.println("enter number greater than zero");
	       }
	       System.out.println("percentage of heads vs tails is"+(hcount/tcount)*100);
}
}

