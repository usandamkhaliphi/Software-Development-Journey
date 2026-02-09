import javax.swing.JOptionPane;

public class Counting_Sheep 
{
public static void main(String[] args) 
   {

      int counter = 1;
      
      String str = JOptionPane.showInputDialog("Enter the number of sheep: ");
      int num = Integer.parseInt(str);
      
      while (counter <= num)
         {
            System.out.println("I have "+ counter + " sheep"); 
            
            counter++;
         }
    }
}