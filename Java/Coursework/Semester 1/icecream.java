import javax.swing.JOptionPane;

public class icecream
{
public static void main(String[] args)
   {
   
   int small;
   int medium;
   int large;
   
   small = 5;
   medium = 10;
   large = 15;
   
   int input = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for small\nEnter 2 for medium\nEnter 3 for large"));
   
   
   if (input == 1)
      {
       JOptionPane.showMessageDialog(null,"The price is R " + 5);
      }
      
      else 
      if (input == 2)
       {
       JOptionPane.showMessageDialog(null,"The price is R " + 10);
       }
       
       else 
       if (input == 3)
       {
       JOptionPane.showMessageDialog(null,"The price is R " + 15);
       }

         System.exit(0);
    }
}