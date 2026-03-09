package Chapter2;

//Write your code here
//This is a comment.
import javax.swing.JOptionPane;
public class InchesToFeetInteractive 
{
 public static void main(String[] args) 
 {
     //creating new varibles for converson rate
     final int INCHES_IN_FEET = 12; 
     int feet = Integer.parseInt(JOptionPane.showInputDialog("How many miles?"));
     //Math stuff
     
     int inches = INCHES_IN_FEET * feet;
     //extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON; 
     //Output
     System.out.println(feet + " feet is equal to " + inches + " inches"); 
 }

}