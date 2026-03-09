package Chapter3;

//Write your code here
//This is a comment
import java.util.Scanner;

import javax.swing.JOptionPane;
public class InchConversion 
{
 public static Scanner input;


	public static void main(String[] args) 
 {
     //creating new varibles for converson rate
     input = new Scanner(System.in);

     System.out.print("Enter inches >> ");
     double inches = input.nextDouble();
     convertToFeet(inches);
     convertToYards(inches);
 }

	public static void convertToFeet(double Inch) {
		System.out.println((Inch) + " inches is " + (Inch/12) + " feet");
	}

 public static void convertToYards(double Inch) {
		System.out.println((Inch) + " inches is " + (Inch/36) + " yards");
	}
}