package Practices;

// Write your code here
//This is a comment.
import java.util.Scanner;
public class EvenEntryLoop
{
  public static void main (String args[])
  {
	 Scanner keyboard = new Scanner(System.in);
     int number;
     String message;
     final int QUIT = 999;
     System.out.print("Enter an even number or " + QUIT + " to quit ");     
     number = keyboard.nextInt();
     
   
     while(number != QUIT)
     { 
        if(number % 2 == 0)
           message = "Good job!";
        else
           message = number + " is not an even number";
        System.out.println(message);
        System.out.println("Enter an even number or " + QUIT + " to quit");       
        number = keyboard.nextInt();  
     }   
  }
}