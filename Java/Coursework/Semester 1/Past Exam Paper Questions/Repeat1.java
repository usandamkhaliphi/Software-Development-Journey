import javax.swing.JOptionPane;

public class Repeat1
{
public static void Calc_Sum(double k)
   {
      double sum = 0;
      double num;
      
      for (int count = 0; count < k; count++)
         {
            String str = JOptionPane.showInputDialog("Enter a number: ");
            num = Double.parseDouble(str);
            
            sum = sum + num;
         }
       
       System.out.println("the sum is: " + sum);
       System.out.println("The average = " + sum/k);
    }
  
   public static void main(String[] args)
   {
      String str = JOptionPane.showInputDialog("Enter a number: ");
      double num1 = Double.parseDouble(str);
      
      Calc_Sum(num1);
   }
}     