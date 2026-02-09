import javax.swing.JOptionPane;

public class Activity4_4_1
{

public static void main(String[] args)
   {
      String username;
      String password;
      username = JOptionPane.showInputDialog("Input Username");
      password = JOptionPane.showInputDialog("Input Password");
      
      if(username.equals("tron") && password.equals("abc1234"))
         
      JOptionPane.showMessageDialog(null,"The Username and Password is correct");    
      
      else         
      
      JOptionPane.showMessageDialog(null,"the Username and Password entered is incorrect");
               
               
      System.exit(0);
   }
}         