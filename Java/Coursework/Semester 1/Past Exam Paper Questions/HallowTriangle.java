import javax.swing.JOptionPane;
public class HallowTriangle 
{
public static void main(String[] args)   
   {
      String character;
      int height;
      int depth;
      
      character = JOptionPane.showInputDialog("Enter the character of your choice");
      System.out.println("You have entered the character: " + character);
      
      height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height/Depth of the triangle"));
      depth = height;
      
      for (int base = 1; base <= height; base++)
         {
            for (int column = 1; column <= base; column++)
            {
               if (column == 1 || column == base || base == height)
               {
               System.out.print(column);
               }
            else 
            { 
            System.out.print(" ");
            }
            }
            System.out.println();
         }
   }
}