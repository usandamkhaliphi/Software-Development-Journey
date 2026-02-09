import javax.swing.JOptionPane;

public class Activity4_4_2
{

public static void main(String[] args)
   {
   
      int age;
      double discount;
      int price;
      double discountedPrice;
      age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
      price = Integer.parseInt((JOptionPane.showInputDialog("Input Price")));
      discount = 0.75;
      discountedPrice = (price * discount);
     
          if(age < 12||age >= 60)
         
          JOptionPane.showMessageDialog(null,"The customer qualifies for a 25% discount!\nThe new total is R " + discountedPrice);
          
          else
          
            JOptionPane.showMessageDialog(null,"The total is R " + price);
            
            System.exit(0);
    }
}
            