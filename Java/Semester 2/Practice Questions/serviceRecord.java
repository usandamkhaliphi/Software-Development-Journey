public class serviceRecord
{
   public String vehicleReg;
   public int mileage;
   
   public serviceRecord(String v, int m)
   {
      this.vehicleReg = v;
      this.mileage = m;
   }
   
   public boolean needsService()
   {
      boolean Service;
      
      if (mileage > 15000)
      {
          Service = true;
      }
      else
      {
          Service = false;
      }
   
      return Service;
   }
}

class Main
{
public static void main(String[] args)
   {
      serviceRecord[] service = new serviceRecord[5];
      
      service[0] = new serviceRecord("DN73KSGP",8931);
      service[1] = new serviceRecord("BE92LDGP",18823);
      service[2] = new serviceRecord("ND77320",82831);
      service[3] = new serviceRecord("OPS921FS",15214);
      service[4] = new serviceRecord("GK92APL",6132);
      
      System.out.println("Registration: " + service[0].vehicleReg + " Needs service?: " + service[0].needsService());
      System.out.println("Registration: " + service[1].vehicleReg + " Needs service?: " + service[1].needsService()); 
      System.out.println("Registration: " + service[2].vehicleReg + " Needs service?: " + service[2].needsService()); 
      System.out.println("Registration: " + service[3].vehicleReg + " Needs service?: " + service[3].needsService()); 
      System.out.println("Registration: " + service[4].vehicleReg + " Needs service?: " + service[4].needsService());
   }
}      