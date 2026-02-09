import javax.swing.JOptionPane;

public class rightangledtriangle
{
public static void main(String[] args)
   {
      
      
      
      for (int row = 1; row <= Integer.parseInt(JOptionPane.showInputDialog("Input height/ base of triangle")); row++)
         {
   
            for (int base = 1; base <= row; base++)
               {
            
                  System.out.print(base);
               }
               
               System.out.println();
          }
          
   }
}


      