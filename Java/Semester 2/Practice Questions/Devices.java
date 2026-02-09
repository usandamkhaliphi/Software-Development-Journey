class Device 
{
   public String serialNumber;
   
   public String activate() 
   {
      return serialNumber;
   }
}

class Smartphone extends Device 
{
   public String osVersion;
   
   public Smartphone(String initialVersion) 
   {
      osVersion = initialVersion;
   }
   
   public String updateOS(String newVersion) 
   {
      this.osVersion = newVersion;
      return osVersion;
   }
}

public class Devices
{
   public static void main(String[] args) 
   {
      Device device = new Device();
      device.serialNumber = "123456";
      System.out.println(device.activate());

      Smartphone smartphone = new Smartphone("iOS 25");
      System.out.println(smartphone.updateOS("iOS 26 Public Beta 3"));
   }
}
