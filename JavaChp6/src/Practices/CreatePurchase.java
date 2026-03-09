package Practices;


//Write your code here
//This is a comment.
import java.util.Scanner;
public class CreatePurchase
{
public static void main(String[] args)
{
   Purchase purch = new Purchase();
   int num;
   double amount;

   final int LOW = 1000, HIGH = 8000;
   
   
   
   Scanner kb = new Scanner(System.in);
	System.out.print("Enter invoice number");
    num = kb.nextInt();
   
   while(num <= LOW || num >= HIGH)
   {
	   System.out.print("Invoice number must be between " + LOW + " and " + HIGH + "\nnter invoice number");
	    num = kb.nextInt();
		System.out.print("Enter invoice number");
	    num = kb.nextInt();
   }
   System.out.print("Enter sale amount");
   amount = kb.nextDouble();

   while(amount < 0)
   {
	   System.out.print("Enter sale amount");
	   amount = kb.nextDouble();
	   
   }
   purch.setInvoiceNumber(num);
   purch.setSaleAmount(amount);
   purch.display();
}
}