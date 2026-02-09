public class ParkingSpot
{
   public int spotNumber;
   public boolean isOccupied;
   
   public ParkingSpot(int s, boolean o)
   {
      this.spotNumber = s;
      this.isOccupied = o;
   }
   
   public boolean Park(boolean Parked)
   {
      if (Parked == true)
      {
         isOccupied = true;
      }
      else
      {
         isOccupied = false;
      }
      
      return isOccupied;
   }
   
   public boolean Leave(boolean Leave)
   {
      if (Leave == true)
      {
         isOccupied = false;
      }
      else
      {
         isOccupied = true;
      }
      return isOccupied;
   }
}

class Main
{
public static void main(String[] args)
   {
      ParkingSpot p1 = new ParkingSpot(112,false);
      ParkingSpot p2 = new ParkingSpot(261,true);
      ParkingSpot p3 = new ParkingSpot(283,false);
      ParkingSpot p4 = new ParkingSpot(183,false);
      ParkingSpot p5 = new ParkingSpot(185,true);
      
      System.out.println("Parking space is occupied?: " + p1.Park(true));
      System.out.println("Parking space is occupied?: " + p1.Leave(true));
      System.out.println("Parking space is occupied?: " + p1.Park(false));
      System.out.println("Parking space is occupied?: " + p1.Leave(true));
      System.out.println("Parking space is occupied?: " + p1.Leave(false));
   }
}