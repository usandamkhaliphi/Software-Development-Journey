import javax.swing.JOptionPane;

public class Decision
{
public static void main(String[] args)
   {
      int counter = 0;
         System.out.println("A pass is a mark from 50 and above\nA fail is a mark below 50");
         
         do 
         {
            int mark;
            String result;
            
            
            mark = Integer.parseInt(JOptionPane.showInputDialog("Enter mark"));
            
            if (mark < 50)
            
            result = "fail";
            
            else
            
            result = "pass";
            
            
            System.out.println(mark + " is a " + result);
            
            counter++;
            
        } 
        while (counter < 5);
        
        counter++;
     
     
   }
}
     