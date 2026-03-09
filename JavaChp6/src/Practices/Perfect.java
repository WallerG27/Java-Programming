package Practices;



//Write your code here
//This is a comment.
import java.util.Scanner;
public class Perfect
{
public static void main (String args[])
{
	Scanner kb = new Scanner(System.in);
	
	System.out.print("Enter a maximum number >> ");
	int MAX = kb.nextInt();
   for(int i = 2; i <= MAX; i++) 
     if(perfect(i) == true)
        System.out.println("The number " + i + " is perfect");
}
public static boolean perfect(int n)
{
   int sum = 1;
   boolean result = false;
   for (int j = 2; j <= n/2; j++)
      if (n % j == 0)
         sum += j;
      if (sum == n)
         result = true;
   return result;
}
}