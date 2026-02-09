public class Order
{
   public String orderId;
   public String customerName;
   public double totalAmount;
   
   public Order(String o, String c, double t)
   {
      this.orderId = o;
      this.customerName = c;
      this.totalAmount = t;
   }
   
   public void applyCoupon(double percent)
   {
       double discountedAmount = totalAmount * percent / 100;
       totalAmount = totalAmount - discountedAmount;
   }
}

class Main
{
public static void main(String[] args)
   {
      Order order = new Order("AE725","John",5999.99);
      order.applyCoupon(5);
      
      System.out.println("Order ID: " + order.orderId + "\n" + "Name: " + order.customerName + "\n" + "Total: " + order.totalAmount);
   }
}