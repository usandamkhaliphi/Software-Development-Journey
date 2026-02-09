import javax.swing.JOptionPane;

public class Discount
{

   public static void main(String[] args)
   {
   
   int age;
   double discount;
   double price;
   double PriceAfterDiscount;
   
   age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
   price = Integer.parseInt(JOptionPane.showInputDialog("Enter Price"));
   discount = 0.75;
   PriceAfterDiscount = price * discount;
   
   if ((age < 12) || (age > 60))
      
      
      
         JOptionPane.showMessageDialog(null,"A discount applies!\n The new total is R " + PriceAfterDiscount);
         
      else
      
      JOptionPane.showMessageDialog(null,"The price is R " + price);
      
      System.exit(0);
      
   }
}