class SmartDevice
{
   public String deviceName;

   public SmartDevice(String d)
   {
      this.deviceName = d;
   }
}

class LightBulb extends SmartDevice
{
   public int brightness;
   
   public LightBulb(String d, int b)
   {
      super(d);
      this.brightness = b;
   }
   
   public int adjustBrightness(int newbrightness)
   {
      brightness = newbrightness;
      return newbrightness;
   }
}

class Main
{
public static void main(String[] args)
   {
      LightBulb l1 = new LightBulb("Phillips Hue",85);
      l1.adjustBrightness(45);
      
      System.out.println("DeviceName: " + l1.deviceName + "\n" + "Brightness: " + l1.brightness);
   }
}