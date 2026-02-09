import javax.swing.JOptionPane;

public class Q3
{
public static void main(String[] args)
   {
      int num1;
      int num2;
      
      num1 = Integer.parseInt(JOptionPane.showInputDialog("enter the first number"));
      num2 = Integer.parseInt(JOptionPane.showInputDialog("enter the second number"));
      
      if (num1 > num2)
         {
            JOptionPane.showMessageDialog(null,num1 + " is the larger number and " + num2 + " is the smaller number");
         }
      
      else if (num2 > num1)
         {
            JOptionPane.showMessageDialog(null,num2 + " is the larger number and " + num1 + " is the smaller number");
         }
         
   }
}
