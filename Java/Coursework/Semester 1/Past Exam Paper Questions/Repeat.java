import javax.swing.JOptionPane;

public class Repeat
{
public static void main(String[] args)
   {
      int userinput;
      
      
      
      for (int i = 1; i <= 5; i++)
       {  
         userinput = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
         
         {
            System.out.println(userinput);
         }
   }
   }
}    