import javax.swing.JOptionPane;

public class activity4_1
{
public static void main(String[] args)
   {
      String answerString;
      int answerInt;
      
      
      answerString = JOptionPane.showInputDialog("what is 50/5");
      answerInt = Integer.parseInt(answerString);
      
      if (answerInt== 10)
      {
         JOptionPane.showMessageDialog(null,"Congratulations!\nCorrect Answer");
      }
      
      else 
      {
         JOptionPane.showMessageDialog(null,"sorry,wrong answer\nTry again.");
      }
      System.exit(0);
    }
}