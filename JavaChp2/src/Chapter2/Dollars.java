package Chapter2;

//Write your code here
//This is a comment.
import javax.swing.JOptionPane;
public class Dollars 
{
 public static void main(String[] args) 
 {
     //creating new varibles for converson rate
     int dollars = Integer.parseInt(JOptionPane.showInputDialog("Enter a number of dollars"));
     //Math stuff
     
     int twentiesTotal = dollars / 20;
     int twentiesReminding = dollars % 20;

     int tenTotal = twentiesReminding / 10;
     int tenReminding = twentiesReminding % 10;

     int fiveTotal = tenReminding / 5;
     int finalReminding = tenReminding % 5;


     //extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON; 
     //Output
     System.out.println("$" + dollars + " converted is " + twentiesTotal + " $20s, " + tenTotal + " $10s, " + fiveTotal + " $5s, and " + finalReminding + " $1s"); 
 }
}