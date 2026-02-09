import javax.swing.JOptionPane;

public class Act2_11_2
{
public static void main(String[] args)
   {
      String [] name = new String [4];
      
      name[0] = JOptionPane.showInputDialog("Enter Name");
      name[1] = JOptionPane.showInputDialog("Enter Name");
      name[2] = JOptionPane.showInputDialog("Enter Name");
      name[3] = JOptionPane.showInputDialog("Enter Name");
      
      for (int counter = 0; counter <= 3; counter++)
         
         System.out.println(name[counter]);
    }
}