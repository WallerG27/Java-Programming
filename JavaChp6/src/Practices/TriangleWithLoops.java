package Practices;

//Write your code here
//This is a comment.
import java.util.Scanner;
public class TriangleWithLoops 
{
 public static void main(String[] args)
 {
	  Scanner kb = new Scanner(System.in);
		System.out.print("Enter a single digit >> ");
		String NUM = kb.nextLine();
	   

    final char SPACE = ' ';
    final int ROWS = 7;
    int secSpaces = 0;
    int firSpaces = 0;
    int a, b, c;
    for(a = 0; a < ROWS; ++a)
    {
        for(c = ROWS; c > firSpaces; --c)
            System.out.print(SPACE);
            //System.out.print(c);

         System.out.print(NUM);
         firSpaces++;
    	
    	
       for(b = 0; b < secSpaces; ++b) {
           //System.out.print(b);
          System.out.print(NUM);
       System.out.print(NUM);}
       System.out.println(SPACE);
       secSpaces++;
    }

 }
}