package Chapter2;

//Write your code here
//This is a comment.
import javax.swing.JOptionPane;
public class InchesToFeet 
{
 public static void main(String[] args) 
 {
     //creating new varibles for converson rate
     final int INCHES_IN_FEET = 12; 
     int inches = 86;
     //Math stuff
     int feet = INCHES_IN_FEET * inches;
     //Output
     System.out.println(feet + " feet is equal to " + inches + " inches"); 
 }
}