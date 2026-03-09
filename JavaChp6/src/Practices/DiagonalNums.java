package Practices;

//Write your code here
//This is a comment.
import java.util.Scanner;
public class DiagonalNums
{
   public static void main(String[] args)
   {
	  Scanner kb = new Scanner(System.in);
		System.out.print("Enter a single digit >> ");
		String NUM = kb.nextLine();
	   

      final char SPACE = ' ';
      final int ROWS = 10;
      int spaces = 0;
      int a, b;
      for(a = 0; a < ROWS; ++a)
      {
         for(b = 0; b < spaces; ++b)
            System.out.print(SPACE);
         System.out.println(NUM);
         spaces++;
      }
   }
}