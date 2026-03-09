package Chapter2;



//Write your code here
//This is a comments.
import java.util.Scanner;
public class Eggs 
{
 public static void main(String[] args) 
 {
     //creating new varibles for converson rate
	 Scanner input = new Scanner(System.in);

     System.out.print("How many eggs?");
     int eggs = input.nextInt();
     
     int dozens = eggs / 12;
     int leftEggs = eggs % 12;

     double dozenPrice = 3.25;
     double leftEggsPrice = .45;
    //Math stuff

     double price = ((dozens*dozenPrice) + (leftEggs*(leftEggsPrice) ) );

     //Output
     System.out.println("You ordered " +  eggs + " eggs. That’s " + dozens + " dozen at $" + dozenPrice + " per dozen and " + leftEggs + " loose eggs at 45 cents each for a total of $" + price + "."); 
 }
}