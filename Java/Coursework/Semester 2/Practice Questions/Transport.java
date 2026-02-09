public class Transport
{
   public String type;
   public int distance;
   
   public Transport(String t, int d)
   {
      this.type = t;
      this.distance = d;
   }
   
   public double calculateFare(double ratePerKm)
   {
      double fare = distance * ratePerKm;
      return fare;
   }
}

class Main
{
public static void main(String[] args)
   {
      Transport t1 = new Transport("Bus",23);
      Transport t2 = new Transport("Taxi",49);
      Transport t3 = new Transport("Train",36);
      
      System.out.println("Bus Fare: R" + t1.calculateFare(2.10));
      System.out.println("Taxi Fare: R" + t2.calculateFare(1.23));
   }
}     