public class USD_convert
{
   public double convertToUSD(double amount, double rate)
   {
      double USD = amount * rate;
      return USD;
   }
}

class Main
{
public static void main(String[] args)
   {
      USD_convert c1 = new USD_convert();
      USD_convert c2 = new USD_convert();
      USD_convert c3 = new USD_convert();
      
      System.out.println("Converts to $" + c1.convertToUSD(5821.43,0.37));
      System.out.println("Converts to $" + c2.convertToUSD(3172.82,0.37));
      System.out.println("Converts to $" + c3.convertToUSD(9313.16,0.37));
   }
}