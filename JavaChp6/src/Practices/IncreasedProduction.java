package Practices;

//Write your code here
//This is comment.
import java.util.*;
public class IncreasedProduction  
{
public static void main (String args[])
{
final int MAX = 24;
int month = 1;
final double goal = 10000;

Scanner kb = new Scanner(System.in);
	System.out.print("Enter worker's current production level >> ");
	double parts = kb.nextDouble();
 while(month <= MAX)
 {

   parts *= 1.06;
   System.out.println("Month "+month+"     Predicted production is "+ parts);
 
    if(parts > goal)
    {
    	System.out.println("The month in which production exceeds "+goal+" is month " + month);
        month = MAX + 1;
        
     }
    if(month == MAX) {
    	   parts *= 1.06;
    	   System.out.println("Month "+month+"     Predicted production is "+ parts);
    	   month += 1;
       System.out.println("This worker will not reach "+goal+" in "+MAX+" months");
       //month = MAX + 1;
    }
    month += 1;
 }
}
}
    