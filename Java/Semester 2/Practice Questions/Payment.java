public class Payment
{
   public String method;
   public double amount;
   
   public Payment(String m, double a)
   {
      this.method = m;
      this.amount = a;
   }
   
   public double applyServiceCharge(double percent)
   {
      double serviceCharge = amount * (percent / 100);
      return serviceCharge;
   }
}

class Main
{
public static void main(String[] args)
   {
      Payment p1 = new Payment("Withdrawl",500);
      Payment p2 = new Payment("Deposit",9200);
       
      System.out.println("Service charge of: R" +p1.applyServiceCharge(2.5) + " applies");
      System.out.println("Service charge of: R" +p2.applyServiceCharge(1.25) + " applies");
   }
} 