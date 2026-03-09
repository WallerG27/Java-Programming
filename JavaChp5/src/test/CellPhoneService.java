package test;
//Write your code here
//This is a comment.

import java.util.Scanner;
public class CellPhoneService
{
public static void main (String args[])
{
 int price, min, messages, bytes;
 String plan;

 Scanner input = new Scanner(System.in);
 System.out.print("Enter talk minutes needed >> ");
 min = input.nextInt();
 
 System.out.print("Enter text messages needed >> ");
 messages = input.nextInt();
 
 System.out.print("Enter gigabytes of data needed >> ");
 bytes = input.nextInt();
 
 price = 500;

 if(bytes == 0 ) {
    if(min < 500)
    	if(messages == 0) {
    		plan = "A";}
    	else {
    		plan = "B";}
    else
    	if(messages > 100) {
    		plan = "C";}
    	else {
    		plan = "D";}
 } else
    if(bytes > 3) {
    	plan = "E";
    }
    else {
    	plan = "F";
    }
    	
	 
	 
	 
	 
	 
	 
 System.out.println("Plan " + plan + " $" + price + " per month");
}
}
