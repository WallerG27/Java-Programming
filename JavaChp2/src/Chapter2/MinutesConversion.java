package Chapter2;

//Write your code here
//This is a comment.
import javax.swing.JOptionPane;
public class MinutesConversion
{
 public static void main(String[] args) 
 {
     //creating new varibles for converson rate
     int minutes = Integer.parseInt(JOptionPane.showInputDialog("Enter minutes >>"));
     //Math stuff
     
     double hours = minutes / 60;
     double days = hours / 24;

     //extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON; 
     //Output
     System.out.println(minutes + " minutes is " + hours + " hours or " + days + " days."); 
 }
}