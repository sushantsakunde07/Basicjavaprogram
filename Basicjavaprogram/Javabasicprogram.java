package Basicjavaprogram;
import java.util.*;
public class Javabasicprogram {
public static void main(String[] args) {
	Scanner scan =new Scanner (System.in);
    System.out.println("Enter a sentence");
    String str =scan.nextLine();
    scan.close();
    for(int i=0; i<str.length(); i++) {
    if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A'||str.charAt(i) == 'E'||str.charAt(i) == 'I'||str.charAt(i) == 'O'||str.charAt(i) == 'U')
    {
      System.out.println("Given sentence contains "+str.charAt(i)+" at the index "+i);
    }
}
}
}
