package Chapter3;

//Write your code here
//This is a comment.

import java.util.Scanner;
public class PaintCalculator
{
 public static Scanner input;


	public static void main(String[] args) 
 {
     //creating new varibles for converson rate
     input = new Scanner(System.in);

     System.out.print("Enter the room's length >> ");
     double length = input.nextDouble();

     System.out.print("Enter the room's width >> ");
     double width = input.nextDouble();

     System.out.print("Enter the room's height >> ");
     double height = input.nextDouble();


     computeArea(length, width, height);
 }

 public static double computeArea(double length, double width, double height)
 {
     double area = (2*(length+width))*height;
     computeGallons(area);
     double price = (area/350)*32;
		return price;
 
 }
 
	public static double computeGallons(double area) {
		double gallons = area/350;
     System.out.println("You will need " + gallons + " gallons");
     PaintCalculator(gallons);
		return gallons;
	}

 public static double PaintCalculator(double gallons)
 {
     double price = gallons*32;
     System.out.println("The price to paint the room is $" + price);
     return price;
 }
}