package test;

//Write your code here
//This is a comment.
import java.util.Scanner;
public class ShadyRestRoom2
{
public static void main (String args[])
{
 int room, output, cView;
 Object suite, view;

 System.out.println("(1) Queen bed");
 System.out.println("(2) King bed");
 System.out.println("(3) Suite with a king bed and pull-out couch)");
 Scanner input = new Scanner(System.in);
 System.out.print("Enter Selection (1, 2, or 3) >> ");
 room = input.nextInt();
 if(room == 1) {
    output = 125;
 	 suite = "Queen";}
 else
   if(room == 2) {
      output = 139;
      suite = "King";}
   else
	if(room == 3){
	   output = 165;
	   suite = "pull-out couch";}
	else {
	    output = 0;
	    suite = "error";
	          }
	       
	       
	       
	       
 System.out.println("((1) a lake");
 System.out.println("(2) a park");
 System.out.println("Enter Selection (1 or 2) >> ");
 cView = input.nextInt();
 if(cView == 1) {
	output += 15;
	view = "a lake";}
 else
	 if (cView == 2) {
			view = "a park";}
	 else {
		output += 15;
		view = "a lake";}



 
 
 System.out.println("You selected " + suite + " bed " + view + " view for $" + output);
}
}
