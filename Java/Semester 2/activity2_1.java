import javax.swing.JOptionPane;

public class activity2_1
{
public static void main(String[] args)
   {
      String [] Names = new String [10];
      
     for(int counter = 0; counter <= 9; counter++)
     {
     Names[counter] = JOptionPane.showInputDialog("Enter Name");
     }
         
     for(int counter = 0; counter <= 9; counter++)
     {
     System.out.println(Names[counter]); 
     }
   }
}