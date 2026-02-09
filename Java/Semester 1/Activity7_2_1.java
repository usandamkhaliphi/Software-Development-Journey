import javax.swing.JOptionPane;

public class Activity7_2_1
{
   public static void showMessage(String msg)
   {
      JOptionPane.showMessageDialog(null,msg);
   }
   
   public static void main(String[] args)
   {
      showMessage("It's a nice day");
      showMessage();
   }
   
  
}