import javax.swing.JOptionPane;

public class Activity7_2_4
{

public static void showMessage()
   {
      int num1;
      int num2;
      int totalnums;
      
      num1 = Integer.parseInt(JOptionPane.showInputDialog("input first numerical value"));
      num2 = Integer.parseInt(JOptionPane.showInputDialog("input second numerical value"));
      totalnums = num1 + num2;

      JOptionPane.showMessageDialog(null,"The sum of the numbers entered is " + totalnums);
   }
   public static void main(String[] args)
   {
      showMessage();
   }
}