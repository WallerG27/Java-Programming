package test;

public class testMath {
	public static void main (String args[]) {

		double m = 7.346 * Math.pow(10, 22);
		double r = 1.7374 * Math.pow(10, 6);

		double g = 6.674 * Math.pow(10, -11);

		//double r = Math.pow(10, 2);
		
		double math = 2*g*m;
		System.out.println(math);
		double math2 = (math)/r;
		System.out.println(math2);
		double math3 = Math.pow(math2, .5);
		System.out.println(math3);
	}
}
