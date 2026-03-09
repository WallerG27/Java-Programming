package Chapter3;

//Write your code here
//This is a comment.

import java.util.Scanner;
public class BookBilling  
{
 public static Scanner input;


	public static void main(String[] args) 
 {
     //creating new varibles for converson rate
		Scanner input = new Scanner(System.in);
		
     System.out.print("Enter quantity ordered >> ");
     int quantity = input.nextInt();

     System.out.print("Enter coupon value >> ");
     double coupon = input.nextDouble();
     
     computeBill();
     computeBill(quantity);
     computeBill(quantity, coupon);
 }

 public static double computeBill()
 {
     double tax = .08;
     double priceTax = (14.99*tax);
     double price = (14.99+priceTax);
     System.out.println("One book is $" + price);
     return price;

 }

 public static double computeBill(int quantity)
 {
     double tax =.08;
     double priceTax = ((14.99*quantity)*tax);
     double price = ((14.99 * quantity)+priceTax);
     System.out.println(quantity + " books with no coupon are $" + price);
     return price;
 }

 public static double computeBill(int quantity, double coupon)
 {
     double tax =.08;
     double priceTax = (((14.99*quantity)-coupon)*tax);
     double price = (((14.99 * quantity)-coupon)+priceTax);
     System.out.println(quantity + " books with a coupon worth $" + coupon + " are " + price);
     return price;
 }  
}