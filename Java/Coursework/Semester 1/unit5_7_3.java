import javax.swing.JOptionPane;

public class unit5_7_3
{

public static void main(String[] args)
   {
   
      int userinput = 0;
      int total = 0;
      int count = 0;
      String userinputstring;
      
      while (userinput != -999)
      {
         total = total + userinput;
         count++;
         userinputstring = JOptionPane.showInputDialog("Insert a number\nor\n-999 to finish");
         userinput = Integer.parseInt(userinputstring);
      }
         if (count > 1)
         {
           double average = (double) total / (count - 1);
            
            JOptionPane.showMessageDialog(null,"The average is " + average);
         }
         
            
               else
               
                  JOptionPane.showMessageDialog(null, "No valid numbers were entered.");
            
                  System.exit(0);
   }
} 