class Item
{
   private String name;
   private double price;
   private int quantity;

   public Item(String n, double p, int q)
   {
      this.name = n;
      this.price = p;
      this.quantity = q;
   }
   
   public double getPrice()
   {
      return this.price;
   }
   
   public void applyDiscount(double discountPercent)
   {
     price = price - (price * discountPercent / 100);
   }
}

public class OnlineStore
{
public static void main(String[] args)
   {
      Item item = new Item("bread", 18, 2);
      item.applyDiscount(7);
      System.out.println("The updated price is: R " + item.getPrice());
   }
}