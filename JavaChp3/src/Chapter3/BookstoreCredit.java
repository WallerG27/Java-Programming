package Chapter3;

//Write your code here
//This is a comment.
import java.util.Scanner;

public class BookstoreCredit
{
 public static Scanner input;


	public static void main(String[] args) 
 {
     //creating new varibles for converson rate
     input = new Scanner(System.in);

     System.out.print("Enter your name >> ");
     String name = input.nextLine();

     System.out.print("Enter your gpa >> ");
     double gpa = input.nextDouble();
     computeDiscount(name, gpa);
 }
     

	public static void computeDiscount(String name, double gpa) {
		// TODO Auto-generated method stub
		System.out.println(name + ", your GPA is " + gpa + ", so your discount is $" + (gpa * 10));
	}
}