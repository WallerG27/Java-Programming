package Chapter4;

//Write your code here
//This is a comment.
import java.time.*;
import java.util.Scanner;
public class TestFitnessTracker {
public static void main(String[] args)
{
  FitnessTracker exercise = new FitnessTracker();

  

  // code to test constructor added for exercise 3b
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter activity >> ");
  String activity = input.nextLine();
  System.out.print("Enter minutes spent "+activity+" >> ");
  int minute = input.nextInt();
  
  System.out.print("Enter month >> ");
	 int month = input.nextInt();
  System.out.print("Enter day >> ");
  int day = input.nextInt();
  System.out.print("Enter year >> ");
  int year = input.nextInt();
  
  
  LocalDate date = LocalDate.of(year,month,day);;
  FitnessTracker exercise2 = new FitnessTracker(activity, minute, date);
  System.out.println("Activity log:");
  System.out.println(exercise.getActivity() + " " + exercise.getMinutes() + " minutes on " + exercise.getDate());
  System.out.println(exercise2.getActivity() + " " + exercise2.getMinutes() +" minutes on " + exercise2.getDate());
}
}