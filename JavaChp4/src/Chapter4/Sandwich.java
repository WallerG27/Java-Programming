package Chapter4;

public class Sandwich
{
   private String mainIngredient ;
   private String bread;
   private double price;
   public Sandwich()
   {
      mainIngredient  = "";
      bread = "";
      price = 0;

   }
   public void DebugSandwich(String mainIngredient, String bread, double price)
   {
    mainIngredient = mainIngredient;
	  bread = bread;
	  price = price;
   }
   public void setMainIngredient(String ingre)
   {
      mainIngredient = ingre;
   }
   public void setBread(String brd)
   {
      bread = brd;
   }
   public void setPrice(double p)
   {
      price = p;
   }

   public String getMainIngredient()
   {
      return mainIngredient;
   }
   public String getBread()
   {
      return bread;
   }
   public double getPrice()
   {
      return price;
   }
}