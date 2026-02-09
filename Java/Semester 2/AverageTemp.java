import javax.swing.JOptionPane;
public class AverageTemp
{
public static void main(String[] args)
   {
      double [] temperature = new double [5];
      
      temperature[0] = 30.4;
      temperature[1] = 27.3;
      temperature[2] = 40.0;
      temperature[3] = 13.6;
      temperature[4] = 32.7;
      
      double total = temperature[0] + temperature[1] + temperature[2] + temperature[3] + temperature[4];
      double average = total/5;
      
      JOptionPane.showMessageDialog(null,"The average is " + average);
   }
}