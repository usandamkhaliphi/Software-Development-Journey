import javax.swing.JOptionPane;

public class RandomGuess
{
public static void main(String[] args)
   {
      int guess;
      guess = Integer.parseInt(JOptionPane.showInputDialog("Think of a number between 1 and 10"));
      
      JOptionPane.showMessageDialog(null,"The number is " + (1 + (int) (Math.random() * 10)));
      
   }
}
      