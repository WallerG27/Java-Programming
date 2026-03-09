package Chapter8;

//Write your code here
//This is a comment.

import java.util.Scanner;

public class Planets 
{
	// Thanks to my docs.oracle.com research enum is way more advanced
	public enum Days {
		ZERO, MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE;
	

	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//Days aDay;
		String input = "";
		
		//for (Days day : Days.values())
			//System.out.print(day + " ");
		
		System.out.print("\nEnter a planet in our solar system >> ");
		input = in.nextLine().toUpperCase();
		
		
		try // I have a peeve about seeing errors even from unexpected input
		{
			Days aDay = Days.valueOf(input);
			System.out.println("You entered " + aDay);
			System.out.println(aDay+" is "+aDay.ordinal()+" planet(s) from the sun");
		}
		catch(Exception e)
		{
			if (input.isEmpty())
				System.out.println("Nothing entered exiting.");
			else
				System.out.println("Error: Invalid entry!\n\t" + e);
		}
	}
}