package Practices;

// Write your code here
//This is a comment.
import java.util.Scanner;
public class CountByFives 
{
   public static void main (String args[])
   {
      final int START = 5;
      final int STOP = 500;
      final int newLine = 50;
      for(int i = START; i <= STOP; i += START)
      {
         System.out.print(i + "  ");
         if(i % newLine == 0)
            System.out.println();
      }
   }
}