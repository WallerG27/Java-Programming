package chapter7;



//Write your code here
//This is a comment.
import java.util.Scanner;
public class ThreeLetterAcronym
{
public static void main(String[] args)
{
   Scanner in = new Scanner(System.in);
   String tla = "", entry;
   int stringLength;
   int i;
   int count = 0;
   int MAX = 3;
   char c;
   
   System.out.print("Please enter three words");
   entry = in.nextLine();
   
   
   stringLength = entry.length();
   tla += Character.toUpperCase(entry.charAt(0));
   ++count;
   for(i = 1; i < stringLength; i++)
   {
      if(count < MAX)
      {
         if(entry.charAt(i) == ' ')
         {
            ++i;
            c = entry.charAt(i);
            c = Character.toUpperCase(c);
            tla += c;
            ++count;
         }
      }
   }
   
   
   System.out.println("Original phrase was " + entry + "\nThree letter acronym is " + tla);
}  
}