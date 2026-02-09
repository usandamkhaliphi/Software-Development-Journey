import javax.swing.JOptionPane;

public class conversion
{
public static void main(String[] args)
   {
      double millimeter;
      double kilometer;
      
      millimeter = Double.parseDouble(JOptionPane.showInputDialog("Enter the millimeter value"));
      
      kilometer = millimeter / 1000000;
      
      System.out.println("The ammount of kilometers is " + kilometer);
      
   }
}
      