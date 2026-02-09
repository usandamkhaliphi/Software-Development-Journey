import javax.swing.JOptionPane;

public class Count_names
{

public static void main(String[] args)
  {
      String userinput;
      int counter;
      
      userinput = JOptionPane.showInputDialog("Enter name");
      counter = 0;
      
      while (!userinput.equals("##"))
         {
            userinput = JOptionPane.showInputDialog("Enter name");
            counter++;
         }
         
     JOptionPane.showMessageDialog(null,"the total names entered is " + counter);
   }
}
            