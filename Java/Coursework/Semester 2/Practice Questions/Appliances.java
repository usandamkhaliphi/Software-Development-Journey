class Appliance
{
   public String brand;
   public int powerUsage;

   public Appliance()
   {
   }
   
   public Appliance(String n, int p)
   {
      this.brand = n;
      this.powerUsage = p;
   }
}  

class Microwave extends Appliance
{
   public int capacity;
      
   public void heatfood()
   {
   }
   
   public Microwave()
   {
   }
   
   public Microwave(int c)
   {
      this.capacity = c;
   }

}

public class Appliances
{
public static void main(String[] args)
   {
      Appliance a1 = new Appliance("Samsung",900);
      
      Microwave m1 = new Microwave(32);
      
      System.out.println("Brand: " + a1.brand + "\n" + "Power Usage: " + a1.powerUsage);
      System.out.println("Capacity: " + m1.capacity);
   }
}