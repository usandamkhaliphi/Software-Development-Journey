import javax.swing.JOptionPane;

public class marks 
{

    public static void main(String[] args) 
    {
    
      int mark;
      char symbol = (' ');
      
      mark = Integer.parseInt(JOptionPane.showInputDialog("Input Mark"));
      
        if(mark > 79)
      symbol = 'A';
      
      else
      
         if(mark > 69)
         symbol = 'B';
         
         else
         
            if(mark > 59)
            symbol = 'C';
            
            else
            
               if(mark > 49)
               symbol = 'D';
               
               else
               
                  if(mark > 39)
                  symbol = 'E';
               
                  else
                  
                  if(mark < 40)
                  symbol = 'F';

               JOptionPane.showMessageDialog(null,"Your symbol is: " + symbol);
              
              System.exit(0); 
        }
}