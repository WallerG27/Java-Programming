package Chapter3;

//Write your code here
//This is a comment.
import java.util.Scanner;
public class FormLetterWriter  
{
 public static Scanner input;


	public static void main(String[] args) 
 {
     //creating new varibles for converson rate
		Scanner input = new Scanner(System.in);
		
     System.out.print("Enter first name >> ");
     String firstName = input.nextLine();

     System.out.print("Enter last name >> ");
     String lastName = input.nextLine();
     
     displaySalutation(firstName);
     displaySalutation(firstName, lastName);
 }

 public static void displaySalutation(String name)
 {
     System.out.println("Dear " + name + ","
     + "\nThank you for your recent order."
     + "\n");
 }

 public static void displaySalutation(String fName, String lName)
 {
     System.out.println("Dear "+ fName + " " + lName +","
     + "\nThank you for your recent order."
     + "\n");
 }  
}