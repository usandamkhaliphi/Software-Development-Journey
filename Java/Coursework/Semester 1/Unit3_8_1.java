import javax.swing.JOptionPane;

public class Unit3_8_1
{
public static void main(String[] args)
   {  
      int num1;
      int num2;
      int num3;
      int temp;
      
      String numString1;
      String numString2;
      String numString3;
      
      num1 = 27;
      num2 = 19;
      num3 = 15;
      temp = num1;
      
      num1 = num2;
      num2 = num3;
      num3 = temp;
      
      
      
      JOptionPane.showMessageDialog(null,num1);
      JOptionPane.showMessageDialog(null,num2);
      JOptionPane.showMessageDialog(null,num3);
      System.exit(0);
    }
 }  