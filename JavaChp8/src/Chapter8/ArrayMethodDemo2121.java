package Chapter8;



//Write your code here
//This is a comment.
import java.util.Scanner;
public class ArrayMethodDemo2121
{
public static void main (String args[])
{
   //int[] numbers = {12, 15, 34, 67, 4, 9, 10, 7, 13, 50};
   
   Scanner input = new Scanner(System.in);
   int[] numbers = new int[10];
   double entry;

   int x = 0;
   //System.out.print("Enter integer #1 >> ");
   ////entry = input.nextInt();
   //numbers[(int) x] = (int) entry;
   while(x < numbers.length)
   {

      //if(x < numbers.length)
      //{
         System.out.print("Enter integer #"+(x+1)+" >> ");
         entry = input.nextDouble();  
         numbers[(int) x] = (int) entry;

         ++x;
      //}
   }
   
   
   
   
   
   int limit = 12;
   display(numbers);
   displayReverse(numbers);
   displaySum(numbers);
   displayLessThan(numbers, limit);
   displayHigherThanAverage(numbers);
}
public static void display(int[] numbers)
{
   System.out.print("The numbers are  ");
   for(int i = 0; i < numbers.length; ++ i)
      System.out.print(numbers[i] + "  ");
}
public static void displayReverse(int[] numbers)
{
   System.out.print("\nThe numbers in reverse order are  ");
   for(int i = numbers.length - 1; i >= 0; -- i)
      System.out.print(numbers[i] + "  ");
}
public static void displaySum(int[] numbers)
{
   int total = 0;
   for(int i = 0; i < numbers.length; i++)
   {
      total += numbers[i];
   }
   System.out.println("\nThe sum of all numbers is " + total);
}
public static void displayLessThan(int[] numbers, int limit)
{
    for(int i = 0; i < numbers.length; i++)
      if(numbers[i] < limit)
          System.out.print(numbers[i] + " ");
     System.out.println("are less than the limit " + limit);

}
public static void displayHigherThanAverage(int[] numbers)
{
   int sum = 0;
   double average;
   for(int i = 0; i < numbers.length; ++i)
      sum += numbers[i];
   average = sum * 1.0 / numbers.length;
   System.out.println("The average is " + average);
   for(int i = 0; i < numbers.length; i++)
      if(numbers[i] > average)
	    System.out.print(numbers[i] + "  ");
   System.out.println("are greater than the average");
}
}
