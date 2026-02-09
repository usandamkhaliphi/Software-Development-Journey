import javax.swing.JOptionPane;

public class Act2_2
{
public static void main(String[] args)
   {
      int [] marks = new int [10];
          
      marks[0] = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark"));
      marks[1] = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark"));
      marks[2] = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark"));
      marks[3] = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark"));
      marks[4] = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark"));
      marks[5] = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark"));
      marks[6] = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark"));
      marks[7] = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark"));
      marks[8] = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark"));
      marks[9] = Integer.parseInt(JOptionPane.showInputDialog("Enter Mark"));
    
    
    
       for(int counter = 0; counter <= 4; counter++)
       {
       System.out.println(marks[counter]);
       }
    }
}