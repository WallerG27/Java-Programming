package Chapter4;

//Write your code here
//This is a comment.
import java.time.*;
import java.util.Scanner;
public class DaysTilNextMonth
{
 public static void main(String[] args)
 {
     System.out.print("\nEnter the month as an integer >> ");
     Scanner input = new Scanner(System.in);
		int month = input.nextInt();
     System.out.print("Enter the day >> ");
     int day = input.nextInt();
     System.out.print("Enter the year using four digits >> ");
     int year = input.nextInt();
 

     LocalDate today = LocalDate.of(year,month,day);

     int daysTilNextMo;
     System.out.println("Today is " + today);
     day = today.getDayOfMonth();
     System.out.println(day);
     daysTilNextMo = today.lengthOfMonth() - (day-1);
     System.out.println("There are " + daysTilNextMo +" days until " + today.plusMonths(1).getMonth() + " starts");
 }
}