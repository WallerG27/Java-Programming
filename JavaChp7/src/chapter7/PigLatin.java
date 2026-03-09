package chapter7;

//Write your code here
//This is a comment.

import java.util.Scanner;
public class PigLatin
{
public static void main(String[] args)
{
   Scanner in = new Scanner(System.in);
   StringBuffer str = new StringBuffer("");
   String userEntry;
   String suffix = "";
   char letter;
   int firstVowel = -1;
   int x;
   
   System.out.print("Enter a word to be converted to Pig Latin >> ");
   userEntry = in.nextLine();
   
   
   
   str.insert(0, userEntry);
   for(x = 0; x < userEntry.length(); ++x)
   {
      letter = userEntry.charAt(x);
      if(isVowel(letter))
      {
          firstVowel = x;
          x = userEntry.length();
      }
      else
         if(x != 0 && letter == 'y')
         {
            firstVowel = x;
            x = userEntry.length();
         }
   }
   for(x = 0; x < firstVowel; ++x)
       suffix = suffix + userEntry.charAt(x);
   suffix = suffix + "ay";
   for(x = firstVowel - 1; x >= 0; --x)
      str.deleteCharAt(x);
   str.append(suffix);
   
   System.out.println("Pig Latin version: " + str);

}
public static boolean isVowel(char c)
{
   boolean isVowel = false;
   if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
      isVowel = true;
   return isVowel;
}
}