package test;

import java.util.Scanner;

//Write your code here
//This is a comment.
public class TestAutomobiles
{
public static void main(String[] args)
{

   Automobile auto1; //= new Automobile(ID1, make1, model1, color1, year1, mpg1);
   Automobile auto2; // = new Automobile(ID2, make2, model2, color2, year2, mpg2);

   auto1 = getData();
   auto2 = getData();
   
   showData(auto1);
   showData(auto2);
   
}


public static void showData(Automobile am) {
	   System.out.println("ID#" + am.getId() + " " + am.getMake() + " " + am.getModel() + " " + am.getColor() + " " + am.getYear() + " " + am.getMpg() + " miles per gallon");

	
	
}
public static Automobile getData()
{
   Automobile auto = new Automobile();
	Scanner input = new Scanner(System.in); 
   String make, model, color;
   int year, ID;
   double mpg;

	 System.out.print("\nEnter ID (an integer) >> ");
	 ID = input.nextInt();
	 
	 System.out.print("Enter make >> ");
	 String messy = input.nextLine();
	 make = input.nextLine();
	 
	 System.out.print("Enter model >> ");
	 model = input.nextLine();
	 
	 System.out.print("Enter color >> ");
	 color = input.nextLine();
	 
	 System.out.print("Enter year (4 digits) >> ");
	 year = input.nextInt();
	 
	 System.out.print("Enter mpg >> ");
	 mpg = input.nextDouble();
   
   auto.setId(ID);
   auto.setMake(make);
   auto.setModel(model);
   auto.setColor(color);
   auto.setYear(year);
   auto.setMpg(mpg);
   return auto;
   
   
}
} 