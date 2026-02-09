import javax.swing.JOptionPane;

public class Activity7_3
{
   public static int addNums(int a, int b)
   {
      int sum;
      sum = a + b;
      return sum;
   }
   
   public static void main(String[] args)
      {
         int total;
         total = addNums(3,2);
         JOptionPane.showMessageDialog(null, total);
      
      
      {
         total = addNums(45,2);
         JOptionPane.showMessageDialog(null, total);
      }
      
      {
         total = addNums(794,2);
         JOptionPane.showMessageDialog(null, total);
      }
      
      {
         total = addNums(392,2);
         JOptionPane.showMessageDialog(null, total);
      }
      
      {
         total = addNums(742,2);
         JOptionPane.showMessageDialog(null, total);
      }

   }
}