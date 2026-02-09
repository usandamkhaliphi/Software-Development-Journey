public class coffeeOrder
{
   public String size;
   public double price;
   
   public coffeeOrder(String s, double p)
   {
      this.size = s;
      this.price = p;
   }
   
   public double applySizeDiscount()
   {  
      if (size.equals("Large"))
      {
         price = price - (price * 5 / 100);
      }
      return price;
   }
}

class Main
{
public static void main(String[] args)
   {
      coffeeOrder c1 = new coffeeOrder("Medium",30);
      coffeeOrder c2 = new coffeeOrder("Small",25);
      coffeeOrder c3 = new coffeeOrder("Large",35);
      coffeeOrder c4 = new coffeeOrder("Large",35);
      coffeeOrder c5 = new coffeeOrder("Medium",30);
      
      System.out.println("Price: R" + c1.applySizeDiscount());
      System.out.println("Price: R" + c2.applySizeDiscount());
      System.out.println("Price: R" + c3.applySizeDiscount());
      System.out.println("Price: R" + c4.applySizeDiscount());
      System.out.println("Price: R" + c5.applySizeDiscount());
   }
}