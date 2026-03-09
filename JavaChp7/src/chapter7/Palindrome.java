package chapter7;


//Write your code here
//This is a comment.
import java.util.Scanner;
public class Palindrome
{
   public static void main(String[] args)
   {
      String phrase;
      String message;
      int i, j = 0, midPoint;
      char first, last;
      boolean isPalindrome = true;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a string");
      phrase = input.nextLine();
      

      int stringLength = phrase.length();
    
      midPoint = stringLength / 2;
      i = stringLength - 1;
      j = 0;
      while(j <= midPoint)
      {
         first = Character.toLowerCase(phrase.charAt(j));
         last = Character.toLowerCase(phrase.charAt(i));
         if(first != ' ' && last != ' ')
         {
            if(first != last)
            {
               isPalindrome = false;
               j = midPoint;
            }
            --i;
            ++j;
         }
        else
           if(first == ' ')
              ++j;
           else
              --i;
      }
      if(isPalindrome)
          message = "You entered a plaindrome";
      else
          message = "You did not enter a palindrome";   
      System.out.print(message);
   }
}