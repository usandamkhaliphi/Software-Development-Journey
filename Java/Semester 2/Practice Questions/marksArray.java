import javax.swing.JOptionPane;
public class marksArray
{
public static void main(String[] args)
   {
      int [] marks = new int [12];
      
      for (int counter = 0; counter <= 11; counter++)
         {
            marks[counter] = Integer.parseInt(JOptionPane.showInputDialog("Enter mark"));
            
            if (marks[counter] >= 50)
            {
               System.out.println(marks[counter]);
            }
            else 
            {
            }
         }
   }
}