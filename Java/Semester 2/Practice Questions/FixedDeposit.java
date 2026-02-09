public class FixedDeposit
{
   public double amount;
   public double rate;
   public int years;
   
   public FixedDeposit(double a, double r, int y)
   {
      this.amount = a;
      this.rate = r;
      this.years = y;
   }
   
   public double calculateMaturityAmount()
   {
      double maturityAmount = amount + amount * years * (rate / 100);
      return maturityAmount;
   }
}

class Main
{
public static void main(String[] args)
   {
      FixedDeposit f1 = new FixedDeposit(50000,7.4,2);
      System.out.println(f1.calculateMaturityAmount());
   }
}