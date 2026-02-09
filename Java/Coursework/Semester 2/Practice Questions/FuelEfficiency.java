public class FuelEfficiency
{
   public double distance;
   public double fuelUsed;
   
   public FuelEfficiency(double d, double f)
   {
      this.distance = d;
      this.fuelUsed = f;
   }
   
   public double calculateFuelefficiency()
   {
      double fuelEfficiency = distance / fuelUsed;
      return fuelEfficiency;
   }
}

class Main
{
public static void main(String[] args)
   {
      FuelEfficiency f1 = new FuelEfficiency(53,12);
      System.out.println("Litres used: " + f1.calculateFuelefficiency());
   }
}