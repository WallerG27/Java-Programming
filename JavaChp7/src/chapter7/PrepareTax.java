package chapter7;

//Write your code here
//This is a comment.

import java.util.Scanner;
public class PrepareTax
{
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
 String entry = "", ssn, last, first, address, city, state, zip;
 char status;
 int x;
 double income = 0;
 boolean isGood = false;
 while(!isGood)
 {
    isGood = true;
    

    
    System.out.print("Enter your Social Security number");
    entry = input.nextLine();
    
    if(entry.length() != 11)
      isGood = false;
    else
    {
        for(x = 0; x < 3; ++x)
           if(!Character.isDigit(entry.charAt(x)))
              isGood = false;
        for(x = 4; x < 6; ++x)
           if(!Character.isDigit(entry.charAt(x)))
              isGood = false;
        for(x = 8; x < entry.length(); ++x)
           if(!Character.isDigit(entry.charAt(x)))
              isGood = false;
        if(!(entry.charAt(3) == '-') || !(entry.charAt(6) == '-'))
           isGood = false;
     }
  }
  ssn = entry;

  System.out.print("Enter your first name");
  first = input.nextLine();
  

  System.out.print("Enter your last name");
  last = input.nextLine();

  System.out.print( "Enter your address");
  address = input.nextLine();

  System.out.print("Enter your city");
  city = input.nextLine();

  System.out.print("Enter your state");
  state = input.nextLine();

  isGood = false;
  while(!isGood)
  {
     isGood = true;

     System.out.print("Enter your Zip code");
     entry = input.nextLine();
     
     if(entry.length() != 5)
        isGood = false;
     else
       for(x = 0; x < 5; ++x)
         if(!Character.isDigit(entry.charAt(x)))
            isGood = false;
  }
  zip = entry;
  isGood = false;
  while(!isGood)
  {
     isGood = true;
     
     System.out.print("Enter marital status");
     entry = input.nextLine();
     
     if(!(entry.charAt(0) == 's' || entry.charAt(0) == 'S' ||
        entry.charAt(0) == 'm' || entry.charAt(0) == 'M'))
           isGood = false;
  }
  status = entry.charAt(0);
  isGood = false;
  while(!isGood)
  {
     isGood = true;

     
     System.out.print("Enter your annnual income");
     entry = input.nextLine();
     
     income = Double.parseDouble(entry);
     if(income < 0)
        isGood = false;
  }
  TaxReturn taxRet = new TaxReturn(ssn, last, first,
         address, city, state, zip, income, status);
  taxRet.display();
}
}