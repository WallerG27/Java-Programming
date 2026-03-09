package Chapter8;



//Write your code here
//This is a comment.

import java.util.Scanner;
public class CarCareChoice2
{
public static void main (String[] args)
{
	   Scanner input = new Scanner(System.in);

   boolean isMatch = false;
   String[] items =  { "oil change", "tire rotation",
      "battery check", "brake inspection"};
   int[] prices = {25, 22, 15, 5};
   int x;
   int matchIndex = 0;
   String menu = "Enter selection:";
   for(x = 0; x < items.length; ++x)
	   System.out.println(items[x]);
   
   System.out.print("Enter selection: ");
   String selection = input.nextLine();
   for (x = 0; x < items.length; x++)
   if(selection.substring(0, 3).equals(items[x].substring(0, 3)))
   {
	  isMatch = true;
	  matchIndex = x;
   }
   if(isMatch)
	   System.out.print(selection + " price is $" + prices[matchIndex]);
   else
	   System.out.print("Invalid Entry");
}
}