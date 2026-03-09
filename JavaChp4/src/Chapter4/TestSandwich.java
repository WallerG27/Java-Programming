package Chapter4;

//Write your code here
//This is a comment.
import java.util.Scanner;
class TestSandwich
{
public static void main (String args[])
{
Sandwich Sandwich1 = new Sandwich();
Sandwich1 = getData();
showValues(Sandwich1);

}
public static void showValues(Sandwich sw)
{
System.out.println("You have ordered a " + sw.getMainIngredient() + " sandwich on " +sw.getBread() + " bread, and the price is " + sw.getPrice());
}
public static Sandwich getData()
{
String mainIngredient;
String bread;
double price;
Scanner input = new Scanner(System.in);
System.out.print("\nEnter main sandwich ingredient >> ");
mainIngredient = input.nextLine();
System.out.print("Enter bread type >> ");
bread = input.nextLine();
System.out.print("Enter sandwich price >> ");
price = input.nextDouble();

input.nextLine();
Sandwich sw = new Sandwich();
sw.setMainIngredient(mainIngredient);
sw.setBread(bread);
sw.setPrice(price);
return sw;
}
}
