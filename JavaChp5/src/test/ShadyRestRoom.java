package test;

//Write your code here
//This is a comment.
import java.util.Scanner;
public class ShadyRestRoom
{
public static void main (String args[])
{
 int room, output;
 Object suite;

 System.out.println("(1) Queen bed");
 System.out.println("(2) King bed");
 System.out.println("(3) Suite with a king bed and pull-out couch)");
 Scanner input = new Scanner(System.in);
 System.out.print("Enter Selection (1, 2, or 3) >> ");
 room = input.nextInt();
 if(room == 1) {
	   suite = "Queen";
	   output = 125;

 } else
   if(room == 2) {
      output = 139;
      suite = "King";
   } else 
      if(room == 3){
         output = 165;
	       suite = "pull-out couch";}
         else {
          output = 0;
          suite = "error";
         }

 
 
 System.out.println("You selected " + suite + " bed $" + output);
}
}