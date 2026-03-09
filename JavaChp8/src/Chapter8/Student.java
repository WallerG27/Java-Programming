package Chapter8;

//Write your code here
//This is a comment.

public class Student
{
private int stuID;
private CollegeCourse[] course = new CollegeCourse[5];  

public int getID()
{
   return stuID;
}
public CollegeCourse getCourse(int x)
{
   return course[x];
}

public void setID(int idNum)
{
   stuID = idNum;
}
public void setCourse(CollegeCourse c, int x)
{
   course[x] = c;
}
}