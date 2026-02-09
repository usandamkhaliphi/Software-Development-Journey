import javax.swing.JOptionPane;
public class QMethods_prompt1 
{
public static double findAvg(int num1, int num2, int num3)
   
   {
      double avg = (num1 + num2 + num3)/3;
      return avg;
   }

public static void main(String[] args) 

{
   int num1, num2, num3;
   String str = JOptionPane.showInputDialog("Enter a value for num1: ");
   num1 = Integer.parseInt(str);
   
   str = JOptionPane.showInputDialog("Enter a value for num2: ");
   num2 = Integer.parseInt(str);
   
   str = JOptionPane.showInputDialog("Enter a value for num3: ");
   num3 = Integer.parseInt(str);
   
   double avg = findAvg(num1,num2,num3);
   System.out.println(avg);
}
}