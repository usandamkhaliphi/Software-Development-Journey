import javax.swing.JOptionPane;

public class greaterthan
{
public static void main(String[] args)
   {
   
   int x;
   int y;
   int number;
  
  x = 6;
  y = 3;
  
  if (x > y)
  {
   JOptionPane.showMessageDialog(null, "number is equal to " + x);
  }
  
  else 
  {
   JOptionPane.showMessageDialog(null, "number is equal to " + y);
  }
  
  System.exit(0);
  
  }
}