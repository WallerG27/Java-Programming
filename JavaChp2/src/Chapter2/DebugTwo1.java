package Chapter2;

import java.util.Scanner;
public class DebugTwo1
{
   public static void main(String[] args)
   {
      int oneInt;
      double oneDouble;
      String oneString;
      Scanner input = new Scanner(System.in);
      oneInt = input.nextInt();
      System.out.print("Enter an integer >> ");
      oneDouble = input.nextDouble();
      System.out.print("Enter a double >> ");      
      input.nextLine();
      System.out.print("Enter a string >> ");
      oneString = input.nextLine();
      System.out.print("The int is ");
      System.out.println(oneInt);
      System.out.print("The double is ");
      System.out.println(oneDouble);
      System.out.print("The String is ");
      System.out.println(oneString);
   }
}