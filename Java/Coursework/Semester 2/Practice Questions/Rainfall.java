public class Rainfall
{
public static void main(String[] args)
   {
     
      double[] rain = new double[10];
      
      rain[0] = 0.22;
      rain[1] = 0.32;
      rain[2] = 0.00;
      rain[3] = 0.18;
      rain[4] = 0.44;
      rain[5] = 0.28;
      rain[6] = 1.33;
      rain[7] = 1.21;
      rain[8] = 1.02;
      rain[9] = 0.91;
      
      double total = 0;
      double average = 0;
      for (int counter = 0; counter <= 9; counter++)
      {
         total = total + rain[counter];
         average = rain[counter] / 9;
      }
      
      System.out.println("Total Rainfall: " + total);
      System.out.println("Average Rainfall: " + average);
   }
}