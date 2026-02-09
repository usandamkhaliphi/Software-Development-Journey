import javax.swing.JOptionPane;

public class Validate_age
{
public static void main(String[] args)
   {
      int age;
      
      age = Integer.parseInt(JOptionPane.showInputDialog("Enter age to check eligibility to vote"));
      
      if (age >= 17 && age <= 50)
         
         {
            JOptionPane.showMessageDialog(null,"Age is valid for learner's permit"); 
         }
         
      else if (age < 17 && age >= 1)
         
         {
            JOptionPane.showMessageDialog(null,"Age is not valid for a learner's permit");
         }
         
         else
         
         {
            JOptionPane.showMessageDialog(null,"Invalid value for age");
         }
   }
}