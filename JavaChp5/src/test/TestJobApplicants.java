package test;
import java.time.LocalDate;
//Write your code here
//This is a comment.
import java.util.Scanner;
public class TestJobApplicants
{
public static void main(String[] args)
{
 // code to test constructor added for exercise 3b
 Scanner input = new Scanner(System.in);


 JobApplicant job1; //= new Automobile(ID1, make1, model1, color1, year1, mpg1);
 JobApplicant job2; // = new Automobile(ID2, make2, model2, color2, year2, mpg2);

 job1 = getData();
 job2 = getData();
 
 //showData(job1);
 //showData(job2);
 
 
 
 
 
 
 String qualifiedMsg = "is qalified for an interview   ";
 String notQualifiedMsg = "is not qualified for an interview at this time   ";
 if(isQualified(job1))
    display(job1, qualifiedMsg);
 else
    display(job1, notQualifiedMsg);
 if(isQualified(job2))
    display(job2, qualifiedMsg);
 else
    display(job2, notQualifiedMsg);

}
public static boolean isQualified(JobApplicant app)
{
 int count = 0;
 boolean isQual;
 final int MIN_SKILLS = 3;
 if(app.getHasWordSkill())
    count = count + 1;
 if(app.getHasSpreadsheetSkill())
    count = count + 1;
 if(app.getHasDatabaseSkill())
    count = count + 1;
 if(app.getHasGraphicsSkill())
    count = count + 1;
 if(count >= MIN_SKILLS)
    isQual = true;
 else
    isQual = false;
 return isQual;
}
public static void display(JobApplicant app, String msg)
{
 System.out.println(app.getName() + " " + msg +
    "  Phone: " + app.getPhone());
}
public static boolean tF(int graphics)
{
 if (graphics == 1)
	   return true;
	   else 
		   return false;
}

public static void showData(JobApplicant jb) {
	   System.out.println(jb.getName() +" is not qualified for an interview at this time  Phone: "+ jb.getPhone());

	
	
}


public static JobApplicant getData()
{
Scanner input = new Scanner(System.in);
System.out.print("Enter applicant's name >> ");
String name = input.nextLine();
System.out.print("Enter applicant's phone number >> ");
String number = input.nextLine();
System.out.print("Is applicant skilled in word processing?\r\n"
		+ "    Enter 1 for yes or 2 for no >> ");
int wordProcessing = input.nextInt();
boolean wp = tF(wordProcessing);
System.out.print("Is applicant skilled in spreadsheet?\r\n"
		+ "    Enter 1 for yes or 2 for no >> ");
int spreadsheet = input.nextInt();
boolean ss = tF(spreadsheet);
System.out.print("Is applicant skilled in database?\r\n"
		+ "    Enter 1 for yes or 2 for no >> ");
int database = input.nextInt();
boolean db = tF(database);
System.out.print("Is applicant skilled in graphics?\r\n"
		+ "    Enter 1 for yes or 2 for no >> ");
int graphics = input.nextInt();
boolean gph = tF(graphics);

JobApplicant ja = new JobApplicant();
ja.setName(name);
ja.setPhone(number);
ja.setWordSkill(wp);
ja.setSpreadsheetSkill(ss);
ja.setDatabaseSkill(db);
ja.setGraphicsSkill(gph);
return ja;
}


}

