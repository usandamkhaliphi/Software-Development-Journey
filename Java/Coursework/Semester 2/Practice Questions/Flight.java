/*public class flight
{
   public String flightNumber;
   public String destination;


   public flight (String f, String d)
   {
      this.flightNumber = f;
      this.destination = d;
   }
}

class internationalFlight extends flight
{
   public double baggageAllowance;


   public internationalFlight(double b)
   {
      this.baggageAllowance = b;
   }
}
class main 
{
public static void main(String[] args)
   {
      flight f1 = new flight("SA183","Durban");
      internationalFlight f2 = new internationalFlight("QA273","Sydney",40);
   }
}*/

//correct code below

public class Flight
{
   String flightNumber;
   String destination;

   public Flight(String flightNumber, String destination)
   {
      this.flightNumber = flightNumber;
      this.destination = destination;
   }

   public void displayDetails()
   {
      System.out.println("Flight Number: " + flightNumber);
      System.out.println("Destination: " + destination);
   }
}

class InternationalFlight extends Flight
{
   double baggageAllowance;

   public InternationalFlight(String flightNumber, String destination, double baggageAllowance)
   {
      super(flightNumber, destination);
      this.baggageAllowance = baggageAllowance;
   }

   @Override
   public void displayDetails()
   {
      super.displayDetails();
      System.out.println("Baggage Allowance: " + baggageAllowance + " kg");
   }
}

class AirlineManagement
{
   public static void main(String[] args)
   {
      Flight domesticFlight = new Flight("DF123", "Cape Town");
      System.out.println("Domestic Flight Details:");
      domesticFlight.displayDetails();

      System.out.println();

      InternationalFlight intlFlight = new InternationalFlight("IF456", "London", 30.0);
      System.out.println("International Flight Details:");
      intlFlight.displayDetails();
   }
}
