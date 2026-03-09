package chapter7;

//Write your code here
//This is a comment.

import java.util.*;
public class Alphabetize
{
public static void main(String[] args)
{
  String str1, str2, str3;
  Scanner in = new Scanner(System.in);
  System.out.print("Enter first string >> ");
  str1 = in.nextLine();
  System.out.print("Enter second string >> ");
  str2 = in.nextLine();
  System.out.print("Enter third string >> ");
  str3 = in.nextLine();
  if(str1.toLowerCase().compareTo(str2.toLowerCase()) < 0 &&
    str2.toLowerCase().compareTo(str3.toLowerCase()) < 0)
     System.out.println("Yes, the strings entered are in alphabetical order");
  else
     System.out.println("No, the strings entered are not in alphabetical order");
}
}