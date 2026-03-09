package test;
//Write your code here
//This a comment.

import java.util.*;
public class EvenOdd
{
public static void main (String args[]) {
	int number;
 Scanner input = new Scanner(System.in);
 System.out.print("Enter a number >> ");
 number = input.nextInt();
 Boolean output = isEven(number);
 String print;
if(output == true)
	 print = "even";
	else
	 print = "odd";
 System.out.println(number + " is " + print);
	}

static Boolean isEven(int num)  
{
//int num;
boolean output;


if(num % 2 == 0)
 output = true;
else
 output = false;
return output;

//System.out.println(number + " is " + output);
}
}

