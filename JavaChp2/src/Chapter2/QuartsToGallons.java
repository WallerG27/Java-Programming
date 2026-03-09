package Chapter2;

//Write your code here
//This is a comment.
class QuartsToGallons
{
public static void main(String[] args) 
{
   //Converson rate 
   final int QUARTS_IN_GALLON = 4; 
   //Quarts used
   int quartsNeeded = 18;
   //creating new varibles 
   int gallonsNeeded; 
   int extraQuartsNeeded; 
   //Math stuff
   gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
   extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON; 
   //Output
   System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + extraQuartsNeeded + " quarts."); 
}

}