import javax.swing.JOptionPane;

public class Act2_3
{
public static void main(String[] args)
   {
      String [] marks = new String [10];
          
      marks[0] = JOptionPane.showInputDialog("Enter Name");
      marks[1] = JOptionPane.showInputDialog("Enter Name");
      marks[2] = JOptionPane.showInputDialog("Enter Name");
      marks[3] = JOptionPane.showInputDialog("Enter Name");
      marks[4] = JOptionPane.showInputDialog("Enter Name");
      marks[5] = JOptionPane.showInputDialog("Enter Name");
      marks[6] = JOptionPane.showInputDialog("Enter Name");
      marks[7] = JOptionPane.showInputDialog("Enter Name");
      marks[8] = JOptionPane.showInputDialog("Enter Name");
      marks[9] = JOptionPane.showInputDialog("Enter Name");
    
    
    
       for(int counter = 0; counter <= 9; counter++)
       {
       System.out.println(marks[counter]);
       }
    }
}