package Chapter3;

//This application gets a user's name
//and displays a greeting
import java.util.Scanner;
public class DebugThree3
{
private static Scanner input;
public static void main(String args[])
{
   String name;
   name = getName();
   displayGreeting(name);           
}
public static String getName()
{
   String name;
   input = new Scanner(System.in);
   
   System.out.print("Enter name ");
   name = input.nextLine();
   return name;
}
public static void displayGreeting(String name)
{
   System.out.println("Hello, " + name + "!");
}
}