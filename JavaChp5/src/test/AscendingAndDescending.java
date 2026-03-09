package test;

// Write your code here
//This is a comment.
import java.util.*;
public class AscendingAndDescending
{
public static void main (String args[]) 
{
   int one, two, three;
   int highest, middle, lowest;
   Scanner input = new Scanner(System.in);
   System.out.print("Enter an integer >> ");
   one = input.nextInt();
   System.out.print("Enter an integer >> ");
   two = input.nextInt();
   System.out.print("Enter an integer >> ");
   three = input.nextInt();
   if(one > two && one > three)
      highest = one;
   else
      if(two > one && two > three)
         highest = two;
      else
         highest = three;

   if(one < two && one < three)
	      lowest = one;
	   else
	      if(two < one && two < three)
	         lowest = two;
	      else
	         lowest = three;
   
   
   if(highest > one && one > lowest)
	      middle = one;
	   else
	      if(highest > two && two > lowest)
	    	  middle = two;
	      else
	         middle = three;

   
   
   System.out.println("Ascending: " + highest + " " + middle + " " + lowest);
   System.out.println("Descending: " + lowest + " " + middle + " " + highest);
}
}
