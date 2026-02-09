import javax.swing.JOptionPane;

public class Vote
{
public static void main(String[] args)
   {
      int age;
      
      age = Integer.parseInt(JOptionPane.showInputDialog("Enter age to check eligibility to vote"));
      
      if (age >= 18 && age <= 117)
         
         {
            JOptionPane.showMessageDialog(null,"You are eligible to vote!"); 
         }
         
      else if (age < 18 && age >= 1)
         
         {
            JOptionPane.showMessageDialog(null,"You are not old enough to vote");
         }
         
         else
         
         {
            JOptionPane.showMessageDialog(null,"you have entered an invalid input, Enter an age between 1 and 117 years");
         }
   }
}