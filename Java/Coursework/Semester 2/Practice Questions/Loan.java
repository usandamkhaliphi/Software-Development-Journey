public class Loan
{
   public double principal;
   public double rate;
   public int years;
   
   public Loan(double p, double r, int y)
   {
      this.principal = p;
      this.rate = r;
      this.years = y;
   }
   
   public double calculateTotalPayment()
   {
      double total = principal + (principal * (rate/100) * years);
      return total;
   }
}

class Main
{
public static void main(String[] args)
   {
      Loan l1 = new Loan(50000,10.4,5);
      
      System.out.println("Total Balance: R" + l1.calculateTotalPayment());
   }
} 