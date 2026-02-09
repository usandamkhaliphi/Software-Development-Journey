import javax.swing.JOptionPane;

public class Activity6_3 
{

   public static void main(String[] args) 
      {
        
         for (int a = 0; a <= 50; a = a + 1) 
            {
               System.out.print(a);
               if (((a % 5) == 0) && ((a % 4) == 0))
                  {
                     System.out.println(" : Multiple of 4 and 5");
                  } 
                     else 
                        {
                           
                           System.out.println();
           
                        }
        
            }
    
    }

}

