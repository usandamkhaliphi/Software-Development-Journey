public class WaterAccount
{
   public String owner;
   public double litresUsed;
   
   public WaterAccount(String o, double l)
   {
      this.owner = o;
      this.litresUsed = l;
   }
   
   public double calculateBill(double ratePerLitre)
   {
      double bill = litresUsed * ratePerLitre;
      return bill;
   }
}

class Main
{
public static void main(String[] args)
   {
      WaterAccount a1 = new WaterAccount("John",35000);
      WaterAccount a2 = new WaterAccount("Peter",25000);
      WaterAccount a3 = new WaterAccount("Samuel",43000);
      
      System.out.println("Bill: R" + a1.calculateBill(0.59));
      System.out.println("Bill: R" + a2.calculateBill(0.59));
      System.out.println("Bill: R" + a3.calculateBill(0.59));
   }
}