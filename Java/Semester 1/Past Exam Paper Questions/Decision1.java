import javax.swing.JOptionPane;

public class Decision1 
{
    public static void main(String[] args) 
    {
      double marks;
      String result;
      int counter;
     
      counter = 0;
      
      do 
         {
            marks = Double.parseDouble(JOptionPane.showInputDialog("Enter students Marks"));
            
            if (marks >= 50 && marks <= 100)
               {   
                result = "Pass";
               }
              
               
           else 
               {
               result = "Fail";
               }
        
            System.out.println(marks + " is a " + result);
            
            counter++;
         }
         
     while (counter < 5);      
      
      counter++;
      
      System.exit(0);
   }
}