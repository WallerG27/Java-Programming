package Chapter4;

import java.util.Scanner;

//Write your code here
//This is a comment

public class TestTeam {

public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("\nEnter school name >> ");
   String school1 = input.nextLine();
   System.out.print("Enter sport >> ");
   String sport1 = input.nextLine();
   System.out.print("Enter mascot >> ");
   String mascot1 = input.nextLine();
   Team team1 = new Team(school1, sport1, mascot1);
	 
   System.out.print("\nEnter school name >> ");
   String school2 = input.nextLine();
   System.out.print("Enter sport >> ");
   String sport2 = input.nextLine();
   System.out.print("Enter mascot >> ");
   String mascot2 = input.nextLine();
   Team team2 = new Team(school2, sport2, mascot2);
   
   System.out.print("\nEnter school name >> ");
   String school3 = input.nextLine();
   System.out.print("Enter sport >> ");
   String sport3 = input.nextLine();
   System.out.print("Enter mascot >> ");
   String mascot3 = input.nextLine();
   Team team3 = new Team(school3, sport3, mascot3);
   
   
 display(team1);
 display(team2);
 display(team3);
}

public static void display(Team team) {
 System.out.println(
     team.getName() + "" + team.getSport() + "" + team.getMascot() + ""
         + Team.MOTTO);
}
}
