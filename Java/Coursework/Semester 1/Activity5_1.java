import javax.swing.JOptionPane;

public class Activity5_1
{

public static void main(String[] args)
   
   {
   
      int counter = 1;
      int timestoprint;
      String printstatement;
      
      printstatement = JOptionPane.showInputDialog("Input print statement");
      
      timestoprint = Integer.parseInt(JOptionPane.showInputDialog("Input how many times statement should be printed"));
            
      while (counter <=  timestoprint)     
        {
        
            System.out.println(printstatement);
            
            counter++;
        }
        
    }
    
}