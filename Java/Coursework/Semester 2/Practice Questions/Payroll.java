public class Payroll
{
   public String employee;
   public double grossPay;
   
   public Payroll(String e, double g)
   {
      this.employee = e;
      this.grossPay = g;
   }
   
   public double deductTax(double percent)
   {
      double netPay = grossPay - grossPay * (percent / 100);
      return netPay;
   }
}

class Main
{
public static void main(String[] args)
   {
      Payroll p1 = new Payroll("John",23583.83);
      Payroll p2 = new Payroll("Peter",73421.64);
      Payroll p3 = new Payroll("Steve",63472.37);
      
      System.out.println("Net pay: R" + p1.deductTax(1.9));
      System.out.println("Net pay: R" + p2.deductTax(12.6));
      System.out.println("Net pay: R" + p1.deductTax(5.2));
   }
}  