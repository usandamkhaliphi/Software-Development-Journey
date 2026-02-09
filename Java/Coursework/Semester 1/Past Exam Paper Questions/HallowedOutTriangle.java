import javax.swing.JOptionPane;

public class HallowedOutTriangle
{
public static void main(String[] args)
   {
   
      char symbol;
      int printtimes;
      int base;
      symbol = JOptionPane.showInputDialog("Enter your desired symbol");
      
      System.out.println("You have chosen symbol : " + symbol);
      
      printtimes = Integer.parseInt(JOptionPane.showInputDialog("Input depth of triangle"));
      
      for(int row = 1; row <= printtimes; row++)
      
      {
         for(int num = 1; num <= row; num++)
         {
         System.out.print(symbol);
         
         
         }
         
         System.out.println();
      }
   }
}