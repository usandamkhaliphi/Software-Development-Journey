/*public class Ticket
{
   public String type;
   public double price;


public Ticket(String t, double p)
{
   this.type = t;
   this.price = p;
}
}
class busTicket extends Ticket
{
   public int routeNumber;


public busTicket(int r)
{
   this.routeNumber = r;
}
}
class Main
{
public static void main(String[] args)
   {
      Ticket t1 = new Ticket("One way",55.35);
      busTicket t2= new busTicket(14);
         
      System.out.println("Type: " + t1.type + "Price: " + t1.price);
      System.out.println("Type: " + t2.type + "Price: " + t2.price + "Route number: " + t2.routeNumber);
   }
}*/

//corect answer below; own attempt is above

public class Ticket {
    public String type;
    public double price;

    public Ticket(String t, double p) {
        this.type = t;
        this.price = p;
    }
}

class busTicket extends Ticket {
    public int routeNumber;
    public busTicket(String t, double p, int r) {
        super(t, p);  
        this.routeNumber = r;
    }
}

class Main {
    public static void main(String[] args) {
        
        Ticket t1 = new Ticket("One way", 55.35);

        
        busTicket t2 = new busTicket("Round trip", 80.50, 14);

        
        System.out.println("Type: " + t1.type + " Price: " + t1.price);
        System.out.println("Type: " + t2.type + " Price: " + t2.price + " Route number: " + t2.routeNumber);
    }
}
