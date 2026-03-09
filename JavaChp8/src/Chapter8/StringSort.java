package Chapter8;

//Write your program here
//This is a comment.
import java.util.*;
public class StringSort 
{
   public static void main (String[] args)
   {
      final int MAX = 15;
      final String QUIT = "zzz";
      String entry;
      int Sub = 0;
      Scanner input = new Scanner(System.in);
      String[] Strings = new String[MAX];

      System.out.print("Enter a string or " +
         QUIT + " to quit >> ");
      entry = input.nextLine();
      while(!entry.equals(QUIT) && (Sub < MAX))
      {
         
         
            Strings[Sub] = entry;
            ++Sub;
         
         if(Sub < MAX)
         {
            System.out.print("Enter a string or " +
               QUIT + " to quit >> ");
            entry = input.nextLine();
         }
      }
      String temp;
      for (int i = 0; i < Strings.length; i++) {
          for (int j = i + 1; j < Strings.length; j++) {
             
              // to compare one string with other strings
              if (Strings[i].compareTo(Strings[j]) > 0) {
                  // swapping
                  temp = Strings[i];
                  Strings[i] = Strings[j];
                  Strings[j] = temp;
              }
          }
      }
     
      // print output array
      System.out.println(
          "The names in alphabetical order are: ");
      for (int i = 0; i < Strings.length; i++) {
          System.out.println(Strings[i]);
      }
}}