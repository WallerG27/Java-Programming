package Chapter8;



//Write your code here
//This is a comment.

import java.util.Scanner;
public class InputGrades
{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
   Student[] students = new Student[10]; 
   int x, y, z;
   String courseEntry, entry  = "",  message;
   int idEntry, credits;
   char gradeEntry = ' ';
   boolean isGoodGrade =  false;
   char[] grades = {'A', 'B', 'C', 'D', 'F'};
   final int NUM_COURSES = 5;
   for(x = 0; x < students.length; ++x)
   {
      Student stu = new Student();
          

      System.out.print("For student #" +
    	         (x + 1) + ", enter the student ID");
      entry = input.nextLine();  
      
      
      idEntry  = Integer.parseInt(entry);
      stu.setID(idEntry);
      for(y = 0; y < NUM_COURSES; ++y)
      {  
        
         System.out.print("For student #" + (x + 1) + ", enter course #" +
                 (y + 1));
         courseEntry = input.nextLine(); 
         
         
  
         System.out.print("For student #" + (x + 1) +
                 ", enter credits for course  #" + (y + 1));
      entry = input.nextLine();  
         
         credits = Integer.parseInt(entry); 
         isGoodGrade = false;
         while(!isGoodGrade)
         {
            
            System.out.print("For student #" + (x + 1) +
                    ", enter grade for course  #" + (y + 1));
         entry = input.nextLine();  

            
            gradeEntry = entry.charAt(0);
            for(z = 0; z < grades.length; ++z)     
            {
               if(gradeEntry == grades[z])
                 isGoodGrade = true;
            }
         }
         CollegeCourse temp = new CollegeCourse();
         temp.setID(courseEntry);
         temp.setCredits(credits);
         temp.setGrade(gradeEntry);
         stu.setCourse(temp, y);
     }
     students[x] = stu;
  }
  for(x = 0; x < students.length;  ++x)
  {
     message  = "Student #" + (x + 1) + "  ID #" +
       students[x].getID();
     for(y = 0; y < grades.length; ++y)
     {
       CollegeCourse temp = new CollegeCourse();
       temp =  students[x].getCourse(y);
       message = message + "\n" + temp.getID() +
         " " + temp.getCredits() +  "  -- credits. Grade is " +
         temp.getGrade();  
     }
     System.out.print(message);
  }
}
}