import javax.swing.JOptionPane;

public class Room_dimensions
{

public static void main(String[] args)
   {
   
      double length;
      double width;
      
      
      length = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the room"));
      width = Integer.parseInt(JOptionPane.showInputDialog("Enter the width of the room"));
      
       JOptionPane.showMessageDialog(null,"The room dimensions are: " + length + "X" + width);
      
      System.exit(0);
   
   }
}