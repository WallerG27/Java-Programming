package Chapter3;

//Write your code here
//This is a comment.
import java.util.Scanner;
public class JobPricing  
{
 public static Scanner input;


	public static void main(String[] args) 
 {
     //creating new varibles for converson rate
		Scanner input = new Scanner(System.in);
		
     System.out.print("Enter job description >> ");
     String job = "";
     job+=input.nextLine();
     //System.out.println(job);

     System.out.print("Enter cost of materials >> ");
     double cost = input.nextDouble();

     System.out.print("Enter hours on the job work >> ");
     double hours = input.nextDouble();

     System.out.print("Enter hours traveling >> ");
     double travel = input.nextDouble();


     double totalCost = computePrice(cost, hours, travel);
     
     System.out.println("The price for " + job + " is $" + totalCost);
 }

 public static double computePrice(double cost, double hours, double travel)
 {
     double workCost = hours*35;
     double travelCost = travel*12;
     double JobPricing = workCost+travelCost+cost;
		return JobPricing ;
 }
 
}