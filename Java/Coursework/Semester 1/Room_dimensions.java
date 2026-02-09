import javax.swing.JOptionPane;

public class Room_dimensions
{

public static void main(String[] args)
   {
   
      double length;
      double width;
      double perimeter;
      
      length = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the room"));
      width = Integer.parseInt(JOptionPane.showInputDialog("Enter the width of the room"));
      perimeter = length * width;
       
       JOptionPane.showMessageDialog(null,"The perimeter is: " + perimeter);
      
      System.exit(0);
   
   }
}