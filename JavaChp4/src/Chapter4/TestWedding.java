package Chapter4;

//Write your code here
//This is a comment.
import java.time.*;
import java.util.Scanner;
public class TestWedding
{
public static void main(String[] args)
{
   System.out.print("\nEnter month of wedding ");
   Scanner input = new Scanner(System.in);
   int month = input.nextInt();
   System.out.print("Enter day of wedding ");
   int day = input.nextInt();
   System.out.print("Enter year of wedding ");
   int year = input.nextInt();


   System.out.print("Enter first name of bride >> ");
   String sloppyCode = input.nextLine();
   String firstBride = input.nextLine();
   System.out.print("Enter last name of bride >> ");
   String lastBride = input.nextLine();

   System.out.print("Enter first name of groom >> ");
   String firstGroom = input.nextLine();
   System.out.print("Enter last name of groom >> ");
   String lastGroom = input.nextLine();

   System.out.print("Enter location of wedding >> ");
   String location = input.nextLine();


   LocalDate date1 = LocalDate.of(year,month,day);



   Person bride1 = new Person(firstBride, lastBride);
   Person groom1 = new Person(firstGroom, lastGroom); 

   Couple couple1 = new Couple(bride1, groom1);

   Wedding wedding1 = new Wedding(couple1, date1, location);

   displayWeddingDetails(wedding1);

}
public static void displayWeddingDetails(Wedding w)
{
   Couple couple = w.getCouple();
   LocalDate weddingDate = w.getWeddingDate();
   String location = w.getLocation();
   Person bride = couple.getBride();
   Person groom = couple.getGroom();
   String firstBride = bride.getFirstName();
   String lastBride = bride.getLastName();

   String firstGroom = groom.getFirstName();
   String lastGroom = groom.getLastName();

   System.out.println("\n" + lastBride + "/" + lastGroom + " Wedding");
   System.out.println("Date: " + weddingDate + "   Location: " +
         location);
   System.out.println("Bride: " + firstBride +
      " " + lastBride);
   System.out.println("Groom: " + firstGroom +
      " " + lastGroom);
}
}