public class tempConvert
{
   public double temperature;
   
   public tempConvert(double t)
   {
      this.temperature = t;
   }
   
   public double celciustoFahrenheit(double celcius)
   {
      double fahreinheit = (celcius * 9 /5) + 32;
      return fahreinheit;
   }
}

class Main
{
public static void main(String[] args)
   {
      tempConvert t1 = new tempConvert(26.4);
      tempConvert t2 = new tempConvert(31.5);
      tempConvert t3 = new tempConvert(33.9);
      
      System.out.println("The temperature in Fahrenheit is: " + t1.celciustoFahrenheit(t1.temperature));
      System.out.println("The temperature in Fahrenheit is: " + t2.celciustoFahrenheit(t2.temperature));
      System.out.println("The temperature in Fahrenheit is: " + t3.celciustoFahrenheit(t3.temperature));
   }
}