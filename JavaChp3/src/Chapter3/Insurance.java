package Chapter3;

//Write your code here
//This is a comment.

import java.util.Scanner;
public class Insurance  
{
 public static Scanner input;


	public static void main(String[] args) 
 {
     //creating new varibles for converson rate
     input = new Scanner(System.in);

     System.out.print("Enter the current year >> ");
     int curYear = input.nextInt();

     System.out.print("Enter the birth year >> ");
     int birthYear = input.nextInt();


     calculatePremium(curYear, birthYear);
 }

 public static int calculatePremium(int curYear, int birthYear)
 {
     int decades = (curYear-birthYear)/10;
     int premium = ((decades)+15)*20;
     System.out.println("The premium is $" + premium);
		return premium;
 }
 
}