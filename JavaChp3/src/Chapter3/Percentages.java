package Chapter3;

//Write your code here
//This is a comment
import java.util.Scanner;

public class Percentages
{
 public static void main(String args[])
 {
    double num1, num2;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a double >> ");
    num1 = input.nextDouble();
    System.out.print("Enter another Double >> ");
    num2 = input.nextDouble();
    computePercent(num1, num2);
    computePercent(num2, num1);
 }
 
 public static void computePercent(double firstNum, double secondNum)
 {
    System.out.println(firstNum + " is " + ((firstNum / secondNum)*100) + " percent of " + secondNum);
 }
 
}