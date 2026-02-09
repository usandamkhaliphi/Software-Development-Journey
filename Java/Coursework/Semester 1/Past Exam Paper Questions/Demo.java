import javax.swing.JOptionPane;

public class Demo 
{
public static void main(String[] args)
   {
      String str;
      String numstr; 
      double weight;
   
   for (int i = 1; i <= 3; i++)
   {
   str = JOptionPane.showInputDialog("Enter your name: ");   
   numstr = JOptionPane.showInputDialog("Enter your weight: ");
   weight = Double.parseDouble(numstr);
   
   System.out.println("Your name is: " + str + "\nYour weight is: " + weight);
   }
   }
}