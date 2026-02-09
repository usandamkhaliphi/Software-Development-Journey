public class CinemaTicket
{
   public String movieName;
   public int seatNumber;
   public double price;
   
   public CinemaTicket(String m, int s, double p)
   {
      this.movieName = m;
      this.seatNumber = s;
      this.price = p;
   }
   
   public double applyStudentDiscount(double percent)
   {
      price = price - (price * (percent / 100));
      return price;
   }
}

class Main
{
public static void main(String[] args)
   {
      CinemaTicket c1 = new CinemaTicket("Titanic",5,75);
      System.out.println("Price: R" + c1.applyStudentDiscount(7.5));
   }
}  