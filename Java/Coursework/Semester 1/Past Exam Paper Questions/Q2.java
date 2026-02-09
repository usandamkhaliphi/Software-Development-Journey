import javax.swing.JOptionPane;

public class Q2
{
public static void main(String[] args)
   {
      int userinput;
      String name;
      int counter;
      int numberofNames;
        
      counter = 0;
      userinput = 0;    
      
      while (userinput == 0) 
      {
         name = JOptionPane.showInputDialog("Enter name");
         counter++;
         
         userinput = Integer.parseInt(JOptionPane.showInputDialog("Enter 0 to continue entering names or enter 1 to stop entering names and get the total number of names entered"));

         }
         
         JOptionPane.showMessageDialog(null,"the number of names entered is " + counter);
         
         }
      }
      
     
   
     