import javax.swing.JOptionPane;

public class HallowRightAngledTriangle
{
public static void main(String[] args)
   {
      String symbol;
      int height;
      
      symbol = JOptionPane.showInputDialog("Enter the symbol of choice");
      System.out.println("You have entered the character " + symbol);
      height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height of the triangle"));
      
      for (int row = 1; row <= height; row++)
         {
            for (int num = 1; num <= row; num++)
            {
               System.out.print(symbol);
            }
         
         
            System.out.println();
            
         }
   }
}        