public class CartItem
{
   public String product;
   public int quantity;
   public double pricePerUnit;
   
   public CartItem(String p, int q, double u)
   {
      this.product = p;
      this.quantity = q;
      this.pricePerUnit = u;
   }
   
   public double getTotalPrice()
   {
      double totalPrice = quantity * pricePerUnit;
      return totalPrice;
   }
}

class Main
{
public static void main(String[] args)
   {
      CartItem[] cart = new CartItem[3];
      
      
      cart[0] = new CartItem("Bread",2,18.99);
      cart[1] = new CartItem("Milk",1,34.99);
      cart[2] = new CartItem("Eggs",1,89.99);
      
      cart[0].getTotalPrice();
      cart[1].getTotalPrice();
      cart[2].getTotalPrice();
      
      System.out.println("Cart 1 total value: " + cart[0].getTotalPrice());
      System.out.println("Cart 2 total value: " + cart[1].getTotalPrice());
      System.out.println("Cart 3 total value: " + cart[2].getTotalPrice());
   }
}