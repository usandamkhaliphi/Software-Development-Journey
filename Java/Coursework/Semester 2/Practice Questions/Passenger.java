public class Passenger
{
   public String name;
   public String seatNumber;
   
   public Passenger(String n, String s)
   {
      this.name = n;
      this.seatNumber = s;
   }
}

class Main
{
public static void main(String[] args)
   {
      
      Passenger[] passenger = new Passenger[5];
      
      passenger[0] = new Passenger("John","2A");
      passenger[1] = new Passenger("Peter","3C");
      passenger[2] = new Passenger("Sam","5B");
      passenger[3] = new Passenger("Paul","2B");
      passenger[4] = new Passenger("Mark","4A");
      
      for (int counter = 0; counter <= 4; counter++)
      {
         System.out.println("Passenger name: " + passenger[counter].name + "\n" + "Seat Number: " + passenger[counter].seatNumber);
      }
   }
} 