package Chapter2;

//Write your code here
//This is a comment.
import javax.swing.JOptionPane;
public class ElectionStatistics
{
 public static void main(String[] args) 
 {
     //creating new varibles for converson rate
     String firstParty = JOptionPane.showInputDialog("Enter name for first party >> ");
     double firstPartyVotes = Integer.parseInt(JOptionPane.showInputDialog("Enter votes received >> "));

     String secondParty = JOptionPane.showInputDialog("Enter name for second party >> ");
     double secondPartyVotes = Integer.parseInt(JOptionPane.showInputDialog("Enter votes received >> "));
     
     String thirdParty = JOptionPane.showInputDialog("Enter name for third party >> ");
     double thirdPartyVotes = Integer.parseInt(JOptionPane.showInputDialog("Enter votes received >> "));
     //Math stuff
     
     double totalVotes = firstPartyVotes + secondPartyVotes + thirdPartyVotes; 
     double firstPercent = 100 * (firstPartyVotes / totalVotes);
     double secondPercent = 100 * (secondPartyVotes / totalVotes);
     double thirdPercent = 100 * (thirdPartyVotes / totalVotes);

     //extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON; 
     //Output 
     System.out.println("The " + firstParty + " got " + firstPercent + " percent of the vote"); 
     System.out.println("The " + secondParty + " got " + secondPercent + " percent of the vote"); 
     System.out.println("The " + thirdParty + " got " + thirdPercent + " percent of the vote"); 
 }
}