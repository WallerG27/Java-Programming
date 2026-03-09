package Chapter4;

//Write your code here
//This is a comment.
import java.time.*;
public class FitnessTracker
{
String activity;
int minutes;
LocalDate date;
// constructor added for Exercise 3a
public FitnessTracker()
{
   activity = "running";
   minutes = 0;
   date = LocalDate.of(2024, 1, 1);
}
// constructor added for Exercise 3b
public FitnessTracker(String a, int m, LocalDate d)
{
   activity = a;
   minutes = m;
   date = d;
}
public String getActivity()
{
   return activity;
}
public int getMinutes()
{
   return minutes;
}
public LocalDate getDate()
{
   return date;
}
}