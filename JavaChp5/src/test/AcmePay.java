package test;
//Write your code here
//This is a comment.

import java.util.Scanner;
public class AcmePay
{
public static void main (String args[])
{
	double usedShift, hours, overHours = 0, overPay, pay, netPay, retirePay;
	int retirement = 0;
	final double fShift = 17;
	final double sShift = 18.5;
	final double tShift = 22;
	


	Scanner input = new Scanner(System.in);
	System.out.print("Please enter shift - 1, 2, or 3 >> ");
	int shift = input.nextInt();


	System.out.print("Please enter hours worked (can be a fraction) >> ");
	double time = input.nextInt();
	
	if (shift == 2 || shift == 3) {
		System.out.print("Do you want to participate in the retirement plan?\r\n"
				+ "   Enter 1 for Yes and 2 for No >>");
		retirement = input.nextInt();}

if(shift == 1 ) {
usedShift = fShift;
}
else
	if(shift == 2) {
		usedShift = sShift;
	}
	else
		if (shift == 3) {
			usedShift = tShift;
		}
		else {
			System.out.print("Dawg learn to read");
			usedShift = 0;
		}
			

if (time > 40) {
	overHours = time - 40;
	pay = 40 * usedShift;
	overPay = overHours * (usedShift*1.5);
}
else {
	overHours = 0;
	overPay = 0;
	pay = time * usedShift;
}
double tPay = pay + overPay;

if (retirement == 1) {
	retirePay = tPay * .03;
	netPay = tPay - retirePay;
}
else {
	retirePay = 0;
	netPay = tPay;
}



	 
	 
System.out.println("Hours worked is    " + time + "\r\n"
		+ "Shift:             " + shift + "\r\n"
		+ "Hourly pay rate is " + usedShift + "\r\n"
		+ "Regular pay is     " + pay + "\r\n"
		+ "Overtime pay is    " + overPay + "\r\n"
		+ "Retirement deduction is " + retirePay + "\r\n"
	    + "Net pay is.............." + netPay + "\r\n"); 
}
}