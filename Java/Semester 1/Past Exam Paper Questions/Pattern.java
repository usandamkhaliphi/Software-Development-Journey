import javax.swing.JOptionPane;

public class Pattern 
{
public static void main(String[] args) 
   {
      int height;

      height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height/depth of the triangle"));
      
      System.out.println("Increasing Pattern:");
      System.out.println();
      
      for (int row = 1; row <= height; row++) 
         {
            for (int column = 1; column <= row; column++)  
            {
                System.out.print(column + "  "); 
            }
            System.out.println();
        }
    }
}
