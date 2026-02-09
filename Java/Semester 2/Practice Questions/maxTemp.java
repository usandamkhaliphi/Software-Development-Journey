public class maxTemp
{
public static void main(String[] args)
  {
      double max; 
      
      double [] temperature = new double [7];
      
      temperature[0] = 27.3;
      temperature[1] = 29.1;
      temperature[2] = 29.7;
      temperature[3] = 30.7;
      temperature[4] = 33.4;
      temperature[5] = 36.2;
      temperature[6] = 34.1;
      
      max = temperature[0];
      
      for (int counter = 1; counter <= 6; counter++)
      {
         if (temperature[counter] > max )
           {
              max = temperature[counter];
           }
      }
    
     System.out.println("Maximum temperature: " + max);
  }
}      