package Chapter3;

//Write your code here
//This is a comment.
import java.util.Scanner;
public class NumbersDemo 
{
 public static void main(String args[])
 {
    int num1, num2;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer >> ");
    num1 = input.nextInt();
    System.out.print("Enter another integer >> ");
    num2 = input.nextInt();

    displayTwiceTheNumber(num1);
    displayNumberPlusFive(num1);
    displayNumberSquared(num1);
    
    displayTwiceTheNumber(num2);
    displayNumberPlusFive(num2);
    displayNumberSquared(num2);
 }
 public static void displayTwiceTheNumber(int Num)
 {
    System.out.println(Num + " times 2 is " + (Num * 2));
 }

 public static void displayNumberPlusFive(int Num)
 {
    System.out.println(Num + " plus 5 is " +  (Num + 5));
 }

public static void displayNumberSquared(int Num)
 {
    System.out.println(Num + " squared is " +  (Num * Num));
 }
}