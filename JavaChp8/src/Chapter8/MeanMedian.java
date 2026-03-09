package Chapter8;

import java.util.Arrays;
import java.util.Scanner;

//Write your code here
//This is a comment.
public class MeanMedian {

 public static void main(String[] args) 
 {
     
     double mean = 0;
     int sum = 0;
     final int MAX = 9;
     final int QUIT = 9999;
     int[] inputs = new int[MAX];
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("Please enter "+MAX+" integers");
     
     
     
     while(count < input.length && (!entry.equals(QUIT)) )
     for(int x = 0; x <= MAX-1; x++)
     {
         System.out.print("Enter number "+(x+1)+" >> ");
         inputs[x] = input.nextInt();
     }
     
     
     
     
     
     
     
     System.out.print("You entered: ");
     Arrays.sort(inputs);
     

     for(int y = 0; y <= inputs.length - 1; y++)
     {
         System.out.print(inputs[y] + " ");
     }
     System.out.println();
     
     for(int y = 0; y <= inputs.length - 1; y++)
     {
         sum += inputs[y];
         mean = sum / 5;
     }
     
     System.out.println("The mean is "+mean+" and the median is "+inputs[MAX/2]);
 }
}