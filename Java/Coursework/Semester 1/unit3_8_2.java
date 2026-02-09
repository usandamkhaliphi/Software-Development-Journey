import javax.swing.JOptionPane;

public class unit3_8_2
{
public static void main(String[] args)
   {
   double width;
   double length;
   
   width = Double.parseDouble(JOptionPane.showInputDialog("Input length of room "));
   length = Double.parseDouble(JOptionPane.showInputDialog("Input length of room"));
   
   JOptionPane.showMessageDialog(null,"The perimeter of the room is " + length + "X" + width);
   System.exit(0);
  }
} 