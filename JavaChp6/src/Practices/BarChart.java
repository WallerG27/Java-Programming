package Practices;

// Write your code here
//This is a comment.
import java.util.Scanner;
public class BarChart
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      int aliPoints;
   int bobPoints;
   int caiPoints;
   int danPoints;
   int eliPoints;
   System.out.print("Enter points earned by Ali >> ");
   aliPoints = input.nextInt();
   System.out.print("Enter points earned by Bob >> ");
   bobPoints = input.nextInt();
   System.out.print("Enter points earned by Cai >> ");
   caiPoints = input.nextInt();
   System.out.print("Enter points earned by Dan >> ");
   danPoints = input.nextInt();
   System.out.print("Enter points earned by Eli >> ");
   eliPoints = input.nextInt();
      System.out.println("\nPoints for Game\n");
      drawChart("Ali", aliPoints);
      drawChart("Bob", bobPoints);
      drawChart("Cai", caiPoints);
      drawChart("Dan", danPoints);
      drawChart("Eli", eliPoints);
   }
   public static void drawChart(String name, int points)
   {
      System.out.print(name + "  ");
      for(int x = 0; x < points; ++x)
         System.out.print("*");
      System.out.println();
   }
}