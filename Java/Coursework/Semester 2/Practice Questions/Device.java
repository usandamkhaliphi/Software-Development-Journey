public class Device
{
   public String ID;
   public boolean isAvailible;
   
   public Device(String i, boolean a)
   {
      this.ID = i;
      this.isAvailible = a;
   }
   
   public boolean assignDevice()
   {
      isAvailible = false;
      return isAvailible;
   }
   
   public boolean releaseDevice()
   {
      isAvailible = true;
      return isAvailible;
   }
}

class Main
{
public static void main(String[] args)
   {
      Device d1 = new Device("MBP382",true);
      Device d2 = new Device("DAP111",true);
      Device d3 = new Device("DKB349",false);
      
      System.out.println("Device is availible?: " + d1.assignDevice());
      System.out.println("Device is availible?: " + d2.assignDevice());
      System.out.println("Device is availible?: " + d3.releaseDevice());
   }
}