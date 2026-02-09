import javax.swing.JOptionPane;

public class activity3_8_2
{

    public static void main(String[] args) 
    {
    
    double width;
    double length;
    double perimeter;
    
    width = Integer.parseInt(JOptionPane.showInputDialog("Enter the width of the room")); 
    length = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the room")); 
    perimeter = length * width;
    
    JOptionPane.showMessageDialog(null,"the perimeter of the room is: " + perimeter);
    
    System.exit(0);
    }
}