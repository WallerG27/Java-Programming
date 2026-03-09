package Chapter4;

//Write your code here
//This is a comment.
import java.time.*;
public class Person
{
private String firstName;
private String lastName;
public Person(String first, String last)
{
   firstName = first;
   lastName = last;
}

public String getFirstName()
{
   return firstName;
}
public String getLastName()
{
  return lastName;
}
}