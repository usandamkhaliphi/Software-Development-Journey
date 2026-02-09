import javax.swing.JOptionPane;

public class Verify
{
public static void main(String[] args)
   {
      String username;
      String password;
      
      username = JOptionPane.showInputDialog("Enter username");
      password = JOptionPane.showInputDialog("Enter password");
      
      if (username.equals("Micky") && password.equals("R@in2"))
         
         {
            JOptionPane.showMessageDialog(null,"The username and password entered is correct");
         }
         
        else 
         
         {
            JOptionPane.showMessageDialog(null,"The username and password is incorrect");
         }
    }
}