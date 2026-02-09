class DataUsage
{
   public double dataUsed;
   
   public DataUsage(double d)
   {
      this.dataUsed = d;
   }
   
   public double calculateBill(double ratePerGB)
   {
      double bill = dataUsed * ratePerGB;
      return bill;
   }
}

class Main
{
public static void main(String[] args)
   {
      DataUsage d1 = new DataUsage(7.3);
      DataUsage d2 = new DataUsage(13.4);
      DataUsage d3 = new DataUsage(4.2);
      
      System.out.println("Bill Amount: R" + d1.calculateBill(35.75));
      System.out.println("Bill Amount: R" + d2.calculateBill(35.75));
      System.out.println("Bill Amount: R" + d3.calculateBill(35.75));
   }
}