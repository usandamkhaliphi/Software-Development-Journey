public class ETicket
{
   public String passengerName;
   public String destination;
   public double fare;
   
   public ETicket(String p, String d, double f)
   {
      this.passengerName = p;
      this.destination = d;
      this.fare = f;
   }
   
   public void printTicket()
   {
    System.out.println("Passenger Name: " + passengerName);
    System.out.println("Destination: " + destination);  
    System.out.println("fare: R" + fare);    
   }
}

class Main
{
public static void main(String[] args)
   {
      ETicket e1 = new ETicket("John","Cape Town",2173.92);
      ETicket e2 = new ETicket("Peter","Durban",1728.83);
      ETicket e3 = new ETicket("John","Johannesburg",1949.39);
   
      e1.printTicket();
      System.out.println();
      e2.printTicket();
      System.out.println();
      e3.printTicket();
   }
}     