package Chapter2;

//Write your code here
//This is a comments.
import javax.swing.JOptionPane;
public class ChiliToGoProfit 
{
 public static void main(String[] args) 
 {
     //creating new varibles for converson rate
     
     int adultMeals = Integer.parseInt(JOptionPane.showInputDialog("Enter number of adult meals ordered >>"));
     int childMeals = Integer.parseInt(JOptionPane.showInputDialog("Enter number of child meals ordered >>"));

     double adultsPrice = 7.0;
     double kidsPrice = 4.0;
     //Math stuff
     double adultsTotal = adultMeals*adultsPrice;
     double kidsTotal = childMeals*kidsPrice;
     double grandTotal = kidsTotal + adultsTotal;

     //Output
     System.out.println(adultMeals + " adult meals were ordered at $" + adultsPrice +" each."); 
     System.out.println("      Total is $" + adultsTotal); 
     System.out.println(childMeals + " child meals were ordered at $"+ kidsPrice +" each."); 
     System.out.println("      Total is $" + kidsTotal); 
     System.out.println("Grand total for all meals is $" + grandTotal); 
 }
}