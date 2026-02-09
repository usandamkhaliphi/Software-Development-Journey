public class Delivery
{
   public String customer;
   public String address;
   public boolean delivered;
   
   public Delivery(String c, String a, boolean d)
   {
      this.customer = c;
      this.address = a;
      this.delivered = d;
   }
   
   public boolean Delivered()
   {
      delivered = true;
      return delivered;
   }
   
   public void displayDetails()
   {
      System.out.println("Customer name: " + customer + "\n" + "Customer Address: " + address + "\n" + "Delivered?: " + delivered);
      System.out.println();
   }
}

class Main
{
public static void main(String[] args)
   {
      Delivery d1 = new Delivery("John","123 Boom Street",false);
      Delivery d2 = new Delivery("Steve","58 Main Street",true);
      Delivery d3 = new Delivery("Peter","5 7th Street",true);
      
      d1.Delivered();
      d1.displayDetails();
      d2.displayDetails();
      d3.displayDetails();
   }
}