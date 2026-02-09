import javax.swing.JOptionPane;

public class activity2_11_2
{
public static void main(String[] args)
   {
      String [] names = new String [4];
      
      for(int counter = 0; counter <= 3; counter++)
      {
      names[counter] = JOptionPane.showInputDialog("Enter Name");
      }     
      
      for(int counter = 0; counter <= 3; counter++)
      {
      System.out.println(names[counter]);
      }
   }
}
      