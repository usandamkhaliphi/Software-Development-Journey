import javax.swing.JOptionPane;

public class Activity4_8
{

public static void main(String[] args)
   {
   
     double sizeNumber;
     String price;
     
     sizeNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter size code for the milkshake below:\nEnter 1 for Small\nEnter 2 for Medium\nEnter 3 for Large"));
     
     
     
     if(sizeNumber == 1)
     JOptionPane.showMessageDialog(null,"The price is R5");
     
      else
         
         if(sizeNumber == 2)
        JOptionPane.showMessageDialog(null,"The price is R10");
         
      else
            
        if(sizeNumber == 3)
        JOptionPane.showMessageDialog(null,"The price is R15");
        
        System.exit(0);
    }
}     