package Chapter4;

//This class uses a DebugCircle class
//to instantiate a Circle object
import java.util.Scanner;
class DebugFour1
{
public static void main(String args[])
{
   Scanner input = new Scanner(System.in);
   int radius;
   DebugCircle c = new DebugCircle();
   System.out.print("Enter a radius for a circle >> ");
   radius = input.nextInt();
   c = new DebugCircle();
   c.setRadius(radius);
   System.out.println("The radius is " + c.getRadius() ); 
   System.out.println("The diamter is " + c.getDiameter()); 
   System.out.println("The area is " + c.getArea()); 
}
}