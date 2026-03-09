package Practices;

// Write your code here
//This is a comment.
import java.util.Scanner;
public class CountByAnything
{
   public static void main (String args[])
   {
      final int STOP = 500;
      final int newLine;
      Scanner keyboard = new Scanner(System.in);
      int stepValue;
      System.out.print("Enter number to count by >> ");
      stepValue = keyboard.nextInt();
      newLine = stepValue * 10;
      for(int i = stepValue; i <= STOP; i += stepValue)
      {
         System.out.print(i + "  ");
         if(i % newLine == 0)
            System.out.println();
      }
   }
}