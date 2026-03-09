package Practices;



//Write your code here
//This is a comment.
import java.util.Scanner;
public class Factorials

{
public static void main (String args[])
{ 
	 Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter a number to compute factorial >> ");     
	int MAX = keyboard.nextInt();
   int factorial;
   for (int i = 1; i <= MAX; i++)
   {
      factorial = i;
      for(int j = i - 1; j > 0; --j)
          factorial = factorial * j;
      System.out.println("The factorial of " + i +
        " is " + factorial);
   }
}
}