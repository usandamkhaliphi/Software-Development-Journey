import javax.swing.JOptionPane;

public class Activity7_10_2 
{
   public static void findMultiples(int findmultiples)
   {
    
         {
                      
           for (int i = 1; i <= 50; i = i + 1)
               {
              
                  System.out.print(i);
                  if ((i % findmultiples) == 0)
                                       {
                        System.out.println(" : Multiple of " + findmultiples);
                     } 
                        else 
                           {
                              
                              System.out.println();
              
                           }
           
               }
    
    }

}
public static void main(String[] args)
{
      String input = JOptionPane.showInputDialog("enter multiple intervals");
      int output = Integer.parseInt(input);
   findMultiples(output);
}
}