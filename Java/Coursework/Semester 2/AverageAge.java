import javax.swing.JOptionPane;
public class AverageAge
{
public static void main(String[] args)
   {
      int[] ages = new int [5];
      int sum;
      int average;
      
      ages[0] = 23;
      ages[1] = 56;
      ages[2] = 67;
      ages[3] = 12;
      ages[4] = 45;
     
      sum = ages[0] + ages[1] + ages[2] + ages[3] + ages[4];
      average = sum/5;
      
      JOptionPane.showMessageDialog(null,average);
   }
}