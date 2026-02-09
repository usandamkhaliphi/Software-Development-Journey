public class Customer
{
   public String name;
   public double totalSpent;
   
   public Customer(String n, double t)
   {
      this.name = n;
      this.totalSpent = t;
   }
   
   public double getDiscount()
   {
      double newTotal;

      if (totalSpent > 1000) 
      {
         newTotal = totalSpent - (totalSpent * 10 / 100);
      }     
     
      else 
      
      {
         newTotal = totalSpent;
      }

      return newTotal;
   
   }
}
class Main
{
public static void main(String[] args)
   {
      Customer c1 = new Customer("John",921.82);
      Customer c2 = new Customer("Peter",3291.93);
      Customer c3 = new Customer("Samuel",2732.64);
      
      System.out.println("Total: R" + c1.getDiscount());
      System.out.println("Total: R" + c2.getDiscount());
      System.out.println("Total: R" + c3.getDiscount());
   }
}   