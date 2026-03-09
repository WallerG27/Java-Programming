package chapter7;

public class CountSpaces
{
  public static void main(String[] args)
  {
     String aString = 
       "We Didn't Start The Fire, It Was Always Burning Since The Worlds Been Turning";
     int numSpaces = 0;
     int stringLength = aString.length();

     for(int i = 0; i < stringLength; i++)
     {
        char ch = aString.charAt(i);
        if(ch == ' ')
           numSpaces++;
     }
     System.out.println("The number of spaces is " + numSpaces);
  }
}