public class Property
{
   public String address;
   public int price;
   public boolean isSold;
   
   public Property(String a, int p, boolean s)
   {
      this.address = a;
      this.price = p;
      this.isSold = s;
   }
}

class Main
{
public static void main(String[] args)
   {
      Property p1 = new Property("123 Boom Street",500000,false);
      Property p2 = new Property("272 Hippo Avenue",830000,true);
      Property p3 = new Property("832 Main Street",1800000,true);
      Property p4 = new Property("13 7th Street",3720000,false);
      Property p5 = new Property("23 Scott Street",750000,true);
      
      System.out.println("Unsold Properties:");
      System.out.println();
      
      if (p1.isSold == false)
      {
         System.out.println("Address: " + p1.address + "\n" + "Price: R" + p1.price);
         System.out.println();
      }
      if (p2.isSold == false)
      {
         System.out.println("Address: " + p2.address + "\n" + "Price: R" + p2.price);
         System.out.println();
      }
      if (p3.isSold == false)
      {
         System.out.println("Address: " + p3.address + "\n" + "Price: R" + p3.price);
         System.out.println();
      }
      if (p4.isSold == false)
      {
         System.out.println("Address: " + p4.address + "\n" + "Price: R" + p4.price);
         System.out.println();
      }
      if (p5.isSold == false)
      {
         System.out.println("Address: " + p5.address + "\n" + "Price: R" + p5.price);
      }
   }
}