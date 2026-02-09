public class Phone
{
   public String model;
   public int batteryLevel;
   
   public Phone(String m, int b)
   {
      this.model = m;
      this.batteryLevel = b;
   }
   
   public int chargeBattery(int amount)
   {
      
      if(batteryLevel + amount > 100)
      {
         System.out.println("Invalid charge ammount");
      }
      else
      {
         batteryLevel = batteryLevel + amount;
      }
   return batteryLevel;
   }
}

class Main
{
public static void main(String[] args)
   {
      Phone p1 = new Phone("iPhone 17 Pro Max",23);
      System.out.println("Battery Level: " + p1.chargeBattery(64));
   }
}
      
      
      