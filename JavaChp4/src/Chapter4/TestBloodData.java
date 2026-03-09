package Chapter4;


import java.util.Scanner;

//Write your code here
//This is a comment.
public class TestBloodData
{
 public static void main(String[] args)
 {
     BloodData bloodData1 = new BloodData();
     BloodData bloodData2 = new BloodData();

     bloodData1 = getData();
     bloodData2 = getData();

     display(bloodData1);
     display(bloodData1);
     bloodData1.setBloodType(null);
     bloodData1.getRhFactor();
     display(bloodData1);
 }
 public static void display(BloodData bloodData1)
 {
    System.out.println("The blood is type " + bloodData1.getBloodType() + bloodData1.getRhFactor());
 }

 public static BloodData getData()
{
  String bloodType;
  String rhFactor;

  Scanner input = new Scanner(System.in);
  System.out.print("\nEnter blood type >>");
  
  bloodType = input.nextLine();
  System.out.print("Enter RH factor >> ");
  rhFactor = input.nextLine();


  BloodData bloodData1 = new BloodData();
  bloodData1.setBloodType(bloodType);
  bloodData1.setRhFactor(rhFactor);
  return bloodData1;
}

}