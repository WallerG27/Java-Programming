package Chapter4;


import java.util.Scanner;

//Write your code here
//This is a comment.
public class TestPatient
{
   public static void main(String[] args)
   {
       Patient p1 = new Patient();
       Patient p2;
       p1 = getData();
       BloodData b2 = new BloodData();
       display(p1);
       display(p2);
       p1.setId();
       p1.setAge();
       BloodData b = new BloodData();
       p1.setBloodData(b);
       display(p1);
   }

   public static void display(Patient p2)
   {
      BloodData bt = p2.getBloodData();
      System.out.println("Patient #" + p2.getId() + "  age: " + + p2.getAge() +
         "\n   The blood is type " + bt.getBloodType() + bt.getRhFactor());
   }

   public static Patient getData()
   {
       int age;
       String id;
       String bloodType;
       String rhFactor;
       Scanner input = new Scanner(System.in);
       System.out.print("\nEnter ID number for patient >> ");
       id = input.nextLine();
       System.out.print("Enter age for patient "+id+" >> ");
       age = input.nextInt();
       System.out.print("Enter blood type for patient "+id+" >> ");
       bloodType = input.nextLine();
       System.out.print("Enter RH factor for patient "+id+" >>");
       rhFactor = input.nextLine();
       input.nextLine();
       Patient pat = new Patient();
       pat.setAge(age);
       pat.setId(id);
       Object bloodData = (bloodType,rhFactor);
       pat.setBloodData(bloodData);
       return pat;
   }
}